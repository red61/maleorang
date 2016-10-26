package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*

/**
 * [Get information about a specific cart](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/#read-get_ecommerce_stores_store_id_carts_cart_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}")
class GetCartMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val cart_id: String
) : MailchimpMethod<CartInfo>() {
    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null
}
