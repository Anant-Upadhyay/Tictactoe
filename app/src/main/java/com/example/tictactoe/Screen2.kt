package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_view)
        val proceed :Button= findViewById(R.id.button3)
        val person1 :EditText= findViewById(R.id.Person1)
        val person2 :EditText= findViewById(R.id.Person2)
        proceed.setOnClickListener{
            if(person1.text.toString().trim().length==0){
                person1.error="Name cannot be empty"
            }
            else if(person2.text.toString().trim().length==0){
                person2.error="Name cannot be empty"
            }
            else{
                val intent = Intent(this,Game_activity::class.java)
                val P1 = person1.text.toString()
                intent.putExtra("Person1", P1)
                val P2 = person2.text.toString()
                intent.putExtra("Person2", P2)
                startActivity(intent)
            }
        }
    }
}