package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class UnprocessableEntityException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(422, headers, body, error)
