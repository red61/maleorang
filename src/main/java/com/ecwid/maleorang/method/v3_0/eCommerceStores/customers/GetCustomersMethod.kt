package com.ecwid.maleorang.method.v3_0.eCommerceStores.customers


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.CustomerInfo
import com.ecwid.maleorang.method.v3_0.lists.members.MemberInfo

/**
 * [Get information about a store’s customers.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/customers/#read-get_ecommerce_stores_store_id_customers)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/customers")
class GetCustomersMethod(
        @JvmField
        @PathParam
        val store_id: String
) : MailchimpMethod<GetCustomersMethod.Response>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

    @JvmField
    @QueryStringParam
    var count: Int? = null

    @JvmField
    @QueryStringParam
    var offset: Int? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var store_id: String? = null

        @JvmField
        @Field
        var customers: List<CustomerInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}
