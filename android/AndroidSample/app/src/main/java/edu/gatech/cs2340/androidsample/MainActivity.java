package edu.gatech.cs2340.androidsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * This method will be called when the button is pressed.
     * add JavaDocs to your heart's content
     */
    public void doSomething(View view) {
        Intent intent = new Intent(this, NextActivity.class);
        EditText text = (EditText) findViewById(R.id.editText);
        String name = text.getText().toString();
        intent.putExtra("NAME", name);
        startActivity(intent);
    }
}
