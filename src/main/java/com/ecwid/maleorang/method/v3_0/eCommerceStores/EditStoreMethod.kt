package com.ecwid.maleorang.method.v3_0.eCommerceStores

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.MailchimpObject
import com.ecwid.maleorang.annotation.*
import java.util.*

/**
 * Base class for store create or update operations.
 */
sealed class EditStoreMethod : MailchimpMethod<StoreInfo>() {
    /**
     * [Add a new store](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/#create-post_ecommerce_stores)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores")
    class Create() : EditStoreMethod()

    /**
     * [Update a store](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/#edit-patch_ecommerce_stores_store_id)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}")
    class Update(
            @JvmField
            @PathParam
            val store_id: String
    ) : EditStoreMethod()

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var list_id: String? = null

    @JvmField
    @Field
    var name: String? = null

    @JvmField
    @Field
    var platform: String? = null

    @JvmField
    @Field
    var domain: String? = null

    @JvmField
    @Field
    var email_address: String? = null

    @JvmField
    @Field
    var currency_code: String? = null

    @JvmField
    @Field
    var money_format: String? = null

    @JvmField
    @Field
    var primary_locale: String? = null

    @JvmField
    @Field
    var timezone: String? = null

    @JvmField
    @Field
    var phone: String? = null

    @JvmField
    @Field
    var address: AddressInfo? = null
}