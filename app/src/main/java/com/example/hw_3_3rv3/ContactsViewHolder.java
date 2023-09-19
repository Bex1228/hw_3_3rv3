package com.example.hw_3_3rv3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    private TextView tvEmail;
    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_names);
        tvEmail = itemView.findViewById(R.id.tv_email);
    }

   public void bind(String name , String email ){
   tvName.setText(name);
   tvEmail.setText(email);
   }
}
