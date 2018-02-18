package com.linderhassinger.mifolder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    private EditText firstName, lastName;
    private TextView displayname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edtit_text);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        displayname = (TextView) findViewById(R.id.displayName);

    }
    public void register(View view) {
        String getFirstName = firstName.getText().toString();
        String getLastName = lastName.getText().toString();
        if(getFirstName.length() == 0 || getLastName.length() == 0)
            displayname.setText("These fields are required");
        else
            displayname.setText("Your username is " + getFirstName + " " + getLastName);
    }

}
