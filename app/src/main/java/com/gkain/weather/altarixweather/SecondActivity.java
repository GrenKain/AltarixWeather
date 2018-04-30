package com.gkain.weather.altarixweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        editText = (EditText)findViewById(R.id.editText);


        String txtName = getIntent().getStringExtra("textFromOneActivity");
        textView.setText(textView.getText().toString() + " " + txtName);
    }


    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("textFromSecondActivity", editText.getText().toString());
        startActivity(intent);
    }
}