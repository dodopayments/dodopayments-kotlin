package com.dodo_payments.api.errors

class DodoPaymentsInvalidDataException(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
