package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main4.next1
import kotlinx.android.synthetic.main.activity_main4.s2b1
import kotlinx.android.synthetic.main.activity_main4.s2b2
import kotlinx.android.synthetic.main.activity_main4.s2b3
import kotlinx.android.synthetic.main.activity_main4.s2b4
import kotlinx.android.synthetic.main.activity_main4.s2b5
import kotlinx.android.synthetic.main.activity_main4.s2b6
import kotlinx.android.synthetic.main.activity_main4.s2b7
import kotlinx.android.synthetic.main.activity_main4.s2b8
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var score=intent.getIntExtra("score",0)




        rgq9.setOnCheckedChangeListener { group, q9 ->
            run {
                when(q9){
                    R.id.s2b1->{
                        s2b2.isChecked=false
                        s2b3.isChecked=false
                        s2b4.isChecked=false
                        score=score
                    }
                    R.id.s2b2->{
                        s2b1.isChecked=false
                        s2b3.isChecked=false
                        s2b4.isChecked=false
                        score=score
                    }
                    R.id.s2b3->{
                        s2b2.isChecked=false
                        s2b1.isChecked=false
                        s2b4.isChecked=false
                        score=score+1
                    }
                    R.id.s2b4->{
                        s2b2.isChecked=false
                        s2b3.isChecked=false
                        s2b1.isChecked=false
                        score=score
                    }
                }
            }
        }
        rgq10.setOnCheckedChangeListener { group, q10 ->
            run {
                when(q10){
                    R.id.s2b5->{
                        s2b6.isChecked=false
                        s2b7.isChecked=false
                        s2b8.isChecked=false
                        score=score+1
                    }
                    R.id.s2b6->{
                        s2b5.isChecked=false
                        s2b7.isChecked=false
                        s2b8.isChecked=false
                        score=score
                    }
                    R.id.s2b7->{
                        s2b6.isChecked=false
                        s2b5.isChecked=false
                        s2b8.isChecked=false
                        score=score
                    }
                    R.id.s2b8->{
                        s2b6.isChecked=false
                        s2b7.isChecked=false
                        s2b5.isChecked=false
                        score=score
                    }

                }
            }
        }
        next1.setOnClickListener {
            var i= Intent(this,MainActivity6::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            i.putExtra("score",score)
            startActivity(i)

        }
    }
}