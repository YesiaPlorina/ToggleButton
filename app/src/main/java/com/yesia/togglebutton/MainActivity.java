package com.yesia.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton1, toggleButton2;
    Button btState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton1 = (ToggleButton) findViewById(R.id.tgl_1);
        toggleButton2 = (ToggleButton) findViewById(R.id.tgl_2);
        btState = (Button) findViewById(R.id.bt_toggle);

        btState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("Status toggleButton1 : ").append(toggleButton1.isChecked());
                result.append("\nStatus toggleButton2 : ").append(toggleButton2.isChecked());

            }
        });

    }
}
