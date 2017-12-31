package com.example.pratiksha.findmyphone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onReg(view: View)
    {
        val userData = UserData(this);
        userData.savePhone(phnno.text.toString());

        finish();
    }
}
