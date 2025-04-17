package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(400, headers, body, error)
