package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean isFirstInput = true;
    int resultNumber = 0; //인터페이스 사용
    char operator = '+';

    TextView resultText;

    Button allClearbutton;
    Button clearEntryButton;
    Button backSpaceButton;
    Button[] numberButtons = new Button[10];
    Button[] operatorButtons = new Button[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.result_text);

        allClearbutton = findViewById(R.id.all_clear_button);
        clearEntryButton = findViewById(R.id.clear_entry_button);
        backSpaceButton = findViewById(R.id.back_space_button);

        for(int i =0; i < numberButtons.length; i++){
            numberButtons[i] = findViewById(R.id.num_0_button+i);
            System.out.println(numberButtons[i].getText());
        }

        numberButtons[0] = findViewById(R.id.division_button);
        numberButtons[1] = findViewById(R.id.multiply_button);
        numberButtons[2] = findViewById(R.id.decimal_button);
        numberButtons[3] = findViewById(R.id.addition_button);
        numberButtons[4] = findViewById(R.id.result_button);

        initButtons();

    }

    private void initButtons(){

        allClearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        clearEntryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        backSpaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        for(final Button numberButton : numberButtons){
            numberButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    numberButtonClick(view);
                }
            });
        }

        for(final Button operatorButton : operatorButtons){
            operatorButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                }
            });
        }
    }

    private void numberButtonClick(View view) {
        if(isFirstInput){
            Button btn = findViewById(view.getId());
            resultText.setText(btn.getText());

        }
    }
}