package com.example.quizgelanga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText nn, cc;
    Button btnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nn = findViewById(R.id.edtname);
        cc = findViewById(R.id.edtcourse);
        btnv =findViewById(R.id.btn);
        btnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namevalue = nn.getText().toString();
                String courseval = cc.getText().toString();
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                intent.putExtra("Name", namevalue);
                intent.putExtra("Course", courseval);
                startActivity(intent);
            }
        });
    }
}