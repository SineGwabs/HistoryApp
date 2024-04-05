package com.example.historyapp3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts.People
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputAge = findViewById<EditText>(R.id.inputAge)
        val results = findViewById<TextView>(R.id.resultsTxt)
        val genBtn = findViewById<Button>(R.id.btnCalculate)
        val clearBtn = findViewById<Button>(R.id.btnClear)

        genBtn.setOnClickListener {
            val age = inputAge.text.toString().toInt()


            if (age < 20 || age > 100) {
                results.text =
                    "The age is out of range"

            }   else if(age == 95) {
                results.text = "Nelson Mandela"

            }else if (age == 52)
                results.text= "William Shakespeare"

                else if (age == 76)
                results.text = "Albert Einstein"

                else if (age == 78)
                results.text = "Mahatma Gandhi"

                else if (age == 67)
                results.text= "Leonardo da Vinci"

                else if (age == 25)
                results.text = "Biggie Smalls"

                else if (age == 58)
                results.text = "Whitney Houston"

                else if (age == 87)
                results.text = "Mother Teresa"

                else if (age == 56)
                results.text = "Abraham Lincoln"

                else if (age == 39)
                results.text = "Martin Luther King Jr."

                else if (age == 56)
                results.text = "Steve Jobs"

                else if (age == 76)
                results.text = "Stephen Hawking"

                else if (age == 50)
                results.text = "Michael Jackson"

                else results.text = "The Age Entered has no specific person assigned"

                clearBtn.setOnClickListener {
                    val name = results.text.toString()
                    results.text = ""
                    inputAge.text.clear()
                }

            }
        }
    }






