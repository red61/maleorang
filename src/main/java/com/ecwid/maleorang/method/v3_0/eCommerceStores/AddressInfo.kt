package com.ecwid.maleorang.method.v3_0.eCommerceStores

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field
import java.util.*

class AddressInfo : MailchimpObject() {
    @JvmField
    @Field
    var address1: String? = null

    @JvmField
    @Field
    var address2: String? = null

    @JvmField
    @Field
    var city: String? = null

    @JvmField
    @Field
    var province: String? = null

    @JvmField
    @Field
    var province_code: String? = null

    @JvmField
    @Field
    var postal_code: String? = null

    @JvmField
    @Field
    var country: String? = null

    @JvmField
    @Field
    var country_code: String? = null

    @JvmField
    @Field
    var longitude: Double? = null

    @JvmField
    @Field
    var latitude: Double? = null
}
