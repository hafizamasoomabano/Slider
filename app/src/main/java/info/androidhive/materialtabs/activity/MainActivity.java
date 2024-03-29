package info.androidhive.materialtabs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import info.androidhive.materialtabs.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button  btnScrollableTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnScrollableTabs = (Button) findViewById(R.id.btnScrollableTabs);



        btnScrollableTabs.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btnScrollableTabs:
                startActivity(new Intent(MainActivity.this, ScrollableTabsActivity.class));

        }
    }
}
