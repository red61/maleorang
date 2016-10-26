package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.lists.members.MemberInfo
import java.util.*

/**
 * [Get information about store's carts](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/#read-get_ecommerce_stores_store_id_carts)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts")
class GetCartsMethod(
        @JvmField
        @PathParam
        val store_id: String
) : MailchimpMethod<GetCartsMethod.Response>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

    @JvmField
    @QueryStringParam
    var count: Int? = null

    @JvmField
    @QueryStringParam
    var offset: Int? = null

    class Response : MailchimpObject() {
        @JvmField
        @Field
        var store_id: String? = null

        @JvmField
        @Field
        var carts: List<CartInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}
