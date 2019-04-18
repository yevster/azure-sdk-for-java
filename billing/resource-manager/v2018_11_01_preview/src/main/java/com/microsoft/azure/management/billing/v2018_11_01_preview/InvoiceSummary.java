/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSummaryInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing InvoiceSummary.
 */
public interface InvoiceSummary extends HasInner<InvoiceSummaryInner>, Indexable, Refreshable<InvoiceSummary>, HasManager<BillingManager> {
    /**
     * @return the amountDue value.
     */
    Amount amountDue();

    /**
     * @return the billedAmount value.
     */
    Amount billedAmount();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the billingProfileName value.
     */
    String billingProfileName();

    /**
     * @return the documentUrls value.
     */
    List<DownloadProperties> documentUrls();

    /**
     * @return the dueDate value.
     */
    DateTime dueDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceDate value.
     */
    DateTime invoiceDate();

    /**
     * @return the invoicePeriodEndDate value.
     */
    DateTime invoicePeriodEndDate();

    /**
     * @return the invoicePeriodStartDate value.
     */
    DateTime invoicePeriodStartDate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the payments value.
     */
    List<PaymentProperties> payments();

    /**
     * @return the purchaseOrderNumber value.
     */
    String purchaseOrderNumber();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the type value.
     */
    String type();

}
