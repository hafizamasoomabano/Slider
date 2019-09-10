package info.androidhive.materialtabs.activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import info.androidhive.materialtabs.R;

public class Maghribfard extends AppCompatActivity {
    private ViewPager viewPagers;
    private SlideAdapterMF myadapters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maghribfard);
        viewPagers = (ViewPager) findViewById(R.id.viewpager);
        myadapters= new SlideAdapterMF(this);
        viewPagers.setAdapter(myadapters);
    }
}