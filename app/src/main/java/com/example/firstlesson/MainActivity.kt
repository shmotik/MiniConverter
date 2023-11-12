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
    private var selectedRadioButtonNumber = 0

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

        buttonConvert.setOnClickListener {View ->
            val checkedRadioButtonId = choiceGroup.checkedRadioButtonId

            when (checkedRadioButtonId){
                -1 -> {
                    textSystem.text = "Не выбрана конвертация"
                }
                else -> {
                    textSystem.text = ""
                     var selectedRadioButtonText = findViewById<RadioButton>(checkedRadioButtonId)
                }
            }

                //textViewEnter.text = checkedRadioButtonId.toString()

            if ( checkedRadioButtonId == 2131230821 ){
                textViewEnter.text = "Мили"
                textViewExit.text = "Километры"
                text1 = editEnter.getText().toString()
                input = text1.toDouble()
                input = input * 1.609344
                text1 = input.toString()
                textExit.text = text1
            }

            if ( checkedRadioButtonId == 2131230820 ){
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