package com.example.administrator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class setActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);
        Button back = (Button)findViewById(R.id.title_button1);
        TextView textView = (TextView)findViewById(R.id.title_name);
        textView.setText("设置");
        Button outLogin = (Button)findViewById(R.id.outLogin);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(setActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        outLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(setActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
