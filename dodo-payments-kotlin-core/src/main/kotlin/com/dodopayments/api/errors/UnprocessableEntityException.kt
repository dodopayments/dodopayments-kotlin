package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(422, headers, body, error)
