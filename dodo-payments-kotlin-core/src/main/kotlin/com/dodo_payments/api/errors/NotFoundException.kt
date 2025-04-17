package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(404, headers, body, error)
