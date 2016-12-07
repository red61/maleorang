package com.ecwid.maleorang.method.v3_0.eCommerceStores.customers

import com.ecwid.maleorang.MailchimpMethod
import com.ecwid.maleorang.annotation.*
import com.ecwid.maleorang.method.v3_0.eCommerceStores.AddressInfo
import com.ecwid.maleorang.method.v3_0.eCommerceStores.carts.CustomerInfo
import org.apache.commons.codec.digest.DigestUtils

/**
 * Base class for customer create or update operations.
 */
sealed class EditCustomerMethod : MailchimpMethod<CustomerInfo>() {
    /**
     * [Add a new customer to a store.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/customers/#create-post_ecommerce_stores_store_id_customers)
     */
    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/customers")
    class Create(
            @JvmField
            @PathParam
            val store_id: String
    ) : EditCustomerMethod()

    /**
     * [Update a customer.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/customers/#edit-patch_ecommerce_stores_store_id_customers_customer_id)
     */
    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/customers/{customer_id}")
    class Update(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val customer_id: String
    ) : EditCustomerMethod()

    /**
     * [Add or update a customer.](http://developer.mailchimp.com/documentation/mailchimp/reference/ecommerce/stores/customers/#edit-put_ecommerce_stores_store_id_customers_customer_id)
     */
    @Method(httpMethod = HttpMethod.PUT, version = APIVersion.v3_0, path = "/ecommerce/stores/{store_id}/customers/{customer_id}")
    class CreateOrUpdate(
            @JvmField
            @PathParam
            val store_id: String,

            @JvmField
            @PathParam
            val customer_id: String
    ) : EditCustomerMethod()

    @JvmField
    @Field
    var id: String? = null

    @JvmField
    @Field
    var email_address: String? = null

    @JvmField
    @Field
    var opt_in_status: Boolean? = null

    @JvmField
    @Field
    var company: String? = null

    @JvmField
    @Field
    var first_name: String? = null

    @JvmField
    @Field
    var last_name: String? = null

    @JvmField
    @Field
    var orders_count: Int? = null

    @JvmField
    @Field
    var total_spent: Number? = null

    @JvmField
    @Field
    var address: AddressInfo? = null
}