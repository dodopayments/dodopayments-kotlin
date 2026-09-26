// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.moderation.ModerationRetrieveUsageParams
import com.dodopayments.api.models.moderation.ModerationRetrieveUsageResponse
import com.dodopayments.api.models.moderation.ModerationScreenParams
import com.dodopayments.api.models.moderation.ModerationScreenResponse
import com.google.errorprone.annotations.MustBeClosed

interface ModerationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ModerationService

    /**
     * Shows how many billable screens you made and how close you are to your next charge.
     *
     * **Billing.** A billable screen is a live-mode screen that returns a verdict. Dodo Payments
     * charges $0.30 for each full block of 1000 billable screens and debits the fee from your
     * balance. Each full block is charged within one hour. Screens that do not fill a block stay
     * unbilled until they do. Errors and test-mode screens are free and are not counted.
     */
    fun retrieveUsage(
        params: ModerationRetrieveUsageParams = ModerationRetrieveUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModerationRetrieveUsageResponse

    /** @see retrieveUsage */
    fun retrieveUsage(requestOptions: RequestOptions): ModerationRetrieveUsageResponse =
        retrieveUsage(ModerationRetrieveUsageParams.none(), requestOptions)

    /**
     * Screens text, an image, or both, and returns a verdict: `allow`, `flag` or `deny`. The API is
     * fail-closed: do not generate when you get no verdict.
     *
     * **Pricing.** Dodo Payments charges $0.30 per 1000 billable screens and debits the fee from
     * your balance. A billable screen is a live-mode screen that returns a verdict. Errors and
     * test-mode screens are free.
     *
     * **429.** Honour `Retry-After` and retry. A 429 is a throughput limit, not a verdict.
     *
     * **Test mode** returns mock verdicts and never calls the model. The default verdict is
     * `allow`. Put one of these strings in `text` to select another outcome: `dodo_mock_flag`
     * (`flag`), `dodo_mock_deny` (`deny`), `dodo_mock_overloaded` (429) or `dodo_mock_not_ready`
     * (503).
     */
    fun screen(
        params: ModerationScreenParams = ModerationScreenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ModerationScreenResponse

    /** @see screen */
    fun screen(requestOptions: RequestOptions): ModerationScreenResponse =
        screen(ModerationScreenParams.none(), requestOptions)

    /** A view of [ModerationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ModerationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /moderation/usage`, but is otherwise the same as
         * [ModerationService.retrieveUsage].
         */
        @MustBeClosed
        fun retrieveUsage(
            params: ModerationRetrieveUsageParams = ModerationRetrieveUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModerationRetrieveUsageResponse>

        /** @see retrieveUsage */
        @MustBeClosed
        fun retrieveUsage(
            requestOptions: RequestOptions
        ): HttpResponseFor<ModerationRetrieveUsageResponse> =
            retrieveUsage(ModerationRetrieveUsageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /moderation/screen`, but is otherwise the same as
         * [ModerationService.screen].
         */
        @MustBeClosed
        fun screen(
            params: ModerationScreenParams = ModerationScreenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ModerationScreenResponse>

        /** @see screen */
        @MustBeClosed
        fun screen(requestOptions: RequestOptions): HttpResponseFor<ModerationScreenResponse> =
            screen(ModerationScreenParams.none(), requestOptions)
    }
}
