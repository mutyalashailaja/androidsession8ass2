package com.example.admin.preferencesassignment2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class INFORMATION extends AppCompatActivity {
    TextView name2;
    TextView age2;
    TextView phone2;
    TextView city2;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        name2=(TextView) findViewById(R.id.textView);
        age2=(TextView) findViewById(R.id.textView2);
        phone2=(TextView) findViewById(R.id.textView3);
        city2=(TextView) findViewById(R.id.textView4);
        loadMyPreferences();

    }

    private void loadMyPreferences() {

        sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this);

        String ld_str=sharedPreferences.getString("KEY_STR","");
        String ld_str1=sharedPreferences.getString("KEY_STR1","");
        String ld_str2=sharedPreferences.getString("KEY_STR2","");
        String ld_str3=sharedPreferences.getString("KEY_STR3","");
        name2.setText(ld_str);
        age2.setText(ld_str1);
        phone2.setText(ld_str2);
        city2.setText(ld_str3);


    }
}
