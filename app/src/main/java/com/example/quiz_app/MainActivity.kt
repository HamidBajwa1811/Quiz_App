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
                    R.id.r1->{
                        r2.isChecked=false
                        r3.isChecked=false
                        r4.isChecked=false
                        score=score
                    }
                    R.id.r2->{
                        r1.isChecked=false
                        r3.isChecked=false
                        r4.isChecked=false
                        score=score
                    }
                    R.id.r3->{
                        r2.isChecked=false
                        r1.isChecked=false
                        r4.isChecked=false
                        score=score+1
                    }
                    R.id.r4->{
                        r2.isChecked=false
                        r3.isChecked=false
                        r1.isChecked=false
                        score=score
                    }

                }

            }
        }
        rgq2.setOnCheckedChangeListener { group, n ->
             run {
                 when(n){
                     R.id.r5->{
                         r6.isChecked=false
                         r7.isChecked=false
                         r8.isChecked=false
                         score=score
                     }
                     R.id.r6->{
                         r5.isChecked=false
                         r7.isChecked=false
                         r8.isChecked=false
                         score=score+1
                     }
                     R.id.r7->{
                         r6.isChecked=false
                         r5.isChecked=false
                         r8.isChecked=false
                         score=score
                     }
                     R.id.r8->{
                         r6.isChecked=false
                         r7.isChecked=false
                         r5.isChecked=false
                         score=score
                     }

                 }

             }
        }

        btn.setOnClickListener {
            val totalscore=score
            var i=Intent(this,MainActivity2::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            i.putExtra("score",totalscore)
            startActivity(i)
        }
    }
}