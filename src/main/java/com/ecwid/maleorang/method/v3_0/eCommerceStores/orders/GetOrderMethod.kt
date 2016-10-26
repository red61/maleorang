package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.lists.members.MemberInfo
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Get information about a specific order.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/#read-get_ecommerce_stores_store_id_orders_order_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders/{order_id}")
class GetOrderMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val order_id: String
) : MailchimpMethod<OrderInfo>() {
    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null
}
