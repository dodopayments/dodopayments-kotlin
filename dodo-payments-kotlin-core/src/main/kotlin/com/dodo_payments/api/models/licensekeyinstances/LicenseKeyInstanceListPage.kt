// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licensekeyinstances

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.services.blocking.LicenseKeyInstanceService
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

class LicenseKeyInstanceListPage
private constructor(
    private val licenseKeyInstancesService: LicenseKeyInstanceService,
    private val params: LicenseKeyInstanceListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<LicenseKeyInstance> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyInstanceListPage && licenseKeyInstancesService == other.licenseKeyInstancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(licenseKeyInstancesService, params, response) /* spotless:on */

    override fun toString() =
        "LicenseKeyInstanceListPage{licenseKeyInstancesService=$licenseKeyInstancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): LicenseKeyInstanceListParams? {
        if (!hasNextPage()) {
            return null
        }

        return LicenseKeyInstanceListParams.builder()
            .from(params)
            .pageNumber((params.pageNumber() ?: 0) + 1)
            .build()
    }

    fun getNextPage(): LicenseKeyInstanceListPage? {
        return getNextPageParams()?.let { licenseKeyInstancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            licenseKeyInstancesService: LicenseKeyInstanceService,
            params: LicenseKeyInstanceListParams,
            response: Response,
        ) = LicenseKeyInstanceListPage(licenseKeyInstancesService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items")
        private val items: JsonField<List<LicenseKeyInstance>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<LicenseKeyInstance> = items.getNullable("items") ?: listOf()

        @JsonProperty("items") fun _items(): JsonField<List<LicenseKeyInstance>>? = items

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
             * Returns a mutable builder for constructing an instance of
             * [LicenseKeyInstanceListPage].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<LicenseKeyInstance>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<LicenseKeyInstance>) = items(JsonField.of(items))

            fun items(items: JsonField<List<LicenseKeyInstance>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: LicenseKeyInstanceListPage) :
        Sequence<LicenseKeyInstance> {

        override fun iterator(): Iterator<LicenseKeyInstance> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
