// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.Metadata
import com.dodopayments.api.models.misc.TaxCategory
import com.dodopayments.api.models.products.localizedprices.PricingMode
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductCreateParamsTest {

    @Test
    fun create() {
        ProductCreateParams.builder()
            .name("name")
            .price(
                Price.OneTimePrice.builder()
                    .currency(Currency.AED)
                    .discount(0L)
                    .price(0)
                    .payWhatYouWant(true)
                    .purchasingPowerParity(true)
                    .suggestedPrice(0)
                    .taxInclusive(true)
                    .build()
            )
            .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
            .addAddon("string")
            .brandId("brand_id")
            .addCreditEntitlement(
                AttachCreditEntitlement.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .creditsAmount("credits_amount")
                    .currency(Currency.AED)
                    .expiresAfterDays(0)
                    .lowBalanceThresholdPercent(0)
                    .maxRolloverCount(0)
                    .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                    .overageEnabled(true)
                    .overageLimit("overage_limit")
                    .pricePerUnit("price_per_unit")
                    .prorationBehavior(CbbProrationBehavior.PRORATE)
                    .rolloverEnabled(true)
                    .rolloverPercentage(0)
                    .rolloverTimeframeCount(0)
                    .rolloverTimeframeInterval(TimeInterval.DAY)
                    .trialCredits("trial_credits")
                    .trialCreditsExpireAfterTrial(true)
                    .build()
            )
            .description("description")
            .digitalProductDelivery(
                ProductCreateParams.DigitalProductDelivery.builder()
                    .externalUrl("external_url")
                    .instructions("instructions")
                    .build()
            )
            .addEntitlement(
                AttachProductEntitlement.builder().entitlementId("entitlement_id").build()
            )
            .licenseKeyActivationMessage("license_key_activation_message")
            .licenseKeyActivationsLimit(0)
            .licenseKeyDuration(
                LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
            )
            .licenseKeyEnabled(true)
            .metadata(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
            .pricingMode(PricingMode.BY_CURRENCY)
            .build()
    }

    @Test
    fun body() {
        val params =
            ProductCreateParams.builder()
                .name("name")
                .price(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .payWhatYouWant(true)
                        .purchasingPowerParity(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .addAddon("string")
                .brandId("brand_id")
                .addCreditEntitlement(
                    AttachCreditEntitlement.builder()
                        .creditEntitlementId("credit_entitlement_id")
                        .creditsAmount("credits_amount")
                        .currency(Currency.AED)
                        .expiresAfterDays(0)
                        .lowBalanceThresholdPercent(0)
                        .maxRolloverCount(0)
                        .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                        .overageEnabled(true)
                        .overageLimit("overage_limit")
                        .pricePerUnit("price_per_unit")
                        .prorationBehavior(CbbProrationBehavior.PRORATE)
                        .rolloverEnabled(true)
                        .rolloverPercentage(0)
                        .rolloverTimeframeCount(0)
                        .rolloverTimeframeInterval(TimeInterval.DAY)
                        .trialCredits("trial_credits")
                        .trialCreditsExpireAfterTrial(true)
                        .build()
                )
                .description("description")
                .digitalProductDelivery(
                    ProductCreateParams.DigitalProductDelivery.builder()
                        .externalUrl("external_url")
                        .instructions("instructions")
                        .build()
                )
                .addEntitlement(
                    AttachProductEntitlement.builder().entitlementId("entitlement_id").build()
                )
                .licenseKeyActivationMessage("license_key_activation_message")
                .licenseKeyActivationsLimit(0)
                .licenseKeyDuration(
                    LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build()
                )
                .licenseKeyEnabled(true)
                .metadata(
                    Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .pricingMode(PricingMode.BY_CURRENCY)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.price())
            .isEqualTo(
                Price.ofOneTime(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .payWhatYouWant(true)
                        .purchasingPowerParity(true)
                        .suggestedPrice(0)
                        .taxInclusive(true)
                        .build()
                )
            )
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
        assertThat(body.addons()).containsExactly("string")
        assertThat(body.brandId()).isEqualTo("brand_id")
        assertThat(body.creditEntitlements())
            .containsExactly(
                AttachCreditEntitlement.builder()
                    .creditEntitlementId("credit_entitlement_id")
                    .creditsAmount("credits_amount")
                    .currency(Currency.AED)
                    .expiresAfterDays(0)
                    .lowBalanceThresholdPercent(0)
                    .maxRolloverCount(0)
                    .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                    .overageEnabled(true)
                    .overageLimit("overage_limit")
                    .pricePerUnit("price_per_unit")
                    .prorationBehavior(CbbProrationBehavior.PRORATE)
                    .rolloverEnabled(true)
                    .rolloverPercentage(0)
                    .rolloverTimeframeCount(0)
                    .rolloverTimeframeInterval(TimeInterval.DAY)
                    .trialCredits("trial_credits")
                    .trialCreditsExpireAfterTrial(true)
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.digitalProductDelivery())
            .isEqualTo(
                ProductCreateParams.DigitalProductDelivery.builder()
                    .externalUrl("external_url")
                    .instructions("instructions")
                    .build()
            )
        assertThat(body.entitlements())
            .containsExactly(
                AttachProductEntitlement.builder().entitlementId("entitlement_id").build()
            )
        assertThat(body.licenseKeyActivationMessage()).isEqualTo("license_key_activation_message")
        assertThat(body.licenseKeyActivationsLimit()).isEqualTo(0)
        assertThat(body.licenseKeyDuration())
            .isEqualTo(LicenseKeyDuration.builder().count(0).interval(TimeInterval.DAY).build())
        assertThat(body.licenseKeyEnabled()).isEqualTo(true)
        assertThat(body.metadata())
            .isEqualTo(
                Metadata.builder().putAdditionalProperty("foo", JsonValue.from("string")).build()
            )
        assertThat(body.pricingMode()).isEqualTo(PricingMode.BY_CURRENCY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductCreateParams.builder()
                .name("name")
                .price(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .build()
                )
                .taxCategory(TaxCategory.DIGITAL_PRODUCTS)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.price())
            .isEqualTo(
                Price.ofOneTime(
                    Price.OneTimePrice.builder()
                        .currency(Currency.AED)
                        .discount(0L)
                        .price(0)
                        .build()
                )
            )
        assertThat(body.taxCategory()).isEqualTo(TaxCategory.DIGITAL_PRODUCTS)
    }
}
