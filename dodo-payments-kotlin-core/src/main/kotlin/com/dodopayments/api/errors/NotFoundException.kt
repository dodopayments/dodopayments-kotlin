package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(404, headers, body, error)
