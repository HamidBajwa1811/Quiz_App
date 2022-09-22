package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.Group
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var score=0

        rgq1.setOnCheckedChangeListener { group, checkid ->
            run {
                when(checkid){
                    R.id.r3->{
                        score=score+1
                    }
                }
            }
        }
        rgq2.setOnCheckedChangeListener { group, n ->
             run {
                 when(n){
                     R.id.r6->{
                         score=score+1
                     }
                 }
             }
        }

        btn.setOnClickListener {
            var i=Intent(this,MainActivity2::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            i.putExtra("score",score)
            startActivity(i)
        }
    }
}