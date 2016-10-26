package com.ecwid.maleorang.method.v3_0.eCommerceStores.carts

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*

/**
 * Base class for cart create or update operations.
 */
sealed class EditCartMethod : MailchimpMethod<CartInfo>() {
    /**
     * [Add a new cart](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/carts/#create-post_ecommerce_stores_store_id_carts)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts")
    class Create(
            @JvmField
            @PathParam
            val store_id: String
    ) : EditCartMethod()

    /**
     * [Update a cart](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/members/#edit-patch_lists_list_id_members_subscriber_hash)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/carts/{cart_id}")
    class Update(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val cart_id: String
    ) : EditCartMethod()

    @JvmField
    @Field
    var customer: CustomerInfo? = null

    @JvmField
    @Field
    var campaign_id: String? = null

    @JvmField
    @Field
    var checkout_url: String? = null

    @JvmField
    @Field
    var currency_code: String? = null

    @JvmField
    @Field
    var order_total: Number? = null

    @JvmField
    @Field
    var tax_total: Number? = null

    @JvmField
    @Field
    var lines: List<LineInfo>? = null
}