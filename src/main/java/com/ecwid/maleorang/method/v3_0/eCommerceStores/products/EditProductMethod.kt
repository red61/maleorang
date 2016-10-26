package com.ecwid.maleorang.method.v3_0.lists.members

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.products.ProductInfo
import com.ecwid.maleorang.method.v3_0.eCommerceStores.products.VariantInfo
import java.util.*

/**
 * Base class for product create or update operations.
 */
sealed class EditProductMethod : MailchimpMethod<ProductInfo>() {
    /**
     * [Add a new product to a store.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/products/#create-post_ecommerce_stores_store_id_products)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/products")
    class Create(
            @JvmField
            @PathParam
            val store_id: String
    ) : EditProductMethod()

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var title: String? = null

    @JvmField
    @Field
    var handle: String? = null

    @JvmField
    @Field
    var url: String? = null

    @JvmField
    @Field
    var description: String? = null

    @JvmField
    @Field
    var type: String? = null

    @JvmField
    @Field
    var vendor: String? = null

    @JvmField
    @Field
    var image_url: String? = null

    @JvmField
    @Field
    var variants: List<VariantInfo>? = null

    @JvmField
    @Field
    var published_at_foreign: String? = null
}