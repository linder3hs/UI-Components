package com.linderhassinger.mifolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Main9Activity extends AppCompatActivity {
    private ToggleButton toggleButton1, toggleButton2;
    private TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toogle_button);


        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);

        textView1 = (TextView) findViewById(R.id.text_view1);
        textView2 = (TextView) findViewById(R.id.text_view2);

        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    textView1.setText("ToggleButton is ON");
                } else {
                    textView1.setText("ToggleButton is OFF");
                }
            }
        });

        toggleButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
                if (checked) {
                    textView2.setText("ToggleButton is ON");
                } else {
                    textView2.setText("ToggleButton is OFF");
                }
            }
        });

        if (toggleButton1.isChecked()) {
            textView1.setText("ToggleButton is ON");
        } else {
            textView1.setText("ToggleButton is OFF");
        }

        if (toggleButton2.isChecked()) {
            textView2.setText("ToggleButton is ON");
        } else {
            textView2.setText("ToggleButton is OFF");
        }
    }

}

