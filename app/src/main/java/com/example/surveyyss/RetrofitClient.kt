package com.example.surveyyss


import com.example.surveyyss.ApiUtil.Companion.BASE_URL
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.Header

object RetrofitClient {
    private fun addBearer(token: String): String {
        return " Bearer ".plus(token)
    }

    fun getClinet( token: String): Retrofit {

        val interceptor = (Interceptor { chain ->

            val requestBuilder = chain.request().newBuilder()
             requestBuilder.header("Authorization", addBearer(token))
            chain.proceed(requestBuilder.build())
        })
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(interceptor)

        return Retrofit.Builder()
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(ScalarsConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

    }

}

object CityVisitorApi {
    val RETROFIT_SERVICE : DaoInterface by lazy {RetrofitClient.getClinet(
        "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOiIxIiwiTGFuZ0lkIjoiMSIsIkVtYWlsIjoidHVyYWwueGFzaXlldkByYWJpdGEuYXoiLCJOYW1lIjoiVFVSQUwiLCJTdXJuYW1lIjoiWEFTxLBZRVYiLCJQYXRyb255bWljIjoixo9SWlVNQU4gT8SeTFUiLCJTdHJ1Y3R1cmVJZCI6IjYiLCJTdHJ1Y3R1cmVOYW1lIjoiQsO2ecO8ayBtyZlzbMmZaMmZdMOnaSIsIkRlcElkIjoiNiIsIkRlcE5hbWUiOiJCw7Z5w7xrIG3JmXNsyZloyZl0w6dpIiwiVG9wU3RydWN0dXJlSWQiOiIxIiwiT2ZmaWNlSWQiOiI2IiwiT2ZmaWNlTmFtZSI6IkLDtnnDvGsgbcmZc2zJmWjJmXTDp2kiLCJQaG90byI6Imh0dHBzOi8vc3RvcmFnZS5yaW5uLmF6L21pbmlvLWltcGwtYnVja2V0LzE2NDA2NzQzMTc4MTgucG5nP1gtQW16LUFsZ29yaXRobT1BV1M0LUhNQUMtU0hBMjU2JlgtQW16LUNyZWRlbnRpYWw9aW1wbCUyRjIwMjIxMjIzJTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIyMTIyM1QwNDQ1NDFaJlgtQW16LUV4cGlyZXM9ODY0MDAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JlgtQW16LVNpZ25hdHVyZT1hYWUxZTNjOGNhN2RmMzk2MjA2MjFmZDlkMzE3YmZjNmYyYmE5MmYwY2IyYTAxNWFkNGM3MDFiMjNiZjhiNmY0IiwianRpIjoiOTM4ZTk5N2ItZjRhZS00NDg4LTgzZmYtNmY2ZjJlMjEzYmY4IiwiZXhwIjoxNjcxODczODYwLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjU5OTIxIiwiYXVkIjoiaHR0cDovL2xvY2FsaG9zdDo0MjAwIn0.ggU43x61P_7TcaHT1zoB1T51z7yz4jgpoDMCdQym7M0"
    ).create(DaoInterface::class.java) }
}