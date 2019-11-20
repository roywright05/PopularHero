package com.example.popularhero.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.popularhero.R;

public class Main4Activity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn = findViewById(R.id.btn_to_five);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTo2018();
            }
        });
    }

    public void goTo2018(){

        Intent intent = new Intent(this, Main5Activity.class);

        startActivity(intent);
    }
}
