// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerRetrievePaymentMethodsParamsTest {

    @Test
    fun create() {
        CustomerRetrievePaymentMethodsParams.builder()
            .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
            .billingCountry(CountryCode.AF)
            .currency(Currency.AED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerRetrievePaymentMethodsParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("cus_TV52uJWWXt2yIoBBxpjaa")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerRetrievePaymentMethodsParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .billingCountry(CountryCode.AF)
                .currency(Currency.AED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("billing_country", "AF").put("currency", "AED").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerRetrievePaymentMethodsParams.builder()
                .customerId("cus_TV52uJWWXt2yIoBBxpjaa")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
