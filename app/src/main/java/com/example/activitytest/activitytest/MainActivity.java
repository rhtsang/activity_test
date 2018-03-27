package com.example.activitytest.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = (Button) findViewById(R.id.mainButtonId);

        mainButton.setOnClickListener(3new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainToSecond = new Intent(MainActivity.this, SecondActivity.class);
                //startActivity(mainToSecond);
                startActivityForResult(mainToSecond,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                Toast.makeText(MainActivity.this, "Hello from second activity!", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
