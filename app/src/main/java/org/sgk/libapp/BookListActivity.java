package org.sgk.libapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookListActivity extends AppCompatActivity {

    public static ArrayList<String[]> books = new ArrayList<String[]>();

    //TODO Мы не смогли сделать поиск по атрибутам :(
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        sortArrayListByIndex(books, 1);
    }

    public void sortArrayListByIndex(ArrayList<String[]> arrayList, int index) {
        Collections.sort(arrayList,new Comparator<String[]>() {
            public int compare(String[] strings, String[] otherStrings) {
                return strings[index].compareTo(otherStrings[index]);
            }
        });
        ArrayList<String> temp = new ArrayList<>();
        for (String[] sa : arrayList) {
            temp.add(sa[0] + " " + sa[1] + " " + sa[2]);
        }
        ListView booklist = findViewById(R.id.listViewBooks);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, temp);

        booklist.setAdapter(adapter);
    }

    public void sortBookListByYear(View view) {
        sortArrayListByIndex(books, 0);
    }

    public void sortBookListByTitle(View view) {
        sortArrayListByIndex(books, 1);
    }

    public void sortBookListByAuthor(View view) {
        sortArrayListByIndex(books, 2);
    }

    public void onButtonBookListReturnClick(View view){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}