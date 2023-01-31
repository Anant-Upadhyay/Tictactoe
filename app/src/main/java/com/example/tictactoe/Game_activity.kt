package com.example.tictactoe

import android.content.res.ColorStateList
import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Game_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val P1 :TextView = findViewById(R.id.P1)
        val P2 :TextView = findViewById(R.id.P2)
        val wp1 :TextView = findViewById(R.id.WP1)
        val wp2 :TextView = findViewById(R.id.WP2)
        val w1 :TextView = findViewById(R.id.W1)
        val w2 :TextView = findViewById(R.id.W2)
        var WP1 = 0
        var WP2 = 0
        var turn = "X"
        wp1.text = WP1.toString()
        wp2.text = WP2.toString()
        P1.text = intent.getStringExtra("Person1")
        P2.text = intent.getStringExtra("Person2")
        val back:Button = findViewById(R.id.back)
        val restart:Button = findViewById(R.id.restart)
        val b1:ImageButton = findViewById(R.id.b1)
        val b2:ImageButton = findViewById(R.id.b2)
        val b3:ImageButton = findViewById(R.id.b3)
        val b4:ImageButton = findViewById(R.id.b4)
        val b5:ImageButton = findViewById(R.id.b5)
        val b6:ImageButton = findViewById(R.id.b6)
        val b7:ImageButton = findViewById(R.id.b7)
        val b8:ImageButton = findViewById(R.id.b8)
        val b9:ImageButton = findViewById(R.id.b9)
        var Ib1=true
        var Ib2=true
        var Ib3=true
        var Ib4=true
        var Ib5=true
        var Ib6=true
        var Ib7=true
        var Ib8=true
        var Ib9=true
        var Ib1m=""
        var Ib2m=""
        var Ib3m=""
        var Ib4m=""
        var Ib5m=""
        var Ib6m=""
        var Ib7m=""
        var Ib8m=""
        var Ib9m=""
        fun mfalse(){
            Ib1=false
            Ib2=false
            Ib3=false
            Ib4=false
            Ib5=false
            Ib6=false
            Ib7=false
            Ib8=false
            Ib9=false
            Ib1m=""
            Ib2m=""
            Ib3m=""
            Ib4m=""
            Ib5m=""
            Ib6m=""
            Ib7m=""
            Ib8m=""
            Ib9m=""
        }
        fun Check(){
        if(Ib1m=="X" && Ib2m=="X" && Ib3m=="X"){
            b1.setImageResource(R.drawable.rcross)
            b2.setImageResource(R.drawable.rcross)
            b3.setImageResource(R.drawable.rcross)
            WP1++
            wp1.text = WP1.toString()
            mfalse()
        }
        else if(Ib1m=="O" && Ib2m=="O" && Ib3m=="O"){
            b1.setImageResource(R.drawable.rnought)
            b2.setImageResource(R.drawable.rnought)
            b3.setImageResource(R.drawable.rnought)
            WP2++
            wp2.text = WP2.toString()
            mfalse()
        }
            if(Ib4m=="X" && Ib5m=="X" && Ib6m=="X"){
                b4.setImageResource(R.drawable.rcross)
                b5.setImageResource(R.drawable.rcross)
                b6.setImageResource(R.drawable.rcross)
                WP1++
                wp1.text = WP1.toString()
                mfalse()
            }
            else if(Ib4m=="O" && Ib5m=="O" && Ib6m=="O"){
                b4.setImageResource(R.drawable.rnought)
                b5.setImageResource(R.drawable.rnought)
                b6.setImageResource(R.drawable.rnought)
                WP2++
                wp2.text = WP2.toString()
                mfalse()
            }
            if(Ib7m=="X" && Ib8m=="X" && Ib9m=="X"){
                b7.setImageResource(R.drawable.rcross)
                b8.setImageResource(R.drawable.rcross)
                b9.setImageResource(R.drawable.rcross)
                WP1++
                wp1.text = WP1.toString()
                mfalse()
            }
            else if(Ib7m=="O" && Ib8m=="O" && Ib9m=="O"){
                b7.setImageResource(R.drawable.rnought)
                b8.setImageResource(R.drawable.rnought)
                b9.setImageResource(R.drawable.rnought)
                WP2++
                wp2.text = WP2.toString()
                mfalse()
            }
            if(Ib1m=="X" && Ib5m=="X" && Ib9m=="X"){
                b1.setImageResource(R.drawable.rcross)
                b5.setImageResource(R.drawable.rcross)
                b9.setImageResource(R.drawable.rcross)
                WP1++
                wp1.text = WP1.toString()
                mfalse()
            }
            else if(Ib1m=="O" && Ib5m=="O" && Ib9m=="O"){
                b1.setImageResource(R.drawable.rnought)
                b5.setImageResource(R.drawable.rnought)
                b9.setImageResource(R.drawable.rnought)
                WP2++
                wp2.text = WP2.toString()
                mfalse()
            }
            if(Ib3m=="X" && Ib5m=="X" && Ib7m=="X"){
                b3.setImageResource(R.drawable.rcross)
                b5.setImageResource(R.drawable.rcross)
                b7.setImageResource(R.drawable.rcross)
                WP1++
                wp1.text = WP1.toString()
                mfalse()
            }
            else if(Ib3m=="O" && Ib5m=="O" && Ib7m=="O"){
                b3.setImageResource(R.drawable.rnought)
                b5.setImageResource(R.drawable.rnought)
                b7.setImageResource(R.drawable.rnought)
                WP2++
                wp2.text = WP2.toString()
                mfalse()
            }
            if(Ib1m=="X" && Ib4m=="X" && Ib7m=="X"){
                b1.setImageResource(R.drawable.rcross)
                b4.setImageResource(R.drawable.rcross)
                b7.setImageResource(R.drawable.rcross)
                WP1++
                wp1.text = WP1.toString()
                mfalse()
            }
            else if(Ib1m=="O" && Ib4m=="O" && Ib7m=="O"){
                b1.setImageResource(R.drawable.rnought)
                b4.setImageResource(R.drawable.rnought)
                b7.setImageResource(R.drawable.rnought)
                WP2++
                wp2.text = WP2.toString()
                mfalse()
            }
            if(Ib2m=="X" && Ib5m=="X" && Ib8m=="X"){
                b2.setImageResource(R.drawable.rcross)
                b5.setImageResource(R.drawable.rcross)
                b8.setImageResource(R.drawable.rcross)
                WP1++
                wp1.text = WP1.toString()
                mfalse()
            }
            else if(Ib2m=="O" && Ib5m=="O" && Ib8m=="O"){
                b2.setImageResource(R.drawable.rnought)
                b5.setImageResource(R.drawable.rnought)
                b8.setImageResource(R.drawable.rnought)
                WP2++
                wp2.text = WP2.toString()
                mfalse()
            }
            if(Ib3m=="X" && Ib6m=="X" && Ib9m=="X"){
                b3.setImageResource(R.drawable.rcross)
                b6.setImageResource(R.drawable.rcross)
                b9.setImageResource(R.drawable.rcross)
                WP1++
                wp1.text = WP1.toString()
                mfalse()
            }
            else if(Ib3m=="O" && Ib6m=="O" && Ib9m=="O"){
                b3.setImageResource(R.drawable.rnought)
                b6.setImageResource(R.drawable.rnought)
                b9.setImageResource(R.drawable.rnought)
                WP2++
                wp2.text = WP2.toString()
                mfalse()
            }
            if(Ib1m!="" && Ib2m!=""&& Ib3m!=""&& Ib4m!=""&& Ib5m!=""&& Ib6m!=""&& Ib7m!=""&& Ib8m!=""&& Ib9m!=""){
                if(Ib1m=="X"){
                  b1.setImageResource(R.drawable.ycross)
               }
               else if(Ib1m=="O") {
                   b1.setImageResource(R.drawable.ynought)
               }
                if(Ib2m=="X"){
                    b2.setImageResource(R.drawable.ycross)
                }
                else if(Ib2m=="O") {
                    b2.setImageResource(R.drawable.ynought)
                }
                if(Ib3m=="X"){
                    b3.setImageResource(R.drawable.ycross)
                }
                else if(Ib3m=="O") {
                    b3.setImageResource(R.drawable.ynought)
                }
                if(Ib4m=="X"){
                    b4.setImageResource(R.drawable.ycross)
                }
                else if(Ib4m=="O") {
                    b4.setImageResource(R.drawable.ynought)
                }
                if(Ib5m=="X"){
                    b5.setImageResource(R.drawable.ycross)
                }
                else if(Ib5m=="O") {
                    b5.setImageResource(R.drawable.ynought)
                }
                if(Ib6m=="X"){
                    b6.setImageResource(R.drawable.ycross)
                }
                else if(Ib6m=="O") {
                    b6.setImageResource(R.drawable.ynought)
                }
                if(Ib7m=="X"){
                    b7.setImageResource(R.drawable.ycross)
                }
                else if(Ib7m=="O") {
                    b7.setImageResource(R.drawable.ynought)
                }
                if(Ib8m=="X"){
                    b8.setImageResource(R.drawable.ycross)
                }
                else if(Ib8m=="O") {
                    b8.setImageResource(R.drawable.ynought)
                }
                if(Ib9m=="X"){
                    b9.setImageResource(R.drawable.ycross)
                }
                else if(Ib9m=="O") {
                    b9.setImageResource(R.drawable.ynought)
                }
                mfalse()
            }

        }
        fun SO(){
            if (resources.getString(R.string.mode) == "Day") {
                P2.setTextColor(Color.BLACK)
                wp2.setTextColor(Color.BLACK)
                w2.setTextColor(Color.BLACK)
            } else {
                P2.setTextColor(Color.WHITE)
                wp2.setTextColor(Color.WHITE)
                w2.setTextColor(Color.WHITE)
            }
            P1.setTextColor(Color.parseColor("#B71C1C"))
            wp1.setTextColor(Color.parseColor("#B71C1C"))
            w1.setTextColor(Color.parseColor("#B71C1C"))
        }
        fun SX(){
            P2.setTextColor(Color.parseColor("#B71C1C"))
            wp2.setTextColor(Color.parseColor("#B71C1C"))
            w2.setTextColor(Color.parseColor("#B71C1C"))
            if (resources.getString(R.string.mode) == "Day") {
                P1.setTextColor(Color.BLACK)
                wp1.setTextColor(Color.BLACK)
                w1.setTextColor(Color.BLACK)
            } else {
                P1.setTextColor(Color.WHITE)
                wp1.setTextColor(Color.WHITE)
                w1.setTextColor(Color.WHITE)
            }
        }
        fun Change(i: Int){
            if(i==1) {
                    if (turn == "X") {
                        Ib1m="X"
                        turn = "O"
                        SX()
                        b1.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib1m="O"
                        turn = "X"
                        SO()
                        b1.setImageResource(R.drawable.nought)
                    }
            }
            else if(i==2) {
                    if (turn == "X") {
                        Ib2m="X"
                        turn = "O"
                        SX()
                        b2.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib2m="O"
                        turn = "X"
                        SO()
                        b2.setImageResource(R.drawable.nought)
                    }
            }
            else if(i==3) {
                    if (turn == "X") {
                        Ib3m="X"
                        turn = "O"
                        SX()
                        b3.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib3m="O"
                        turn = "X"
                        SO()
                        b3.setImageResource(R.drawable.nought)
                    }
            }
            if(i==4) {
                    if (turn == "X") {
                        Ib4m="X"
                        turn = "O"
                        SX()
                        b4.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib4m="O"
                        turn = "X"
                        SO()
                        b4.setImageResource(R.drawable.nought)
                    }
            }
            if(i==5) {
                    if (turn == "X") {
                        Ib5m="X"
                        turn = "O"
                        SX()
                        b5.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib5m="O"
                        turn = "X"
                        SO()
                        b5.setImageResource(R.drawable.nought)
                    }
            }
            if(i==6) {
                    if (turn == "X") {
                        Ib6m="X"
                        turn = "O"
                        SX()
                        b6.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib6m="O"
                        turn = "X"
                        SO()
                        b6.setImageResource(R.drawable.nought)
                    }
            }
            if(i==7) {
                    if (turn == "X") {
                        Ib7m="X"
                        turn = "O"
                        SX()
                        b7.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib7m="O"
                        turn = "X"
                        SO()
                        b7.setImageResource(R.drawable.nought)
                    }
            }
            if(i==8) {
                    if (turn == "X") {
                        Ib8m="X"
                        turn = "O"
                        SX()
                        b8.setImageResource(R.drawable.cross)

                    } else if (turn == "O") {
                        Ib8m="O"
                        turn = "X"
                        SO()
                        b8.setImageResource(R.drawable.nought)
                    }
                }
            if(i==9) {
                    if (turn == "X") {
                        Ib9m="X"
                        turn = "O"
                        SX()
                        b9.setImageResource(R.drawable.cross)

                    }
                    else if (turn == "O") {
                        Ib9m="O"
                        turn = "X"
                        SO()
                        b9.setImageResource(R.drawable.nought)
                    }
            }
        }
        b1.setOnClickListener {
            if(Ib1) {
                Change(1)
                Check()
                Ib1 = false
            }
        }
        b2.setOnClickListener {
        if(Ib2) {
            Change(2)
            Check()
            Ib2 = false
        }
        }
        b3.setOnClickListener {
        if(Ib3) {
            Change(3)
            Check()
            Ib3 = false
        }
        }
        b4.setOnClickListener {
        if(Ib4) {
            Change(4)
            Check()
            Ib4 = false
        }
        }
        b5.setOnClickListener {
        if(Ib5) {
            Change(5)
            Check()
            Ib5 = false
        }
        }
        b6.setOnClickListener {
        if(Ib6) {
            Change(6)
            Check()
            Ib6 = false
        }
        }
        b7.setOnClickListener {
        if(Ib7) {
            Change(7)
            Check()
            Ib7 = false
        }
        }
        b8.setOnClickListener {
        if(Ib8) {
            Change(8)
            Check()
            Ib8 = false
        }
        }
        b9.setOnClickListener {
        if(Ib9) {
            Change(9)
            Check()
            Ib9 = false
        }
        }
        back.setOnClickListener{
            finish()
        }
        restart.setOnClickListener{
            b1.setImageResource(R.drawable.empty)
            b2.setImageResource(R.drawable.empty)
            b3.setImageResource(R.drawable.empty)
            b4.setImageResource(R.drawable.empty)
            b5.setImageResource(R.drawable.empty)
            b6.setImageResource(R.drawable.empty)
            b7.setImageResource(R.drawable.empty)
            b8.setImageResource(R.drawable.empty)
            b9.setImageResource(R.drawable.empty)
            Ib1=true
            Ib2=true
            Ib3=true
            Ib4=true
            Ib5=true
            Ib6=true
            Ib7=true
            Ib8=true
            Ib9=true
            Ib1m=""
            Ib2m=""
            Ib3m=""
            Ib4m=""
            Ib5m=""
            Ib6m=""
            Ib7m=""
            Ib8m=""
            Ib9m=""
            turn="X"
            SO()
        }

    }
    
}