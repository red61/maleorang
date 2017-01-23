package com.ecwid.maleorang.method.v3_0.eCommerceStores.products.productVariants


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.products.VariantInfo

/**
 * [Get information about a specific product variant.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/variants/#read-get_ecommerce_stores_store_id_products_product_id_variants_variant_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}")
class GetProductVariantMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val product_id: String,

        @JvmField
        @PathParam
        val variant_id: String
) : MailchimpMethod<VariantInfo>() {
    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null
}
