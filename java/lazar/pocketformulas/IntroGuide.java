package lazar.pocketformulas;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

/**
 * Created by Lazar on 2/12/14.
 */
public class IntroGuide extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introguide);

        ViewPager pager = (ViewPager) findViewById(R.id.pagerIntroGuide);
        FragmentManager manager = getSupportFragmentManager();
        IntroGuideFragmentPager pagerAdapter = new IntroGuideFragmentPager(manager);
        pager.setAdapter(pagerAdapter);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.os.Process.killProcess(android.os.Process.myPid());
        super.onDestroy();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
}
