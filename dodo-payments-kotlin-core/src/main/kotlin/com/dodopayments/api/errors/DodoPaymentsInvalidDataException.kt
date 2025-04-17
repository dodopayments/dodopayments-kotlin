package com.dodopayments.api.errors

class DodoPaymentsInvalidDataException(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
