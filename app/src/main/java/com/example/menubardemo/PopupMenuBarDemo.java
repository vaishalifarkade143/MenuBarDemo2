package com.example.menubardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuBarDemo extends AppCompatActivity
{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu_bar);

        btn=(Button) findViewById(R.id.btn);
        //if we are not adding onClick evennt on butten then we write this code

       /*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                PopupMenu popupMenu = new PopupMenu(PopupMenuBarDemo.this,btn);
                //PopupMenuBarDemo popupMenuBarDemo =new PopupMenuBarDemo();
                popupMenu.getMenuInflater().inflate(R.menu.popupmenus,popupMenu.getMenu());
                popupMenu.show();
            }
        });*/
    }
    //method created to perfform onclick
    void openPopupMenu(View view)
    {
        PopupMenu popupMenu = new PopupMenu(PopupMenuBarDemo.this,btn);
        popupMenu.getMenuInflater().inflate(R.menu.popupmenus,popupMenu.getMenu());
        //to perform event

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                //Toast.makeText(PopupMenuBarDemo.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                int id=item.getItemId();
                if (id == R.id.menu1) {
                    Toast.makeText(PopupMenuBarDemo.this, "menu 1 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.menu2) {
                    Toast.makeText(PopupMenuBarDemo.this, "menu 2 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.menu3) {
                    Toast.makeText(PopupMenuBarDemo.this, "menu 3 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }

                return true;
            }
        });

        popupMenu.show();
    }
}