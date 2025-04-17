// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.subscriptions

import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.BillingAddress
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SubscriptionUpdateParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateParams.builder()
            .subscriptionId("subscription_id")
            .billing(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .metadata(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .status(SubscriptionStatus.PENDING)
            .taxId("tax_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateParams.builder()
                .subscriptionId("subscription_id")
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .metadata(
                    SubscriptionUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .status(SubscriptionStatus.PENDING)
                .taxId("tax_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.status()).isEqualTo(SubscriptionStatus.PENDING)
        assertThat(body.taxId()).isEqualTo("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()
        assertThat(params).isNotNull
        // path param "subscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
