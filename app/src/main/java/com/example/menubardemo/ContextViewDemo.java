package com.example.menubardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import kotlin.jvm.internal.TypeIntrinsics;

public class ContextViewDemo extends AppCompatActivity
{

    ListView contact_list;
    String[] contact={"Prachi","Shree", "vivek0"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_view_demo);

        contact_list=(ListView) findViewById(R.id.contact_list);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,contact);
        contact_list.setAdapter(adapter);
        registerForContextMenu(contact_list);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menubar,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id == R.id.call)
        {
            Toast.makeText(this, "calling", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.message) {
            Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onContextItemSelected(item);


    }
}