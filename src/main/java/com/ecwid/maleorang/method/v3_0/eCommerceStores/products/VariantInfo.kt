package com.ecwid.maleorang.method.v3_0.eCommerceStores.products

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

class VariantInfo : MailchimpObject() {
    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var title: String? = null

    @JvmField
    @Field
    var url: String? = null

    @JvmField
    @Field
    var sku: String? = null

    @JvmField
    @Field
    var price: Number? = null

    @JvmField
    @Field
    var inventory_quantity: Int? = null

    @JvmField
    @Field
    var image_url: String? = null

    @JvmField
    @Field
    var backorders: String? = null

    @JvmField
    @Field
    var visibility: String? = null
}
