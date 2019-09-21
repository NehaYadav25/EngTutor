package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class fourthpage extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthpage);

        Calendar c = Calendar.getInstance();
        Button b;

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        Toast.makeText(this, formattedDate, Toast.LENGTH_SHORT).show();
        TextView txtView = new TextView(this);
        txtView.setText("Insertion Date  : " + formattedDate);
        txtView.setGravity(Gravity.CENTER);
        txtView.setTextSize(20);
        setContentView(txtView);

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if user pressed on button register
                //here we will check the registeration to server

                //checkreg();
                Toast.makeText(getApplicationContext(),  "Waiting for completion. " +
                        "Login to check status", Toast.LENGTH_SHORT).show();

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));

        }
    });

       /* private void checkreg() {

           //enter email again.
            //If email exists vreg status is 0


        }

        */














    }

}



