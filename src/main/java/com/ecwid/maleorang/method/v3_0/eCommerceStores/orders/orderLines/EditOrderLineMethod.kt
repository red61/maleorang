package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders.orderLines

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.lists.members.MemberInfo

/**
 * Base class for order lines create or update operations.
 */
sealed class EditOrderLineMethod : MailchimpMethod<MemberInfo>() {
    /**
     * [Add a new line item to an existing order.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/lines/#create-post_ecommerce_stores_store_id_orders_order_id_lines)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders/{order_id}/lines")
    class Create(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val order_id: String
    ) : EditOrderLineMethod()

    /**
     * [Update a specific order line item.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/lines/#edit-patch_ecommerce_stores_store_id_orders_order_id_lines_line_id)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id}")
    class Update(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val order_id: String,

            @JvmField
            @PathParam
            val line_id: String
    ) : EditOrderLineMethod()

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var product_id: String? = null

    @JvmField
    @Field
    var product_title: String? = null

    @JvmField
    @Field
    var product_variant_title: String? = null

    @JvmField
    @Field
    var product_variant_id: Boolean? = null

    @JvmField
    @Field
    var quantity: Int? = null

    @JvmField
    @Field
    var price: Number? = null
}