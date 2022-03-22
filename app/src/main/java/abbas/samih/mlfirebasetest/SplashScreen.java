package abbas.samih.mlfirebasetest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import abbas.samih.mlfirebasetest.FullExample.BaseActivity;

public class SplashScreen extends AppCompatActivity
{
private TextView tvWelcome;
private ImageView imview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Thread 1.

        Thread th = new Thread() {
            //Thread 2.
            @Override
            public void run() {
                // هنا المقطع الذي سيعمل بالتزامن مع مقاطع اخرى
                //Thread 3.
                int ms = 3 * 1000;// miiliseconds
                try {
                    sleep(ms);
                    startActivity(new Intent(getApplicationContext(), BaseActivity.class));
                }
                catch (InterruptedException e)
                {


                    e.printStackTrace();
                }
            }
        };
        // Thread 4.
        th.start();
        imview = findViewById(R.id.imview);

    }
}
