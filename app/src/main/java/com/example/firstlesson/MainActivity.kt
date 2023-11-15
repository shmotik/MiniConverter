package com.example.firstlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var input = 0.0
    private var text1 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonConvert: Button = findViewById(R.id.button_convert)
        val textExit: TextView = findViewById(R.id.text_exit)
        val editEnter: EditText = findViewById(R.id.edit_Enter)
        val textSystem: TextView = findViewById(R.id.text_system)
        val choiceGroup: RadioGroup = findViewById(R.id.choice_group)
        val textViewEnter: TextView = findViewById(R.id.text_view_enter)
        val textViewExit: TextView = findViewById(R.id.text_view_exit)

        buttonConvert.setOnClickListener { view ->
            val checkedRadioButtonId = choiceGroup.checkedRadioButtonId

            textSystem.text = if (checkedRadioButtonId == -1) "Не выбрана конвертация" else ""

            if (checkedRadioButtonId == R.id.button_mile) {
                textViewEnter.text = "Мили"
                textViewExit.text = "Километры"
                text1 = editEnter.getText().toString()
                input = text1.toDouble()
                input = input * 1.609344
                text1 = input.toString()
                textExit.text = text1
            }

            if (checkedRadioButtonId == R.id.button_knots) {
                textViewEnter.text = "Узлы"
                textViewExit.text = "Километры в час"
                text1 = editEnter.getText().toString()
                input = text1.toDouble()
                input = input * 1.852
                text1 = input.toString()
                textExit.text = text1
            }


        }


    }
}