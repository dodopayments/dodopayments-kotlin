// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.moderation

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** How each score in `categories` was measured. */
class ModerationCategoryProvenance
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val childSexualExploitation: JsonField<ModerationProvenance>,
    private val defamation: JsonField<ModerationProvenance>,
    private val hate: JsonField<ModerationProvenance>,
    private val indiscriminateWeapons: JsonField<ModerationProvenance>,
    private val intellectualProperty: JsonField<ModerationProvenance>,
    private val livingArtistStyle: JsonField<ModerationProvenance>,
    private val minorCodedLanguage: JsonField<ModerationProvenance>,
    private val nonConsensualIntimateImagery: JsonField<ModerationProvenance>,
    private val nonViolentCrimes: JsonField<ModerationProvenance>,
    private val privacy: JsonField<ModerationProvenance>,
    private val promptInjection: JsonField<ModerationProvenance>,
    private val realPersonLikeness: JsonField<ModerationProvenance>,
    private val sexRelatedCrimes: JsonField<ModerationProvenance>,
    private val sexualContent: JsonField<ModerationProvenance>,
    private val specializedAdvice: JsonField<ModerationProvenance>,
    private val suicideAndSelfHarm: JsonField<ModerationProvenance>,
    private val violentCrimes: JsonField<ModerationProvenance>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("child_sexual_exploitation")
        @ExcludeMissing
        childSexualExploitation: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("defamation")
        @ExcludeMissing
        defamation: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("hate")
        @ExcludeMissing
        hate: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("indiscriminate_weapons")
        @ExcludeMissing
        indiscriminateWeapons: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("intellectual_property")
        @ExcludeMissing
        intellectualProperty: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("living_artist_style")
        @ExcludeMissing
        livingArtistStyle: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("minor_coded_language")
        @ExcludeMissing
        minorCodedLanguage: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("non_consensual_intimate_imagery")
        @ExcludeMissing
        nonConsensualIntimateImagery: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("non_violent_crimes")
        @ExcludeMissing
        nonViolentCrimes: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("privacy")
        @ExcludeMissing
        privacy: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("prompt_injection")
        @ExcludeMissing
        promptInjection: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("real_person_likeness")
        @ExcludeMissing
        realPersonLikeness: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("sex_related_crimes")
        @ExcludeMissing
        sexRelatedCrimes: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("sexual_content")
        @ExcludeMissing
        sexualContent: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("specialized_advice")
        @ExcludeMissing
        specializedAdvice: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("suicide_and_self_harm")
        @ExcludeMissing
        suicideAndSelfHarm: JsonField<ModerationProvenance> = JsonMissing.of(),
        @JsonProperty("violent_crimes")
        @ExcludeMissing
        violentCrimes: JsonField<ModerationProvenance> = JsonMissing.of(),
    ) : this(
        childSexualExploitation,
        defamation,
        hate,
        indiscriminateWeapons,
        intellectualProperty,
        livingArtistStyle,
        minorCodedLanguage,
        nonConsensualIntimateImagery,
        nonViolentCrimes,
        privacy,
        promptInjection,
        realPersonLikeness,
        sexRelatedCrimes,
        sexualContent,
        specializedAdvice,
        suicideAndSelfHarm,
        violentCrimes,
        mutableMapOf(),
    )

    /**
     * Child sexual exploitation.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun childSexualExploitation(): ModerationProvenance =
        childSexualExploitation.getRequired("child_sexual_exploitation")

    /**
     * False depiction that is likely to injure the reputation of a real person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defamation(): ModerationProvenance = defamation.getRequired("defamation")

    /**
     * Demeaning people because of a protected characteristic.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hate(): ModerationProvenance = hate.getRequired("hate")

    /**
     * Chemical, biological, radiological, nuclear or explosive weapons.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indiscriminateWeapons(): ModerationProvenance =
        indiscriminateWeapons.getRequired("indiscriminate_weapons")

    /**
     * Copyright or trademark infringement.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun intellectualProperty(): ModerationProvenance =
        intellectualProperty.getRequired("intellectual_property")

    /**
     * Imitation of the signature style of a specific living artist.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun livingArtistStyle(): ModerationProvenance =
        livingArtistStyle.getRequired("living_artist_style")

    /**
     * Age-coded language that suggests the subject is a minor.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minorCodedLanguage(): ModerationProvenance =
        minorCodedLanguage.getRequired("minor_coded_language")

    /**
     * Non-consensual intimate imagery: undressing, nudifying or sexualising a real person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nonConsensualIntimateImagery(): ModerationProvenance =
        nonConsensualIntimateImagery.getRequired("non_consensual_intimate_imagery")

    /**
     * Non-violent crimes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nonViolentCrimes(): ModerationProvenance =
        nonViolentCrimes.getRequired("non_violent_crimes")

    /**
     * Sensitive private information about a person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun privacy(): ModerationProvenance = privacy.getRequired("privacy")

    /**
     * An attempt to override or manipulate the instructions of the system.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun promptInjection(): ModerationProvenance = promptInjection.getRequired("prompt_injection")

    /**
     * The likeness of a real, identifiable, named person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun realPersonLikeness(): ModerationProvenance =
        realPersonLikeness.getRequired("real_person_likeness")

    /**
     * Sex-related crimes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sexRelatedCrimes(): ModerationProvenance =
        sexRelatedCrimes.getRequired("sex_related_crimes")

    /**
     * Sexually explicit or pornographic content.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sexualContent(): ModerationProvenance = sexualContent.getRequired("sexual_content")

    /**
     * Unqualified financial, medical, legal or electoral advice.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun specializedAdvice(): ModerationProvenance =
        specializedAdvice.getRequired("specialized_advice")

    /**
     * Suicide and self-harm.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun suicideAndSelfHarm(): ModerationProvenance =
        suicideAndSelfHarm.getRequired("suicide_and_self_harm")

    /**
     * Violent crimes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun violentCrimes(): ModerationProvenance = violentCrimes.getRequired("violent_crimes")

    /**
     * Returns the raw JSON value of [childSexualExploitation].
     *
     * Unlike [childSexualExploitation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("child_sexual_exploitation")
    @ExcludeMissing
    fun _childSexualExploitation(): JsonField<ModerationProvenance> = childSexualExploitation

    /**
     * Returns the raw JSON value of [defamation].
     *
     * Unlike [defamation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defamation")
    @ExcludeMissing
    fun _defamation(): JsonField<ModerationProvenance> = defamation

    /**
     * Returns the raw JSON value of [hate].
     *
     * Unlike [hate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hate") @ExcludeMissing fun _hate(): JsonField<ModerationProvenance> = hate

    /**
     * Returns the raw JSON value of [indiscriminateWeapons].
     *
     * Unlike [indiscriminateWeapons], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("indiscriminate_weapons")
    @ExcludeMissing
    fun _indiscriminateWeapons(): JsonField<ModerationProvenance> = indiscriminateWeapons

    /**
     * Returns the raw JSON value of [intellectualProperty].
     *
     * Unlike [intellectualProperty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("intellectual_property")
    @ExcludeMissing
    fun _intellectualProperty(): JsonField<ModerationProvenance> = intellectualProperty

    /**
     * Returns the raw JSON value of [livingArtistStyle].
     *
     * Unlike [livingArtistStyle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("living_artist_style")
    @ExcludeMissing
    fun _livingArtistStyle(): JsonField<ModerationProvenance> = livingArtistStyle

    /**
     * Returns the raw JSON value of [minorCodedLanguage].
     *
     * Unlike [minorCodedLanguage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minor_coded_language")
    @ExcludeMissing
    fun _minorCodedLanguage(): JsonField<ModerationProvenance> = minorCodedLanguage

    /**
     * Returns the raw JSON value of [nonConsensualIntimateImagery].
     *
     * Unlike [nonConsensualIntimateImagery], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("non_consensual_intimate_imagery")
    @ExcludeMissing
    fun _nonConsensualIntimateImagery(): JsonField<ModerationProvenance> =
        nonConsensualIntimateImagery

    /**
     * Returns the raw JSON value of [nonViolentCrimes].
     *
     * Unlike [nonViolentCrimes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("non_violent_crimes")
    @ExcludeMissing
    fun _nonViolentCrimes(): JsonField<ModerationProvenance> = nonViolentCrimes

    /**
     * Returns the raw JSON value of [privacy].
     *
     * Unlike [privacy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privacy")
    @ExcludeMissing
    fun _privacy(): JsonField<ModerationProvenance> = privacy

    /**
     * Returns the raw JSON value of [promptInjection].
     *
     * Unlike [promptInjection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_injection")
    @ExcludeMissing
    fun _promptInjection(): JsonField<ModerationProvenance> = promptInjection

    /**
     * Returns the raw JSON value of [realPersonLikeness].
     *
     * Unlike [realPersonLikeness], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("real_person_likeness")
    @ExcludeMissing
    fun _realPersonLikeness(): JsonField<ModerationProvenance> = realPersonLikeness

    /**
     * Returns the raw JSON value of [sexRelatedCrimes].
     *
     * Unlike [sexRelatedCrimes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sex_related_crimes")
    @ExcludeMissing
    fun _sexRelatedCrimes(): JsonField<ModerationProvenance> = sexRelatedCrimes

    /**
     * Returns the raw JSON value of [sexualContent].
     *
     * Unlike [sexualContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sexual_content")
    @ExcludeMissing
    fun _sexualContent(): JsonField<ModerationProvenance> = sexualContent

    /**
     * Returns the raw JSON value of [specializedAdvice].
     *
     * Unlike [specializedAdvice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("specialized_advice")
    @ExcludeMissing
    fun _specializedAdvice(): JsonField<ModerationProvenance> = specializedAdvice

    /**
     * Returns the raw JSON value of [suicideAndSelfHarm].
     *
     * Unlike [suicideAndSelfHarm], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("suicide_and_self_harm")
    @ExcludeMissing
    fun _suicideAndSelfHarm(): JsonField<ModerationProvenance> = suicideAndSelfHarm

    /**
     * Returns the raw JSON value of [violentCrimes].
     *
     * Unlike [violentCrimes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("violent_crimes")
    @ExcludeMissing
    fun _violentCrimes(): JsonField<ModerationProvenance> = violentCrimes

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ModerationCategoryProvenance].
         *
         * The following fields are required:
         * ```kotlin
         * .childSexualExploitation()
         * .defamation()
         * .hate()
         * .indiscriminateWeapons()
         * .intellectualProperty()
         * .livingArtistStyle()
         * .minorCodedLanguage()
         * .nonConsensualIntimateImagery()
         * .nonViolentCrimes()
         * .privacy()
         * .promptInjection()
         * .realPersonLikeness()
         * .sexRelatedCrimes()
         * .sexualContent()
         * .specializedAdvice()
         * .suicideAndSelfHarm()
         * .violentCrimes()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ModerationCategoryProvenance]. */
    class Builder internal constructor() {

        private var childSexualExploitation: JsonField<ModerationProvenance>? = null
        private var defamation: JsonField<ModerationProvenance>? = null
        private var hate: JsonField<ModerationProvenance>? = null
        private var indiscriminateWeapons: JsonField<ModerationProvenance>? = null
        private var intellectualProperty: JsonField<ModerationProvenance>? = null
        private var livingArtistStyle: JsonField<ModerationProvenance>? = null
        private var minorCodedLanguage: JsonField<ModerationProvenance>? = null
        private var nonConsensualIntimateImagery: JsonField<ModerationProvenance>? = null
        private var nonViolentCrimes: JsonField<ModerationProvenance>? = null
        private var privacy: JsonField<ModerationProvenance>? = null
        private var promptInjection: JsonField<ModerationProvenance>? = null
        private var realPersonLikeness: JsonField<ModerationProvenance>? = null
        private var sexRelatedCrimes: JsonField<ModerationProvenance>? = null
        private var sexualContent: JsonField<ModerationProvenance>? = null
        private var specializedAdvice: JsonField<ModerationProvenance>? = null
        private var suicideAndSelfHarm: JsonField<ModerationProvenance>? = null
        private var violentCrimes: JsonField<ModerationProvenance>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(moderationCategoryProvenance: ModerationCategoryProvenance) = apply {
            childSexualExploitation = moderationCategoryProvenance.childSexualExploitation
            defamation = moderationCategoryProvenance.defamation
            hate = moderationCategoryProvenance.hate
            indiscriminateWeapons = moderationCategoryProvenance.indiscriminateWeapons
            intellectualProperty = moderationCategoryProvenance.intellectualProperty
            livingArtistStyle = moderationCategoryProvenance.livingArtistStyle
            minorCodedLanguage = moderationCategoryProvenance.minorCodedLanguage
            nonConsensualIntimateImagery = moderationCategoryProvenance.nonConsensualIntimateImagery
            nonViolentCrimes = moderationCategoryProvenance.nonViolentCrimes
            privacy = moderationCategoryProvenance.privacy
            promptInjection = moderationCategoryProvenance.promptInjection
            realPersonLikeness = moderationCategoryProvenance.realPersonLikeness
            sexRelatedCrimes = moderationCategoryProvenance.sexRelatedCrimes
            sexualContent = moderationCategoryProvenance.sexualContent
            specializedAdvice = moderationCategoryProvenance.specializedAdvice
            suicideAndSelfHarm = moderationCategoryProvenance.suicideAndSelfHarm
            violentCrimes = moderationCategoryProvenance.violentCrimes
            additionalProperties = moderationCategoryProvenance.additionalProperties.toMutableMap()
        }

        /** Child sexual exploitation. */
        fun childSexualExploitation(childSexualExploitation: ModerationProvenance) =
            childSexualExploitation(JsonField.of(childSexualExploitation))

        /**
         * Sets [Builder.childSexualExploitation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childSexualExploitation] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun childSexualExploitation(childSexualExploitation: JsonField<ModerationProvenance>) =
            apply {
                this.childSexualExploitation = childSexualExploitation
            }

        /** False depiction that is likely to injure the reputation of a real person. */
        fun defamation(defamation: ModerationProvenance) = defamation(JsonField.of(defamation))

        /**
         * Sets [Builder.defamation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defamation] with a well-typed [ModerationProvenance]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defamation(defamation: JsonField<ModerationProvenance>) = apply {
            this.defamation = defamation
        }

        /** Demeaning people because of a protected characteristic. */
        fun hate(hate: ModerationProvenance) = hate(JsonField.of(hate))

        /**
         * Sets [Builder.hate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hate] with a well-typed [ModerationProvenance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hate(hate: JsonField<ModerationProvenance>) = apply { this.hate = hate }

        /** Chemical, biological, radiological, nuclear or explosive weapons. */
        fun indiscriminateWeapons(indiscriminateWeapons: ModerationProvenance) =
            indiscriminateWeapons(JsonField.of(indiscriminateWeapons))

        /**
         * Sets [Builder.indiscriminateWeapons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indiscriminateWeapons] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun indiscriminateWeapons(indiscriminateWeapons: JsonField<ModerationProvenance>) = apply {
            this.indiscriminateWeapons = indiscriminateWeapons
        }

        /** Copyright or trademark infringement. */
        fun intellectualProperty(intellectualProperty: ModerationProvenance) =
            intellectualProperty(JsonField.of(intellectualProperty))

        /**
         * Sets [Builder.intellectualProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intellectualProperty] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun intellectualProperty(intellectualProperty: JsonField<ModerationProvenance>) = apply {
            this.intellectualProperty = intellectualProperty
        }

        /** Imitation of the signature style of a specific living artist. */
        fun livingArtistStyle(livingArtistStyle: ModerationProvenance) =
            livingArtistStyle(JsonField.of(livingArtistStyle))

        /**
         * Sets [Builder.livingArtistStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.livingArtistStyle] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun livingArtistStyle(livingArtistStyle: JsonField<ModerationProvenance>) = apply {
            this.livingArtistStyle = livingArtistStyle
        }

        /** Age-coded language that suggests the subject is a minor. */
        fun minorCodedLanguage(minorCodedLanguage: ModerationProvenance) =
            minorCodedLanguage(JsonField.of(minorCodedLanguage))

        /**
         * Sets [Builder.minorCodedLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minorCodedLanguage] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun minorCodedLanguage(minorCodedLanguage: JsonField<ModerationProvenance>) = apply {
            this.minorCodedLanguage = minorCodedLanguage
        }

        /** Non-consensual intimate imagery: undressing, nudifying or sexualising a real person. */
        fun nonConsensualIntimateImagery(nonConsensualIntimateImagery: ModerationProvenance) =
            nonConsensualIntimateImagery(JsonField.of(nonConsensualIntimateImagery))

        /**
         * Sets [Builder.nonConsensualIntimateImagery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonConsensualIntimateImagery] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun nonConsensualIntimateImagery(
            nonConsensualIntimateImagery: JsonField<ModerationProvenance>
        ) = apply { this.nonConsensualIntimateImagery = nonConsensualIntimateImagery }

        /** Non-violent crimes. */
        fun nonViolentCrimes(nonViolentCrimes: ModerationProvenance) =
            nonViolentCrimes(JsonField.of(nonViolentCrimes))

        /**
         * Sets [Builder.nonViolentCrimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonViolentCrimes] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun nonViolentCrimes(nonViolentCrimes: JsonField<ModerationProvenance>) = apply {
            this.nonViolentCrimes = nonViolentCrimes
        }

        /** Sensitive private information about a person. */
        fun privacy(privacy: ModerationProvenance) = privacy(JsonField.of(privacy))

        /**
         * Sets [Builder.privacy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacy] with a well-typed [ModerationProvenance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privacy(privacy: JsonField<ModerationProvenance>) = apply { this.privacy = privacy }

        /** An attempt to override or manipulate the instructions of the system. */
        fun promptInjection(promptInjection: ModerationProvenance) =
            promptInjection(JsonField.of(promptInjection))

        /**
         * Sets [Builder.promptInjection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptInjection] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun promptInjection(promptInjection: JsonField<ModerationProvenance>) = apply {
            this.promptInjection = promptInjection
        }

        /** The likeness of a real, identifiable, named person. */
        fun realPersonLikeness(realPersonLikeness: ModerationProvenance) =
            realPersonLikeness(JsonField.of(realPersonLikeness))

        /**
         * Sets [Builder.realPersonLikeness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.realPersonLikeness] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun realPersonLikeness(realPersonLikeness: JsonField<ModerationProvenance>) = apply {
            this.realPersonLikeness = realPersonLikeness
        }

        /** Sex-related crimes. */
        fun sexRelatedCrimes(sexRelatedCrimes: ModerationProvenance) =
            sexRelatedCrimes(JsonField.of(sexRelatedCrimes))

        /**
         * Sets [Builder.sexRelatedCrimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sexRelatedCrimes] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun sexRelatedCrimes(sexRelatedCrimes: JsonField<ModerationProvenance>) = apply {
            this.sexRelatedCrimes = sexRelatedCrimes
        }

        /** Sexually explicit or pornographic content. */
        fun sexualContent(sexualContent: ModerationProvenance) =
            sexualContent(JsonField.of(sexualContent))

        /**
         * Sets [Builder.sexualContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sexualContent] with a well-typed [ModerationProvenance]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sexualContent(sexualContent: JsonField<ModerationProvenance>) = apply {
            this.sexualContent = sexualContent
        }

        /** Unqualified financial, medical, legal or electoral advice. */
        fun specializedAdvice(specializedAdvice: ModerationProvenance) =
            specializedAdvice(JsonField.of(specializedAdvice))

        /**
         * Sets [Builder.specializedAdvice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specializedAdvice] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun specializedAdvice(specializedAdvice: JsonField<ModerationProvenance>) = apply {
            this.specializedAdvice = specializedAdvice
        }

        /** Suicide and self-harm. */
        fun suicideAndSelfHarm(suicideAndSelfHarm: ModerationProvenance) =
            suicideAndSelfHarm(JsonField.of(suicideAndSelfHarm))

        /**
         * Sets [Builder.suicideAndSelfHarm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suicideAndSelfHarm] with a well-typed
         * [ModerationProvenance] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun suicideAndSelfHarm(suicideAndSelfHarm: JsonField<ModerationProvenance>) = apply {
            this.suicideAndSelfHarm = suicideAndSelfHarm
        }

        /** Violent crimes. */
        fun violentCrimes(violentCrimes: ModerationProvenance) =
            violentCrimes(JsonField.of(violentCrimes))

        /**
         * Sets [Builder.violentCrimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.violentCrimes] with a well-typed [ModerationProvenance]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun violentCrimes(violentCrimes: JsonField<ModerationProvenance>) = apply {
            this.violentCrimes = violentCrimes
        }

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

        /**
         * Returns an immutable instance of [ModerationCategoryProvenance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .childSexualExploitation()
         * .defamation()
         * .hate()
         * .indiscriminateWeapons()
         * .intellectualProperty()
         * .livingArtistStyle()
         * .minorCodedLanguage()
         * .nonConsensualIntimateImagery()
         * .nonViolentCrimes()
         * .privacy()
         * .promptInjection()
         * .realPersonLikeness()
         * .sexRelatedCrimes()
         * .sexualContent()
         * .specializedAdvice()
         * .suicideAndSelfHarm()
         * .violentCrimes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModerationCategoryProvenance =
            ModerationCategoryProvenance(
                checkRequired("childSexualExploitation", childSexualExploitation),
                checkRequired("defamation", defamation),
                checkRequired("hate", hate),
                checkRequired("indiscriminateWeapons", indiscriminateWeapons),
                checkRequired("intellectualProperty", intellectualProperty),
                checkRequired("livingArtistStyle", livingArtistStyle),
                checkRequired("minorCodedLanguage", minorCodedLanguage),
                checkRequired("nonConsensualIntimateImagery", nonConsensualIntimateImagery),
                checkRequired("nonViolentCrimes", nonViolentCrimes),
                checkRequired("privacy", privacy),
                checkRequired("promptInjection", promptInjection),
                checkRequired("realPersonLikeness", realPersonLikeness),
                checkRequired("sexRelatedCrimes", sexRelatedCrimes),
                checkRequired("sexualContent", sexualContent),
                checkRequired("specializedAdvice", specializedAdvice),
                checkRequired("suicideAndSelfHarm", suicideAndSelfHarm),
                checkRequired("violentCrimes", violentCrimes),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ModerationCategoryProvenance = apply {
        if (validated) {
            return@apply
        }

        childSexualExploitation().validate()
        defamation().validate()
        hate().validate()
        indiscriminateWeapons().validate()
        intellectualProperty().validate()
        livingArtistStyle().validate()
        minorCodedLanguage().validate()
        nonConsensualIntimateImagery().validate()
        nonViolentCrimes().validate()
        privacy().validate()
        promptInjection().validate()
        realPersonLikeness().validate()
        sexRelatedCrimes().validate()
        sexualContent().validate()
        specializedAdvice().validate()
        suicideAndSelfHarm().validate()
        violentCrimes().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: DodoPaymentsInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (childSexualExploitation.asKnown()?.validity() ?: 0) +
            (defamation.asKnown()?.validity() ?: 0) +
            (hate.asKnown()?.validity() ?: 0) +
            (indiscriminateWeapons.asKnown()?.validity() ?: 0) +
            (intellectualProperty.asKnown()?.validity() ?: 0) +
            (livingArtistStyle.asKnown()?.validity() ?: 0) +
            (minorCodedLanguage.asKnown()?.validity() ?: 0) +
            (nonConsensualIntimateImagery.asKnown()?.validity() ?: 0) +
            (nonViolentCrimes.asKnown()?.validity() ?: 0) +
            (privacy.asKnown()?.validity() ?: 0) +
            (promptInjection.asKnown()?.validity() ?: 0) +
            (realPersonLikeness.asKnown()?.validity() ?: 0) +
            (sexRelatedCrimes.asKnown()?.validity() ?: 0) +
            (sexualContent.asKnown()?.validity() ?: 0) +
            (specializedAdvice.asKnown()?.validity() ?: 0) +
            (suicideAndSelfHarm.asKnown()?.validity() ?: 0) +
            (violentCrimes.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModerationCategoryProvenance &&
            childSexualExploitation == other.childSexualExploitation &&
            defamation == other.defamation &&
            hate == other.hate &&
            indiscriminateWeapons == other.indiscriminateWeapons &&
            intellectualProperty == other.intellectualProperty &&
            livingArtistStyle == other.livingArtistStyle &&
            minorCodedLanguage == other.minorCodedLanguage &&
            nonConsensualIntimateImagery == other.nonConsensualIntimateImagery &&
            nonViolentCrimes == other.nonViolentCrimes &&
            privacy == other.privacy &&
            promptInjection == other.promptInjection &&
            realPersonLikeness == other.realPersonLikeness &&
            sexRelatedCrimes == other.sexRelatedCrimes &&
            sexualContent == other.sexualContent &&
            specializedAdvice == other.specializedAdvice &&
            suicideAndSelfHarm == other.suicideAndSelfHarm &&
            violentCrimes == other.violentCrimes &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            childSexualExploitation,
            defamation,
            hate,
            indiscriminateWeapons,
            intellectualProperty,
            livingArtistStyle,
            minorCodedLanguage,
            nonConsensualIntimateImagery,
            nonViolentCrimes,
            privacy,
            promptInjection,
            realPersonLikeness,
            sexRelatedCrimes,
            sexualContent,
            specializedAdvice,
            suicideAndSelfHarm,
            violentCrimes,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModerationCategoryProvenance{childSexualExploitation=$childSexualExploitation, defamation=$defamation, hate=$hate, indiscriminateWeapons=$indiscriminateWeapons, intellectualProperty=$intellectualProperty, livingArtistStyle=$livingArtistStyle, minorCodedLanguage=$minorCodedLanguage, nonConsensualIntimateImagery=$nonConsensualIntimateImagery, nonViolentCrimes=$nonViolentCrimes, privacy=$privacy, promptInjection=$promptInjection, realPersonLikeness=$realPersonLikeness, sexRelatedCrimes=$sexRelatedCrimes, sexualContent=$sexualContent, specializedAdvice=$specializedAdvice, suicideAndSelfHarm=$suicideAndSelfHarm, violentCrimes=$violentCrimes, additionalProperties=$additionalProperties}"
}
