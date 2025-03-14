package com.dodo_payments.api.errors

import com.dodo_payments.api.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(403, headers, body, error)
