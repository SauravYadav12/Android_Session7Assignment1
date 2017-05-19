package com.example.saurav.implicitintent;

import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity{

    EditText Txt;
    Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txt = (EditText) findViewById(R.id.Keyword);
        search = (Button) findViewById(R.id.btn);


                search.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String stest = Txt.getText().toString();
                        Intent webIntent = new Intent();
                        webIntent.setData(Uri.parse("https://www.google.co.in/#q="+stest));
                        startActivity(webIntent);
                    }
                });

    }
}
