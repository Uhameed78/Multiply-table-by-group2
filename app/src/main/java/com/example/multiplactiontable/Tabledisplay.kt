package com.example.multiplactiontable

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView


class Tabledisplay : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tabledisplay)

        val bundle: Bundle? = intent.extras
        // get the table number from the intent
        val tableString: String? = bundle?.getString("tableNumber")
        // convert the table number to an integer
val tableNumber = tableString!!.toInt()
 val multiplyTable = findViewById<TextView>(R.id.tableDistxt)
  var tableDisplay: String = "$tableNumber x table\n\n"

        multiplyTable.text = tableDisplay

        // declare the control variables
        var counter = 1
        while (counter <= 10) { // check the control variable
            val answer = tableNumber * counter // calculate the answer
            tableDisplay += "$tableNumber x $counter = ${answer}\n" // add the answer to the table display string
            counter++ // increment the control variable
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())



            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}