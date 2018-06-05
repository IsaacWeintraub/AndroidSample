package edu.gatech.cs2340.androidsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // You will need to add the code below.
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        TextView textView = findViewById(R.id.textView2);
        textView.setText(embellish(name));
    }

    private String embellish(String name) {
        String ret = "";
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < name.length(); j++) {
                ret += name.charAt((j - i + name.length()) % name.length());
            }
            if (i != name.length() - 1) {
                ret += "\n";
            }
        }
        return ret;
    }
}
