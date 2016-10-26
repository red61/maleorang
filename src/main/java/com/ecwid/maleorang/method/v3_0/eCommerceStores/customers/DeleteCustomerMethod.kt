package com.ecwid.maleorang.method.v3_0.eCommerceStores.customers

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.APIVersion
import com.ecwid.maleorang.annotation.HttpMethod
import com.ecwid.maleorang.annotation.Method
import com.ecwid.maleorang.annotation.PathParam

/**
 * [Delete a customer from a store.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/customers/#delete-delete_ecommerce_stores_store_id_customers_customer_id)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/customers/{customer_id}")
class DeleteCustomerMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val customer_id: String
) : MailchimpMethod<MailchimpObject>()
