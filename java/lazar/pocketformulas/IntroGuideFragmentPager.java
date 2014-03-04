package lazar.pocketformulas;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Lazar on 2/12/14.
 */
public class IntroGuideFragmentPager extends FragmentPagerAdapter {

    final int PAGES = 3;

    public IntroGuideFragmentPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            default:
                return null;

            case 0:
                return new Lazarko();
            case 1:
                return new Guide();
            case 2:
                return new Thanks();
        }
    }

    public static class Lazarko extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.guide_welcome, null);
            RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.guide_welcome, container, false);
            TextView helloGeek = (TextView) layout.findViewById(R.id.helloGeek);
            TextView meetLazarko = (TextView) layout.findViewById(R.id.meetLazarko);
            TextView heWill = (TextView) layout.findViewById(R.id.heWill);
            Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bariol.otf");
            helloGeek.setTypeface(font);
            meetLazarko.setTypeface(font);
            heWill.setTypeface(font);
            return layout;
        }
    }

    public static class Guide extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.guide_guide, null);
            RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.guide_guide, container, false);
            TextView tvGuide = (TextView) layout.findViewById(R.id.tvGuide);
            Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bariol.otf");
            tvGuide.setTypeface(font);
            return layout;
        }
    }

    public static class Thanks extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.guide_thanks, null);
            RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.guide_thanks, container, false);
            TextView youDidIt = (TextView) layout.findViewById(R.id.youDidIt);
            TextView endOfTheGuide = (TextView) layout.findViewById(R.id.endOfTheGuide);
            Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "Bariol.otf");
            youDidIt.setTypeface(font);
            endOfTheGuide.setTypeface(font);

            Button bProceed = (Button) layout.findViewById(R.id.bProceed);
            bProceed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent("android.intent.action.AfterGuide");
                    startActivity(intent);
                }
            });
            return layout;
        }
    }

    @Override
    public int getCount() {
        return PAGES;
    }
}
