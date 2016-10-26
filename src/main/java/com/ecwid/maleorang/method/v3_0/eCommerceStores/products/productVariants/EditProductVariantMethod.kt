package com.ecwid.maleorang.method.v3_0.eCommerceStores.products.productVariants

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.products.VariantInfo

/**
 * Base class for product variants create or update operations.
 */
sealed class EditProductVariantMethod : MailchimpMethod<VariantInfo>() {
    /**
     * [Add a new variant to the product.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/variants/#create-post_ecommerce_stores_store_id_products_product_id_variants)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products/{product_id}/variants")
    class Create(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val product_id: String
    ) : EditProductVariantMethod()

    /**
     * [Update a product variant.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/variants/#edit-patch_ecommerce_stores_store_id_products_product_id_variants_variant_id)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}")
    class Update(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val product_id: String,

            @JvmField
            @PathParam
            val variant_id: String
    ) : EditProductVariantMethod()

    /**
     * [Add or update a product variant.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/variants/#edit-put_ecommerce_stores_store_id_products_product_id_variants_variant_id)
     */
    @Method(httpMethod = HttpMethod.PUT, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id}")
    class CreateOrUpdate(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val product_id: String,

            @JvmField
            @PathParam
            val variant_id: String
    ) : EditProductVariantMethod()

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var title: String? = null

    @JvmField
    @Field
    var url: String? = null

    @JvmField
    @Field
    var sku: String? = null

    @JvmField
    @Field
    var price: Number? = null

    @JvmField
    @Field
    var inventory_quantity: Int? = null

    @JvmField
    @Field
    var image_url: String? = null

    @JvmField
    @Field
    var backorders: String? = null

    @JvmField
    @Field
    var visibility: String? = null
}