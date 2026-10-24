// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeterUpdateParamsTest {

    @Test
    fun create() {
        MeterUpdateParams.builder()
            .id("mtr_h5tgTWL55OyMO0L2Q9w9v")
            .description("description")
            .measurementUnit("measurement_unit")
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MeterUpdateParams.builder().id("mtr_h5tgTWL55OyMO0L2Q9w9v").build()

        assertThat(params._pathParam(0)).isEqualTo("mtr_h5tgTWL55OyMO0L2Q9w9v")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MeterUpdateParams.builder()
                .id("mtr_h5tgTWL55OyMO0L2Q9w9v")
                .description("description")
                .measurementUnit("measurement_unit")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.measurementUnit()).isEqualTo("measurement_unit")
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MeterUpdateParams.builder().id("mtr_h5tgTWL55OyMO0L2Q9w9v").build()

        val body = params._body()
    }
}
