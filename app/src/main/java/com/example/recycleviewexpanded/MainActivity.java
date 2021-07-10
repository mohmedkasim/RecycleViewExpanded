package com.example.recycleviewexpanded;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView booksRecView;
    private BooksRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new BooksRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"The Da Vinci Code","Dave", 100,"https://upload.wikimedia.org/wikipedia/en/thumb/e/e9/The_da_vinci_code_final.jpg/220px-The_da_vinci_code_final.jpg","short Description","Long Description"));
//        books.add(new Book(2,"The Da Vinci Code","Dave", 100,"https://upload.wikimedia.org/wikipedia/en/thumb/e/e9/The_da_vinci_code_final.jpg/220px-The_da_vinci_code_final.jpg","short Description","Long Description"));

        adapter.setBooks(books);
    }

}