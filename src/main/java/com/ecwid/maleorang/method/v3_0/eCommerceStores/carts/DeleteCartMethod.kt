package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.APIVersion
import com.ecwid.maleorang.annotation.HttpMethod
import com.ecwid.maleorang.annotation.Method
import com.ecwid.maleorang.annotation.PathParam

/**
 * [Delete a cart](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/#delete-delete_ecommerce_stores_store_id_carts_cart_id)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}")
class DeleteCartMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val cart_id: String
) : MailchimpMethod<MailchimpObject>()
