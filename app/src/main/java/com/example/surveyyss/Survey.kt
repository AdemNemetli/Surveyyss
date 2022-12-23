package com.example.surveyyss


import com.google.gson.annotations.SerializedName

data class Survey(
    @SerializedName("data")
    var `data`: List<Data?>?,
    @SerializedName("errors")
    var errors: Any?,
    @SerializedName("firstPage")
    var firstPage: String?,
    @SerializedName("lastPage")
    var lastPage: String?,
    @SerializedName("message")
    var message: String?,
    @SerializedName("nextPage")
    var nextPage: Any?,
    @SerializedName("pageNumber")
    var pageNumber: Int?,
    @SerializedName("pageSize")
    var pageSize: Int?,
    @SerializedName("previousPage")
    var previousPage: Any?,
    @SerializedName("succeeded")
    var succeeded: Boolean?,
    @SerializedName("totalPages")
    var totalPages: Int?,
    @SerializedName("totalRecords")
    var totalRecords: Int?
)