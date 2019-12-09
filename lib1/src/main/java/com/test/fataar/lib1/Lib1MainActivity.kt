package com.test.fataar.lib1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lib1.*

class Lib1MainActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, Lib1MainActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib1)
        //FIXME
        // As soon as we use any static field (com.test.fataar.lib1.R.*), app crashes.
        lib1View.setText(R.string.lib_1_name)
    }
}
