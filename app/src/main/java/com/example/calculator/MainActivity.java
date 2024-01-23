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

    TextView resultText; //ui를 구현하면서 생성한 버튼 id를 부여할 수 있다. 단, 프로그램이 실행된 후에 부여 가능하다.

    Button num0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultText = findViewById(R.id.result_text);
        num0 = findViewById(R.id.num_0_button);
    }

    public void buttonClick(View view) { //해당 메서드로 onClick된 버든이 동작하는 메서드
        Button getButton = findViewById(view.getId()); //버튼 -> 버튼 아이디 -> 버튼 텍스트

        if(view.getId() == R.id.all_clear_button){
            resultText.setTextColor(0xFF666666);
            isFirstInput =true;
            resultNumber =0;
            operator = '+';
            resultText.setText(String.valueOf(resultNumber)); // == resultNumber + ""
        }else if(view.getId() == R.id.num_0_button
                || view.getId() == R.id.num_1_button
                || view.getId() == R.id.num_2_button
                || view.getId() == R.id.num_3_button
                || view.getId() == R.id.num_4_button
                || view.getId() == R.id.num_5_button
                || view.getId() == R.id.num_6_button
                || view.getId() == R.id.num_7_button
                || view.getId() == R.id.num_8_button
                || view.getId() == R.id.num_9_button){
            if(isFirstInput){
                resultText.setTextColor(0xFF000000);
                resultText.setText(getButton.getText().toString());
                isFirstInput = false;
            } else{
                resultText.append(getButton.getText().toString());
            }
        }
        else {
            Log.e("buttonClick","defalt" + getButton.getText().toString() + "버튼이 클릭되었습니다.");
        }








    }

}