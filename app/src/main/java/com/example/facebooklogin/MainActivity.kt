package com.example.facebooklogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity(), TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var thread = Thread(Runnable {
            try {
                t_logo.animate().translationY(-855f).duration = 700
                Thread.sleep(900)
                t_logo.animate().alpha(0f).duration = 0
                top_photo.animate().alpha(1f).duration = 0
                ed_email.animate().alpha(1f).duration = 0
                ed_pass.animate().alpha(1f).duration = 0
                btn_login.animate().alpha(1f).duration = 0
                btn_forgotPassword.animate().alpha(1f).duration = 0
                linearLayout.animate().alpha(1f).duration = 0
                btn_createN_F_A.animate().alpha(1f).duration = 0
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        })
        thread.start()

        ed_email.addTextChangedListener(this)
        ed_pass.addTextChangedListener(this)


        btn_login.setOnClickListener {
            login()
        }
        btn_forgotPassword.setOnClickListener {
            forgot()
        }
        btn_createN_F_A.setOnClickListener {
            create()
        }

    }


    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        btn_login.isEnabled = ed_email.text.isNotEmpty() && ed_pass.text.isNotEmpty()
    }

    private fun login() {
        Toast.makeText(this, "مش هتخش.. انا حر!!", Toast.LENGTH_SHORT).show()
    }

    private fun forgot() {
        Toast.makeText(this, "نعم يا رووح امك !!", Toast.LENGTH_SHORT).show()
    }

    private fun create() {
        Toast.makeText(this, "لا.. شكلك مش عاجبنى", Toast.LENGTH_SHORT).show()
    }

}


