package com.example.android.booklist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Hp on 3/27/2018.
 */

public class Book_ViewHolder extends RecyclerView.ViewHolder {
    TextView book;
    TextView author;

    public Book_ViewHolder(View itemView) {
        super(itemView);

        book = (TextView) itemView.findViewById(R.id.BookName);
        author = (TextView) itemView.findViewById(R.id.AuthorName);
    }
}
