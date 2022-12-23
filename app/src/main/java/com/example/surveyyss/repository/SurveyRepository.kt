package com.example.surveyyss.repository

import com.example.surveyyss.CityVisitorApi
import com.example.surveyyss.RetrofitClient

class SurveyRepository {
    private val service = CityVisitorApi.RETROFIT_SERVICE
    /*("",
        "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOiIxIiwiTGFuZ0lkIjoiMSIsIkVtYWlsIjoidHVyYWwueGFzaXlldkByYWJpdGEuYXoiLCJOYW1lIjoiVFVSQUwiLCJTdXJuYW1lIjoiWEFTxLBZRVYiLCJQYXRyb255bWljIjoixo9SWlVNQU4gT8SeTFUiLCJTdHJ1Y3R1cmVJZCI6IjYiLCJTdHJ1Y3R1cmVOYW1lIjoiQsO2ecO8ayBtyZlzbMmZaMmZdMOnaSIsIkRlcElkIjoiNiIsIkRlcE5hbWUiOiJCw7Z5w7xrIG3JmXNsyZloyZl0w6dpIiwiVG9wU3RydWN0dXJlSWQiOiIxIiwiT2ZmaWNlSWQiOiI2IiwiT2ZmaWNlTmFtZSI6IkLDtnnDvGsgbcmZc2zJmWjJmXTDp2kiLCJQaG90byI6Imh0dHBzOi8vc3RvcmFnZS5yaW5uLmF6L21pbmlvLWltcGwtYnVja2V0LzE2NDA2NzQzMTc4MTgucG5nP1gtQW16LUFsZ29yaXRobT1BV1M0LUhNQUMtU0hBMjU2JlgtQW16LUNyZWRlbnRpYWw9aW1wbCUyRjIwMjIxMjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIyMTIyM1QwNDQ1NDFaJlgtQW16LUV4cGlyZXM9ODY0MDAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JlgtQW16LVNpZ25hdHVyZT1hYWUxZTNjOGNhN2RmMzk2MjA2MjFmZDlkMzE3YmZjNmYyYmE5MmYwY2IyYTAxNWFkNGM3MDFiMjNiZjhiNmY0IiwianRpIjoiOTM4ZTk5N2ItZjRhZS00NDg4LTgzZmYtNmY2ZjJlMjEzYmY4IiwiZXhwIjoxNjcxODczODYwLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjU5OTIxIiwiYXVkIjoiaHR0cDovL2xvY2FsaG9zdDo0MjAwIn0"
    )*/

    suspend fun getClientData(onComplete: (String) -> Unit) {
        val response = service.selectRespons()
        try {
            if (response.isSuccessful) {
                response.body()?.let {
                    onComplete(it)
                } ?: onComplete(response.message())
            } else onComplete(response.message())

        } catch (ec: Exception) {
            ec.printStackTrace()
            onComplete(ec.message ?: ec.localizedMessage)
        }
    }


}