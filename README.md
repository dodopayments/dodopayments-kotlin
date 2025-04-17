# Dodo Payments Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.dodo_payments.api/dodo-payments-kotlin)](https://central.sonatype.com/artifact/com.dodo_payments.api/dodo-payments-kotlin/0.0.1-alpha.0)
[![javadoc](https://javadoc.io/badge2/com.dodo_payments.api/dodo-payments-kotlin/0.0.1-alpha.0/javadoc.svg)](https://javadoc.io/doc/com.dodo_payments.api/dodo-payments-kotlin/0.0.1-alpha.0)

<!-- x-release-please-end -->

The Dodo Payments Kotlin SDK provides convenient access to the Dodo Payments REST API from applications written in Kotlin.

It is generated with [Stainless](https://www.stainless.com/).

The REST API documentation can be found on [docs.dodopayments.com](https://docs.dodopayments.com). KDocs are also available on [javadoc.io](https://javadoc.io/doc/com.dodo_payments.api/dodo-payments-kotlin/0.0.1-alpha.0).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.dodo_payments.api:dodo-payments-kotlin:0.0.1-alpha.0")
```

### Maven

```xml
<dependency>
    <groupId>com.dodo_payments.api</groupId>
    <artifactId>dodo-payments-kotlin</artifactId>
    <version>0.0.1-alpha.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse

// Configures using the `DODO_PAYMENTS_API_KEY` environment variable
val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.fromEnv()

val params: PaymentCreateParams = PaymentCreateParams.builder()
    .billing(BillingAddress.builder()
        .city("city")
        .country(CountryCode.AF)
        .state("state")
        .street("street")
        .zipcode("zipcode")
        .build())
    .customer(AttachExistingCustomer.builder()
        .customerId("customer_id")
        .build())
    .addProductCart(OneTimeProductCartItem.builder()
        .productId("product_id")
        .quantity(0L)
        .build())
    .build()
val payment: PaymentCreateResponse = client.payments().create(params)
```

## Client configuration

Configure the client using environment variables:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient

// Configures using the `DODO_PAYMENTS_API_KEY` environment variable
val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient

val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.builder()
    .bearerToken("My Bearer Token")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient

val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.builder()
    // Configures using the `DODO_PAYMENTS_API_KEY` environment variable
    .fromEnv()
    .bearerToken("My Bearer Token")
    .build()
```

See this table for the available options:

| Setter        | Environment variable    | Required | Default value |
| ------------- | ----------------------- | -------- | ------------- |
| `bearerToken` | `DODO_PAYMENTS_API_KEY` | true     | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Dodo Payments API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.payments().create(...)` should be called with an instance of `PaymentCreateParams`, and it will return an instance of `PaymentCreateResponse`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse

// Configures using the `DODO_PAYMENTS_API_KEY` environment variable
val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.fromEnv()

val params: PaymentCreateParams = PaymentCreateParams.builder()
    .billing(BillingAddress.builder()
        .city("city")
        .country(CountryCode.AF)
        .state("state")
        .street("street")
        .zipcode("zipcode")
        .build())
    .customer(AttachExistingCustomer.builder()
        .customerId("customer_id")
        .build())
    .addProductCart(OneTimeProductCartItem.builder()
        .productId("product_id")
        .quantity(0L)
        .build())
    .build()
val payment: PaymentCreateResponse = client.async().payments().create(params)
```

Or create an asynchronous client from the beginning:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClientAsync
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse

// Configures using the `DODO_PAYMENTS_API_KEY` environment variable
val client: DodoPaymentsClientAsync = DodoPaymentsOkHttpClientAsync.fromEnv()

val params: PaymentCreateParams = PaymentCreateParams.builder()
    .billing(BillingAddress.builder()
        .city("city")
        .country(CountryCode.AF)
        .state("state")
        .street("street")
        .zipcode("zipcode")
        .build())
    .customer(AttachExistingCustomer.builder()
        .customerId("customer_id")
        .build())
    .addProductCart(OneTimeProductCartItem.builder()
        .productId("product_id")
        .quantity(0L)
        .build())
    .build()
val payment: PaymentCreateResponse = client.payments().create(params)
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## Raw responses

The SDK defines methods that deserialize responses into instances of Kotlin classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```kotlin
import com.dodo_payments.api.core.http.Headers
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse

val params: PaymentCreateParams = PaymentCreateParams.builder()
    .billing(BillingAddress.builder()
        .city("city")
        .country(CountryCode.AF)
        .state("state")
        .street("street")
        .zipcode("zipcode")
        .build())
    .customer(AttachExistingCustomer.builder()
        .customerId("customer_id")
        .build())
    .addProductCart(OneTimeProductCartItem.builder()
        .productId("product_id")
        .quantity(0L)
        .build())
    .build()
val payment: HttpResponseFor<PaymentCreateResponse> = client.payments().withRawResponse().create(params)

val statusCode: Int = payment.statusCode()
val headers: Headers = payment.headers()
```

You can still deserialize the response into an instance of a Kotlin class if needed:

```kotlin
import com.dodo_payments.api.models.payments.PaymentCreateResponse

val parsedPayment: PaymentCreateResponse = payment.parse()
```

## Error handling

The SDK throws custom unchecked exception types:

- [`DodoPaymentsServiceException`](dodo-payments-kotlin-core/src/main/kotlin/com/dodo_payments/api/errors/DodoPaymentsServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- [`DodoPaymentsIoException`](dodo-payments-kotlin-core/src/main/kotlin/com/dodo_payments/api/errors/DodoPaymentsIoException.kt): I/O networking errors.

- [`DodoPaymentsInvalidDataException`](dodo-payments-kotlin-core/src/main/kotlin/com/dodo_payments/api/errors/DodoPaymentsInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`DodoPaymentsException`](dodo-payments-kotlin-core/src/main/kotlin/com/dodo_payments/api/errors/DodoPaymentsException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```kotlin
import com.dodo_payments.api.models.payments.PaymentListPage
import com.dodo_payments.api.models.payments.PaymentListResponse

// As a Sequence:
client.payments().list(params).autoPager()
    .take(50)
    .forEach { payment -> print(payment) }
```

### Asynchronous

```kotlin
// As a Flow:
asyncClient.payments().list(params).autoPager()
    .take(50)
    .collect { payment -> print(payment) }
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```kotlin
import com.dodo_payments.api.models.payments.PaymentListPage
import com.dodo_payments.api.models.payments.PaymentListResponse

val page = client.payments().list(params)
while (page != null) {
    for (payment in page.items) {
        print(payment)
    }

    page = page.getNextPage()
}
```

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `DODO_PAYMENTS_LOG` environment variable to `info`:

```sh
$ export DODO_PAYMENTS_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export DODO_PAYMENTS_LOG=debug
```

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient

val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse

val payment: PaymentCreateResponse = client.payments().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import java.time.Duration

val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

### Environments

The SDK sends requests to the live_mode by default. To send requests to a different environment, configure the client like so:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient

val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.builder()
    .fromEnv()
    .testMode()
    .build()
```

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.payments.PaymentCreateParams

val params: PaymentCreateParams = PaymentCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```kotlin
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.PaymentCreateParams

val params: PaymentCreateParams = PaymentCreateParams.builder()
    .billing(BillingAddress.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build()
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](dodo-payments-kotlin-core/src/main/kotlin/com/dodo_payments/api/core/Values.kt) object to its setter:

```kotlin
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams

val params: PaymentCreateParams = PaymentCreateParams.builder()
    .billing(BillingAddress.builder()
        .city("city")
        .country(CountryCode.AF)
        .state("state")
        .street("street")
        .zipcode("zipcode")
        .build())
    .customer(AttachExistingCustomer.builder()
        .customerId("customer_id")
        .build())
    .addProductCart(OneTimeProductCartItem.builder()
        .productId("product_id")
        .quantity(0L)
        .build())
    .build()
```

The most straightforward way to create a [`JsonValue`](dodo-payments-kotlin-core/src/main/kotlin/com/dodo_payments/api/core/Values.kt) is using its `from(...)` method:

```kotlin
import com.dodo_payments.api.core.JsonValue

// Create primitive JSON values
val nullValue: JsonValue = JsonValue.from(null)
val booleanValue: JsonValue = JsonValue.from(true)
val numberValue: JsonValue = JsonValue.from(42)
val stringValue: JsonValue = JsonValue.from("Hello World!")

// Create a JSON array value equivalent to `["Hello", "World"]`
val arrayValue: JsonValue = JsonValue.from(listOf(
  "Hello", "World"
))

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
val objectValue: JsonValue = JsonValue.from(mapOf(
  "a" to 1, "b" to 2
))

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
val complexValue: JsonValue = JsonValue.from(mapOf(
  "a" to listOf(
    1, 2
  ), "b" to listOf(
    3, 4
  )
))
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import com.dodo_payments.api.core.JsonBoolean
import com.dodo_payments.api.core.JsonNull
import com.dodo_payments.api.core.JsonNumber
import com.dodo_payments.api.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.payments().create(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.models.payments.BillingAddress

val billing: JsonField<BillingAddress> = client.payments().create(params)._billing()

if (billing.isMissing()) {
  // The property is absent from the JSON response
} else if (billing.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = billing.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = billing.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`DodoPaymentsInvalidDataException`](dodo-payments-kotlin-core/src/main/kotlin/com/dodo_payments/api/errors/DodoPaymentsInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import com.dodo_payments.api.models.payments.PaymentCreateResponse

val payment: PaymentCreateResponse = client.payments().create(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import com.dodo_payments.api.models.misc.CountryCode
import com.dodo_payments.api.models.payments.AttachExistingCustomer
import com.dodo_payments.api.models.payments.BillingAddress
import com.dodo_payments.api.models.payments.OneTimeProductCartItem
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse

val payment: PaymentCreateResponse = client.payments().create(
  params, RequestOptions.builder().responseValidation(true).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.dodo_payments.api.client.DodoPaymentsClient
import com.dodo_payments.api.client.okhttp.DodoPaymentsOkHttpClient

val client: DodoPaymentsClient = DodoPaymentsOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/dodopayments/dodopayments-kotlin/issues) with questions, bugs, or suggestions.
