package com.example.codepath_prework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap button to change color of text in label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change text color of label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.purple_500));

            }
        });

        // User can tap button to change color of background
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_cyan));
            }

        });

        // User can tap button to change text
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("CodePath is Cool!");
            }
        });

        // User can tap on background view to reset all views to default

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1. Reset text to "Hello Sonia!"
                    //id: @id/text
                textView.setText("Hello Sonia!");
                //2. Reset color of text to original color
                    // original text color: black, text id: @id/text
                textView.setTextColor(getResources().getColor(R.color.black));
                //3. Reset background color to original color
                    // original background color: R.color.light_pink
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_pink));
            }
        });

        // User can tap "Click to change to your custom text" button to update the label with custom text from the text field

        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change text view to text in edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}