package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.cartLines

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.LineInfo

/**
 * [Get information about a cart’s line items.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/lines/#read-get_ecommerce_stores_store_id_carts_cart_id_lines)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}/lines")
class GetCartLinesMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val cart_id: String
) : MailchimpMethod<GetCartLinesMethod.Response>() {

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
        var cart_id: String? = null

        @JvmField
        @Field
        var lines: List<LineInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}
