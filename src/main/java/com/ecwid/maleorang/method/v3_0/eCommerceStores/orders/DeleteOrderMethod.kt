package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.APIVersion
import com.ecwid.maleorang.annotation.HttpMethod
import com.ecwid.maleorang.annotation.Method
import com.ecwid.maleorang.annotation.PathParam
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Delete an order.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/#delete-delete_ecommerce_stores_store_id_orders_order_id)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders/{order_id}")
class DeleteOrderMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val order_id: String
) : MailchimpMethod<MailchimpObject>()
