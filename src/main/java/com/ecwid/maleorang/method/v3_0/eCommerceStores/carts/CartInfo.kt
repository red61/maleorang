package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

class CartInfo : MailchimpObject() {
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
    var checkout_url: String? = null

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
    var lines: List<LineInfo>? = null

    @JvmField
    @Field
    var created_at: String? = null

    @JvmField
    @Field
    var updated_at: String? = null
}
