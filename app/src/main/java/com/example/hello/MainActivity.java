package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hello.R;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e;
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.buttonJ);
        e=(EditText) findViewById(R.id.textName);
        t=(TextView) findViewById(R.id.view);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e.getText().toString();

                t.setText("Hello  "+s);
            }
        });



    }


}
