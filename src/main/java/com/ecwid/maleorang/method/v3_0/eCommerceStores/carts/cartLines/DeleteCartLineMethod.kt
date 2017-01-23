package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.cartLines

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.APIVersion
import com.ecwid.maleorang.annotation.HttpMethod
import com.ecwid.maleorang.annotation.Method
import com.ecwid.maleorang.annotation.PathParam

/**
 * [Delete a specific cart line item.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/lines/#delete-delete_ecommerce_stores_store_id_carts_cart_id_lines_line_id)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}")
class DeleteCartLineMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val cart_id: String,

        @JvmField
        @PathParam
        val line_id: String
) : MailchimpMethod<MailchimpObject>()
