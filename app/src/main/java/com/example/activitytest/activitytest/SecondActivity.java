package com.example.activitytest.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button secondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondButton = (Button) findViewById(R.id.secondButtonId);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent secondToMain = new Intent(SecondActivity.this, MainActivity.class);
                //startActivity(secondToMain);

                Intent secondToMain = getIntent();
                setResult(RESULT_OK, secondToMain);
                finish();
            }
        });

    }
}
