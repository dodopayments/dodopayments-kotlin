package com.dodopayments.api.errors

import com.dodopayments.api.core.http.Headers

class PermissionDeniedException(headers: Headers, body: String, error: DodoPaymentsError) :
    DodoPaymentsServiceException(403, headers, body, error)
