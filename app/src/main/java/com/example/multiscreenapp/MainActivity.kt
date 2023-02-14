package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.parcelize.Parcelize
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    // creating key
    companion object {
        const val KEY = "com.example.multiscreenapp.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val ordersPlaced = eT1.text.toString() + " " +
                    eT2.text.toString() + " " +
                    eT3.text.toString() + " " +
                    eT4.text.toString()

            intent = Intent(this, OrderActivity::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)
        }


    }
}