// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/**
 * All supported payment method types.
 *
 * Used for disabled-payment-methods filtering and validation.
 */
class PaymentMethodTypes @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val ACH = of("ach")

        val AFFIRM = of("affirm")

        val AFTERPAY_CLEARPAY = of("afterpay_clearpay")

        val ALFAMART = of("alfamart")

        val ALI_PAY = of("ali_pay")

        val ALI_PAY_HK = of("ali_pay_hk")

        val ALMA = of("alma")

        val AMAZON_PAY = of("amazon_pay")

        val APPLE_PAY = of("apple_pay")

        val ATOME = of("atome")

        val BACS = of("bacs")

        val BANCONTACT_CARD = of("bancontact_card")

        val BECS = of("becs")

        val BENEFIT = of("benefit")

        val BIZUM = of("bizum")

        val BLIK = of("blik")

        val BOLETO = of("boleto")

        val BCA_BANK_TRANSFER = of("bca_bank_transfer")

        val BNI_VA = of("bni_va")

        val BRI_VA = of("bri_va")

        val CARD_REDIRECT = of("card_redirect")

        val CIMB_VA = of("cimb_va")

        val CLASSIC = of("classic")

        val CREDIT = of("credit")

        val CRYPTO_CURRENCY = of("crypto_currency")

        val CASHAPP = of("cashapp")

        val DANA = of("dana")

        val DANAMON_VA = of("danamon_va")

        val DEBIT = of("debit")

        val DUIT_NOW = of("duit_now")

        val EFECTY = of("efecty")

        val EFT = of("eft")

        val EPS = of("eps")

        val FPS = of("fps")

        val EVOUCHER = of("evoucher")

        val GIROPAY = of("giropay")

        val GIVEX = of("givex")

        val GOOGLE_PAY = of("google_pay")

        val GO_PAY = of("go_pay")

        val GCASH = of("gcash")

        val IDEAL = of("ideal")

        val INTERAC = of("interac")

        val INDOMARET = of("indomaret")

        val KLARNA = of("klarna")

        val KAKAO_PAY = of("kakao_pay")

        val LOCAL_BANK_REDIRECT = of("local_bank_redirect")

        val MANDIRI_VA = of("mandiri_va")

        val KNET = of("knet")

        val MB_WAY = of("mb_way")

        val MOBILE_PAY = of("mobile_pay")

        val MOMO = of("momo")

        val MOMO_ATM = of("momo_atm")

        val MULTIBANCO = of("multibanco")

        val ONLINE_BANKING_THAILAND = of("online_banking_thailand")

        val ONLINE_BANKING_CZECH_REPUBLIC = of("online_banking_czech_republic")

        val ONLINE_BANKING_FINLAND = of("online_banking_finland")

        val ONLINE_BANKING_FPX = of("online_banking_fpx")

        val ONLINE_BANKING_POLAND = of("online_banking_poland")

        val ONLINE_BANKING_SLOVAKIA = of("online_banking_slovakia")

        val OXXO = of("oxxo")

        val PAGO_EFECTIVO = of("pago_efectivo")

        val PERMATA_BANK_TRANSFER = of("permata_bank_transfer")

        val OPEN_BANKING_UK = of("open_banking_uk")

        val PAY_BRIGHT = of("pay_bright")

        val PAYPAL = of("paypal")

        val PAZE = of("paze")

        val PIX = of("pix")

        val PAY_SAFE_CARD = of("pay_safe_card")

        val PRZELEWY24 = of("przelewy24")

        val PROMPT_PAY = of("prompt_pay")

        val PSE = of("pse")

        val RED_COMPRA = of("red_compra")

        val RED_PAGOS = of("red_pagos")

        val SAMSUNG_PAY = of("samsung_pay")

        val SEPA = of("sepa")

        val SEPA_BANK_TRANSFER = of("sepa_bank_transfer")

        val SOFORT = of("sofort")

        val SWISH = of("swish")

        val TOUCH_N_GO = of("touch_n_go")

        val TRUSTLY = of("trustly")

        val TWINT = of("twint")

        val UPI_COLLECT = of("upi_collect")

        val UPI_INTENT = of("upi_intent")

        val VIPPS = of("vipps")

        val VIET_QR = of("viet_qr")

        val VENMO = of("venmo")

        val WALLEY = of("walley")

        val WE_CHAT_PAY = of("we_chat_pay")

        val SEVEN_ELEVEN = of("seven_eleven")

        val LAWSON = of("lawson")

        val MINI_STOP = of("mini_stop")

        val FAMILY_MART = of("family_mart")

        val SEICOMART = of("seicomart")

        val PAY_EASY = of("pay_easy")

        val LOCAL_BANK_TRANSFER = of("local_bank_transfer")

        val MIFINITY = of("mifinity")

        val OPEN_BANKING_PIS = of("open_banking_pis")

        val DIRECT_CARRIER_BILLING = of("direct_carrier_billing")

        val INSTANT_BANK_TRANSFER = of("instant_bank_transfer")

        val BILLIE = of("billie")

        val ZIP = of("zip")

        val REVOLUT_PAY = of("revolut_pay")

        val NAVER_PAY = of("naver_pay")

        val PAYCO = of("payco")

        val SATISPAY = of("satispay")

        fun of(value: String) = PaymentMethodTypes(JsonField.of(value))
    }

    /** An enum containing [PaymentMethodTypes]'s known values. */
    enum class Known {
        ACH,
        AFFIRM,
        AFTERPAY_CLEARPAY,
        ALFAMART,
        ALI_PAY,
        ALI_PAY_HK,
        ALMA,
        AMAZON_PAY,
        APPLE_PAY,
        ATOME,
        BACS,
        BANCONTACT_CARD,
        BECS,
        BENEFIT,
        BIZUM,
        BLIK,
        BOLETO,
        BCA_BANK_TRANSFER,
        BNI_VA,
        BRI_VA,
        CARD_REDIRECT,
        CIMB_VA,
        CLASSIC,
        CREDIT,
        CRYPTO_CURRENCY,
        CASHAPP,
        DANA,
        DANAMON_VA,
        DEBIT,
        DUIT_NOW,
        EFECTY,
        EFT,
        EPS,
        FPS,
        EVOUCHER,
        GIROPAY,
        GIVEX,
        GOOGLE_PAY,
        GO_PAY,
        GCASH,
        IDEAL,
        INTERAC,
        INDOMARET,
        KLARNA,
        KAKAO_PAY,
        LOCAL_BANK_REDIRECT,
        MANDIRI_VA,
        KNET,
        MB_WAY,
        MOBILE_PAY,
        MOMO,
        MOMO_ATM,
        MULTIBANCO,
        ONLINE_BANKING_THAILAND,
        ONLINE_BANKING_CZECH_REPUBLIC,
        ONLINE_BANKING_FINLAND,
        ONLINE_BANKING_FPX,
        ONLINE_BANKING_POLAND,
        ONLINE_BANKING_SLOVAKIA,
        OXXO,
        PAGO_EFECTIVO,
        PERMATA_BANK_TRANSFER,
        OPEN_BANKING_UK,
        PAY_BRIGHT,
        PAYPAL,
        PAZE,
        PIX,
        PAY_SAFE_CARD,
        PRZELEWY24,
        PROMPT_PAY,
        PSE,
        RED_COMPRA,
        RED_PAGOS,
        SAMSUNG_PAY,
        SEPA,
        SEPA_BANK_TRANSFER,
        SOFORT,
        SWISH,
        TOUCH_N_GO,
        TRUSTLY,
        TWINT,
        UPI_COLLECT,
        UPI_INTENT,
        VIPPS,
        VIET_QR,
        VENMO,
        WALLEY,
        WE_CHAT_PAY,
        SEVEN_ELEVEN,
        LAWSON,
        MINI_STOP,
        FAMILY_MART,
        SEICOMART,
        PAY_EASY,
        LOCAL_BANK_TRANSFER,
        MIFINITY,
        OPEN_BANKING_PIS,
        DIRECT_CARRIER_BILLING,
        INSTANT_BANK_TRANSFER,
        BILLIE,
        ZIP,
        REVOLUT_PAY,
        NAVER_PAY,
        PAYCO,
        SATISPAY,
    }

    /**
     * An enum containing [PaymentMethodTypes]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentMethodTypes] can contain an unknown value in a couple of cases:
     *
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     *
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ACH,
        AFFIRM,
        AFTERPAY_CLEARPAY,
        ALFAMART,
        ALI_PAY,
        ALI_PAY_HK,
        ALMA,
        AMAZON_PAY,
        APPLE_PAY,
        ATOME,
        BACS,
        BANCONTACT_CARD,
        BECS,
        BENEFIT,
        BIZUM,
        BLIK,
        BOLETO,
        BCA_BANK_TRANSFER,
        BNI_VA,
        BRI_VA,
        CARD_REDIRECT,
        CIMB_VA,
        CLASSIC,
        CREDIT,
        CRYPTO_CURRENCY,
        CASHAPP,
        DANA,
        DANAMON_VA,
        DEBIT,
        DUIT_NOW,
        EFECTY,
        EFT,
        EPS,
        FPS,
        EVOUCHER,
        GIROPAY,
        GIVEX,
        GOOGLE_PAY,
        GO_PAY,
        GCASH,
        IDEAL,
        INTERAC,
        INDOMARET,
        KLARNA,
        KAKAO_PAY,
        LOCAL_BANK_REDIRECT,
        MANDIRI_VA,
        KNET,
        MB_WAY,
        MOBILE_PAY,
        MOMO,
        MOMO_ATM,
        MULTIBANCO,
        ONLINE_BANKING_THAILAND,
        ONLINE_BANKING_CZECH_REPUBLIC,
        ONLINE_BANKING_FINLAND,
        ONLINE_BANKING_FPX,
        ONLINE_BANKING_POLAND,
        ONLINE_BANKING_SLOVAKIA,
        OXXO,
        PAGO_EFECTIVO,
        PERMATA_BANK_TRANSFER,
        OPEN_BANKING_UK,
        PAY_BRIGHT,
        PAYPAL,
        PAZE,
        PIX,
        PAY_SAFE_CARD,
        PRZELEWY24,
        PROMPT_PAY,
        PSE,
        RED_COMPRA,
        RED_PAGOS,
        SAMSUNG_PAY,
        SEPA,
        SEPA_BANK_TRANSFER,
        SOFORT,
        SWISH,
        TOUCH_N_GO,
        TRUSTLY,
        TWINT,
        UPI_COLLECT,
        UPI_INTENT,
        VIPPS,
        VIET_QR,
        VENMO,
        WALLEY,
        WE_CHAT_PAY,
        SEVEN_ELEVEN,
        LAWSON,
        MINI_STOP,
        FAMILY_MART,
        SEICOMART,
        PAY_EASY,
        LOCAL_BANK_TRANSFER,
        MIFINITY,
        OPEN_BANKING_PIS,
        DIRECT_CARRIER_BILLING,
        INSTANT_BANK_TRANSFER,
        BILLIE,
        ZIP,
        REVOLUT_PAY,
        NAVER_PAY,
        PAYCO,
        SATISPAY,
        /**
         * An enum member indicating that [PaymentMethodTypes] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            ACH -> Value.ACH
            AFFIRM -> Value.AFFIRM
            AFTERPAY_CLEARPAY -> Value.AFTERPAY_CLEARPAY
            ALFAMART -> Value.ALFAMART
            ALI_PAY -> Value.ALI_PAY
            ALI_PAY_HK -> Value.ALI_PAY_HK
            ALMA -> Value.ALMA
            AMAZON_PAY -> Value.AMAZON_PAY
            APPLE_PAY -> Value.APPLE_PAY
            ATOME -> Value.ATOME
            BACS -> Value.BACS
            BANCONTACT_CARD -> Value.BANCONTACT_CARD
            BECS -> Value.BECS
            BENEFIT -> Value.BENEFIT
            BIZUM -> Value.BIZUM
            BLIK -> Value.BLIK
            BOLETO -> Value.BOLETO
            BCA_BANK_TRANSFER -> Value.BCA_BANK_TRANSFER
            BNI_VA -> Value.BNI_VA
            BRI_VA -> Value.BRI_VA
            CARD_REDIRECT -> Value.CARD_REDIRECT
            CIMB_VA -> Value.CIMB_VA
            CLASSIC -> Value.CLASSIC
            CREDIT -> Value.CREDIT
            CRYPTO_CURRENCY -> Value.CRYPTO_CURRENCY
            CASHAPP -> Value.CASHAPP
            DANA -> Value.DANA
            DANAMON_VA -> Value.DANAMON_VA
            DEBIT -> Value.DEBIT
            DUIT_NOW -> Value.DUIT_NOW
            EFECTY -> Value.EFECTY
            EFT -> Value.EFT
            EPS -> Value.EPS
            FPS -> Value.FPS
            EVOUCHER -> Value.EVOUCHER
            GIROPAY -> Value.GIROPAY
            GIVEX -> Value.GIVEX
            GOOGLE_PAY -> Value.GOOGLE_PAY
            GO_PAY -> Value.GO_PAY
            GCASH -> Value.GCASH
            IDEAL -> Value.IDEAL
            INTERAC -> Value.INTERAC
            INDOMARET -> Value.INDOMARET
            KLARNA -> Value.KLARNA
            KAKAO_PAY -> Value.KAKAO_PAY
            LOCAL_BANK_REDIRECT -> Value.LOCAL_BANK_REDIRECT
            MANDIRI_VA -> Value.MANDIRI_VA
            KNET -> Value.KNET
            MB_WAY -> Value.MB_WAY
            MOBILE_PAY -> Value.MOBILE_PAY
            MOMO -> Value.MOMO
            MOMO_ATM -> Value.MOMO_ATM
            MULTIBANCO -> Value.MULTIBANCO
            ONLINE_BANKING_THAILAND -> Value.ONLINE_BANKING_THAILAND
            ONLINE_BANKING_CZECH_REPUBLIC -> Value.ONLINE_BANKING_CZECH_REPUBLIC
            ONLINE_BANKING_FINLAND -> Value.ONLINE_BANKING_FINLAND
            ONLINE_BANKING_FPX -> Value.ONLINE_BANKING_FPX
            ONLINE_BANKING_POLAND -> Value.ONLINE_BANKING_POLAND
            ONLINE_BANKING_SLOVAKIA -> Value.ONLINE_BANKING_SLOVAKIA
            OXXO -> Value.OXXO
            PAGO_EFECTIVO -> Value.PAGO_EFECTIVO
            PERMATA_BANK_TRANSFER -> Value.PERMATA_BANK_TRANSFER
            OPEN_BANKING_UK -> Value.OPEN_BANKING_UK
            PAY_BRIGHT -> Value.PAY_BRIGHT
            PAYPAL -> Value.PAYPAL
            PAZE -> Value.PAZE
            PIX -> Value.PIX
            PAY_SAFE_CARD -> Value.PAY_SAFE_CARD
            PRZELEWY24 -> Value.PRZELEWY24
            PROMPT_PAY -> Value.PROMPT_PAY
            PSE -> Value.PSE
            RED_COMPRA -> Value.RED_COMPRA
            RED_PAGOS -> Value.RED_PAGOS
            SAMSUNG_PAY -> Value.SAMSUNG_PAY
            SEPA -> Value.SEPA
            SEPA_BANK_TRANSFER -> Value.SEPA_BANK_TRANSFER
            SOFORT -> Value.SOFORT
            SWISH -> Value.SWISH
            TOUCH_N_GO -> Value.TOUCH_N_GO
            TRUSTLY -> Value.TRUSTLY
            TWINT -> Value.TWINT
            UPI_COLLECT -> Value.UPI_COLLECT
            UPI_INTENT -> Value.UPI_INTENT
            VIPPS -> Value.VIPPS
            VIET_QR -> Value.VIET_QR
            VENMO -> Value.VENMO
            WALLEY -> Value.WALLEY
            WE_CHAT_PAY -> Value.WE_CHAT_PAY
            SEVEN_ELEVEN -> Value.SEVEN_ELEVEN
            LAWSON -> Value.LAWSON
            MINI_STOP -> Value.MINI_STOP
            FAMILY_MART -> Value.FAMILY_MART
            SEICOMART -> Value.SEICOMART
            PAY_EASY -> Value.PAY_EASY
            LOCAL_BANK_TRANSFER -> Value.LOCAL_BANK_TRANSFER
            MIFINITY -> Value.MIFINITY
            OPEN_BANKING_PIS -> Value.OPEN_BANKING_PIS
            DIRECT_CARRIER_BILLING -> Value.DIRECT_CARRIER_BILLING
            INSTANT_BANK_TRANSFER -> Value.INSTANT_BANK_TRANSFER
            BILLIE -> Value.BILLIE
            ZIP -> Value.ZIP
            REVOLUT_PAY -> Value.REVOLUT_PAY
            NAVER_PAY -> Value.NAVER_PAY
            PAYCO -> Value.PAYCO
            SATISPAY -> Value.SATISPAY
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            ACH -> Known.ACH
            AFFIRM -> Known.AFFIRM
            AFTERPAY_CLEARPAY -> Known.AFTERPAY_CLEARPAY
            ALFAMART -> Known.ALFAMART
            ALI_PAY -> Known.ALI_PAY
            ALI_PAY_HK -> Known.ALI_PAY_HK
            ALMA -> Known.ALMA
            AMAZON_PAY -> Known.AMAZON_PAY
            APPLE_PAY -> Known.APPLE_PAY
            ATOME -> Known.ATOME
            BACS -> Known.BACS
            BANCONTACT_CARD -> Known.BANCONTACT_CARD
            BECS -> Known.BECS
            BENEFIT -> Known.BENEFIT
            BIZUM -> Known.BIZUM
            BLIK -> Known.BLIK
            BOLETO -> Known.BOLETO
            BCA_BANK_TRANSFER -> Known.BCA_BANK_TRANSFER
            BNI_VA -> Known.BNI_VA
            BRI_VA -> Known.BRI_VA
            CARD_REDIRECT -> Known.CARD_REDIRECT
            CIMB_VA -> Known.CIMB_VA
            CLASSIC -> Known.CLASSIC
            CREDIT -> Known.CREDIT
            CRYPTO_CURRENCY -> Known.CRYPTO_CURRENCY
            CASHAPP -> Known.CASHAPP
            DANA -> Known.DANA
            DANAMON_VA -> Known.DANAMON_VA
            DEBIT -> Known.DEBIT
            DUIT_NOW -> Known.DUIT_NOW
            EFECTY -> Known.EFECTY
            EFT -> Known.EFT
            EPS -> Known.EPS
            FPS -> Known.FPS
            EVOUCHER -> Known.EVOUCHER
            GIROPAY -> Known.GIROPAY
            GIVEX -> Known.GIVEX
            GOOGLE_PAY -> Known.GOOGLE_PAY
            GO_PAY -> Known.GO_PAY
            GCASH -> Known.GCASH
            IDEAL -> Known.IDEAL
            INTERAC -> Known.INTERAC
            INDOMARET -> Known.INDOMARET
            KLARNA -> Known.KLARNA
            KAKAO_PAY -> Known.KAKAO_PAY
            LOCAL_BANK_REDIRECT -> Known.LOCAL_BANK_REDIRECT
            MANDIRI_VA -> Known.MANDIRI_VA
            KNET -> Known.KNET
            MB_WAY -> Known.MB_WAY
            MOBILE_PAY -> Known.MOBILE_PAY
            MOMO -> Known.MOMO
            MOMO_ATM -> Known.MOMO_ATM
            MULTIBANCO -> Known.MULTIBANCO
            ONLINE_BANKING_THAILAND -> Known.ONLINE_BANKING_THAILAND
            ONLINE_BANKING_CZECH_REPUBLIC -> Known.ONLINE_BANKING_CZECH_REPUBLIC
            ONLINE_BANKING_FINLAND -> Known.ONLINE_BANKING_FINLAND
            ONLINE_BANKING_FPX -> Known.ONLINE_BANKING_FPX
            ONLINE_BANKING_POLAND -> Known.ONLINE_BANKING_POLAND
            ONLINE_BANKING_SLOVAKIA -> Known.ONLINE_BANKING_SLOVAKIA
            OXXO -> Known.OXXO
            PAGO_EFECTIVO -> Known.PAGO_EFECTIVO
            PERMATA_BANK_TRANSFER -> Known.PERMATA_BANK_TRANSFER
            OPEN_BANKING_UK -> Known.OPEN_BANKING_UK
            PAY_BRIGHT -> Known.PAY_BRIGHT
            PAYPAL -> Known.PAYPAL
            PAZE -> Known.PAZE
            PIX -> Known.PIX
            PAY_SAFE_CARD -> Known.PAY_SAFE_CARD
            PRZELEWY24 -> Known.PRZELEWY24
            PROMPT_PAY -> Known.PROMPT_PAY
            PSE -> Known.PSE
            RED_COMPRA -> Known.RED_COMPRA
            RED_PAGOS -> Known.RED_PAGOS
            SAMSUNG_PAY -> Known.SAMSUNG_PAY
            SEPA -> Known.SEPA
            SEPA_BANK_TRANSFER -> Known.SEPA_BANK_TRANSFER
            SOFORT -> Known.SOFORT
            SWISH -> Known.SWISH
            TOUCH_N_GO -> Known.TOUCH_N_GO
            TRUSTLY -> Known.TRUSTLY
            TWINT -> Known.TWINT
            UPI_COLLECT -> Known.UPI_COLLECT
            UPI_INTENT -> Known.UPI_INTENT
            VIPPS -> Known.VIPPS
            VIET_QR -> Known.VIET_QR
            VENMO -> Known.VENMO
            WALLEY -> Known.WALLEY
            WE_CHAT_PAY -> Known.WE_CHAT_PAY
            SEVEN_ELEVEN -> Known.SEVEN_ELEVEN
            LAWSON -> Known.LAWSON
            MINI_STOP -> Known.MINI_STOP
            FAMILY_MART -> Known.FAMILY_MART
            SEICOMART -> Known.SEICOMART
            PAY_EASY -> Known.PAY_EASY
            LOCAL_BANK_TRANSFER -> Known.LOCAL_BANK_TRANSFER
            MIFINITY -> Known.MIFINITY
            OPEN_BANKING_PIS -> Known.OPEN_BANKING_PIS
            DIRECT_CARRIER_BILLING -> Known.DIRECT_CARRIER_BILLING
            INSTANT_BANK_TRANSFER -> Known.INSTANT_BANK_TRANSFER
            BILLIE -> Known.BILLIE
            ZIP -> Known.ZIP
            REVOLUT_PAY -> Known.REVOLUT_PAY
            NAVER_PAY -> Known.NAVER_PAY
            PAYCO -> Known.PAYCO
            SATISPAY -> Known.SATISPAY
            else -> throw DodoPaymentsInvalidDataException("Unknown PaymentMethodTypes: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PaymentMethodTypes = apply {
        if (validated) {
            return@apply
        }

        known()
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
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentMethodTypes && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
