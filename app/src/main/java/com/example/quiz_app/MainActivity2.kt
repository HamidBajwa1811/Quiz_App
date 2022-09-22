package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var score=intent.getIntExtra("score",0)
//        userscore1.text=userscore

        rgq3.setOnCheckedChangeListener { group, q3 ->
             run {
                 when(q3){
                     R.id.s2b1->{
                         score=score+1
                     }
                 }
             }
        }
        rgq4.setOnCheckedChangeListener { group, q4 ->
            run {
                when(q4){
                    R.id.s2b6->{
                        score=score+1
                    }
                }
            }
        }
        next1.setOnClickListener {
            var i=Intent(this,MainActivity3::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            i.putExtra("score",score)
            startActivity(i)
        }
    }
}