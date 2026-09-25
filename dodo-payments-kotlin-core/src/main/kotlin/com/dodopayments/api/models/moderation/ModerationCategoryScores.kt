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

/** The probability, from 0 to 1, that the screen falls in each category. */
class ModerationCategoryScores
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val childSexualExploitation: JsonField<Double>,
    private val defamation: JsonField<Double>,
    private val hate: JsonField<Double>,
    private val indiscriminateWeapons: JsonField<Double>,
    private val intellectualProperty: JsonField<Double>,
    private val livingArtistStyle: JsonField<Double>,
    private val minorCodedLanguage: JsonField<Double>,
    private val nonConsensualIntimateImagery: JsonField<Double>,
    private val nonViolentCrimes: JsonField<Double>,
    private val privacy: JsonField<Double>,
    private val promptInjection: JsonField<Double>,
    private val realPersonLikeness: JsonField<Double>,
    private val sexRelatedCrimes: JsonField<Double>,
    private val sexualContent: JsonField<Double>,
    private val specializedAdvice: JsonField<Double>,
    private val suicideAndSelfHarm: JsonField<Double>,
    private val violentCrimes: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("child_sexual_exploitation")
        @ExcludeMissing
        childSexualExploitation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("defamation")
        @ExcludeMissing
        defamation: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hate") @ExcludeMissing hate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("indiscriminate_weapons")
        @ExcludeMissing
        indiscriminateWeapons: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("intellectual_property")
        @ExcludeMissing
        intellectualProperty: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("living_artist_style")
        @ExcludeMissing
        livingArtistStyle: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minor_coded_language")
        @ExcludeMissing
        minorCodedLanguage: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("non_consensual_intimate_imagery")
        @ExcludeMissing
        nonConsensualIntimateImagery: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("non_violent_crimes")
        @ExcludeMissing
        nonViolentCrimes: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("privacy") @ExcludeMissing privacy: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("prompt_injection")
        @ExcludeMissing
        promptInjection: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("real_person_likeness")
        @ExcludeMissing
        realPersonLikeness: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sex_related_crimes")
        @ExcludeMissing
        sexRelatedCrimes: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sexual_content")
        @ExcludeMissing
        sexualContent: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("specialized_advice")
        @ExcludeMissing
        specializedAdvice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("suicide_and_self_harm")
        @ExcludeMissing
        suicideAndSelfHarm: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("violent_crimes")
        @ExcludeMissing
        violentCrimes: JsonField<Double> = JsonMissing.of(),
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
    fun childSexualExploitation(): Double =
        childSexualExploitation.getRequired("child_sexual_exploitation")

    /**
     * False depiction that is likely to injure the reputation of a real person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defamation(): Double = defamation.getRequired("defamation")

    /**
     * Demeaning people because of a protected characteristic.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hate(): Double = hate.getRequired("hate")

    /**
     * Chemical, biological, radiological, nuclear or explosive weapons.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indiscriminateWeapons(): Double =
        indiscriminateWeapons.getRequired("indiscriminate_weapons")

    /**
     * Copyright or trademark infringement.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun intellectualProperty(): Double = intellectualProperty.getRequired("intellectual_property")

    /**
     * Imitation of the signature style of a specific living artist.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun livingArtistStyle(): Double = livingArtistStyle.getRequired("living_artist_style")

    /**
     * Age-coded language that suggests the subject is a minor.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minorCodedLanguage(): Double = minorCodedLanguage.getRequired("minor_coded_language")

    /**
     * Non-consensual intimate imagery: undressing, nudifying or sexualising a real person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nonConsensualIntimateImagery(): Double =
        nonConsensualIntimateImagery.getRequired("non_consensual_intimate_imagery")

    /**
     * Non-violent crimes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nonViolentCrimes(): Double = nonViolentCrimes.getRequired("non_violent_crimes")

    /**
     * Sensitive private information about a person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun privacy(): Double = privacy.getRequired("privacy")

    /**
     * An attempt to override or manipulate the instructions of the system.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun promptInjection(): Double = promptInjection.getRequired("prompt_injection")

    /**
     * The likeness of a real, identifiable, named person.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun realPersonLikeness(): Double = realPersonLikeness.getRequired("real_person_likeness")

    /**
     * Sex-related crimes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sexRelatedCrimes(): Double = sexRelatedCrimes.getRequired("sex_related_crimes")

    /**
     * Sexually explicit or pornographic content.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sexualContent(): Double = sexualContent.getRequired("sexual_content")

    /**
     * Unqualified financial, medical, legal or electoral advice.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun specializedAdvice(): Double = specializedAdvice.getRequired("specialized_advice")

    /**
     * Suicide and self-harm.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun suicideAndSelfHarm(): Double = suicideAndSelfHarm.getRequired("suicide_and_self_harm")

    /**
     * Violent crimes.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun violentCrimes(): Double = violentCrimes.getRequired("violent_crimes")

    /**
     * Returns the raw JSON value of [childSexualExploitation].
     *
     * Unlike [childSexualExploitation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("child_sexual_exploitation")
    @ExcludeMissing
    fun _childSexualExploitation(): JsonField<Double> = childSexualExploitation

    /**
     * Returns the raw JSON value of [defamation].
     *
     * Unlike [defamation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defamation") @ExcludeMissing fun _defamation(): JsonField<Double> = defamation

    /**
     * Returns the raw JSON value of [hate].
     *
     * Unlike [hate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hate") @ExcludeMissing fun _hate(): JsonField<Double> = hate

    /**
     * Returns the raw JSON value of [indiscriminateWeapons].
     *
     * Unlike [indiscriminateWeapons], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("indiscriminate_weapons")
    @ExcludeMissing
    fun _indiscriminateWeapons(): JsonField<Double> = indiscriminateWeapons

    /**
     * Returns the raw JSON value of [intellectualProperty].
     *
     * Unlike [intellectualProperty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("intellectual_property")
    @ExcludeMissing
    fun _intellectualProperty(): JsonField<Double> = intellectualProperty

    /**
     * Returns the raw JSON value of [livingArtistStyle].
     *
     * Unlike [livingArtistStyle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("living_artist_style")
    @ExcludeMissing
    fun _livingArtistStyle(): JsonField<Double> = livingArtistStyle

    /**
     * Returns the raw JSON value of [minorCodedLanguage].
     *
     * Unlike [minorCodedLanguage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minor_coded_language")
    @ExcludeMissing
    fun _minorCodedLanguage(): JsonField<Double> = minorCodedLanguage

    /**
     * Returns the raw JSON value of [nonConsensualIntimateImagery].
     *
     * Unlike [nonConsensualIntimateImagery], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("non_consensual_intimate_imagery")
    @ExcludeMissing
    fun _nonConsensualIntimateImagery(): JsonField<Double> = nonConsensualIntimateImagery

    /**
     * Returns the raw JSON value of [nonViolentCrimes].
     *
     * Unlike [nonViolentCrimes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("non_violent_crimes")
    @ExcludeMissing
    fun _nonViolentCrimes(): JsonField<Double> = nonViolentCrimes

    /**
     * Returns the raw JSON value of [privacy].
     *
     * Unlike [privacy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privacy") @ExcludeMissing fun _privacy(): JsonField<Double> = privacy

    /**
     * Returns the raw JSON value of [promptInjection].
     *
     * Unlike [promptInjection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prompt_injection")
    @ExcludeMissing
    fun _promptInjection(): JsonField<Double> = promptInjection

    /**
     * Returns the raw JSON value of [realPersonLikeness].
     *
     * Unlike [realPersonLikeness], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("real_person_likeness")
    @ExcludeMissing
    fun _realPersonLikeness(): JsonField<Double> = realPersonLikeness

    /**
     * Returns the raw JSON value of [sexRelatedCrimes].
     *
     * Unlike [sexRelatedCrimes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("sex_related_crimes")
    @ExcludeMissing
    fun _sexRelatedCrimes(): JsonField<Double> = sexRelatedCrimes

    /**
     * Returns the raw JSON value of [sexualContent].
     *
     * Unlike [sexualContent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sexual_content")
    @ExcludeMissing
    fun _sexualContent(): JsonField<Double> = sexualContent

    /**
     * Returns the raw JSON value of [specializedAdvice].
     *
     * Unlike [specializedAdvice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("specialized_advice")
    @ExcludeMissing
    fun _specializedAdvice(): JsonField<Double> = specializedAdvice

    /**
     * Returns the raw JSON value of [suicideAndSelfHarm].
     *
     * Unlike [suicideAndSelfHarm], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("suicide_and_self_harm")
    @ExcludeMissing
    fun _suicideAndSelfHarm(): JsonField<Double> = suicideAndSelfHarm

    /**
     * Returns the raw JSON value of [violentCrimes].
     *
     * Unlike [violentCrimes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("violent_crimes")
    @ExcludeMissing
    fun _violentCrimes(): JsonField<Double> = violentCrimes

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
         * Returns a mutable builder for constructing an instance of [ModerationCategoryScores].
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

    /** A builder for [ModerationCategoryScores]. */
    class Builder internal constructor() {

        private var childSexualExploitation: JsonField<Double>? = null
        private var defamation: JsonField<Double>? = null
        private var hate: JsonField<Double>? = null
        private var indiscriminateWeapons: JsonField<Double>? = null
        private var intellectualProperty: JsonField<Double>? = null
        private var livingArtistStyle: JsonField<Double>? = null
        private var minorCodedLanguage: JsonField<Double>? = null
        private var nonConsensualIntimateImagery: JsonField<Double>? = null
        private var nonViolentCrimes: JsonField<Double>? = null
        private var privacy: JsonField<Double>? = null
        private var promptInjection: JsonField<Double>? = null
        private var realPersonLikeness: JsonField<Double>? = null
        private var sexRelatedCrimes: JsonField<Double>? = null
        private var sexualContent: JsonField<Double>? = null
        private var specializedAdvice: JsonField<Double>? = null
        private var suicideAndSelfHarm: JsonField<Double>? = null
        private var violentCrimes: JsonField<Double>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(moderationCategoryScores: ModerationCategoryScores) = apply {
            childSexualExploitation = moderationCategoryScores.childSexualExploitation
            defamation = moderationCategoryScores.defamation
            hate = moderationCategoryScores.hate
            indiscriminateWeapons = moderationCategoryScores.indiscriminateWeapons
            intellectualProperty = moderationCategoryScores.intellectualProperty
            livingArtistStyle = moderationCategoryScores.livingArtistStyle
            minorCodedLanguage = moderationCategoryScores.minorCodedLanguage
            nonConsensualIntimateImagery = moderationCategoryScores.nonConsensualIntimateImagery
            nonViolentCrimes = moderationCategoryScores.nonViolentCrimes
            privacy = moderationCategoryScores.privacy
            promptInjection = moderationCategoryScores.promptInjection
            realPersonLikeness = moderationCategoryScores.realPersonLikeness
            sexRelatedCrimes = moderationCategoryScores.sexRelatedCrimes
            sexualContent = moderationCategoryScores.sexualContent
            specializedAdvice = moderationCategoryScores.specializedAdvice
            suicideAndSelfHarm = moderationCategoryScores.suicideAndSelfHarm
            violentCrimes = moderationCategoryScores.violentCrimes
            additionalProperties = moderationCategoryScores.additionalProperties.toMutableMap()
        }

        /** Child sexual exploitation. */
        fun childSexualExploitation(childSexualExploitation: Double) =
            childSexualExploitation(JsonField.of(childSexualExploitation))

        /**
         * Sets [Builder.childSexualExploitation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childSexualExploitation] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun childSexualExploitation(childSexualExploitation: JsonField<Double>) = apply {
            this.childSexualExploitation = childSexualExploitation
        }

        /** False depiction that is likely to injure the reputation of a real person. */
        fun defamation(defamation: Double) = defamation(JsonField.of(defamation))

        /**
         * Sets [Builder.defamation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defamation] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun defamation(defamation: JsonField<Double>) = apply { this.defamation = defamation }

        /** Demeaning people because of a protected characteristic. */
        fun hate(hate: Double) = hate(JsonField.of(hate))

        /**
         * Sets [Builder.hate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hate(hate: JsonField<Double>) = apply { this.hate = hate }

        /** Chemical, biological, radiological, nuclear or explosive weapons. */
        fun indiscriminateWeapons(indiscriminateWeapons: Double) =
            indiscriminateWeapons(JsonField.of(indiscriminateWeapons))

        /**
         * Sets [Builder.indiscriminateWeapons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indiscriminateWeapons] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indiscriminateWeapons(indiscriminateWeapons: JsonField<Double>) = apply {
            this.indiscriminateWeapons = indiscriminateWeapons
        }

        /** Copyright or trademark infringement. */
        fun intellectualProperty(intellectualProperty: Double) =
            intellectualProperty(JsonField.of(intellectualProperty))

        /**
         * Sets [Builder.intellectualProperty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intellectualProperty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intellectualProperty(intellectualProperty: JsonField<Double>) = apply {
            this.intellectualProperty = intellectualProperty
        }

        /** Imitation of the signature style of a specific living artist. */
        fun livingArtistStyle(livingArtistStyle: Double) =
            livingArtistStyle(JsonField.of(livingArtistStyle))

        /**
         * Sets [Builder.livingArtistStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.livingArtistStyle] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun livingArtistStyle(livingArtistStyle: JsonField<Double>) = apply {
            this.livingArtistStyle = livingArtistStyle
        }

        /** Age-coded language that suggests the subject is a minor. */
        fun minorCodedLanguage(minorCodedLanguage: Double) =
            minorCodedLanguage(JsonField.of(minorCodedLanguage))

        /**
         * Sets [Builder.minorCodedLanguage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minorCodedLanguage] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minorCodedLanguage(minorCodedLanguage: JsonField<Double>) = apply {
            this.minorCodedLanguage = minorCodedLanguage
        }

        /** Non-consensual intimate imagery: undressing, nudifying or sexualising a real person. */
        fun nonConsensualIntimateImagery(nonConsensualIntimateImagery: Double) =
            nonConsensualIntimateImagery(JsonField.of(nonConsensualIntimateImagery))

        /**
         * Sets [Builder.nonConsensualIntimateImagery] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonConsensualIntimateImagery] with a well-typed [Double]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nonConsensualIntimateImagery(nonConsensualIntimateImagery: JsonField<Double>) = apply {
            this.nonConsensualIntimateImagery = nonConsensualIntimateImagery
        }

        /** Non-violent crimes. */
        fun nonViolentCrimes(nonViolentCrimes: Double) =
            nonViolentCrimes(JsonField.of(nonViolentCrimes))

        /**
         * Sets [Builder.nonViolentCrimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonViolentCrimes] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nonViolentCrimes(nonViolentCrimes: JsonField<Double>) = apply {
            this.nonViolentCrimes = nonViolentCrimes
        }

        /** Sensitive private information about a person. */
        fun privacy(privacy: Double) = privacy(JsonField.of(privacy))

        /**
         * Sets [Builder.privacy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privacy] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun privacy(privacy: JsonField<Double>) = apply { this.privacy = privacy }

        /** An attempt to override or manipulate the instructions of the system. */
        fun promptInjection(promptInjection: Double) =
            promptInjection(JsonField.of(promptInjection))

        /**
         * Sets [Builder.promptInjection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.promptInjection] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun promptInjection(promptInjection: JsonField<Double>) = apply {
            this.promptInjection = promptInjection
        }

        /** The likeness of a real, identifiable, named person. */
        fun realPersonLikeness(realPersonLikeness: Double) =
            realPersonLikeness(JsonField.of(realPersonLikeness))

        /**
         * Sets [Builder.realPersonLikeness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.realPersonLikeness] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun realPersonLikeness(realPersonLikeness: JsonField<Double>) = apply {
            this.realPersonLikeness = realPersonLikeness
        }

        /** Sex-related crimes. */
        fun sexRelatedCrimes(sexRelatedCrimes: Double) =
            sexRelatedCrimes(JsonField.of(sexRelatedCrimes))

        /**
         * Sets [Builder.sexRelatedCrimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sexRelatedCrimes] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sexRelatedCrimes(sexRelatedCrimes: JsonField<Double>) = apply {
            this.sexRelatedCrimes = sexRelatedCrimes
        }

        /** Sexually explicit or pornographic content. */
        fun sexualContent(sexualContent: Double) = sexualContent(JsonField.of(sexualContent))

        /**
         * Sets [Builder.sexualContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sexualContent] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sexualContent(sexualContent: JsonField<Double>) = apply {
            this.sexualContent = sexualContent
        }

        /** Unqualified financial, medical, legal or electoral advice. */
        fun specializedAdvice(specializedAdvice: Double) =
            specializedAdvice(JsonField.of(specializedAdvice))

        /**
         * Sets [Builder.specializedAdvice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specializedAdvice] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specializedAdvice(specializedAdvice: JsonField<Double>) = apply {
            this.specializedAdvice = specializedAdvice
        }

        /** Suicide and self-harm. */
        fun suicideAndSelfHarm(suicideAndSelfHarm: Double) =
            suicideAndSelfHarm(JsonField.of(suicideAndSelfHarm))

        /**
         * Sets [Builder.suicideAndSelfHarm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suicideAndSelfHarm] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun suicideAndSelfHarm(suicideAndSelfHarm: JsonField<Double>) = apply {
            this.suicideAndSelfHarm = suicideAndSelfHarm
        }

        /** Violent crimes. */
        fun violentCrimes(violentCrimes: Double) = violentCrimes(JsonField.of(violentCrimes))

        /**
         * Sets [Builder.violentCrimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.violentCrimes] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun violentCrimes(violentCrimes: JsonField<Double>) = apply {
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
         * Returns an immutable instance of [ModerationCategoryScores].
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
        fun build(): ModerationCategoryScores =
            ModerationCategoryScores(
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
    fun validate(): ModerationCategoryScores = apply {
        if (validated) {
            return@apply
        }

        childSexualExploitation()
        defamation()
        hate()
        indiscriminateWeapons()
        intellectualProperty()
        livingArtistStyle()
        minorCodedLanguage()
        nonConsensualIntimateImagery()
        nonViolentCrimes()
        privacy()
        promptInjection()
        realPersonLikeness()
        sexRelatedCrimes()
        sexualContent()
        specializedAdvice()
        suicideAndSelfHarm()
        violentCrimes()
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
        (if (childSexualExploitation.asKnown() == null) 0 else 1) +
            (if (defamation.asKnown() == null) 0 else 1) +
            (if (hate.asKnown() == null) 0 else 1) +
            (if (indiscriminateWeapons.asKnown() == null) 0 else 1) +
            (if (intellectualProperty.asKnown() == null) 0 else 1) +
            (if (livingArtistStyle.asKnown() == null) 0 else 1) +
            (if (minorCodedLanguage.asKnown() == null) 0 else 1) +
            (if (nonConsensualIntimateImagery.asKnown() == null) 0 else 1) +
            (if (nonViolentCrimes.asKnown() == null) 0 else 1) +
            (if (privacy.asKnown() == null) 0 else 1) +
            (if (promptInjection.asKnown() == null) 0 else 1) +
            (if (realPersonLikeness.asKnown() == null) 0 else 1) +
            (if (sexRelatedCrimes.asKnown() == null) 0 else 1) +
            (if (sexualContent.asKnown() == null) 0 else 1) +
            (if (specializedAdvice.asKnown() == null) 0 else 1) +
            (if (suicideAndSelfHarm.asKnown() == null) 0 else 1) +
            (if (violentCrimes.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModerationCategoryScores &&
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
        "ModerationCategoryScores{childSexualExploitation=$childSexualExploitation, defamation=$defamation, hate=$hate, indiscriminateWeapons=$indiscriminateWeapons, intellectualProperty=$intellectualProperty, livingArtistStyle=$livingArtistStyle, minorCodedLanguage=$minorCodedLanguage, nonConsensualIntimateImagery=$nonConsensualIntimateImagery, nonViolentCrimes=$nonViolentCrimes, privacy=$privacy, promptInjection=$promptInjection, realPersonLikeness=$realPersonLikeness, sexRelatedCrimes=$sexRelatedCrimes, sexualContent=$sexualContent, specializedAdvice=$specializedAdvice, suicideAndSelfHarm=$suicideAndSelfHarm, violentCrimes=$violentCrimes, additionalProperties=$additionalProperties}"
}
