package com.tutorials.hp.circlemenuopenactivity.mPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tutorials.hp.circlemenuopenactivity.R;

public class PageThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_three);

        TextView valueTxt= (TextView) findViewById(R.id.threeTxt);
        valueTxt.setText(getIntent().getExtras().getString("KEY_DELETE"));


    }
}
