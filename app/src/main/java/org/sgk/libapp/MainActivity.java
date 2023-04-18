package org.sgk.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("lol");
    }

    public void onButtonBookListClick(View view){
        Intent myIntent = new Intent(this, BookListActivity.class);
        this.startActivity(myIntent);
    }

    public void onButtonAddBookClick(View view){
        Intent myIntent = new Intent(this, AddBookActivity.class);
        this.startActivity(myIntent);
    }
}