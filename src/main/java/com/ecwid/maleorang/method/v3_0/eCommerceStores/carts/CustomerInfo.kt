package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts

import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.Field
import com.ecwid.maleorang.method.v3_0.eCommerceStores.AddressInfo

class CustomerInfo : MailchimpObject() {
    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var email_address: String? = null

    @JvmField
    @Field
    var opt_in_status: Boolean? = null

    @JvmField
    @Field
    var company: String? = null

    @JvmField
    @Field
    var first_name: String? = null

    @JvmField
    @Field
    var last_name: String? = null

    @JvmField
    @Field
    var orders_count: Int? = null

    @JvmField
    @Field
    var total_spent: Number? = null

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
