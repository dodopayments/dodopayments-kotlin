// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailListPageResponseTest {

    @Test
    fun create() {
        val emailListPageResponse =
            EmailListPageResponse.builder()
                .addItem(
                    EmailLogItem.builder()
                        .category("category")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .emailLogId("email_log_id")
                        .emailType("email_type")
                        .hasPreview(true)
                        .policies(
                            EmailPolicies.builder()
                                .requiresDifferentAddress(true)
                                .resendAllowed(true)
                                .resendsRemaining(0L)
                                .retryAllowed(true)
                                .build()
                        )
                        .status(EmailLogStatus.SENT)
                        .failureCode(EmailFailureCode.MAILBOX_NOT_FOUND)
                        .failureReason("failure_reason")
                        .from("from")
                        .intendedRecipient("intended_recipient")
                        .recipient("recipient")
                        .subject("subject")
                        .build()
                )
                .totalCount(0L)
                .build()

        assertThat(emailListPageResponse.items())
            .containsExactly(
                EmailLogItem.builder()
                    .category("category")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .emailLogId("email_log_id")
                    .emailType("email_type")
                    .hasPreview(true)
                    .policies(
                        EmailPolicies.builder()
                            .requiresDifferentAddress(true)
                            .resendAllowed(true)
                            .resendsRemaining(0L)
                            .retryAllowed(true)
                            .build()
                    )
                    .status(EmailLogStatus.SENT)
                    .failureCode(EmailFailureCode.MAILBOX_NOT_FOUND)
                    .failureReason("failure_reason")
                    .from("from")
                    .intendedRecipient("intended_recipient")
                    .recipient("recipient")
                    .subject("subject")
                    .build()
            )
        assertThat(emailListPageResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailListPageResponse =
            EmailListPageResponse.builder()
                .addItem(
                    EmailLogItem.builder()
                        .category("category")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .emailLogId("email_log_id")
                        .emailType("email_type")
                        .hasPreview(true)
                        .policies(
                            EmailPolicies.builder()
                                .requiresDifferentAddress(true)
                                .resendAllowed(true)
                                .resendsRemaining(0L)
                                .retryAllowed(true)
                                .build()
                        )
                        .status(EmailLogStatus.SENT)
                        .failureCode(EmailFailureCode.MAILBOX_NOT_FOUND)
                        .failureReason("failure_reason")
                        .from("from")
                        .intendedRecipient("intended_recipient")
                        .recipient("recipient")
                        .subject("subject")
                        .build()
                )
                .totalCount(0L)
                .build()

        val roundtrippedEmailListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailListPageResponse),
                jacksonTypeRef<EmailListPageResponse>(),
            )

        assertThat(roundtrippedEmailListPageResponse).isEqualTo(emailListPageResponse)
    }
}
