package com.example.hw_3_3rv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<Contacts> contacts= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycle_view);
        loadData();
        ContactsAdapter adapter =new ContactsAdapter(contacts);
       rv.setAdapter(adapter);
    }

    private void loadData() {
        contacts.add(new Contacts("Vasya", "vaseafjsiovjs@gmail.com"));
        contacts.add(new Contacts("Max", "maksat3535@gmail.com"));
        contacts.add(new Contacts("Beka", "bekzatokfdg34@gmail.com"));
        contacts.add(new Contacts("Aidar", "aidarhagha@gmail.com"));
        contacts.add(new Contacts("Bektur", "neserioznyi@gmail.com"));
        contacts.add(new Contacts("Nurs", "dfgfhgngfn@gmail.com"));
        contacts.add(new Contacts("Baha", "niger34325@gmail.com"));
        contacts.add(new Contacts("Erbol", "Erbolino@gmail.com"));
        contacts.add(new Contacts("Karina", "karina@gmail.com"));
        contacts.add(new Contacts("Margarita", "rita09090@gmail.com"));
        contacts.add(new Contacts("Rodion", "rodnooy@gmail.com"));

    }


}