package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.*
import kotlinx.android.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun greetingButton(view: View) {
        val name = nameInput.editableText.toString()
        if (name == "") {
            Toast.makeText(this@MainActivity, "Enter the Name", Toast.LENGTH_SHORT).show()
        } else {
//        Toast.makeText(this@MainActivity, "Button Pressed by $name", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)

        }
    }
}

