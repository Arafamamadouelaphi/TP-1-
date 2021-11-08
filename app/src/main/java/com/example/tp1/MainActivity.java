package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.Button);
        final TextView textView=findViewById(R.id.textview);
        final EditText editText=findViewById(R.id.edittext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText.getText().toString();
                if(name.isEmpty())
                    textView.setText("PLEASE ENTER YOUR NAME");
                    else
                textView.setText("HELLO"+name);
                editText.setText("");
            }
        });
    }
}
