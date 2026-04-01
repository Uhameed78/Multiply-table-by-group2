package com.example.multiplactiontable

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView


class Tabledisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tabledisplay)

        val bundle: Bundle? = intent.extras
        // get the table number from the intent
        val tableString: String? = bundle?.getString("tableNumber")
        // convert the table number to an integer
val tableNumber = tableString?.toInt()
 val multiplyTable = findViewById<TextView>(R.id.tableDistxt)
        





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}