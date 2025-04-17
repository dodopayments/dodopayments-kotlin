// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.disputes

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.services.async.DisputeServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class DisputeListPageAsync
private constructor(
    private val disputesService: DisputeServiceAsync,
    private val params: DisputeListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<Dispute> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListPageAsync && disputesService == other.disputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputesService, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListPageAsync{disputesService=$disputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): DisputeListParams? {
        if (!hasNextPage()) {
            return null
        }

        return DisputeListParams.builder()
            .from(params)
            .pageNumber((params.pageNumber() ?: 0) + 1)
            .build()
    }

    suspend fun getNextPage(): DisputeListPageAsync? {
        return getNextPageParams()?.let { disputesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            disputesService: DisputeServiceAsync,
            params: DisputeListParams,
            response: Response,
        ) = DisputeListPageAsync(disputesService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items") private val items: JsonField<List<Dispute>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<Dispute> = items.getNullable("items") ?: listOf()

        @JsonProperty("items") fun _items(): JsonField<List<Dispute>>? = items

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

            /** Returns a mutable builder for constructing an instance of [DisputeListPageAsync]. */
            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<Dispute>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<Dispute>) = items(JsonField.of(items))

            fun items(items: JsonField<List<Dispute>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: DisputeListPageAsync) : Flow<Dispute> {

        override suspend fun collect(collector: FlowCollector<Dispute>) {
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
