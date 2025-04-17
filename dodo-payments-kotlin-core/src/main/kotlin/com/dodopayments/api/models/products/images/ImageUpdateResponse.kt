// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products.images

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.NoAutoDetect
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.immutableEmptyMap
import com.dodopayments.api.core.toImmutable
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects

@NoAutoDetect
class ImageUpdateResponse
@JsonCreator
private constructor(
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonProperty("image_id")
    @ExcludeMissing
    private val imageId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun url(): String = url.getRequired("url")

    fun imageId(): String? = imageId.getNullable("image_id")

    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonProperty("image_id") @ExcludeMissing fun _imageId(): JsonField<String> = imageId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ImageUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        url()
        imageId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ImageUpdateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .url()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ImageUpdateResponse]. */
    class Builder internal constructor() {

        private var url: JsonField<String>? = null
        private var imageId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(imageUpdateResponse: ImageUpdateResponse) = apply {
            url = imageUpdateResponse.url
            imageId = imageUpdateResponse.imageId
            additionalProperties = imageUpdateResponse.additionalProperties.toMutableMap()
        }

        fun url(url: String) = url(JsonField.of(url))

        fun url(url: JsonField<String>) = apply { this.url = url }

        fun imageId(imageId: String?) = imageId(JsonField.ofNullable(imageId))

        fun imageId(imageId: JsonField<String>) = apply { this.imageId = imageId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): ImageUpdateResponse =
            ImageUpdateResponse(
                checkRequired("url", url),
                imageId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ImageUpdateResponse && url == other.url && imageId == other.imageId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(url, imageId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ImageUpdateResponse{url=$url, imageId=$imageId, additionalProperties=$additionalProperties}"
}
