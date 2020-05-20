package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.text);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String readtext=editText.getText().toString();
                if (readtext.equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter some text",Toast.LENGTH_SHORT).show();

                }
                else {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("key", readtext);
                    startActivity(intent);
                }
            }
        });

    }
}
