// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers

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
class CustomerPortalSession
@JsonCreator
private constructor(
    @JsonProperty("link") @ExcludeMissing private val link: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun link(): String = link.getRequired("link")

    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerPortalSession = apply {
        if (validated) {
            return@apply
        }

        link()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerPortalSession].
         *
         * The following fields are required:
         * ```kotlin
         * .link()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerPortalSession]. */
    class Builder internal constructor() {

        private var link: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerPortalSession: CustomerPortalSession) = apply {
            link = customerPortalSession.link
            additionalProperties = customerPortalSession.additionalProperties.toMutableMap()
        }

        fun link(link: String) = link(JsonField.of(link))

        fun link(link: JsonField<String>) = apply { this.link = link }

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

        fun build(): CustomerPortalSession =
            CustomerPortalSession(checkRequired("link", link), additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerPortalSession && link == other.link && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(link, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerPortalSession{link=$link, additionalProperties=$additionalProperties}"
}
