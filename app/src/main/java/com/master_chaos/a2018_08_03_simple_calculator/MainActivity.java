package com.master_chaos.a2018_08_03_simple_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button additionButton; //CREATE A BUTTON FOR ADDITION
    private Button subtractionButton; //CREATE A BUTTON FOR SUBTRACTION
    private Button multiplicationButton; //CREATE A BUTTON FOR MULTIPLICATION
    private Button divisionButton; //CREATE A BUTTON FOR DIVISION
    private Button moduloButton; //CREATE A BUTTON FOR MODULO
    private EditText Numberfield1EditText; //CREATE A EDITTEXTFIELD FOR INPUTNUMBER 1
    private EditText Numberfield2EditText; //CREATE A EDITTEXTFIELD FOR INPUTNUMBER 2
    private TextView resultTextView; //CREATE A TEXTVIEW FOR CALCULATION RESULT

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        additionButton = (Button) findViewById(R.id.additionButton); //GET BUTTON FROM DISPLAY AND STORE IT IN A VAR
        subtractionButton = (Button) findViewById(R.id.subtractionButton); //GET BUTTON FROM DISPLAY AND STORE IT IN A VAR
        multiplicationButton = (Button) findViewById(R.id.multiplicationButton); //GET BUTTON FROM DISPLAY AND STORE IT IN A VAR
        divisionButton = (Button) findViewById(R.id.divisionButton); //GET BUTTON FROM DISPLAY AND STORE IT IN A VAR
        moduloButton = (Button) findViewById(R.id.moduloButton); //GET BUTTON FROM DISPLAY AND STORE IT IN A VAR
        Numberfield1EditText = (EditText) findViewById(R.id.Numberfield1EditText); //GET NUMBER INPUT 1 FROM DISPLAY AND STORE IT IN A VAR
        Numberfield2EditText = (EditText) findViewById(R.id.Numberfield2EditText); //GET NUMBER INPUT 2 FROM DISPLAY AND STORE IT IN A VAR
        resultTextView = (TextView) findViewById(R.id.resultTextView); //GET RESULT TEXT FROM DISPLAY AND STORE IT IN A VAR

        additionButton.setOnClickListener(this);
        subtractionButton.setOnClickListener(this);
        multiplicationButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);
        moduloButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int number1 = Integer.parseInt(Numberfield1EditText.getText().toString()); //VARIABLE OF INPUTNUMBER 1 AND CONVERT THE INPUT(STRING) TO INTEGER
        int number2 = Integer.parseInt(Numberfield2EditText.getText().toString()); //VARIABLE OF INPUTNUMBER 2 AND CONVERT THE INPUT(STRING) TO INTEGER
        int result = 0; //VARIABLE FOR RESULT VALUE

        switch (view.getId()) //SWITCH FOR THE CALCULATION
        {
            case R.id.additionButton:
                result = number1 + number2; //CALCULATE ADDITION OF NUMBER 1 AND NUMBER 2
                resultTextView.setText(number1 + " + " + number2 + " = " + result + ""); //OUTPUT THE CALCULATION IN THE TEXTVIEW
                break; //EXIT THE SWITCH
            case R.id.subtractionButton:
                result = number1 - number2; //CALCULATE SUBTRACTION OF NUMBER 1 AND NUMBER 2
                resultTextView.setText(number1 + " - " + number2 + " = " + result + ""); //OUTPUT THE CALCULATION IN THE TEXTVIEW
                break; //EXIT THE SWITCH
            case R.id.multiplicationButton:
                result = number1 * number2; //CALCULATE MULTIPLICATION OF NUMBER 1 AND NUMBER 2
                resultTextView.setText(number1 + " * " + number2 + " = " + result + ""); //OUTPUT THE CALCULATION IN THE TEXTVIEW
                break; //EXIT THE SWITCH
            case R.id.divisionButton:
                result = number1 / number2; //CALCULATE DIVISION OF NUMBER 1 AND NUMBER 2
                resultTextView.setText(number1 + " / " + number2 + " = " + result + ""); //OUTPUT THE CALCULATION IN THE TEXTVIEW
                break; //EXIT THE SWITCH
            case R.id.moduloButton:
                result = number1 % number2; //CALCULATE MODULO OF NUMBER 1 AND NUMBER 2
                resultTextView.setText(number1 + " mod " + number2 + " = " + result + ""); //OUTPUT THE CALCULATION IN THE TEXTVIEW
                break; //EXIT THE SWITCH
        }
    }
}