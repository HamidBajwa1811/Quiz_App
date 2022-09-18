package com.example.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        var score=intent.getIntExtra("score",0)

        subbtn.setOnClickListener {
            if (french.isChecked==true or  bbq.isChecked==true){
                score=score+1
            }
            else{
                score=score
            }
            if (naran.isChecked==true or  hunza.isChecked==true or swat.isChecked==true ){
                score=score+1
            }
            else{
                score=score
            }
            var dialog:AlertDialog.Builder=AlertDialog.Builder(this)
        dialog.setTitle("Your Total Score")
        dialog.setMessage(score.toString() + " out of 12")
            dialog.setNeutralButton("Retry"){dialog,which->moveToMain()}
            dialog.setIcon(R.drawable.score1)
            dialog.setPositiveButton("Exit") { dialog, which ->finish() }
            dialog.show()

        }
        }


    private fun moveToMain() {
        var i=Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}
