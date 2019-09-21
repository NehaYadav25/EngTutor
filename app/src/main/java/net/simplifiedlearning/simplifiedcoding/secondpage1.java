package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class secondpage1 extends AppCompatActivity {
    DatePicker simpleDatePicker;
    Button next;
    EditText fn, ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage1);



        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intObj = new Intent(secondpage1.this, thirdpage.class);
                startActivity(intObj);
            }


        });



        // initiate the date picker and a button
        simpleDatePicker = (DatePicker) findViewById(R.id.simpleDatePicker);


        // perform click event on submit button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the values for day of month , month and year from a date picker
                String day = "Day = " + simpleDatePicker.getDayOfMonth();
                String month = "Month = " + (simpleDatePicker.getMonth() + 1);
                String year = "Year = " + simpleDatePicker.getYear();
                // display the values by using a toast
                //Toast.makeText(getApplicationContext(), day + "\n" + month + "\n" + year, Toast.LENGTH_LONG).show();
                Intent intObj = new Intent(secondpage1.this,thirdpage.class);
                startActivity(intObj);
            }
        });





    }
}

