package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.lists.members.MemberInfo
import java.util.*

/**
 * [Get information about a store’s orders.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/#read-get_ecommerce_stores_store_id_orders)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders")
class GetOrdersMethod(
        @JvmField
        @PathParam
        val store_id: String
) : MailchimpMethod<GetOrdersMethod.Response>() {

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

    @JvmField
    @QueryStringParam
    var customer_id: String? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var store_id: String? = null

        @JvmField
        @Field
        var orders: List<OrderInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}
