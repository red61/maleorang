package com.ecwid.maleorang.method.v3_0.eCommerceStores.products

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

class ProductInfo : MailchimpObject() {
    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var title: String? = null

    @JvmField
    @Field
    var handle: String? = null

    @JvmField
    @Field
    var url: String? = null

    @JvmField
    @Field
    var description: String? = null

    @JvmField
    @Field
    var type: String? = null

    @JvmField
    @Field
    var vendor: String? = null

    @JvmField
    @Field
    var image_url: String? = null

    @JvmField
    @Field
    var variants: List<VariantInfo>? = null

    @JvmField
    @Field
    var published_at_foreign: String? = null
}
