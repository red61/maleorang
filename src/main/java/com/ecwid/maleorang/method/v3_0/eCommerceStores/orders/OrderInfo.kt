package com.ecwid.maleorang.method.v3_0.eCommerceStores.orders

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field
import com.ecwid.maleorang.method.v3_0.eCommerceStores.AddressInfo
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.CustomerInfo
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.LineInfo

class OrderInfo : MailchimpObject() {
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
