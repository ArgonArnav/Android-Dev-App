package com.example.hp.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  public void buttonIsClicked(View buttonView){

    //  int result = 5 * 7;
    //  Log.i("OPERATION" , result + "");

      TextView text = findViewById(R.id.txt);
      Log.i("TAG" , text.getText().toString());

      EditText edtName = findViewById(R.id.edtName);
      Log.i("NAME",edtName.getText().toString());

       EditText edtPhoneNumber = findViewById(R.id.edtPhoneNumber);
       Log.i("PHONENUMBER", edtPhoneNumber.getText().toString());

        Toast.makeText(MainActivity.this, text.getText().toString(), Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"Your Name is: " + edtName.getText().toString() + "\n" + "Yor Phone Number is: " +edtPhoneNumber.getText().toString(),Toast.LENGTH_LONG).show();

     // ImageView myImage = findViewById(R.id.img);
     // myImage.setImageResource(R.drawable.dahlia);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
