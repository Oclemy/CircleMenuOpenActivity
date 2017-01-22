package com.tutorials.hp.circlemenuopenactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;
import com.tutorials.hp.circlemenuopenactivity.mPages.PageOne;
import com.tutorials.hp.circlemenuopenactivity.mPages.PageThree;
import com.tutorials.hp.circlemenuopenactivity.mPages.PageTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView icon=new ImageView(this);
        icon.setImageResource(R.drawable.add_green);
        final FloatingActionButton fab=new FloatingActionButton.Builder(this).setContentView(icon).build();

        SubActionButton.Builder builder=new SubActionButton.Builder(this);

        ImageView deleteIcon=new ImageView(this);
        deleteIcon.setImageResource(R.drawable.delete_red);
        SubActionButton deleteBtn=builder.setContentView(deleteIcon).build();

        ImageView removeIcon=new ImageView(this);
        removeIcon.setImageResource(R.drawable.remove);
        SubActionButton removeBtn=builder.setContentView(removeIcon).build();


        ImageView addIcon=new ImageView(this);
        addIcon.setImageResource(R.drawable.save);
        SubActionButton addBtn=builder.setContentView(addIcon).build();

        final FloatingActionMenu fam=new FloatingActionMenu.Builder(this)
                .addSubActionView(addBtn)
                .addSubActionView(removeBtn)
                .addSubActionView(deleteBtn)
                .attachTo(fab)
                .build();


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Add Clicked", Toast.LENGTH_SHORT).show();
                fam.close(true);

                Intent i=new Intent(MainActivity.this, PageOne.class);
                i.putExtra("KEY_ADD","add");
                MainActivity.this.startActivity(i);
            }
        });
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Remove Clicked", Toast.LENGTH_SHORT).show();
                fam.close(true);

                Intent i=new Intent(MainActivity.this, PageTwo.class);
                i.putExtra("KEY_REMOVE","remove");
                MainActivity.this.startActivity(i);
            }
        });
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Delete Clicked", Toast.LENGTH_SHORT).show();
                fam.close(true);

                Intent i=new Intent(MainActivity.this, PageThree.class);
                i.putExtra("KEY_DELETE","delete");
                MainActivity.this.startActivity(i);
            }
        });

    }
}
