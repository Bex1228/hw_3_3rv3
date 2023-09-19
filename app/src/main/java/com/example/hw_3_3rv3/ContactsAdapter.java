package com.example.hw_3_3rv3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {

private ArrayList <Contacts> contactsList;

    public ContactsAdapter(ArrayList<Contacts> contacts) {
        this.contactsList = contacts;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacts,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
    Contacts contacts =contactsList.get(position);
    holder.bind(contacts.getName(), contacts.getEmail());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }
}
