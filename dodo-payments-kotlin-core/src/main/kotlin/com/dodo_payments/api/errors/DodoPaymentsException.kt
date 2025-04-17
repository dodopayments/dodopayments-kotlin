package com.dodo_payments.api.errors

open class DodoPaymentsException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
