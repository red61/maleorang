package com.ecwid.maleorang.method.v3_0.eCommerceStores.products.productVariants


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.products.VariantInfo

/**
 * [Get information about a product’s variants.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/variants/#read-get_ecommerce_stores_store_id_products_product_id_variants)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products/{product_id}/variants")
class GetProductVariantsMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val product_id: String
) : MailchimpMethod<GetProductVariantsMethod.Response>() {

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
        val product_id: String? = null

        @JvmField
        @Field
        var variants: List<VariantInfo>? = null

        @JvmField
        @Field
        var total_items: Int? = null
    }
}
