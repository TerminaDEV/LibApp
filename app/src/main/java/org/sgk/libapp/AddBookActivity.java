package org.sgk.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
    }

    public void onAddBookClick(View view) {
        EditText year = findViewById(R.id.editTextYear);
        EditText title = findViewById(R.id.editTextTitle);
        EditText author = findViewById(R.id.editTextAuthor);

        if(year.getText().toString().equals("")||
           title.getText().toString().equals("")||
           author.getText().toString().equals("")) return;

        BookListActivity.books.add(new String[]{year.getText().toString(),
                                                title.getText().toString(),
                                                author.getText().toString()});
    }

    public void onAddBookReturnButtonClick(View view){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}