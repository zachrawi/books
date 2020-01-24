package com.zachrawi2.books;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Book> {

    private Context mContext;
    private int mResource;
    private ArrayList<Book> mBooks;

    private static class ViewHolder {
        ImageView ivCover;
    }

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Book> books) {
        super(context, resource, books);

        mContext = context;
        mResource = resource;
        mBooks = books;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null) {
            convertView = layoutInflater.inflate(mResource, parent, false);

            viewHolder.ivCover = convertView.findViewById(R.id.ivCover);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Book book = mBooks.get(position);

        viewHolder.ivCover.setImageResource(book.getCover());

        return convertView;
    }
}
