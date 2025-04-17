// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.services.async.ProductServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class ProductListPageAsync
private constructor(
    private val productsService: ProductServiceAsync,
    private val params: ProductListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<ProductListResponse> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListPageAsync && productsService == other.productsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(productsService, params, response) /* spotless:on */

    override fun toString() =
        "ProductListPageAsync{productsService=$productsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): ProductListParams? {
        if (!hasNextPage()) {
            return null
        }

        return ProductListParams.builder()
            .from(params)
            .pageNumber((params.pageNumber() ?: 0) + 1)
            .build()
    }

    suspend fun getNextPage(): ProductListPageAsync? {
        return getNextPageParams()?.let { productsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            productsService: ProductServiceAsync,
            params: ProductListParams,
            response: Response,
        ) = ProductListPageAsync(productsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items")
        private val items: JsonField<List<ProductListResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<ProductListResponse> = items.getNullable("items") ?: listOf()

        @JsonProperty("items") fun _items(): JsonField<List<ProductListResponse>>? = items

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

            /** Returns a mutable builder for constructing an instance of [ProductListPageAsync]. */
            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<ProductListResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<ProductListResponse>) = items(JsonField.of(items))

            fun items(items: JsonField<List<ProductListResponse>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: ProductListPageAsync) : Flow<ProductListResponse> {

        override suspend fun collect(collector: FlowCollector<ProductListResponse>) {
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
