package info.androidhive.materialtabs.activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.androidhive.materialtabs.R;

public class Fajrsunnah extends AppCompatActivity {
    private ViewPager viewPager;
    private SlideAdapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fajarsunnah);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        myadapter= new SlideAdapter(this);
        viewPager.setAdapter(myadapter);

    }
}