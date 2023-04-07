package com.example.cricketthermometer;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btncal;
    TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etID=findViewById(R.id.etID);
        btncal=findViewById(R.id.btncal);
        tvresult=findViewById(R.id.tvresult);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ID=etID.getText().toString().trim();
                if (ID.isEmpty()) {
                    Toast.makeText(MainActivity.this, getString(R.string.Invalid), Toast.LENGTH_SHORT).show();
                } else {
                    float VALUE;
                    try {
                        VALUE = Float.parseFloat(ID);
                    } catch (NumberFormatException e) {
                        Toast.makeText(MainActivity.this, getString(R.string.Invalid), Toast.LENGTH_SHORT).show();
                        return;
                    }
                    float cal = (VALUE / 3.0f) + 4;
                    String Show = String.valueOf(cal);
                    tvresult.setText(getString(R.string.message) + " " + Show + " " + getString(R.string.message1));
                }


            }
        });



    }
}