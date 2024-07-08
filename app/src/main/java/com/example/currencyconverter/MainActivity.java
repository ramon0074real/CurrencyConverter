package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.E1);
        btn_convert=findViewById(R.id.btn_convert);
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        });
    }

    public void convert()
    {
        String aid=editText.getText().toString();
        if(aid.equals(""))
        {
            Toast.makeText(this, "Enter A Valid number",
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
           Double amountDollarsDouble = Double.parseDouble(aid);
           Double ain = amountDollarsDouble * 760;
           String amountNaira = ain.toString();
           Toast.makeText(this,"Amount in Naira is = "+amountNaira,
                   Toast.LENGTH_SHORT).show();
        }

    }
}