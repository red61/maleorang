package com.ecwid.maleorang.method.v3_0.lists.members


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.products.ProductInfo

/**
 * [Get information about a store’s products.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/#read-get_ecommerce_stores_store_id_products)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products")
class GetProductsMethod(
        @JvmField
        @PathParam
        val store_id: String
) : MailchimpMethod<GetProductsMethod.Response>() {

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
        val store_id: String? = null

        @JvmField
        @Field
        var products: List<ProductInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}
