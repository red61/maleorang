package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.cartLines

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.LineInfo

/**
 * Base class for cart line create or update operations.
 */
sealed class EditCartLineMethod : MailchimpMethod<LineInfo>() {
    /**
     * [Add a new line item to an existing cart](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/lines/#create-post_ecommerce_stores_store_id_carts_cart_id_lines)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}/lines")
    class Create(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val cart_id: String
    ) : EditCartLineMethod()

    /**
     * [Update a specific cart line item.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/lines/#edit-patch_ecommerce_stores_store_id_carts_cart_id_lines_line_id)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id}")
    class Update(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val cart_id: String,

            @JvmField
            @PathParam
            val line_id: String
    ) : EditCartLineMethod()

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var product_id: String? = null

    @JvmField
    @Field
    var product_variant_id: String? = null

    @JvmField
    @Field
    var quantity: Int? = null

    @JvmField
    @Field
    var price: Number? = null
}