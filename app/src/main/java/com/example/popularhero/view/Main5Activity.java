package com.example.popularhero.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.popularhero.R;

public class Main5Activity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn = findViewById(R.id.btn_to_home);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToHome();
            }
        });


    }

    public void goToHome(){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
