/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.squareup.moshi.Json
/**
 * 
 * @param additionalMetadata Additional data to pass to server
 * @param file file to upload
 */
data class InlineObject1 (
    /* Additional data to pass to server */
    @Json(name = "additionalMetadata")
    val additionalMetadata: kotlin.String? = null,
    /* file to upload */
    @Json(name = "file")
    val file: java.io.File? = null
)


