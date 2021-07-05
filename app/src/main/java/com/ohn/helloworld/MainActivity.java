package com.ohn.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // xml 대신 코드로 구현 ==============================================
//        LinearLayout mainLayout = new LinearLayout(this);
//        mainLayout.setOrientation(LinearLayout.VERTICAL);
//
//        // 첫번째 변수: Width, 두번째 변수: height
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        Button button1 = new Button(this);
//        button1.setText("Button1");
//        button1.setLayoutParams(params);
//        mainLayout.addView(button1);
//
//        setContentView(mainLayout); //보여주기 위해서 전달
        // =================================================================

    }

    public void onClickButton(View view) {
        Log.d("Test", "Test");
    }
}