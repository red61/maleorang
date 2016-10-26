package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

class LineInfo : MailchimpObject() {
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
