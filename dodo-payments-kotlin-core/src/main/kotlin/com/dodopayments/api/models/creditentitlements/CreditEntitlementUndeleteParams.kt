// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import java.util.Objects

/**
 * Undeletes a soft-deleted credit entitlement by clearing `deleted_at`, making it available again
 * through standard list and get endpoints.
 *
 * # Authentication
 * Requires an API key with `Editor` role.
 *
 * # Path Parameters
 * - `id` - The unique identifier of the credit entitlement to restore (format: `cde_...`)
 *
 * # Responses
 * - `200 OK` - Credit entitlement restored successfully
 * - `500 Internal Server Error` - Database error, entitlement not found, or entitlement is not
 *   deleted
 *
 * # Business Logic
 * - Only deleted credit entitlements can be restored
 * - The query filters for `deleted_at IS NOT NULL`, so non-deleted entitlements will result in 0
 *   rows affected
 * - If no rows are affected (entitlement doesn't exist, doesn't belong to business, or is not
 *   deleted), returns 500
 * - The `updated_at` timestamp is automatically updated on successful restoration
 * - Once restored, the entitlement becomes immediately available in the standard list and get
 *   endpoints
 * - All configuration settings are preserved during delete/restore operations
 *
 * # Error Handling
 * This endpoint returns 500 Internal Server Error in several cases:
 * - The credit entitlement does not exist
 * - The credit entitlement belongs to a different business
 * - The credit entitlement is not currently deleted (already active)
 *
 * Callers should verify the entitlement exists and is deleted before calling this endpoint.
 */
class CreditEntitlementUndeleteParams
private constructor(
    private val id: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    fun id(): String? = id

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CreditEntitlementUndeleteParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CreditEntitlementUndeleteParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditEntitlementUndeleteParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditEntitlementUndeleteParams: CreditEntitlementUndeleteParams) =
            apply {
                id = creditEntitlementUndeleteParams.id
                additionalHeaders = creditEntitlementUndeleteParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    creditEntitlementUndeleteParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    creditEntitlementUndeleteParams.additionalBodyProperties.toMutableMap()
            }

        fun id(id: String?) = apply { this.id = id }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [CreditEntitlementUndeleteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CreditEntitlementUndeleteParams =
            CreditEntitlementUndeleteParams(
                id,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Map<String, JsonValue>? = additionalBodyProperties.ifEmpty { null }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditEntitlementUndeleteParams &&
            id == other.id &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(id, additionalHeaders, additionalQueryParams, additionalBodyProperties)

    override fun toString() =
        "CreditEntitlementUndeleteParams{id=$id, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
