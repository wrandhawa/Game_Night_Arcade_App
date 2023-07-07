package com.example.databasetictoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class coinflip extends AppCompatActivity {
    String input = "";
    int wins;
    int losses = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coinflip);

    }
    public String flip() {
        String s = "";
        if (Math.random() < 0.5) {
            s = "heads";
        } else {
            s = "tails";
        }
        return s;
    }

    public void heads(View v) {
        input = "heads";
        v.setEnabled(false);
        ((Button) findViewById(R.id.tails)).setEnabled(true);

    }

    public void tails(View v) {
        input = "tails";
        v.setEnabled(false);
        ((Button) findViewById(R.id.heads)).setEnabled(true);

    }

    public void flip2(View v) {
        String s = this.flip();
        if (input.equals(s)) {
            TextView tv = findViewById(R.id.textView7);
            wins++;
            String ws = Integer.toString(wins);
            ((TextView)findViewById(R.id.textView7)).setText(ws);
            Toast.makeText(this, "You Have Won", Toast.LENGTH_LONG).show();
        } else {
            String ls = Integer.toString(losses);
            losses++;
            ((TextView)findViewById(R.id.textView8)).setText(ls);
            Toast.makeText(this, "You Have Lost", Toast.LENGTH_LONG).show();}

        TextView tv = findViewById(R.id.textView7);
        ((Button) findViewById(R.id.heads)).setEnabled(true);
        ((Button) findViewById(R.id.tails)).setEnabled(true);
    }
    public void reset (View v){
        ((TextView) findViewById(R.id.textView7)).setText("0");
        wins =0;
        losses=0;
        ( (TextView) findViewById(R.id.textView8)).setText("0");
        ((Button) findViewById(R.id.heads)).setEnabled(true);
        ((Button) findViewById(R.id.tails)).setEnabled(true);
    }
}
