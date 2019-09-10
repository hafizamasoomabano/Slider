package info.androidhive.materialtabs.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import info.androidhive.materialtabs.R;

public class Isha_sunnah extends AppCompatActivity {
    private ViewPager viewPagers;
    private SlideAdapterISS myadapters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asrfard);
        viewPagers = (ViewPager) findViewById(R.id.viewpager);
        myadapters= new SlideAdapterISS(this);
        viewPagers.setAdapter(myadapters);
    }
}