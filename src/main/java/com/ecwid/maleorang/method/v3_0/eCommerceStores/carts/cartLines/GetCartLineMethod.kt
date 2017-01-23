package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.cartLines

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.LineInfo

/**
 * [Get information about a specific cart line item.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/lines/#read-get_ecommerce_stores_store_id_carts_cart_id_lines_line_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}")
class GetCartLineMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val cart_id: String,

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
