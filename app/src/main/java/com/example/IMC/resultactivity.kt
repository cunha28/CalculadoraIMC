package com.example.IMC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import com.example.meuprimeiroprojeto.R

class resultactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultactivity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)

        val result = intent.getFloatExtra(  "EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()



       var classificacao =""

        if (result  < 18.5f) {

        classificacao = "ABAIXO DO PESO"

        }else if (result in 18.5f..24.9f){

        classificacao = "NORMAL"

        }else if (result in 25f..29.9f){

            classificacao = "SOBREPESO"

        }else if (result in 30f..39.9f) {

            classificacao = "OBESIDADE"

        }else {

            classificacao = "OBESIDADE GRAVE" }

            tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
        }

            override fun onOptionsItemSelected(item: MenuItem): Boolean {
                 finish()

                return super.onOptionsItemSelected(item)
            }
        }


















