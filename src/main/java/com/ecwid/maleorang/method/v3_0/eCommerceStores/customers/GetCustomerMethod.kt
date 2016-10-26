package com.ecwid.maleorang.method.v3_0.eCommerceStores.customers

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.CustomerInfo
import com.ecwid.maleorang.method.v3_0.lists.members.MemberInfo
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Get information about a specific customer.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/customers/#read-get_ecommerce_stores_store_id_customers_customer_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/customers/{customer_id}")
class GetCustomerMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val customer_id: String
) : MailchimpMethod<CustomerInfo>() {
    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null
}
