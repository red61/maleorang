package com.ecwid.maleorang.method.v3_0.eCommerceStores.products.productVariants

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.APIVersion
import com.ecwid.maleorang.annotation.HttpMethod
import com.ecwid.maleorang.annotation.Method
import com.ecwid.maleorang.annotation.PathParam
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Delete a product variant.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/variants/#delete-delete_ecommerce_stores_store_id_products_product_id_variants_variant_id)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}")
class DeleteProductVariantMethod(
        @JvmField
        @PathParam
        val store_id: String,

        @JvmField
        @PathParam
        val product_id: String,

        @JvmField
        @PathParam
        val variant_id: String
) : MailchimpMethod<MailchimpObject>()