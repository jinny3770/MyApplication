package com.example.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = (Button) findViewById(R.id.but1);
        b2 = (Button) findViewById(R.id.but2);
        b3 = (Button) findViewById(R.id.but3);
        b4 = (Button) findViewById(R.id.but4);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("http://www.nate.com"));
                startActivity(intent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:911"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                Uri uri = Uri.parse("content://media/external/images/media");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
