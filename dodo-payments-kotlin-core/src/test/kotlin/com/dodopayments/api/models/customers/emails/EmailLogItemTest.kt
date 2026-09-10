// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.emails

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailLogItemTest {

    @Test
    fun create() {
        val emailLogItem =
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

        assertThat(emailLogItem.category()).isEqualTo("category")
        assertThat(emailLogItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailLogItem.emailLogId()).isEqualTo("email_log_id")
        assertThat(emailLogItem.emailType()).isEqualTo("email_type")
        assertThat(emailLogItem.hasPreview()).isEqualTo(true)
        assertThat(emailLogItem.policies())
            .isEqualTo(
                EmailPolicies.builder()
                    .requiresDifferentAddress(true)
                    .resendAllowed(true)
                    .resendsRemaining(0L)
                    .retryAllowed(true)
                    .build()
            )
        assertThat(emailLogItem.status()).isEqualTo(EmailLogStatus.SENT)
        assertThat(emailLogItem.failureCode()).isEqualTo(EmailFailureCode.MAILBOX_NOT_FOUND)
        assertThat(emailLogItem.failureReason()).isEqualTo("failure_reason")
        assertThat(emailLogItem.from()).isEqualTo("from")
        assertThat(emailLogItem.intendedRecipient()).isEqualTo("intended_recipient")
        assertThat(emailLogItem.recipient()).isEqualTo("recipient")
        assertThat(emailLogItem.subject()).isEqualTo("subject")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailLogItem =
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

        val roundtrippedEmailLogItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailLogItem),
                jacksonTypeRef<EmailLogItem>(),
            )

        assertThat(roundtrippedEmailLogItem).isEqualTo(emailLogItem)
    }
}
