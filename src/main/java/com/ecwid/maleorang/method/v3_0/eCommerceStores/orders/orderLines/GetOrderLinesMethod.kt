package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders.orderLines


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.LineInfo
import java.util.*

/**
 * [Get information about an order’s line items.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/lines/#read-get_ecommerce_stores_store_id_orders_order_id_lines)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders/{order_id}/lines")
class GetOrderLinesMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val order_id: String
) : MailchimpMethod<GetOrderLinesMethod.Response>() {

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
        val store_id: String? = null

        @JvmField
        @Field
        val order_id: String? = null

        @JvmField
        @Field
        var lines: List<LineInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}
