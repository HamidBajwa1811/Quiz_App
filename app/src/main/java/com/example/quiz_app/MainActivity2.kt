package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var userscore=intent.getIntExtra("score",0)
//        userscore1.text=userscore

        rgq3.setOnCheckedChangeListener { group, q3 ->
             run {
                 when(q3){
                     R.id.s2b1->{
                         s2b2.isChecked=false
                         s2b3.isChecked=false
                         s2b4.isChecked=false
                         userscore=userscore+1
                     }
                     R.id.s2b2->{
                         s2b1.isChecked=false
                         s2b3.isChecked=false
                         s2b4.isChecked=false
                         userscore=userscore
                     }
                     R.id.s2b3->{
                         s2b2.isChecked=false
                         s2b1.isChecked=false
                         s2b4.isChecked=false
                         userscore=userscore
                     }
                     R.id.s2b4->{
                         s2b2.isChecked=false
                         s2b3.isChecked=false
                         s2b1.isChecked=false
                         userscore=userscore
                     }
                 }
             }
        }
        rgq4.setOnCheckedChangeListener { group, q4 ->
            run {
                when(q4){
                    R.id.s2b5->{
                        s2b6.isChecked=false
                        s2b7.isChecked=false
                        s2b8.isChecked=false
                        userscore=userscore
                    }
                    R.id.s2b6->{
                        s2b5.isChecked=false
                        s2b7.isChecked=false
                        s2b8.isChecked=false
                        userscore=userscore+1
                    }
                    R.id.s2b7->{
                        s2b6.isChecked=false
                        s2b5.isChecked=false
                        s2b8.isChecked=false
                        userscore=userscore
                    }
                    R.id.s2b8->{
                        s2b6.isChecked=false
                        s2b7.isChecked=false
                        s2b5.isChecked=false
                        userscore=userscore
                    }

                }
            }
        }
        next1.setOnClickListener {
            var i=Intent(this,MainActivity3::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            i.putExtra("score",userscore)
            startActivity(i)
        }
    }
}