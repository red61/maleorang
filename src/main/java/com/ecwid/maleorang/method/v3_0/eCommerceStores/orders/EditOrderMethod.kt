package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.AddressInfo
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.CustomerInfo
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.LineInfo

/**
 * Base class for order create or update operations.
 */
sealed class EditOrderMethod : MailchimpMethod<OrderInfo>() {
    /**
     * [Add a new order to a store.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/#create-post_ecommerce_stores_store_id_orders)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders")
    class Create(
            @JvmField
            @PathParam
            val store_id: String
    ) : EditOrderMethod()

    /**
     * [Update a specific order.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/orders/#edit-patch_ecommerce_stores_store_id_orders_order_id)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/orders/{order_id}")
    class Update(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val order_id: String
    ) : EditOrderMethod()

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var customer: CustomerInfo? = null

    @JvmField
    @Field
    var campaign_id: String? = null

    @JvmField
    @Field
    var financial_status: String? = null

    @JvmField
    @Field
    var fulfillment_status: String? = null

    @JvmField
    @Field
    var currency_code: String? = null

    @JvmField
    @Field
    var order_total: Number? = null

    @JvmField
    @Field
    var tax_total: Number? = null

    @JvmField
    @Field
    var shipping_total: Number? = null

    @JvmField
    @Field
    var tracking_code: String? = null

    @JvmField
    @Field
    var processed_at_foreign: String? = null

    @JvmField
    @Field
    var cancelled_at_foreign: String? = null

    @JvmField
    @Field
    var updated_at_foreign: String? = null

    @JvmField
    @Field
    var shipping_address: AddressInfo? = null

    @JvmField
    @Field
    var billing_address: AddressInfo? = null

    @JvmField
    @Field
    var lines: List<LineInfo>? = null
}