// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.services.async.CustomerServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class CustomerListPageAsync
private constructor(
    private val customersService: CustomerServiceAsync,
    private val params: CustomerListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<Customer> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerListPageAsync && customersService == other.customersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customersService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerListPageAsync{customersService=$customersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): CustomerListParams? {
        if (!hasNextPage()) {
            return null
        }

        return CustomerListParams.builder()
            .from(params)
            .pageNumber((params.pageNumber() ?: 0) + 1)
            .build()
    }

    suspend fun getNextPage(): CustomerListPageAsync? {
        return getNextPageParams()?.let { customersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            customersService: CustomerServiceAsync,
            params: CustomerListParams,
            response: Response,
        ) = CustomerListPageAsync(customersService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items") private val items: JsonField<List<Customer>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<Customer> = items.getNullable("items") ?: listOf()

        @JsonProperty("items") fun _items(): JsonField<List<Customer>>? = items

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CustomerListPageAsync].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<Customer>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<Customer>) = items(JsonField.of(items))

            fun items(items: JsonField<List<Customer>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: CustomerListPageAsync) : Flow<Customer> {

        override suspend fun collect(collector: FlowCollector<Customer>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
