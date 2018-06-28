package com.example.android.booklist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hp on 3/27/2018.
 */

public class Book_Adapter extends RecyclerView.Adapter<Book_ViewHolder>{
    Book_Model B[];

    public Book_Adapter(Book_Model[] b) {
        B = b;
    }

    @Override
    public Book_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate(R.layout.item_book,null);

        Book_ViewHolder bvh = new Book_ViewHolder(view);
        return bvh;
    }

    @Override
    public void onBindViewHolder(Book_ViewHolder holder, int position) {
        holder.book.setText(B[position].getBook()); // <--- THIS LINE
        holder.author.setText(B[position].getAuth());
    }

    @Override
    public int getItemCount() {
        return B.length;
    }

}
