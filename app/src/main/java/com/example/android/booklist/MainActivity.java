package com.example.android.booklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    DatabaseReference db;
    Book_Model B[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView)findViewById(R.id.RV);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rv.setHasFixedSize(true);
        B = new Book_Model[5];


        db = FirebaseDatabase.getInstance().getReference().child("bookList");

        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int i = 0;
                for (DataSnapshot child : dataSnapshot.getChildren())
                {   Book_Model book_model=new Book_Model();
                    book_model.setAuth(child.child("author").getValue(String.class));
                    book_model.setBook(child.child("book").getValue(String.class));
                    B[i]=book_model;
                    i++;

                }
                Book_Adapter BA = new Book_Adapter(B);
                rv.setAdapter(BA);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {


            }
        }
        );


    }
}
