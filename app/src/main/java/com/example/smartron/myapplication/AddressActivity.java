package com.example.smartron.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText Address1_et,Address2_et;
    public Button submit_btn;
    public String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Address1_et=findViewById(R.id.Address1_et);
        Address2_et=findViewById(R.id.Address2_et);
        submit_btn=findViewById(R.id.submit_btn);
        submit_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit_btn:
                EditText Address1_et = (EditText) findViewById(R.id.Address1_et);
                String result = Address1_et.getText().toString();
                EditText Address2_et = (EditText) findViewById(R.id.Address2_et);
                String result1 = Address2_et.getText().toString();
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result",result+","+" "+result1);
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
                break;
        }

    }

}
