// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class WebhookEventListParams
private constructor(
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val limit: Long?,
    private val objectId: String?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Get events after this created time */
    fun createdAtGte(): OffsetDateTime? = createdAtGte

    /** Get events created before this time */
    fun createdAtLte(): OffsetDateTime? = createdAtLte

    /** Min : 1, Max : 100, default 10 */
    fun limit(): Long? = limit

    /** Get events history of a specific object like payment/subscription/refund/dispute */
    fun objectId(): String? = objectId

    /** Page number default is 0 */
    fun pageNumber(): Int? = pageNumber

    /** Page size default is 10 max is 100 */
    fun pageSize(): Int? = pageSize

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): WebhookEventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [WebhookEventListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [WebhookEventListParams]. */
    class Builder internal constructor() {

        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var limit: Long? = null
        private var objectId: String? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(webhookEventListParams: WebhookEventListParams) = apply {
            createdAtGte = webhookEventListParams.createdAtGte
            createdAtLte = webhookEventListParams.createdAtLte
            limit = webhookEventListParams.limit
            objectId = webhookEventListParams.objectId
            pageNumber = webhookEventListParams.pageNumber
            pageSize = webhookEventListParams.pageSize
            additionalHeaders = webhookEventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = webhookEventListParams.additionalQueryParams.toBuilder()
        }

        /** Get events after this created time */
        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Get events created before this time */
        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Min : 1, Max : 100, default 10 */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Get events history of a specific object like payment/subscription/refund/dispute */
        fun objectId(objectId: String?) = apply { this.objectId = objectId }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [WebhookEventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WebhookEventListParams =
            WebhookEventListParams(
                createdAtGte,
                createdAtLte,
                limit,
                objectId,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAtGte?.let {
                    put("created_at_gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at_lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                limit?.let { put("limit", it.toString()) }
                objectId?.let { put("object_id", it) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookEventListParams && createdAtGte == other.createdAtGte && createdAtLte == other.createdAtLte && limit == other.limit && objectId == other.objectId && pageNumber == other.pageNumber && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(createdAtGte, createdAtLte, limit, objectId, pageNumber, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "WebhookEventListParams{createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, limit=$limit, objectId=$objectId, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
