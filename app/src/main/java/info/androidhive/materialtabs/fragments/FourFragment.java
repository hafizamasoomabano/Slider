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
import info.androidhive.materialtabs.activity.Maghribfard;
import info.androidhive.materialtabs.activity.Maghribnafil;
import info.androidhive.materialtabs.activity.Maghribsunnah;
import info.androidhive.materialtabs.activity.Zuhar_sunnah;
import info.androidhive.materialtabs.activity.Zuharfard;
import info.androidhive.materialtabs.activity.Zuharnafil;
import info.androidhive.materialtabs.activity.Zuharsunnah;


public class FourFragment extends Fragment{
    Activity context;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context=getActivity();
        return inflater.inflate(R.layout.fragment_four, container, false);
    }
    public void onStart(){
        super.onStart();
        Button btmf=(Button)context.findViewById(R.id.btnOpenmf);
        btmf.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Maghribfard.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenms=(Button)context.findViewById(R.id.btnOpenms);
        btnOpenms.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Maghribsunnah.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
        Button btnOpenmn=(Button)context.findViewById(R.id.btnOpenmn);
        btnOpenmn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //create an Intent object
                Intent intent=new Intent(context, Maghribnafil.class);
                //add data to the Intent object
                //start the second activity
                startActivity(intent);
            }

        });
    }


}
