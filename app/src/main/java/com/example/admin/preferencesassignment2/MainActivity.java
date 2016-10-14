package com.example.admin.preferencesassignment2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button save;
    Button show;
    EditText name;
    EditText Age;
    EditText phone;
    EditText city;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save=(Button)findViewById(R.id.button);
        show=(Button)findViewById(R.id.button2);
        name=(EditText)findViewById(R.id.editText);
        Age=(EditText)findViewById(R.id.editText2);
        phone=(EditText)findViewById(R.id.editText3);
        city=(EditText)findViewById(R.id.editText4);
        save.setOnClickListener(this);
        show.setOnClickListener(this);
        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);
        mEditor=sharedPreferences.edit();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){

            String str= name.getText().toString();
            String str1= Age.getText().toString();
            String str2= phone.getText().toString();
            String str3= city.getText().toString();


            SaveMyPreferences("KEY_STR",str);
            SaveMyPreferences("KEY_STR1",str1);
            SaveMyPreferences("KEY_STR2",str2);
            SaveMyPreferences("KEY_STR3",str3);

        }
        if(v.getId()==R.id.button2){
            Intent i=new Intent(this,INFORMATION.class);
            startActivity(i);
        }

    }

    private void SaveMyPreferences(String key_str, String str) {
        String str1= Age.getText().toString();
        String str2= phone.getText().toString();
        String str3= city.getText().toString();


        mEditor.putString("KEY_STR",str);
        mEditor.putString("KEY_STR1",str1);
        mEditor.putString("KEY_STR2",str2);
        mEditor.putString("KEY_STR3",str3);

        mEditor.apply();

    }
}
