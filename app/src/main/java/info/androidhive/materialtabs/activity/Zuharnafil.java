package info.androidhive.materialtabs.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import info.androidhive.materialtabs.R;

public class Zuharnafil extends AppCompatActivity {
    private ViewPager viewPagers;
    private SlideAdapterZN myadapters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zuharnafil);
        viewPagers = (ViewPager) findViewById(R.id.viewpager);
        myadapters= new SlideAdapterZN(this);
        viewPagers.setAdapter(myadapters);
    }
}