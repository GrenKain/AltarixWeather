package com.gkain.weather.altarixweather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button openSecondActivity;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText =(EditText) findViewById(R.id.editText);
        openSecondActivity = (Button)findViewById(R.id.openSecondActivity);
        textView = (TextView)findViewById(R.id.textView);

//принимаем данные
        String txtName = getIntent().getStringExtra("textFromSecondActivity");
//выводим данные
        textView.setText(textView.getText().toString() + " " + txtName);
    }


    public void click(View view) {
        switch (view.getId()){
// case R.id.saveValue: break;
            case R.id.openSecondActivity:
                Intent intent = new Intent(this, SecondActivity.class);
// по ключу будем получать значение с Intent
                intent.putExtra("textFromOneActivity", editText.getText().toString());
                startActivity(intent);
                break;


        }
    }
}
