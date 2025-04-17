package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class UnauthorizedException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(401, headers, body, error)
