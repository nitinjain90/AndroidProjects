package com.example.nitin.myappportfolio.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mClickbutton1 = (Button)findViewById(R.id.button1);
        mClickbutton1.setOnClickListener(this);

        Button mClickbutton2 = (Button)findViewById(R.id.button2);
        mClickbutton1.setOnClickListener(this);

        Button mClickbutton3 = (Button)findViewById(R.id.button3);
        mClickbutton1.setOnClickListener(this);

        Button mClickbutton4 = (Button)findViewById(R.id.button4);
        mClickbutton1.setOnClickListener(this);

        Button mClickbutton5 = (Button)findViewById(R.id.button5);
        mClickbutton1.setOnClickListener(this);

        Button mClickbutton6 = (Button)findViewById(R.id.button6);
        mClickbutton1.setOnClickListener(this);
        
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

    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.button1: {
                Context context = getApplicationContext();
                CharSequence text = "This Button will launch Spotify Streamer";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration );
                toast.show();

                break;
            }

            case R.id.button2: {
                Context context = getApplicationContext();
                CharSequence text = "This Button will launch Scores App";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration );
                toast.show();
                break;
            }

            case R.id.button3: {
                Context context = getApplicationContext();
                CharSequence text = "This Button will launch Library App";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration );
                toast.show();

                break;
            }

            case R.id.button4: {
                Context context = getApplicationContext();
                CharSequence text = "This Button will launch Build It Bigger";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration );
                toast.show();

                break;
            }

            case R.id.button5: {
                Context context = getApplicationContext();
                CharSequence text = "This Button will launch XYZ Reader";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration );
                toast.show();

                break;
            }

            case R.id.button6: {
                Context context = getApplicationContext();
                CharSequence text = "This Button will launch Capstone:My Own App";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration );
                toast.show();

                break;
            }

        }
    }
}
