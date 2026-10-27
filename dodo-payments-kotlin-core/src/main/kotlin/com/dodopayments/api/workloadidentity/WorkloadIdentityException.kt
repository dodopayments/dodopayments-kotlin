// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.workloadidentity

import com.dodopayments.api.errors.DodoPaymentsException

/** A workload identity error that occurs before the token exchange, for example a missing token. */
class WorkloadIdentityException(message: String, cause: Throwable? = null) :
    DodoPaymentsException(message, cause)
