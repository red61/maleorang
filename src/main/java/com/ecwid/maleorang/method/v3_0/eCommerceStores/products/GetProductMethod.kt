package com.ecwid.maleorang.method.v3_0.lists.members


import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.products.ProductInfo
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Get information about a specific product.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/#read-get_ecommerce_stores_store_id_products_product_id)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products/{product_id}")
class GetProductMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val product_id: String
) : MailchimpMethod<ProductInfo>() {
    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null
}
