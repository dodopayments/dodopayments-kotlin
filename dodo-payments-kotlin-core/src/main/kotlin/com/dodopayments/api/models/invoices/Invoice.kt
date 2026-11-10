// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.invoices

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** An invoice-led invoice. Every read and every `invoice.*` webhook uses this schema. */
class Invoice
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allowedActions: JsonField<List<AllowedAction>>,
    private val amountDue: JsonField<Long>,
    private val amountPaid: JsonField<Long>,
    private val amountRefunded: JsonField<Long>,
    private val billingMode: JsonField<BillingMode>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val credits: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val customer: JsonField<Customer>,
    private val discountIds: JsonField<List<String>>,
    private val editableFields: JsonField<List<EditableField>>,
    private val frequency: JsonField<Frequency>,
    private val invoiceId: JsonField<String>,
    private val metadata: JsonValue,
    private val refundIds: JsonField<List<String>>,
    private val retryCount: JsonField<Int>,
    private val rowVersion: JsonField<Long>,
    private val status: JsonField<InvoiceStatus>,
    private val subscriptionIds: JsonField<List<String>>,
    private val tags: JsonField<List<Tag>>,
    private val tax: JsonField<Int>,
    private val totalAmount: JsonField<Int>,
    private val collectionMethod: JsonField<CollectionMethod>,
    private val dueAt: JsonField<OffsetDateTime>,
    private val dunningState: JsonField<DunningState>,
    private val finalizedAt: JsonField<OffsetDateTime>,
    private val hostedUrl: JsonField<String>,
    private val lines: JsonField<List<InvoiceLine>>,
    private val memo: JsonField<String>,
    private val nextReminderAt: JsonField<OffsetDateTime>,
    private val nextRetryAt: JsonField<OffsetDateTime>,
    private val paymentTermsDays: JsonField<Int>,
    private val payments: JsonField<List<Payment>>,
    private val pdfUrl: JsonField<String>,
    private val reminderSettings: JsonField<ReminderSettings>,
    private val reviewDeadline: JsonField<OffsetDateTime>,
    private val sentAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allowed_actions")
        @ExcludeMissing
        allowedActions: JsonField<List<AllowedAction>> = JsonMissing.of(),
        @JsonProperty("amount_due") @ExcludeMissing amountDue: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_paid") @ExcludeMissing amountPaid: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount_refunded")
        @ExcludeMissing
        amountRefunded: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("billing_mode")
        @ExcludeMissing
        billingMode: JsonField<BillingMode> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credits") @ExcludeMissing credits: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("customer") @ExcludeMissing customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("discount_ids")
        @ExcludeMissing
        discountIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("editable_fields")
        @ExcludeMissing
        editableFields: JsonField<List<EditableField>> = JsonMissing.of(),
        @JsonProperty("frequency")
        @ExcludeMissing
        frequency: JsonField<Frequency> = JsonMissing.of(),
        @JsonProperty("invoice_id") @ExcludeMissing invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("refund_ids")
        @ExcludeMissing
        refundIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("retry_count") @ExcludeMissing retryCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("row_version") @ExcludeMissing rowVersion: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<InvoiceStatus> = JsonMissing.of(),
        @JsonProperty("subscription_ids")
        @ExcludeMissing
        subscriptionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<Tag>> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        totalAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("collection_method")
        @ExcludeMissing
        collectionMethod: JsonField<CollectionMethod> = JsonMissing.of(),
        @JsonProperty("due_at") @ExcludeMissing dueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dunning_state")
        @ExcludeMissing
        dunningState: JsonField<DunningState> = JsonMissing.of(),
        @JsonProperty("finalized_at")
        @ExcludeMissing
        finalizedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hosted_url") @ExcludeMissing hostedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lines")
        @ExcludeMissing
        lines: JsonField<List<InvoiceLine>> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("next_reminder_at")
        @ExcludeMissing
        nextReminderAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("next_retry_at")
        @ExcludeMissing
        nextRetryAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_terms_days")
        @ExcludeMissing
        paymentTermsDays: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("payments")
        @ExcludeMissing
        payments: JsonField<List<Payment>> = JsonMissing.of(),
        @JsonProperty("pdf_url") @ExcludeMissing pdfUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reminder_settings")
        @ExcludeMissing
        reminderSettings: JsonField<ReminderSettings> = JsonMissing.of(),
        @JsonProperty("review_deadline")
        @ExcludeMissing
        reviewDeadline: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sent_at")
        @ExcludeMissing
        sentAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        allowedActions,
        amountDue,
        amountPaid,
        amountRefunded,
        billingMode,
        businessId,
        createdAt,
        credits,
        currency,
        customer,
        discountIds,
        editableFields,
        frequency,
        invoiceId,
        metadata,
        refundIds,
        retryCount,
        rowVersion,
        status,
        subscriptionIds,
        tags,
        tax,
        totalAmount,
        collectionMethod,
        dueAt,
        dunningState,
        finalizedAt,
        hostedUrl,
        lines,
        memo,
        nextReminderAt,
        nextRetryAt,
        paymentTermsDays,
        payments,
        pdfUrl,
        reminderSettings,
        reviewDeadline,
        sentAt,
        mutableMapOf(),
    )

    /**
     * The actions that the current status accepts.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allowedActions(): List<AllowedAction> = allowedActions.getRequired("allowed_actions")

    /**
     * The amount that the customer must pay. Zero unless the invoice is open or past due.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountDue(): Long = amountDue.getRequired("amount_due")

    /**
     * The sum of the succeeded payments, in the smallest currency unit. A late payment is not
     * included after its late refund.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountPaid(): Long = amountPaid.getRequired("amount_paid")

    /**
     * The sum of the succeeded refunds, in the currency of each payment. The late refund of a late
     * payment is not included.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountRefunded(): Long = amountRefunded.getRequired("amount_refunded")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billingMode(): BillingMode = billingMode.getRequired("billing_mode")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Customer credits applied at finalise, in the smallest currency unit. Zero or less.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credits(): Long = credits.getRequired("credits")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * The discount codes of the invoice.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun discountIds(): List<String> = discountIds.getRequired("discount_ids")

    /**
     * The fields that `PATCH` can change in the current status.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun editableFields(): List<EditableField> = editableFields.getRequired("editable_fields")

    /**
     * How often the invoice lines bill. `mixed` covers several intervals, or one-time lines next to
     * a plan.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frequency(): Frequency = frequency.getRequired("frequency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceId(): String = invoiceId.getRequired("invoice_id")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = invoice.metadata().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun refundIds(): List<String> = refundIds.getRequired("refund_ids")

    /**
     * The number of failed automatic charges.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun retryCount(): Int = retryCount.getRequired("retry_count")

    /**
     * Goes up by one on each change. Use it to ignore an older webhook delivery.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rowVersion(): Long = rowVersion.getRequired("row_version")

    /**
     * The `message` of each variant is the label of the invoice document.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): InvoiceStatus = status.getRequired("status")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionIds(): List<String> = subscriptionIds.getRequired("subscription_ids")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<Tag> = tags.getRequired("tags")

    /**
     * Tax in the smallest currency unit.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tax(): Int = tax.getRequired("tax")

    /**
     * Total with tax, before credits, in the smallest currency unit.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalAmount(): Int = totalAmount.getRequired("total_amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun collectionMethod(): CollectionMethod? = collectionMethod.getNullable("collection_method")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dueAt(): OffsetDateTime? = dueAt.getNullable("due_at")

    /**
     * `null` for an invoice that has no collection: draft, paid, void or uncollectable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dunningState(): DunningState? = dunningState.getNullable("dunning_state")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun finalizedAt(): OffsetDateTime? = finalizedAt.getNullable("finalized_at")

    /**
     * The page where the customer pays. `null` until the invoice is sent.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun hostedUrl(): String? = hostedUrl.getNullable("hosted_url")

    /**
     * Only on a single invoice. A list leaves it out.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lines(): List<InvoiceLine>? = lines.getNullable("lines")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun memo(): String? = memo.getNullable("memo")

    /**
     * The time of the next reminder email to the customer, before or after the due date. `null`
     * when no reminder email will go out.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nextReminderAt(): OffsetDateTime? = nextReminderAt.getNullable("next_reminder_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nextRetryAt(): OffsetDateTime? = nextRetryAt.getNullable("next_retry_at")

    /**
     * Days from finalise to the due date. `null` when the invoice has a custom due date.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentTermsDays(): Int? = paymentTermsDays.getNullable("payment_terms_days")

    /**
     * Only on a single invoice. A list leaves it out.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun payments(): List<Payment>? = payments.getNullable("payments")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun pdfUrl(): String? = pdfUrl.getNullable("pdf_url")

    /**
     * `null` on a draft that keeps all reminder settings of the business.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reminderSettings(): ReminderSettings? = reminderSettings.getNullable("reminder_settings")

    /**
     * The time at which a draft that waits for review finalises.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reviewDeadline(): OffsetDateTime? = reviewDeadline.getNullable("review_deadline")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sentAt(): OffsetDateTime? = sentAt.getNullable("sent_at")

    /**
     * Returns the raw JSON value of [allowedActions].
     *
     * Unlike [allowedActions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowed_actions")
    @ExcludeMissing
    fun _allowedActions(): JsonField<List<AllowedAction>> = allowedActions

    /**
     * Returns the raw JSON value of [amountDue].
     *
     * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<Long> = amountDue

    /**
     * Returns the raw JSON value of [amountPaid].
     *
     * Unlike [amountPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_paid") @ExcludeMissing fun _amountPaid(): JsonField<Long> = amountPaid

    /**
     * Returns the raw JSON value of [amountRefunded].
     *
     * Unlike [amountRefunded], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_refunded")
    @ExcludeMissing
    fun _amountRefunded(): JsonField<Long> = amountRefunded

    /**
     * Returns the raw JSON value of [billingMode].
     *
     * Unlike [billingMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_mode")
    @ExcludeMissing
    fun _billingMode(): JsonField<BillingMode> = billingMode

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [credits].
     *
     * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<Long> = credits

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Returns the raw JSON value of [discountIds].
     *
     * Unlike [discountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_ids")
    @ExcludeMissing
    fun _discountIds(): JsonField<List<String>> = discountIds

    /**
     * Returns the raw JSON value of [editableFields].
     *
     * Unlike [editableFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("editable_fields")
    @ExcludeMissing
    fun _editableFields(): JsonField<List<EditableField>> = editableFields

    /**
     * Returns the raw JSON value of [frequency].
     *
     * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frequency") @ExcludeMissing fun _frequency(): JsonField<Frequency> = frequency

    /**
     * Returns the raw JSON value of [invoiceId].
     *
     * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

    /**
     * Returns the raw JSON value of [refundIds].
     *
     * Unlike [refundIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refund_ids")
    @ExcludeMissing
    fun _refundIds(): JsonField<List<String>> = refundIds

    /**
     * Returns the raw JSON value of [retryCount].
     *
     * Unlike [retryCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retry_count") @ExcludeMissing fun _retryCount(): JsonField<Int> = retryCount

    /**
     * Returns the raw JSON value of [rowVersion].
     *
     * Unlike [rowVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("row_version") @ExcludeMissing fun _rowVersion(): JsonField<Long> = rowVersion

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<InvoiceStatus> = status

    /**
     * Returns the raw JSON value of [subscriptionIds].
     *
     * Unlike [subscriptionIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_ids")
    @ExcludeMissing
    fun _subscriptionIds(): JsonField<List<String>> = subscriptionIds

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<Tag>> = tags

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

    /**
     * Returns the raw JSON value of [totalAmount].
     *
     * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Int> = totalAmount

    /**
     * Returns the raw JSON value of [collectionMethod].
     *
     * Unlike [collectionMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("collection_method")
    @ExcludeMissing
    fun _collectionMethod(): JsonField<CollectionMethod> = collectionMethod

    /**
     * Returns the raw JSON value of [dueAt].
     *
     * Unlike [dueAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("due_at") @ExcludeMissing fun _dueAt(): JsonField<OffsetDateTime> = dueAt

    /**
     * Returns the raw JSON value of [dunningState].
     *
     * Unlike [dunningState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dunning_state")
    @ExcludeMissing
    fun _dunningState(): JsonField<DunningState> = dunningState

    /**
     * Returns the raw JSON value of [finalizedAt].
     *
     * Unlike [finalizedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("finalized_at")
    @ExcludeMissing
    fun _finalizedAt(): JsonField<OffsetDateTime> = finalizedAt

    /**
     * Returns the raw JSON value of [hostedUrl].
     *
     * Unlike [hostedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hosted_url") @ExcludeMissing fun _hostedUrl(): JsonField<String> = hostedUrl

    /**
     * Returns the raw JSON value of [lines].
     *
     * Unlike [lines], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lines") @ExcludeMissing fun _lines(): JsonField<List<InvoiceLine>> = lines

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [nextReminderAt].
     *
     * Unlike [nextReminderAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_reminder_at")
    @ExcludeMissing
    fun _nextReminderAt(): JsonField<OffsetDateTime> = nextReminderAt

    /**
     * Returns the raw JSON value of [nextRetryAt].
     *
     * Unlike [nextRetryAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_retry_at")
    @ExcludeMissing
    fun _nextRetryAt(): JsonField<OffsetDateTime> = nextRetryAt

    /**
     * Returns the raw JSON value of [paymentTermsDays].
     *
     * Unlike [paymentTermsDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_terms_days")
    @ExcludeMissing
    fun _paymentTermsDays(): JsonField<Int> = paymentTermsDays

    /**
     * Returns the raw JSON value of [payments].
     *
     * Unlike [payments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payments") @ExcludeMissing fun _payments(): JsonField<List<Payment>> = payments

    /**
     * Returns the raw JSON value of [pdfUrl].
     *
     * Unlike [pdfUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

    /**
     * Returns the raw JSON value of [reminderSettings].
     *
     * Unlike [reminderSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reminder_settings")
    @ExcludeMissing
    fun _reminderSettings(): JsonField<ReminderSettings> = reminderSettings

    /**
     * Returns the raw JSON value of [reviewDeadline].
     *
     * Unlike [reviewDeadline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("review_deadline")
    @ExcludeMissing
    fun _reviewDeadline(): JsonField<OffsetDateTime> = reviewDeadline

    /**
     * Returns the raw JSON value of [sentAt].
     *
     * Unlike [sentAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sent_at") @ExcludeMissing fun _sentAt(): JsonField<OffsetDateTime> = sentAt

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
         * Returns a mutable builder for constructing an instance of [Invoice].
         *
         * The following fields are required:
         * ```kotlin
         * .allowedActions()
         * .amountDue()
         * .amountPaid()
         * .amountRefunded()
         * .billingMode()
         * .businessId()
         * .createdAt()
         * .credits()
         * .currency()
         * .customer()
         * .discountIds()
         * .editableFields()
         * .frequency()
         * .invoiceId()
         * .metadata()
         * .refundIds()
         * .retryCount()
         * .rowVersion()
         * .status()
         * .subscriptionIds()
         * .tags()
         * .tax()
         * .totalAmount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Invoice]. */
    class Builder internal constructor() {

        private var allowedActions: JsonField<MutableList<AllowedAction>>? = null
        private var amountDue: JsonField<Long>? = null
        private var amountPaid: JsonField<Long>? = null
        private var amountRefunded: JsonField<Long>? = null
        private var billingMode: JsonField<BillingMode>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var credits: JsonField<Long>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<Customer>? = null
        private var discountIds: JsonField<MutableList<String>>? = null
        private var editableFields: JsonField<MutableList<EditableField>>? = null
        private var frequency: JsonField<Frequency>? = null
        private var invoiceId: JsonField<String>? = null
        private var metadata: JsonValue? = null
        private var refundIds: JsonField<MutableList<String>>? = null
        private var retryCount: JsonField<Int>? = null
        private var rowVersion: JsonField<Long>? = null
        private var status: JsonField<InvoiceStatus>? = null
        private var subscriptionIds: JsonField<MutableList<String>>? = null
        private var tags: JsonField<MutableList<Tag>>? = null
        private var tax: JsonField<Int>? = null
        private var totalAmount: JsonField<Int>? = null
        private var collectionMethod: JsonField<CollectionMethod> = JsonMissing.of()
        private var dueAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dunningState: JsonField<DunningState> = JsonMissing.of()
        private var finalizedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var hostedUrl: JsonField<String> = JsonMissing.of()
        private var lines: JsonField<MutableList<InvoiceLine>>? = null
        private var memo: JsonField<String> = JsonMissing.of()
        private var nextReminderAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var nextRetryAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var paymentTermsDays: JsonField<Int> = JsonMissing.of()
        private var payments: JsonField<MutableList<Payment>>? = null
        private var pdfUrl: JsonField<String> = JsonMissing.of()
        private var reminderSettings: JsonField<ReminderSettings> = JsonMissing.of()
        private var reviewDeadline: JsonField<OffsetDateTime> = JsonMissing.of()
        private var sentAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoice: Invoice) = apply {
            allowedActions = invoice.allowedActions.map { it.toMutableList() }
            amountDue = invoice.amountDue
            amountPaid = invoice.amountPaid
            amountRefunded = invoice.amountRefunded
            billingMode = invoice.billingMode
            businessId = invoice.businessId
            createdAt = invoice.createdAt
            credits = invoice.credits
            currency = invoice.currency
            customer = invoice.customer
            discountIds = invoice.discountIds.map { it.toMutableList() }
            editableFields = invoice.editableFields.map { it.toMutableList() }
            frequency = invoice.frequency
            invoiceId = invoice.invoiceId
            metadata = invoice.metadata
            refundIds = invoice.refundIds.map { it.toMutableList() }
            retryCount = invoice.retryCount
            rowVersion = invoice.rowVersion
            status = invoice.status
            subscriptionIds = invoice.subscriptionIds.map { it.toMutableList() }
            tags = invoice.tags.map { it.toMutableList() }
            tax = invoice.tax
            totalAmount = invoice.totalAmount
            collectionMethod = invoice.collectionMethod
            dueAt = invoice.dueAt
            dunningState = invoice.dunningState
            finalizedAt = invoice.finalizedAt
            hostedUrl = invoice.hostedUrl
            lines = invoice.lines.map { it.toMutableList() }
            memo = invoice.memo
            nextReminderAt = invoice.nextReminderAt
            nextRetryAt = invoice.nextRetryAt
            paymentTermsDays = invoice.paymentTermsDays
            payments = invoice.payments.map { it.toMutableList() }
            pdfUrl = invoice.pdfUrl
            reminderSettings = invoice.reminderSettings
            reviewDeadline = invoice.reviewDeadline
            sentAt = invoice.sentAt
            additionalProperties = invoice.additionalProperties.toMutableMap()
        }

        /** The actions that the current status accepts. */
        fun allowedActions(allowedActions: List<AllowedAction>) =
            allowedActions(JsonField.of(allowedActions))

        /**
         * Sets [Builder.allowedActions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedActions] with a well-typed `List<AllowedAction>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowedActions(allowedActions: JsonField<List<AllowedAction>>) = apply {
            this.allowedActions = allowedActions.map { it.toMutableList() }
        }

        /**
         * Adds a single [AllowedAction] to [allowedActions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedAction(allowedAction: AllowedAction) = apply {
            allowedActions =
                (allowedActions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedActions", it).add(allowedAction)
                }
        }

        /** The amount that the customer must pay. Zero unless the invoice is open or past due. */
        fun amountDue(amountDue: Long) = amountDue(JsonField.of(amountDue))

        /**
         * Sets [Builder.amountDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDue] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amountDue(amountDue: JsonField<Long>) = apply { this.amountDue = amountDue }

        /**
         * The sum of the succeeded payments, in the smallest currency unit. A late payment is not
         * included after its late refund.
         */
        fun amountPaid(amountPaid: Long) = amountPaid(JsonField.of(amountPaid))

        /**
         * Sets [Builder.amountPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountPaid] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amountPaid(amountPaid: JsonField<Long>) = apply { this.amountPaid = amountPaid }

        /**
         * The sum of the succeeded refunds, in the currency of each payment. The late refund of a
         * late payment is not included.
         */
        fun amountRefunded(amountRefunded: Long) = amountRefunded(JsonField.of(amountRefunded))

        /**
         * Sets [Builder.amountRefunded] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountRefunded] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountRefunded(amountRefunded: JsonField<Long>) = apply {
            this.amountRefunded = amountRefunded
        }

        fun billingMode(billingMode: BillingMode) = billingMode(JsonField.of(billingMode))

        /**
         * Sets [Builder.billingMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingMode] with a well-typed [BillingMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingMode(billingMode: JsonField<BillingMode>) = apply {
            this.billingMode = billingMode
        }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Customer credits applied at finalise, in the smallest currency unit. Zero or less. */
        fun credits(credits: Long) = credits(JsonField.of(credits))

        /**
         * Sets [Builder.credits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credits] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun credits(credits: JsonField<Long>) = apply { this.credits = credits }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [Customer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /** The discount codes of the invoice. */
        fun discountIds(discountIds: List<String>) = discountIds(JsonField.of(discountIds))

        /**
         * Sets [Builder.discountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountIds(discountIds: JsonField<List<String>>) = apply {
            this.discountIds = discountIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [discountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscountId(discountId: String) = apply {
            discountIds =
                (discountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discountIds", it).add(discountId)
                }
        }

        /** The fields that `PATCH` can change in the current status. */
        fun editableFields(editableFields: List<EditableField>) =
            editableFields(JsonField.of(editableFields))

        /**
         * Sets [Builder.editableFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.editableFields] with a well-typed `List<EditableField>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun editableFields(editableFields: JsonField<List<EditableField>>) = apply {
            this.editableFields = editableFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [EditableField] to [editableFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEditableField(editableField: EditableField) = apply {
            editableFields =
                (editableFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("editableFields", it).add(editableField)
                }
        }

        /**
         * How often the invoice lines bill. `mixed` covers several intervals, or one-time lines
         * next to a plan.
         */
        fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

        /**
         * Sets [Builder.frequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frequency] with a well-typed [Frequency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frequency(frequency: JsonField<Frequency>) = apply { this.frequency = frequency }

        /** Alias for calling [frequency] with `Frequency.ofObject()`. */
        fun frequencyObject() = frequency(Frequency.ofObject())

        /** Alias for calling [frequency] with `Frequency.ofUnionMember1(unionMember1)`. */
        fun frequency(unionMember1: Frequency.UnionMember1) =
            frequency(Frequency.ofUnionMember1(unionMember1))

        /** Alias for calling [frequency] with `Frequency.ofObject()`. */
        fun frequencyObject() = frequency(Frequency.ofObject())

        fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

        /**
         * Sets [Builder.invoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun refundIds(refundIds: List<String>) = refundIds(JsonField.of(refundIds))

        /**
         * Sets [Builder.refundIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refundIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun refundIds(refundIds: JsonField<List<String>>) = apply {
            this.refundIds = refundIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [refundIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefundId(refundId: String) = apply {
            refundIds =
                (refundIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refundIds", it).add(refundId)
                }
        }

        /** The number of failed automatic charges. */
        fun retryCount(retryCount: Int) = retryCount(JsonField.of(retryCount))

        /**
         * Sets [Builder.retryCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retryCount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun retryCount(retryCount: JsonField<Int>) = apply { this.retryCount = retryCount }

        /** Goes up by one on each change. Use it to ignore an older webhook delivery. */
        fun rowVersion(rowVersion: Long) = rowVersion(JsonField.of(rowVersion))

        /**
         * Sets [Builder.rowVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowVersion] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rowVersion(rowVersion: JsonField<Long>) = apply { this.rowVersion = rowVersion }

        /** The `message` of each variant is the label of the invoice document. */
        fun status(status: InvoiceStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [InvoiceStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<InvoiceStatus>) = apply { this.status = status }

        fun subscriptionIds(subscriptionIds: List<String>) =
            subscriptionIds(JsonField.of(subscriptionIds))

        /**
         * Sets [Builder.subscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionIds(subscriptionIds: JsonField<List<String>>) = apply {
            this.subscriptionIds = subscriptionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [subscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionId(subscriptionId: String) = apply {
            subscriptionIds =
                (subscriptionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("subscriptionIds", it).add(subscriptionId)
                }
        }

        fun tags(tags: List<Tag>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<Tag>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<List<Tag>>) = apply { this.tags = tags.map { it.toMutableList() } }

        /**
         * Adds a single [Tag] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: Tag) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Tax in the smallest currency unit. */
        fun tax(tax: Int) = tax(JsonField.of(tax))

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

        /** Total with tax, before credits, in the smallest currency unit. */
        fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

        /**
         * Sets [Builder.totalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAmount] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalAmount(totalAmount: JsonField<Int>) = apply { this.totalAmount = totalAmount }

        fun collectionMethod(collectionMethod: CollectionMethod?) =
            collectionMethod(JsonField.ofNullable(collectionMethod))

        /**
         * Sets [Builder.collectionMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectionMethod] with a well-typed [CollectionMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun collectionMethod(collectionMethod: JsonField<CollectionMethod>) = apply {
            this.collectionMethod = collectionMethod
        }

        fun dueAt(dueAt: OffsetDateTime?) = dueAt(JsonField.ofNullable(dueAt))

        /**
         * Sets [Builder.dueAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueAt] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dueAt(dueAt: JsonField<OffsetDateTime>) = apply { this.dueAt = dueAt }

        /** `null` for an invoice that has no collection: draft, paid, void or uncollectable. */
        fun dunningState(dunningState: DunningState?) =
            dunningState(JsonField.ofNullable(dunningState))

        /**
         * Sets [Builder.dunningState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dunningState] with a well-typed [DunningState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dunningState(dunningState: JsonField<DunningState>) = apply {
            this.dunningState = dunningState
        }

        fun finalizedAt(finalizedAt: OffsetDateTime?) =
            finalizedAt(JsonField.ofNullable(finalizedAt))

        /**
         * Sets [Builder.finalizedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finalizedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun finalizedAt(finalizedAt: JsonField<OffsetDateTime>) = apply {
            this.finalizedAt = finalizedAt
        }

        /** The page where the customer pays. `null` until the invoice is sent. */
        fun hostedUrl(hostedUrl: String?) = hostedUrl(JsonField.ofNullable(hostedUrl))

        /**
         * Sets [Builder.hostedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hostedUrl(hostedUrl: JsonField<String>) = apply { this.hostedUrl = hostedUrl }

        /** Only on a single invoice. A list leaves it out. */
        fun lines(lines: List<InvoiceLine>?) = lines(JsonField.ofNullable(lines))

        /**
         * Sets [Builder.lines] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lines] with a well-typed `List<InvoiceLine>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lines(lines: JsonField<List<InvoiceLine>>) = apply {
            this.lines = lines.map { it.toMutableList() }
        }

        /**
         * Adds a single [InvoiceLine] to [lines].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLine(line: InvoiceLine) = apply {
            lines =
                (lines ?: JsonField.of(mutableListOf())).also { checkKnown("lines", it).add(line) }
        }

        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /**
         * The time of the next reminder email to the customer, before or after the due date. `null`
         * when no reminder email will go out.
         */
        fun nextReminderAt(nextReminderAt: OffsetDateTime?) =
            nextReminderAt(JsonField.ofNullable(nextReminderAt))

        /**
         * Sets [Builder.nextReminderAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextReminderAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextReminderAt(nextReminderAt: JsonField<OffsetDateTime>) = apply {
            this.nextReminderAt = nextReminderAt
        }

        fun nextRetryAt(nextRetryAt: OffsetDateTime?) =
            nextRetryAt(JsonField.ofNullable(nextRetryAt))

        /**
         * Sets [Builder.nextRetryAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextRetryAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nextRetryAt(nextRetryAt: JsonField<OffsetDateTime>) = apply {
            this.nextRetryAt = nextRetryAt
        }

        /** Days from finalise to the due date. `null` when the invoice has a custom due date. */
        fun paymentTermsDays(paymentTermsDays: Int?) =
            paymentTermsDays(JsonField.ofNullable(paymentTermsDays))

        /**
         * Alias for [Builder.paymentTermsDays].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun paymentTermsDays(paymentTermsDays: Int) = paymentTermsDays(paymentTermsDays as Int?)

        /**
         * Sets [Builder.paymentTermsDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentTermsDays] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentTermsDays(paymentTermsDays: JsonField<Int>) = apply {
            this.paymentTermsDays = paymentTermsDays
        }

        /** Only on a single invoice. A list leaves it out. */
        fun payments(payments: List<Payment>?) = payments(JsonField.ofNullable(payments))

        /**
         * Sets [Builder.payments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payments] with a well-typed `List<Payment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payments(payments: JsonField<List<Payment>>) = apply {
            this.payments = payments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Payment] to [payments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayment(payment: Payment) = apply {
            payments =
                (payments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payments", it).add(payment)
                }
        }

        fun pdfUrl(pdfUrl: String?) = pdfUrl(JsonField.ofNullable(pdfUrl))

        /**
         * Sets [Builder.pdfUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pdfUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

        /** `null` on a draft that keeps all reminder settings of the business. */
        fun reminderSettings(reminderSettings: ReminderSettings?) =
            reminderSettings(JsonField.ofNullable(reminderSettings))

        /**
         * Sets [Builder.reminderSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reminderSettings] with a well-typed [ReminderSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun reminderSettings(reminderSettings: JsonField<ReminderSettings>) = apply {
            this.reminderSettings = reminderSettings
        }

        /**
         * Alias for calling [reminderSettings] with
         * `ReminderSettings.ofUnionMember0(unionMember0)`.
         */
        fun reminderSettings(unionMember0: ReminderSettings.UnionMember0) =
            reminderSettings(ReminderSettings.ofUnionMember0(unionMember0))

        /**
         * Alias for calling [reminderSettings] with
         * `ReminderSettings.ofUnionMember1(unionMember1)`.
         */
        fun reminderSettings(unionMember1: ReminderSettings.UnionMember1) =
            reminderSettings(ReminderSettings.ofUnionMember1(unionMember1))

        /** The time at which a draft that waits for review finalises. */
        fun reviewDeadline(reviewDeadline: OffsetDateTime?) =
            reviewDeadline(JsonField.ofNullable(reviewDeadline))

        /**
         * Sets [Builder.reviewDeadline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewDeadline] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewDeadline(reviewDeadline: JsonField<OffsetDateTime>) = apply {
            this.reviewDeadline = reviewDeadline
        }

        fun sentAt(sentAt: OffsetDateTime?) = sentAt(JsonField.ofNullable(sentAt))

        /**
         * Sets [Builder.sentAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sentAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sentAt(sentAt: JsonField<OffsetDateTime>) = apply { this.sentAt = sentAt }

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
         * Returns an immutable instance of [Invoice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .allowedActions()
         * .amountDue()
         * .amountPaid()
         * .amountRefunded()
         * .billingMode()
         * .businessId()
         * .createdAt()
         * .credits()
         * .currency()
         * .customer()
         * .discountIds()
         * .editableFields()
         * .frequency()
         * .invoiceId()
         * .metadata()
         * .refundIds()
         * .retryCount()
         * .rowVersion()
         * .status()
         * .subscriptionIds()
         * .tags()
         * .tax()
         * .totalAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Invoice =
            Invoice(
                checkRequired("allowedActions", allowedActions).map { it.toImmutable() },
                checkRequired("amountDue", amountDue),
                checkRequired("amountPaid", amountPaid),
                checkRequired("amountRefunded", amountRefunded),
                checkRequired("billingMode", billingMode),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("credits", credits),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("discountIds", discountIds).map { it.toImmutable() },
                checkRequired("editableFields", editableFields).map { it.toImmutable() },
                checkRequired("frequency", frequency),
                checkRequired("invoiceId", invoiceId),
                checkRequired("metadata", metadata),
                checkRequired("refundIds", refundIds).map { it.toImmutable() },
                checkRequired("retryCount", retryCount),
                checkRequired("rowVersion", rowVersion),
                checkRequired("status", status),
                checkRequired("subscriptionIds", subscriptionIds).map { it.toImmutable() },
                checkRequired("tags", tags).map { it.toImmutable() },
                checkRequired("tax", tax),
                checkRequired("totalAmount", totalAmount),
                collectionMethod,
                dueAt,
                dunningState,
                finalizedAt,
                hostedUrl,
                (lines ?: JsonMissing.of()).map { it.toImmutable() },
                memo,
                nextReminderAt,
                nextRetryAt,
                paymentTermsDays,
                (payments ?: JsonMissing.of()).map { it.toImmutable() },
                pdfUrl,
                reminderSettings,
                reviewDeadline,
                sentAt,
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
    fun validate(): Invoice = apply {
        if (validated) {
            return@apply
        }

        allowedActions().forEach { it.validate() }
        amountDue()
        amountPaid()
        amountRefunded()
        billingMode().validate()
        businessId()
        createdAt()
        credits()
        currency().validate()
        customer().validate()
        discountIds()
        editableFields().forEach { it.validate() }
        frequency().validate()
        invoiceId()
        refundIds()
        retryCount()
        rowVersion()
        status().validate()
        subscriptionIds()
        tags().forEach { it.validate() }
        tax()
        totalAmount()
        collectionMethod()?.validate()
        dueAt()
        dunningState()?.validate()
        finalizedAt()
        hostedUrl()
        lines()?.forEach { it.validate() }
        memo()
        nextReminderAt()
        nextRetryAt()
        paymentTermsDays()
        payments()?.forEach { it.validate() }
        pdfUrl()
        reminderSettings()?.validate()
        reviewDeadline()
        sentAt()
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
        (allowedActions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (amountDue.asKnown() == null) 0 else 1) +
            (if (amountPaid.asKnown() == null) 0 else 1) +
            (if (amountRefunded.asKnown() == null) 0 else 1) +
            (billingMode.asKnown()?.validity() ?: 0) +
            (if (businessId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (credits.asKnown() == null) 0 else 1) +
            (currency.asKnown()?.validity() ?: 0) +
            (customer.asKnown()?.validity() ?: 0) +
            (discountIds.asKnown()?.size ?: 0) +
            (editableFields.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (frequency.asKnown()?.validity() ?: 0) +
            (if (invoiceId.asKnown() == null) 0 else 1) +
            (refundIds.asKnown()?.size ?: 0) +
            (if (retryCount.asKnown() == null) 0 else 1) +
            (if (rowVersion.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (subscriptionIds.asKnown()?.size ?: 0) +
            (tags.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (tax.asKnown() == null) 0 else 1) +
            (if (totalAmount.asKnown() == null) 0 else 1) +
            (collectionMethod.asKnown()?.validity() ?: 0) +
            (if (dueAt.asKnown() == null) 0 else 1) +
            (dunningState.asKnown()?.validity() ?: 0) +
            (if (finalizedAt.asKnown() == null) 0 else 1) +
            (if (hostedUrl.asKnown() == null) 0 else 1) +
            (lines.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (memo.asKnown() == null) 0 else 1) +
            (if (nextReminderAt.asKnown() == null) 0 else 1) +
            (if (nextRetryAt.asKnown() == null) 0 else 1) +
            (if (paymentTermsDays.asKnown() == null) 0 else 1) +
            (payments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (pdfUrl.asKnown() == null) 0 else 1) +
            (reminderSettings.asKnown()?.validity() ?: 0) +
            (if (reviewDeadline.asKnown() == null) 0 else 1) +
            (if (sentAt.asKnown() == null) 0 else 1)

    /** An action that a merchant can request on the invoice in its current status. */
    class AllowedAction @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val EDIT = of("edit")

            val FINALIZE = of("finalize")

            val DELETE = of("delete")

            val SEND = of("send")

            val RETRY = of("retry")

            val VOID = of("void")

            val MARK_UNCOLLECTABLE = of("mark_uncollectable")

            val CHANGE_DUNNING = of("change_dunning")

            val ADD_NOTE = of("add_note")

            val DUPLICATE = of("duplicate")

            fun of(value: String) = AllowedAction(JsonField.of(value))
        }

        /** An enum containing [AllowedAction]'s known values. */
        enum class Known {
            EDIT,
            FINALIZE,
            DELETE,
            SEND,
            RETRY,
            VOID,
            MARK_UNCOLLECTABLE,
            CHANGE_DUNNING,
            ADD_NOTE,
            DUPLICATE,
        }

        /**
         * An enum containing [AllowedAction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AllowedAction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EDIT,
            FINALIZE,
            DELETE,
            SEND,
            RETRY,
            VOID,
            MARK_UNCOLLECTABLE,
            CHANGE_DUNNING,
            ADD_NOTE,
            DUPLICATE,
            /**
             * An enum member indicating that [AllowedAction] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EDIT -> Value.EDIT
                FINALIZE -> Value.FINALIZE
                DELETE -> Value.DELETE
                SEND -> Value.SEND
                RETRY -> Value.RETRY
                VOID -> Value.VOID
                MARK_UNCOLLECTABLE -> Value.MARK_UNCOLLECTABLE
                CHANGE_DUNNING -> Value.CHANGE_DUNNING
                ADD_NOTE -> Value.ADD_NOTE
                DUPLICATE -> Value.DUPLICATE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                EDIT -> Known.EDIT
                FINALIZE -> Known.FINALIZE
                DELETE -> Known.DELETE
                SEND -> Known.SEND
                RETRY -> Known.RETRY
                VOID -> Known.VOID
                MARK_UNCOLLECTABLE -> Known.MARK_UNCOLLECTABLE
                CHANGE_DUNNING -> Known.CHANGE_DUNNING
                ADD_NOTE -> Known.ADD_NOTE
                DUPLICATE -> Known.DUPLICATE
                else -> throw DodoPaymentsInvalidDataException("Unknown AllowedAction: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): AllowedAction = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AllowedAction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class BillingMode @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val NORMAL = of("normal")

            val INVOICE_LED = of("invoice_led")

            fun of(value: String) = BillingMode(JsonField.of(value))
        }

        /** An enum containing [BillingMode]'s known values. */
        enum class Known {
            NORMAL,
            INVOICE_LED,
        }

        /**
         * An enum containing [BillingMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BillingMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NORMAL,
            INVOICE_LED,
            /**
             * An enum member indicating that [BillingMode] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NORMAL -> Value.NORMAL
                INVOICE_LED -> Value.INVOICE_LED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NORMAL -> Known.NORMAL
                INVOICE_LED -> Known.INVOICE_LED
                else -> throw DodoPaymentsInvalidDataException("Unknown BillingMode: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): BillingMode = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Customer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingAddress: JsonField<BillingAddress>,
        private val ccEmails: JsonField<List<String>>,
        private val customerId: JsonField<String>,
        private val email: JsonField<String>,
        private val taxId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("cc_emails")
            @ExcludeMissing
            ccEmails: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
        ) : this(billingAddress, ccEmails, customerId, email, taxId, mutableMapOf())

        /**
         * A draft can have no country yet. Finalise needs it.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingAddress(): BillingAddress = billingAddress.getRequired("billing_address")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ccEmails(): List<String> = ccEmails.getRequired("cc_emails")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): String? = taxId.getNullable("tax_id")

        /**
         * Returns the raw JSON value of [billingAddress].
         *
         * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<BillingAddress> = billingAddress

        /**
         * Returns the raw JSON value of [ccEmails].
         *
         * Unlike [ccEmails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cc_emails")
        @ExcludeMissing
        fun _ccEmails(): JsonField<List<String>> = ccEmails

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
             * Returns a mutable builder for constructing an instance of [Customer].
             *
             * The following fields are required:
             * ```kotlin
             * .billingAddress()
             * .ccEmails()
             * .customerId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Customer]. */
        class Builder internal constructor() {

            private var billingAddress: JsonField<BillingAddress>? = null
            private var ccEmails: JsonField<MutableList<String>>? = null
            private var customerId: JsonField<String>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customer: Customer) = apply {
                billingAddress = customer.billingAddress
                ccEmails = customer.ccEmails.map { it.toMutableList() }
                customerId = customer.customerId
                email = customer.email
                taxId = customer.taxId
                additionalProperties = customer.additionalProperties.toMutableMap()
            }

            /** A draft can have no country yet. Finalise needs it. */
            fun billingAddress(billingAddress: BillingAddress) =
                billingAddress(JsonField.of(billingAddress))

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                this.billingAddress = billingAddress
            }

            fun ccEmails(ccEmails: List<String>) = ccEmails(JsonField.of(ccEmails))

            /**
             * Sets [Builder.ccEmails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ccEmails] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ccEmails(ccEmails: JsonField<List<String>>) = apply {
                this.ccEmails = ccEmails.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ccEmails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCcEmail(ccEmail: String) = apply {
                ccEmails =
                    (ccEmails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ccEmails", it).add(ccEmail)
                    }
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
             * Returns an immutable instance of [Customer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .billingAddress()
             * .ccEmails()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Customer =
                Customer(
                    checkRequired("billingAddress", billingAddress),
                    checkRequired("ccEmails", ccEmails).map { it.toImmutable() },
                    checkRequired("customerId", customerId),
                    email,
                    taxId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            billingAddress().validate()
            ccEmails()
            customerId()
            email()
            taxId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (billingAddress.asKnown()?.validity() ?: 0) +
                (ccEmails.asKnown()?.size ?: 0) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (taxId.asKnown() == null) 0 else 1)

        /** A draft can have no country yet. Finalise needs it. */
        class BillingAddress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val country: JsonField<CountryCode>,
            private val state: JsonField<String>,
            private val street: JsonField<String>,
            private val zipcode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<CountryCode> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("street")
                @ExcludeMissing
                street: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zipcode")
                @ExcludeMissing
                zipcode: JsonField<String> = JsonMissing.of(),
            ) : this(city, country, state, street, zipcode, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun city(): String? = city.getNullable("city")

            /**
             * ISO country code alpha2 variant
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun country(): CountryCode? = country.getNullable("country")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun state(): String? = state.getNullable("state")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun street(): String? = street.getNullable("street")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun zipcode(): String? = zipcode.getNullable("zipcode")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country")
            @ExcludeMissing
            fun _country(): JsonField<CountryCode> = country

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /**
             * Returns the raw JSON value of [street].
             *
             * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

            /**
             * Returns the raw JSON value of [zipcode].
             *
             * Unlike [zipcode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

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

                /** Returns a mutable builder for constructing an instance of [BillingAddress]. */
                fun builder() = Builder()
            }

            /** A builder for [BillingAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String> = JsonMissing.of()
                private var country: JsonField<CountryCode> = JsonMissing.of()
                private var state: JsonField<String> = JsonMissing.of()
                private var street: JsonField<String> = JsonMissing.of()
                private var zipcode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingAddress: BillingAddress) = apply {
                    city = billingAddress.city
                    country = billingAddress.country
                    state = billingAddress.state
                    street = billingAddress.street
                    zipcode = billingAddress.zipcode
                    additionalProperties = billingAddress.additionalProperties.toMutableMap()
                }

                fun city(city: String?) = city(JsonField.ofNullable(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** ISO country code alpha2 variant */
                fun country(country: CountryCode?) = country(JsonField.ofNullable(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [CountryCode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<CountryCode>) = apply { this.country = country }

                fun state(state: String?) = state(JsonField.ofNullable(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                fun street(street: String?) = street(JsonField.ofNullable(street))

                /**
                 * Sets [Builder.street] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.street] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun street(street: JsonField<String>) = apply { this.street = street }

                fun zipcode(zipcode: String?) = zipcode(JsonField.ofNullable(zipcode))

                /**
                 * Sets [Builder.zipcode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zipcode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [BillingAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): BillingAddress =
                    BillingAddress(
                        city,
                        country,
                        state,
                        street,
                        zipcode,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): BillingAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                country()?.validate()
                state()
                street()
                zipcode()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (city.asKnown() == null) 0 else 1) +
                    (country.asKnown()?.validity() ?: 0) +
                    (if (state.asKnown() == null) 0 else 1) +
                    (if (street.asKnown() == null) 0 else 1) +
                    (if (zipcode.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillingAddress &&
                    city == other.city &&
                    country == other.country &&
                    state == other.state &&
                    street == other.street &&
                    zipcode == other.zipcode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, country, state, street, zipcode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingAddress{city=$city, country=$country, state=$state, street=$street, zipcode=$zipcode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Customer &&
                billingAddress == other.billingAddress &&
                ccEmails == other.ccEmails &&
                customerId == other.customerId &&
                email == other.email &&
                taxId == other.taxId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(billingAddress, ccEmails, customerId, email, taxId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{billingAddress=$billingAddress, ccEmails=$ccEmails, customerId=$customerId, email=$email, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    class EditableField @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CUSTOMER = of("customer")

            val ITEMS = of("items")

            val DISCOUNTS = of("discounts")

            val CURRENCY = of("currency")

            val BILLING_ADDRESS = of("billing_address")

            val TAX_ID = of("tax_id")

            val REVIEW_REQUIRED = of("review_required")

            val DUE_AT = of("due_at")

            val COLLECTION_METHOD = of("collection_method")

            val MEMO = of("memo")

            val CUSTOMER_EMAIL = of("customer_email")

            val CC_EMAILS = of("cc_emails")

            val DUNNING = of("dunning")

            val METADATA = of("metadata")

            fun of(value: String) = EditableField(JsonField.of(value))
        }

        /** An enum containing [EditableField]'s known values. */
        enum class Known {
            CUSTOMER,
            ITEMS,
            DISCOUNTS,
            CURRENCY,
            BILLING_ADDRESS,
            TAX_ID,
            REVIEW_REQUIRED,
            DUE_AT,
            COLLECTION_METHOD,
            MEMO,
            CUSTOMER_EMAIL,
            CC_EMAILS,
            DUNNING,
            METADATA,
        }

        /**
         * An enum containing [EditableField]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EditableField] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER,
            ITEMS,
            DISCOUNTS,
            CURRENCY,
            BILLING_ADDRESS,
            TAX_ID,
            REVIEW_REQUIRED,
            DUE_AT,
            COLLECTION_METHOD,
            MEMO,
            CUSTOMER_EMAIL,
            CC_EMAILS,
            DUNNING,
            METADATA,
            /**
             * An enum member indicating that [EditableField] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CUSTOMER -> Value.CUSTOMER
                ITEMS -> Value.ITEMS
                DISCOUNTS -> Value.DISCOUNTS
                CURRENCY -> Value.CURRENCY
                BILLING_ADDRESS -> Value.BILLING_ADDRESS
                TAX_ID -> Value.TAX_ID
                REVIEW_REQUIRED -> Value.REVIEW_REQUIRED
                DUE_AT -> Value.DUE_AT
                COLLECTION_METHOD -> Value.COLLECTION_METHOD
                MEMO -> Value.MEMO
                CUSTOMER_EMAIL -> Value.CUSTOMER_EMAIL
                CC_EMAILS -> Value.CC_EMAILS
                DUNNING -> Value.DUNNING
                METADATA -> Value.METADATA
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CUSTOMER -> Known.CUSTOMER
                ITEMS -> Known.ITEMS
                DISCOUNTS -> Known.DISCOUNTS
                CURRENCY -> Known.CURRENCY
                BILLING_ADDRESS -> Known.BILLING_ADDRESS
                TAX_ID -> Known.TAX_ID
                REVIEW_REQUIRED -> Known.REVIEW_REQUIRED
                DUE_AT -> Known.DUE_AT
                COLLECTION_METHOD -> Known.COLLECTION_METHOD
                MEMO -> Known.MEMO
                CUSTOMER_EMAIL -> Known.CUSTOMER_EMAIL
                CC_EMAILS -> Known.CC_EMAILS
                DUNNING -> Known.DUNNING
                METADATA -> Known.METADATA
                else -> throw DodoPaymentsInvalidDataException("Unknown EditableField: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): EditableField = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EditableField && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * How often the invoice lines bill. `mixed` covers several intervals, or one-time lines next to
     * a plan.
     */
    @JsonDeserialize(using = Frequency.Deserializer::class)
    @JsonSerialize(using = Frequency.Serializer::class)
    class Frequency
    private constructor(
        private val object_: JsonValue? = null,
        private val unionMember1: UnionMember1? = null,
        private val object_: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun object_(): JsonValue? = object_

        fun unionMember1(): UnionMember1? = unionMember1

        fun object_(): JsonValue? = object_

        fun isObject(): Boolean = object_ != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isObject(): Boolean = object_ != null

        fun asObject(): JsonValue = object_.getOrThrow("object_")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun asObject(): JsonValue = object_.getOrThrow("object_")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.dodopayments.api.core.JsonValue
         *
         * val result: String? = frequency.accept(object : Frequency.Visitor<String?> {
         *     override fun visitObject(object_: JsonValue): String? = object_.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                object_ != null -> visitor.visitObject(object_)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                object_ != null -> visitor.visitObject(object_)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Frequency = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitObject(object_: JsonValue) {
                        object_.let {
                            if (it != JsonValue.from(mapOf("type" to "one_time"))) {
                                throw DodoPaymentsInvalidDataException(
                                    "'object_' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitObject(object_: JsonValue) {
                        object_.let {
                            if (it != JsonValue.from(mapOf("type" to "mixed"))) {
                                throw DodoPaymentsInvalidDataException(
                                    "'object_' is invalid, received $it"
                                )
                            }
                        }
                    }
                }
            )
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitObject(object_: JsonValue) =
                        object_.let {
                            if (it == JsonValue.from(mapOf("type" to "one_time"))) 1 else 0
                        }

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitObject(object_: JsonValue) =
                        object_.let { if (it == JsonValue.from(mapOf("type" to "mixed"))) 1 else 0 }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Frequency &&
                object_ == other.object_ &&
                unionMember1 == other.unionMember1 &&
                object_ == other.object_
        }

        override fun hashCode(): Int = Objects.hash(object_, unionMember1, object_)

        override fun toString(): String =
            when {
                object_ != null -> "Frequency{object_=$object_}"
                unionMember1 != null -> "Frequency{unionMember1=$unionMember1}"
                object_ != null -> "Frequency{object_=$object_}"
                _json != null -> "Frequency{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Frequency")
            }

        companion object {

            fun ofObject() = Frequency(object_ = JsonValue.from(mapOf("type" to "one_time")))

            fun ofUnionMember1(unionMember1: UnionMember1) = Frequency(unionMember1 = unionMember1)

            fun ofObject() = Frequency(object_ = JsonValue.from(mapOf("type" to "mixed")))
        }

        /**
         * An interface that defines how to map each variant of [Frequency] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitObject(object_: JsonValue): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitObject(object_: JsonValue): T

            /**
             * Maps an unknown variant of [Frequency] to a value of type [T].
             *
             * An instance of [Frequency] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown Frequency: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Frequency>(Frequency::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Frequency {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { Frequency(object_ = it, _json = json) }
                                ?.takeIf { it.isValid() },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())
                                ?.let { Frequency(object_ = it, _json = json) }
                                ?.takeIf { it.isValid() },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Frequency(unionMember1 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Frequency(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Frequency>(Frequency::class) {

            override fun serialize(
                value: Frequency,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.object_ != null -> generator.writeObject(value.object_)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.object_ != null -> generator.writeObject(value.object_)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Frequency")
                }
            }
        }

        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val count: JsonField<Int>,
            private val interval: JsonField<TimeInterval>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("count") @ExcludeMissing count: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("interval")
                @ExcludeMissing
                interval: JsonField<TimeInterval> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(count, interval, type, mutableMapOf())

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun count(): Int = count.getRequired("count")

            /**
             * Unit of a duration count (e.g. license-key validity period).
             *
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun interval(): TimeInterval = interval.getRequired("interval")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("recurring")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [count].
             *
             * Unlike [count], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("count") @ExcludeMissing fun _count(): JsonField<Int> = count

            /**
             * Returns the raw JSON value of [interval].
             *
             * Unlike [interval], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("interval")
            @ExcludeMissing
            fun _interval(): JsonField<TimeInterval> = interval

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
                 * Returns a mutable builder for constructing an instance of [UnionMember1].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .count()
                 * .interval()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var count: JsonField<Int>? = null
                private var interval: JsonField<TimeInterval>? = null
                private var type: JsonValue = JsonValue.from("recurring")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    count = unionMember1.count
                    interval = unionMember1.interval
                    type = unionMember1.type
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun count(count: Int) = count(JsonField.of(count))

                /**
                 * Sets [Builder.count] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.count] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun count(count: JsonField<Int>) = apply { this.count = count }

                /** Unit of a duration count (e.g. license-key validity period). */
                fun interval(interval: TimeInterval) = interval(JsonField.of(interval))

                /**
                 * Sets [Builder.interval] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interval] with a well-typed [TimeInterval] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun interval(interval: JsonField<TimeInterval>) = apply { this.interval = interval }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("recurring")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .count()
                 * .interval()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("count", count),
                        checkRequired("interval", interval),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                count()
                interval().validate()
                _type().let {
                    if (it != JsonValue.from("recurring")) {
                        throw DodoPaymentsInvalidDataException("'type' is invalid, received $it")
                    }
                }
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (count.asKnown() == null) 0 else 1) +
                    (interval.asKnown()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("recurring")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    count == other.count &&
                    interval == other.interval &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(count, interval, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{count=$count, interval=$interval, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class Tag @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val REFUNDED = of("refunded")

            val PARTIALLY_REFUNDED = of("partially_refunded")

            val DISPUTED = of("disputed")

            val PAYMENT_REVERSED = of("payment_reversed")

            fun of(value: String) = Tag(JsonField.of(value))
        }

        /** An enum containing [Tag]'s known values. */
        enum class Known {
            REFUNDED,
            PARTIALLY_REFUNDED,
            DISPUTED,
            PAYMENT_REVERSED,
        }

        /**
         * An enum containing [Tag]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Tag] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REFUNDED,
            PARTIALLY_REFUNDED,
            DISPUTED,
            PAYMENT_REVERSED,
            /** An enum member indicating that [Tag] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REFUNDED -> Value.REFUNDED
                PARTIALLY_REFUNDED -> Value.PARTIALLY_REFUNDED
                DISPUTED -> Value.DISPUTED
                PAYMENT_REVERSED -> Value.PAYMENT_REVERSED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                REFUNDED -> Known.REFUNDED
                PARTIALLY_REFUNDED -> Known.PARTIALLY_REFUNDED
                DISPUTED -> Known.DISPUTED
                PAYMENT_REVERSED -> Known.PAYMENT_REVERSED
                else -> throw DodoPaymentsInvalidDataException("Unknown Tag: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw DodoPaymentsInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Tag = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tag && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Payment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val paymentId: JsonField<String>,
        private val retryAttempt: JsonField<Int>,
        private val status: JsonField<IntentStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payment_id")
            @ExcludeMissing
            paymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("retry_attempt")
            @ExcludeMissing
            retryAttempt: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<IntentStatus> = JsonMissing.of(),
        ) : this(amount, createdAt, paymentId, retryAttempt, status, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentId(): String = paymentId.getRequired("payment_id")

        /**
         * The automatic charge number. `null` for a payment that the customer started.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun retryAttempt(): Int? = retryAttempt.getNullable("retry_attempt")

        /**
         * `null` while the processor has not answered.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): IntentStatus? = status.getNullable("status")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [paymentId].
         *
         * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

        /**
         * Returns the raw JSON value of [retryAttempt].
         *
         * Unlike [retryAttempt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("retry_attempt")
        @ExcludeMissing
        fun _retryAttempt(): JsonField<Int> = retryAttempt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IntentStatus> = status

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
             * Returns a mutable builder for constructing an instance of [Payment].
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .createdAt()
             * .paymentId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Payment]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var paymentId: JsonField<String>? = null
            private var retryAttempt: JsonField<Int> = JsonMissing.of()
            private var status: JsonField<IntentStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(payment: Payment) = apply {
                amount = payment.amount
                createdAt = payment.createdAt
                paymentId = payment.paymentId
                retryAttempt = payment.retryAttempt
                status = payment.status
                additionalProperties = payment.additionalProperties.toMutableMap()
            }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /**
             * Sets [Builder.paymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            /** The automatic charge number. `null` for a payment that the customer started. */
            fun retryAttempt(retryAttempt: Int?) = retryAttempt(JsonField.ofNullable(retryAttempt))

            /**
             * Alias for [Builder.retryAttempt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun retryAttempt(retryAttempt: Int) = retryAttempt(retryAttempt as Int?)

            /**
             * Sets [Builder.retryAttempt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retryAttempt] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun retryAttempt(retryAttempt: JsonField<Int>) = apply {
                this.retryAttempt = retryAttempt
            }

            /** `null` while the processor has not answered. */
            fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [IntentStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<IntentStatus>) = apply { this.status = status }

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
             * Returns an immutable instance of [Payment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .amount()
             * .createdAt()
             * .paymentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payment =
                Payment(
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("paymentId", paymentId),
                    retryAttempt,
                    status,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Payment = apply {
            if (validated) {
                return@apply
            }

            amount()
            createdAt()
            paymentId()
            retryAttempt()
            status()?.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (paymentId.asKnown() == null) 0 else 1) +
                (if (retryAttempt.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payment &&
                amount == other.amount &&
                createdAt == other.createdAt &&
                paymentId == other.paymentId &&
                retryAttempt == other.retryAttempt &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, createdAt, paymentId, retryAttempt, status, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payment{amount=$amount, createdAt=$createdAt, paymentId=$paymentId, retryAttempt=$retryAttempt, status=$status, additionalProperties=$additionalProperties}"
    }

    /** `null` on a draft that keeps all reminder settings of the business. */
    @JsonDeserialize(using = ReminderSettings.Deserializer::class)
    @JsonSerialize(using = ReminderSettings.Serializer::class)
    class ReminderSettings
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        /** The settings that finalise froze. The reminders run on them. */
        fun unionMember0(): UnionMember0? = unionMember0

        /** The changes of a draft. A `null` field keeps the business value at finalise. */
        fun unionMember1(): UnionMember1? = unionMember1

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        /** The settings that finalise froze. The reminders run on them. */
        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        /** The changes of a draft. A `null` field keeps the business value at finalise. */
        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.dodopayments.api.core.JsonValue
         *
         * val result: String? = reminderSettings.accept(object : ReminderSettings.Visitor<String?> {
         *     override fun visitUnionMember0(unionMember0: UnionMember0): String? = unionMember0.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): ReminderSettings = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReminderSettings &&
                unionMember0 == other.unionMember0 &&
                unionMember1 == other.unionMember1
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unionMember1)

        override fun toString(): String =
            when {
                unionMember0 != null -> "ReminderSettings{unionMember0=$unionMember0}"
                unionMember1 != null -> "ReminderSettings{unionMember1=$unionMember1}"
                _json != null -> "ReminderSettings{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ReminderSettings")
            }

        companion object {

            /** The settings that finalise froze. The reminders run on them. */
            fun ofUnionMember0(unionMember0: UnionMember0) =
                ReminderSettings(unionMember0 = unionMember0)

            /** The changes of a draft. A `null` field keeps the business value at finalise. */
            fun ofUnionMember1(unionMember1: UnionMember1) =
                ReminderSettings(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [ReminderSettings] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            /** The settings that finalise froze. The reminders run on them. */
            fun visitUnionMember0(unionMember0: UnionMember0): T

            /** The changes of a draft. A `null` field keeps the business value at finalise. */
            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [ReminderSettings] to a value of type [T].
             *
             * An instance of [ReminderSettings] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws DodoPaymentsInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw DodoPaymentsInvalidDataException("Unknown ReminderSettings: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ReminderSettings>(ReminderSettings::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ReminderSettings {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                ReminderSettings(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                ReminderSettings(unionMember1 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ReminderSettings(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ReminderSettings>(ReminderSettings::class) {

            override fun serialize(
                value: ReminderSettings,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ReminderSettings")
                }
            }
        }

        /** The settings that finalise froze. The reminders run on them. */
        class UnionMember0
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonValue,
            private val offsetsMinutes: JsonField<List<Long>>,
            private val paused: JsonField<Boolean>,
            private val remindersEnabled: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
                @JsonProperty("offsets_minutes")
                @ExcludeMissing
                offsetsMinutes: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("paused")
                @ExcludeMissing
                paused: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reminders_enabled")
                @ExcludeMissing
                remindersEnabled: JsonField<Boolean> = JsonMissing.of(),
            ) : this(kind, offsetsMinutes, paused, remindersEnabled, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("snapshot")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun offsetsMinutes(): List<Long> = offsetsMinutes.getRequired("offsets_minutes")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paused(): Boolean = paused.getRequired("paused")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun remindersEnabled(): Boolean = remindersEnabled.getRequired("reminders_enabled")

            /**
             * Returns the raw JSON value of [offsetsMinutes].
             *
             * Unlike [offsetsMinutes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("offsets_minutes")
            @ExcludeMissing
            fun _offsetsMinutes(): JsonField<List<Long>> = offsetsMinutes

            /**
             * Returns the raw JSON value of [paused].
             *
             * Unlike [paused], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("paused") @ExcludeMissing fun _paused(): JsonField<Boolean> = paused

            /**
             * Returns the raw JSON value of [remindersEnabled].
             *
             * Unlike [remindersEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reminders_enabled")
            @ExcludeMissing
            fun _remindersEnabled(): JsonField<Boolean> = remindersEnabled

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
                 * Returns a mutable builder for constructing an instance of [UnionMember0].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .offsetsMinutes()
                 * .paused()
                 * .remindersEnabled()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var kind: JsonValue = JsonValue.from("snapshot")
                private var offsetsMinutes: JsonField<MutableList<Long>>? = null
                private var paused: JsonField<Boolean>? = null
                private var remindersEnabled: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember0: UnionMember0) = apply {
                    kind = unionMember0.kind
                    offsetsMinutes = unionMember0.offsetsMinutes.map { it.toMutableList() }
                    paused = unionMember0.paused
                    remindersEnabled = unionMember0.remindersEnabled
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("snapshot")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

                fun offsetsMinutes(offsetsMinutes: List<Long>) =
                    offsetsMinutes(JsonField.of(offsetsMinutes))

                /**
                 * Sets [Builder.offsetsMinutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.offsetsMinutes] with a well-typed `List<Long>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun offsetsMinutes(offsetsMinutes: JsonField<List<Long>>) = apply {
                    this.offsetsMinutes = offsetsMinutes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [offsetsMinutes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addOffsetsMinute(offsetsMinute: Long) = apply {
                    offsetsMinutes =
                        (offsetsMinutes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("offsetsMinutes", it).add(offsetsMinute)
                        }
                }

                fun paused(paused: Boolean) = paused(JsonField.of(paused))

                /**
                 * Sets [Builder.paused] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paused] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paused(paused: JsonField<Boolean>) = apply { this.paused = paused }

                fun remindersEnabled(remindersEnabled: Boolean) =
                    remindersEnabled(JsonField.of(remindersEnabled))

                /**
                 * Sets [Builder.remindersEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remindersEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun remindersEnabled(remindersEnabled: JsonField<Boolean>) = apply {
                    this.remindersEnabled = remindersEnabled
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .offsetsMinutes()
                 * .paused()
                 * .remindersEnabled()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): UnionMember0 =
                    UnionMember0(
                        kind,
                        checkRequired("offsetsMinutes", offsetsMinutes).map { it.toImmutable() },
                        checkRequired("paused", paused),
                        checkRequired("remindersEnabled", remindersEnabled),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                _kind().let {
                    if (it != JsonValue.from("snapshot")) {
                        throw DodoPaymentsInvalidDataException("'kind' is invalid, received $it")
                    }
                }
                offsetsMinutes()
                paused()
                remindersEnabled()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                kind.let { if (it == JsonValue.from("snapshot")) 1 else 0 } +
                    (offsetsMinutes.asKnown()?.size ?: 0) +
                    (if (paused.asKnown() == null) 0 else 1) +
                    (if (remindersEnabled.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 &&
                    kind == other.kind &&
                    offsetsMinutes == other.offsetsMinutes &&
                    paused == other.paused &&
                    remindersEnabled == other.remindersEnabled &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(kind, offsetsMinutes, paused, remindersEnabled, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember0{kind=$kind, offsetsMinutes=$offsetsMinutes, paused=$paused, remindersEnabled=$remindersEnabled, additionalProperties=$additionalProperties}"
        }

        /** The changes of a draft. A `null` field keeps the business value at finalise. */
        class UnionMember1
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val kind: JsonValue,
            private val offsetsMinutes: JsonField<List<Long>>,
            private val paused: JsonField<Boolean>,
            private val remindersEnabled: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
                @JsonProperty("offsets_minutes")
                @ExcludeMissing
                offsetsMinutes: JsonField<List<Long>> = JsonMissing.of(),
                @JsonProperty("paused")
                @ExcludeMissing
                paused: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("reminders_enabled")
                @ExcludeMissing
                remindersEnabled: JsonField<Boolean> = JsonMissing.of(),
            ) : this(kind, offsetsMinutes, paused, remindersEnabled, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("override")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun offsetsMinutes(): List<Long>? = offsetsMinutes.getNullable("offsets_minutes")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun paused(): Boolean? = paused.getNullable("paused")

            /**
             * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun remindersEnabled(): Boolean? = remindersEnabled.getNullable("reminders_enabled")

            /**
             * Returns the raw JSON value of [offsetsMinutes].
             *
             * Unlike [offsetsMinutes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("offsets_minutes")
            @ExcludeMissing
            fun _offsetsMinutes(): JsonField<List<Long>> = offsetsMinutes

            /**
             * Returns the raw JSON value of [paused].
             *
             * Unlike [paused], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("paused") @ExcludeMissing fun _paused(): JsonField<Boolean> = paused

            /**
             * Returns the raw JSON value of [remindersEnabled].
             *
             * Unlike [remindersEnabled], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("reminders_enabled")
            @ExcludeMissing
            fun _remindersEnabled(): JsonField<Boolean> = remindersEnabled

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

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var kind: JsonValue = JsonValue.from("override")
                private var offsetsMinutes: JsonField<MutableList<Long>>? = null
                private var paused: JsonField<Boolean> = JsonMissing.of()
                private var remindersEnabled: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    kind = unionMember1.kind
                    offsetsMinutes = unionMember1.offsetsMinutes.map { it.toMutableList() }
                    paused = unionMember1.paused
                    remindersEnabled = unionMember1.remindersEnabled
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("override")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kind(kind: JsonValue) = apply { this.kind = kind }

                fun offsetsMinutes(offsetsMinutes: List<Long>?) =
                    offsetsMinutes(JsonField.ofNullable(offsetsMinutes))

                /**
                 * Sets [Builder.offsetsMinutes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.offsetsMinutes] with a well-typed `List<Long>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun offsetsMinutes(offsetsMinutes: JsonField<List<Long>>) = apply {
                    this.offsetsMinutes = offsetsMinutes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Long] to [offsetsMinutes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addOffsetsMinute(offsetsMinute: Long) = apply {
                    offsetsMinutes =
                        (offsetsMinutes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("offsetsMinutes", it).add(offsetsMinute)
                        }
                }

                fun paused(paused: Boolean?) = paused(JsonField.ofNullable(paused))

                /**
                 * Alias for [Builder.paused].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun paused(paused: Boolean) = paused(paused as Boolean?)

                /**
                 * Sets [Builder.paused] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paused] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun paused(paused: JsonField<Boolean>) = apply { this.paused = paused }

                fun remindersEnabled(remindersEnabled: Boolean?) =
                    remindersEnabled(JsonField.ofNullable(remindersEnabled))

                /**
                 * Alias for [Builder.remindersEnabled].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun remindersEnabled(remindersEnabled: Boolean) =
                    remindersEnabled(remindersEnabled as Boolean?)

                /**
                 * Sets [Builder.remindersEnabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remindersEnabled] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun remindersEnabled(remindersEnabled: JsonField<Boolean>) = apply {
                    this.remindersEnabled = remindersEnabled
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 =
                    UnionMember1(
                        kind,
                        (offsetsMinutes ?: JsonMissing.of()).map { it.toImmutable() },
                        paused,
                        remindersEnabled,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                _kind().let {
                    if (it != JsonValue.from("override")) {
                        throw DodoPaymentsInvalidDataException("'kind' is invalid, received $it")
                    }
                }
                offsetsMinutes()
                paused()
                remindersEnabled()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                kind.let { if (it == JsonValue.from("override")) 1 else 0 } +
                    (offsetsMinutes.asKnown()?.size ?: 0) +
                    (if (paused.asKnown() == null) 0 else 1) +
                    (if (remindersEnabled.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember1 &&
                    kind == other.kind &&
                    offsetsMinutes == other.offsetsMinutes &&
                    paused == other.paused &&
                    remindersEnabled == other.remindersEnabled &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(kind, offsetsMinutes, paused, remindersEnabled, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{kind=$kind, offsetsMinutes=$offsetsMinutes, paused=$paused, remindersEnabled=$remindersEnabled, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Invoice &&
            allowedActions == other.allowedActions &&
            amountDue == other.amountDue &&
            amountPaid == other.amountPaid &&
            amountRefunded == other.amountRefunded &&
            billingMode == other.billingMode &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            credits == other.credits &&
            currency == other.currency &&
            customer == other.customer &&
            discountIds == other.discountIds &&
            editableFields == other.editableFields &&
            frequency == other.frequency &&
            invoiceId == other.invoiceId &&
            metadata == other.metadata &&
            refundIds == other.refundIds &&
            retryCount == other.retryCount &&
            rowVersion == other.rowVersion &&
            status == other.status &&
            subscriptionIds == other.subscriptionIds &&
            tags == other.tags &&
            tax == other.tax &&
            totalAmount == other.totalAmount &&
            collectionMethod == other.collectionMethod &&
            dueAt == other.dueAt &&
            dunningState == other.dunningState &&
            finalizedAt == other.finalizedAt &&
            hostedUrl == other.hostedUrl &&
            lines == other.lines &&
            memo == other.memo &&
            nextReminderAt == other.nextReminderAt &&
            nextRetryAt == other.nextRetryAt &&
            paymentTermsDays == other.paymentTermsDays &&
            payments == other.payments &&
            pdfUrl == other.pdfUrl &&
            reminderSettings == other.reminderSettings &&
            reviewDeadline == other.reviewDeadline &&
            sentAt == other.sentAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allowedActions,
            amountDue,
            amountPaid,
            amountRefunded,
            billingMode,
            businessId,
            createdAt,
            credits,
            currency,
            customer,
            discountIds,
            editableFields,
            frequency,
            invoiceId,
            metadata,
            refundIds,
            retryCount,
            rowVersion,
            status,
            subscriptionIds,
            tags,
            tax,
            totalAmount,
            collectionMethod,
            dueAt,
            dunningState,
            finalizedAt,
            hostedUrl,
            lines,
            memo,
            nextReminderAt,
            nextRetryAt,
            paymentTermsDays,
            payments,
            pdfUrl,
            reminderSettings,
            reviewDeadline,
            sentAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invoice{allowedActions=$allowedActions, amountDue=$amountDue, amountPaid=$amountPaid, amountRefunded=$amountRefunded, billingMode=$billingMode, businessId=$businessId, createdAt=$createdAt, credits=$credits, currency=$currency, customer=$customer, discountIds=$discountIds, editableFields=$editableFields, frequency=$frequency, invoiceId=$invoiceId, metadata=$metadata, refundIds=$refundIds, retryCount=$retryCount, rowVersion=$rowVersion, status=$status, subscriptionIds=$subscriptionIds, tags=$tags, tax=$tax, totalAmount=$totalAmount, collectionMethod=$collectionMethod, dueAt=$dueAt, dunningState=$dunningState, finalizedAt=$finalizedAt, hostedUrl=$hostedUrl, lines=$lines, memo=$memo, nextReminderAt=$nextReminderAt, nextRetryAt=$nextRetryAt, paymentTermsDays=$paymentTermsDays, payments=$payments, pdfUrl=$pdfUrl, reminderSettings=$reminderSettings, reviewDeadline=$reviewDeadline, sentAt=$sentAt, additionalProperties=$additionalProperties}"
}
