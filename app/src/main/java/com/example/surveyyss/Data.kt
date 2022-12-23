package com.example.surveyyss


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("expireDate")
    var expireDate: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("langId")
    var langId: Int?,
    @SerializedName("startDate")
    var startDate: String?,
    @SerializedName("structureId")
    var structureId: Int?,
    @SerializedName("structureName")
    var structureName: String?,
    @SerializedName("surveyPositionId")
    var surveyPositionId: Int?,
    @SerializedName("surveyVote")
    var surveyVote: Int?,
    @SerializedName("title")
    var title: String?
)