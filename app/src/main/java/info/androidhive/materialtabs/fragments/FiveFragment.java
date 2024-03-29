package info.androidhive.materialtabs.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Isha_nafil;
import info.androidhive.materialtabs.activity.Isha_sunnah;
import info.androidhive.materialtabs.activity.Ishafard;
import info.androidhive.materialtabs.activity.Ishanafil;
import info.androidhive.materialtabs.activity.Ishasunnah;
import info.androidhive.materialtabs.activity.Ishawitr;
import info.androidhive.materialtabs.activity.Zuhar_sunnah;
import info.androidhive.materialtabs.activity.Zuharfard;
import info.androidhive.materialtabs.activity.Zuharnafil;
import info.androidhive.materialtabs.activity.Zuharsunnah;


public class FiveFragment extends Fragment{
    Activity context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        return inflater.inflate(R.layout.fragment_five, container, false);
    }
    public void onStart(){
        super.onStart();
        Button btis=(Button)context.findViewById(R.id.btnOpenis);
        btis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Ishasunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenif=(Button)context.findViewById(R.id.btnOpenif);
        btnOpenif.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Ishafard.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpeniss=(Button)context.findViewById(R.id.btnOpeniss);
        btnOpeniss.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Isha_sunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenin=(Button)context.findViewById(R.id.btnOpenin);
        btnOpenin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Ishanafil.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpeniw=(Button)context.findViewById(R.id.btnOpeniw);
        btnOpeniw.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Ishawitr.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpeninn=(Button)context.findViewById(R.id.btnOpeninn);
        btnOpeninn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Isha_nafil.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
    }


}
