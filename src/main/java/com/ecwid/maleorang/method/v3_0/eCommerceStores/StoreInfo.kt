package com.ecwid.maleorang.method.v3_0.eCommerceStores


import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field

class StoreInfo : MailchimpObject() {
    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var list_id: String? = null

    @JvmField
    @Field
    var name: String? = null

    @JvmField
    @Field
    var platform: String? = null

    @JvmField
    @Field
    var domain: String? = null

    @JvmField
    @Field
    var email_address: String? = null

    @JvmField
    @Field
    var currency_code: String? = null

    @JvmField
    @Field
    var money_format: String? = null

    @JvmField
    @Field
    var primary_locale: String? = null

    @JvmField
    @Field
    var timezone: String? = null

    @JvmField
    @Field
    var phone: String? = null

    @JvmField
    @Field
    var address: AddressInfo? = null

    @JvmField
    @Field
    var created_at: String? = null

    @JvmField
    @Field
    var updated_at: String? = null
}
