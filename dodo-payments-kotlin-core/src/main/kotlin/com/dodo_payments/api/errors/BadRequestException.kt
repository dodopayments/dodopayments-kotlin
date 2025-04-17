package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(400, headers, body, error)
