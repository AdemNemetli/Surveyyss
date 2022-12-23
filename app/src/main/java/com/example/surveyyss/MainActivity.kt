package com.example.surveyyss

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.surveyyss.viewModel.MainViewModel

private const val TAG = "jshdgfdf"

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        select()
    }


    fun select() {

        mainViewModel.apply {
            getAllData()
            data.observe(this@MainActivity) {
                Log.d(TAG, "select -----------------------: $it")
            }
        }


        // val u = ApiUtil.getDaoInterface()
/*        u.selectRespons().enqueue(object : Callback<Survey> {
            override fun onResponse(call: Call<Survey>?, response: Response<Survey>?
            ) {
                if(response != null){


                    val responsBody = response.body().data

                    if (responsBody != null) {
                        for (r in responsBody){
                            Log.e("********","***********")
                            r?.expireDate?.let { Log.e("expireDate", it) }
                            if (r != null) {
                                Log.e("title",(r.id).toString())
                            }
                            if (r != null) {
                                Log.e("langId",(r.langId).toString())
                            }


                            r?.startDate?.let { Log.e("startDate", it) }


                            if (r != null) {
                                Log.e("structureId",(r.structureId).toString())
                            }

                            r?.structureName.let {
                                if (it != null) {
                                    Log.e("structureName", it)
                                }
                            }


                            Log.e("surveyPositionId",(r?.surveyPositionId).toString())
                            Log.e("structureId",(r?.surveyVote).toString())
                            r?.title?.let { Log.e("title", it) }


                        }
                    }


                }
            }

            override fun onFailure(call: Call<Survey>?, t: Throwable?) {

            }


        })*/
    }
}