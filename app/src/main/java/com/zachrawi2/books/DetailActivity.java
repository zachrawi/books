package com.zachrawi2.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView ivCover;
    private TextView tvTitle;
    private TextView tvSynopsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivCover = findViewById(R.id.ivCover);
        tvTitle = findViewById(R.id.tvTitle);
        tvSynopsis = findViewById(R.id.tvSynopsis);

        int cover = getIntent().getIntExtra("cover", 0);
        String title = getIntent().getStringExtra("title");
        String synopsis = getIntent().getStringExtra("synopsis");

        ivCover.setImageResource(cover);
        tvTitle.setText(title);
        tvSynopsis.setText(synopsis);
    }
}
