package com.example.travelpackingapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second2)

        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val btnQuantity = findViewById<Button>(R.id.btnQuantity)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)

        btnDisplay.setOnClickListener {

            var output = ""

            for (i in MainActivity.itemArray.indices) {

            output += """ 
Item: ${MainActivity.itemArray[i]} 
Category: ${MainActivity.categoryArray[i]} 
Quantity: ${MainActivity.quantityArray[i]} 
Comments: ${MainActivity.commentsArray[i]} 
 
""".trimIndent()

            output += "\n\n"
            }

            txtOutput.text = output

            Log.d("PACKING_APP", "Displayed full packing list")
            }

        btnQuantity.setOnClickListener {

            var output = ""

            for (i in MainActivity.quantityArray.indices) {

            if (MainActivity.quantityArray[i] >= 2) {

            output +=
            "${MainActivity.itemArray[i]} " +
            "- Quantity: ${MainActivity.quantityArray[i]}\n"
            }
            }

            txtOutput.text = output

            Log.d("PACKING_APP", "Displayed quantity >= 2")
            }

        btnBack.setOnClickListener {
            finish()
            }
        }
}