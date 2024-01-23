package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        if(view.getId() == R.id.num_1_button){
            resultText.setText("1");
        }
    }

}