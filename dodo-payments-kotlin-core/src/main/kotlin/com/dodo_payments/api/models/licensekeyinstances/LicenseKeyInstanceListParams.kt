// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.licensekeyinstances

import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.Params
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.QueryParams
import java.util.Objects

class LicenseKeyInstanceListParams
private constructor(
    private val licenseKeyId: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by license key ID */
    fun licenseKeyId(): String? = licenseKeyId

    /** Page number default is 0 */
    fun pageNumber(): Long? = pageNumber

    /** Page size default is 10 max is 100 */
    fun pageSize(): Long? = pageSize

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.licenseKeyId?.let { queryParams.put("license_key_id", listOf(it.toString())) }
        this.pageNumber?.let { queryParams.put("page_number", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("page_size", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LicenseKeyInstanceListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [LicenseKeyInstanceListParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseKeyInstanceListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var licenseKeyId: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(licenseKeyInstanceListParams: LicenseKeyInstanceListParams) = apply {
            licenseKeyId = licenseKeyInstanceListParams.licenseKeyId
            pageNumber = licenseKeyInstanceListParams.pageNumber
            pageSize = licenseKeyInstanceListParams.pageSize
            additionalHeaders = licenseKeyInstanceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = licenseKeyInstanceListParams.additionalQueryParams.toBuilder()
        }

        /** Filter by license key ID */
        fun licenseKeyId(licenseKeyId: String?) = apply { this.licenseKeyId = licenseKeyId }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

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

        fun build(): LicenseKeyInstanceListParams =
            LicenseKeyInstanceListParams(
                licenseKeyId,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyInstanceListParams && licenseKeyId == other.licenseKeyId && pageNumber == other.pageNumber && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(licenseKeyId, pageNumber, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LicenseKeyInstanceListParams{licenseKeyId=$licenseKeyId, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
