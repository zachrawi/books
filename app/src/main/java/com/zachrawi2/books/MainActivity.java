package com.zachrawi2.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Book> mBooks;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        mBooks = new ArrayList<>();
        mBooks.add(new Book(R.drawable.cover1, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover2, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover3, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover4, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover5, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover6, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover7, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover8, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover9, "Title 1", "Synopsis blabla blabla"));
        mBooks.add(new Book(R.drawable.cover10, "Title 1", "Synopsis blabla blabla"));

        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.item_book, mBooks);

        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Book book = mBooks.get(position);

                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("cover", book.getCover());
                intent.putExtra("title", book.getTitle());
                intent.putExtra("synopsis", book.getSynopsis());

                startActivity(intent);
            }
        });
    }
}
