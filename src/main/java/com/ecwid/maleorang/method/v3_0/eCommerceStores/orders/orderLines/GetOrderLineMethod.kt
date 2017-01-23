package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders.orderLines


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.LineInfo

/**
 * [Get information about a specific order line item.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/lines/#read-get_ecommerce_stores_store_id_orders_order_id_lines_line_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}")
class GetOrderLineMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val order_id: String,

        @JvmField
        @PathParam
        val line_id: String
) : MailchimpMethod<LineInfo>() {
    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null
}
