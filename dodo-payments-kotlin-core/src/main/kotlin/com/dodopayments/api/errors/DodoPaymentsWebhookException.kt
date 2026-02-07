package com.dodopayments.api.errors

class DodoPaymentsWebhookException(message: String? = null, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
