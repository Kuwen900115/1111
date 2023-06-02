package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaDrm;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "My Application";
    EditText et1, et2;
    String account= "fuck",passed="6969";
    Button button1;
    //private lateinit var binding:ActivityMainBinding
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.editTextTextEmailAddress);
        et2=(EditText) findViewById(R.id.editTextTextPassword);
         button1=findViewById(R.id.button5);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent =new Intent(MainActivity.this,Activity_register.class);
                 startActivity(intent);
             }
         });

    }

    public void login(View v) {
        this.setTitle("確定按鈕已按下!" );
        Log.i(TAG, "按鈕已按下 ");
        if(account.equals(et1.getText().toString())&&passed.equals(et2.getText().toString())){
            Toast.makeText(this, "登入成功", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this , homeActivity.class);
            this.startActivity(intent);
            finish() ;
        }
        else {
            Toast.makeText(this, "登入失敗", Toast.LENGTH_SHORT).show();
        }
    }


}
