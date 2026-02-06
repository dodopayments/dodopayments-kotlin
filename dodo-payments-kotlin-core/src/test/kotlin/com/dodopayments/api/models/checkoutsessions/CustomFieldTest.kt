// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomFieldTest {

    @Test
    fun create() {
        val customField =
            CustomField.builder()
                .fieldType(CustomField.FieldType.TEXT)
                .key("key")
                .label("label")
                .addOption("string")
                .placeholder("placeholder")
                .required(true)
                .build()

        assertThat(customField.fieldType()).isEqualTo(CustomField.FieldType.TEXT)
        assertThat(customField.key()).isEqualTo("key")
        assertThat(customField.label()).isEqualTo("label")
        assertThat(customField.options()).containsExactly("string")
        assertThat(customField.placeholder()).isEqualTo("placeholder")
        assertThat(customField.required()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customField =
            CustomField.builder()
                .fieldType(CustomField.FieldType.TEXT)
                .key("key")
                .label("label")
                .addOption("string")
                .placeholder("placeholder")
                .required(true)
                .build()

        val roundtrippedCustomField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customField),
                jacksonTypeRef<CustomField>(),
            )

        assertThat(roundtrippedCustomField).isEqualTo(customField)
    }
}
