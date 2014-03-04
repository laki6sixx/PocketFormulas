package lazar.pocketformulas;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

/**
 * Created by Lazar on 2/12/14.
 */
public class Splash extends Activity {

    Typeface bariol;
    TextView tvPocket;
    Intent intent;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        bariol = Typeface.createFromAsset(getAssets(), "Bariol.otf");
        tvPocket = (TextView) findViewById(R.id.tvPocketFormulas);
        tvPocket.setTypeface(bariol);

        timer();
    }

    private void timer() {
        // TODO Auto-generated method stub
        Thread timer = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                    boolean startedBefore = prefs.getBoolean(getString(R.string.startedBefore), false);
                    if (!startedBefore) {
                        SharedPreferences.Editor edit = prefs.edit();
                        edit.putBoolean(getString(R.string.startedBefore), Boolean.TRUE);
                        edit.commit();
                        intent = new Intent("android.intent.action.IntroGuide");
                        startActivity(intent);
                        finish();
                    } else {
                        intent = new Intent("android.intent.action.AfterGuide");
                        startActivity(intent);
                        finish();
                    }
                }
            }
        };
        timer.start();
    }

}
