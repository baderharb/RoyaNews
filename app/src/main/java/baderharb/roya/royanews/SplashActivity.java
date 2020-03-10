package baderharb.roya.royanews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(() -> {
            try {
                sleep(3000);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        });
        thread.start();
    }
}
