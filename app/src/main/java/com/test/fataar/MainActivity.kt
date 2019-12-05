package com.test.fataar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.fataar.lib1.Lib1MainActivity
import com.test.fataar.lib2.Lib2MainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lib1Btn.setOnClickListener {
            Lib1MainActivity.start(this)
        }
        lib2Btn.setOnClickListener {
            Lib2MainActivity.start(this)
        }
    }
}
