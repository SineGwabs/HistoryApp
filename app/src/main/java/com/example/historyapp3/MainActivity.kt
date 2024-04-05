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

        val inputAge = findViewById<EditText>(R.id.inputAge) // (IIE,2024)
        val results = findViewById<TextView>(R.id.resultsTxt)
        val genBtn = findViewById<Button>(R.id.btnCalculate)
        val clearBtn = findViewById<Button>(R.id.btnClear)

        genBtn.setOnClickListener {
            val age = inputAge.text.toString().toInt()


            if (age < 20 || age > 100) {    // (IIE,2024)
                results.text =
                    "The age is out of range"

            }   else if(age == 95) {
                results.text = "Nelson Mandela, South Africa's First Black President Passed away Age 95" // (Hearst Magazine Media,2024)

            }else if (age == 52)
                results.text= "William Shakespeare, Regarded as the Greatest Writer ever Passed away age 52"

                else if (age == 76)
                results.text = "Albert Einstein, Greatest and most Influential Scientists of all time passed away age 76"

                else if (age == 78)
                results.text = "Mahatma Gandhi, Civil rights lawyer who inspired movements for freedom across the world passed away age 78"

                else if (age == 67)
                results.text= "Leonardo da Vinci, Passed away age 67. Artist,Scientist and an Inventor, He did it all"

                else if (age == 25)
                results.text = "Biggie Smalls, The Notorious B.I.G, Considered one of the greatest rappers of all time passed away age 25"

                else if (age == 48)
                results.text = "Whitney Houston, Known as the voice, One of the greatest singers in history passed away age 48"

                else if (age == 87)
                results.text = "Mother Teresa, women dedicated to helping the poor. Considered one of the 20th Century's greatest humanitarians passed away age 87"

                else if (age == 56)
                results.text = "Abraham Lincoln, the 16th President of the USA who issued the Emancipation Proclamation, freeing enslaved people."

                else if (age == 39)
                results.text = "Martin Luther King Jr. one of the most prominent leaders in the civil rights movement passed away age 39"

                else if (age == 76)
                results.text = "Stephen Hawking, scientist, professor and author who performed groundbreaking work in physics and cosmology passsed away age 76"

                else if (age == 50)
                results.text = "Michael Jackson, Known as the “King of Pop,” Michael Jackson was a best-selling American singer, songwriter, and dancer. Passed away age 50"

                else results.text = "The Age Entered has no specific person assigned"

                clearBtn.setOnClickListener {
                    val name = results.text.toString()
                    results.text = ""
                    inputAge.text.clear()
                }

            }
        }
    }






