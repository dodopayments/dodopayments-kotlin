package com.dodopayments.api.errors

open class DodoPaymentsException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
