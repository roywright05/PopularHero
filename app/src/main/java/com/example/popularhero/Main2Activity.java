package com.example.popularhero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = findViewById(R.id.btn_to_four);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTo2012();
            }
        });
    }

    public void goTo2012(){

        Intent intent = new Intent(this, Main3Activity.class);

        startActivity(intent);
    }
}
