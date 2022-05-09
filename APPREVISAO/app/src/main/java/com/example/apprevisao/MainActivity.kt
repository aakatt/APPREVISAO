package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campo1 = findViewById<EditText>(R.id.numero1)
        val campo2 = findViewById<EditText>(R.id.numero2)
        val b1 = findViewById<Button>(R.id.botao)

        b1.setOnClickListener() {
            val val1 = campo1.text.toString()
            val val2 = campo2.text.toString()


            if (TextUtils.isEmpty(val1) || TextUtils.isEmpty(val2)) {
                Toast.makeText(applicationContext, "Algum dos valores estão sem dados", Toast.LENGTH_SHORT).show()
            }else{
                val1.toInt()
                val2.toInt()
                if(val1!=null)
                    if(val1 > val2){
                        Toast.makeText(applicationContext, "Primeiro valor e menor", Toast.LENGTH_SHORT).show()
                    }
                    else if (val1 < val2){
                        Toast.makeText(applicationContext, "Primeiro valor e maior", Toast.LENGTH_SHORT).show()
                }else if (val1 == val2){
                        Toast.makeText(applicationContext, "Os valores sao iguais", Toast.LENGTH_SHORT).show()
                    }
            }
        }

    }
}
