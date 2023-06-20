package com.example.menubardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_bar);
    }

    //to show  the option on menu bar
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.option_menubar,menu);

        //tro make icon visible
        if(menu instanceof MenuBuilder)
        {
            //store in menubuilder
            MenuBuilder m = (MenuBuilder) menu;
            //typecast
            m.setOptionalIconsVisible(true);

        }
        return true;
    }

    //to add onclick on option

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int item_id = item.getItemId();
        if (item_id == R.id.option_one) {
            Toast.makeText(this, "Option one clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.option_two) {
            Toast.makeText(this, "Opotion Two Clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item_id == R.id.option_three) {
            Toast.makeText(this, "Option Three Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item_id == R.id.home) {
            Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
       return super.onOptionsItemSelected(item);

         /*switch (item_id)
        {
                case R.id.option_one:
                Toast.makeText(this, "Option one clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option_two:
                Toast.makeText(this, "Opotion Two Clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option_three:
                Toast.makeText(this, "Option Three Clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
    }


    }