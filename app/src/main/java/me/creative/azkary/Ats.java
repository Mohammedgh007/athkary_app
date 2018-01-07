package me.creative.azkary;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Ats extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ats);
        Button ats_but_sub= (Button) findViewById(R.id.alt_button_sub);
        Button ats_but_ats= (Button) findViewById(R.id.alt_button_afs);
        Button ats_but_muss= (Button) findViewById(R.id.alt_button_mus);
        Button ats_but_sle= (Button) findViewById(R.id.alt_button_sle);
        Button ats_but_tra= (Button) findViewById(R.id.alt_button_tra);

        ats_but_sub.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Ats.this,Sub.class);
                startActivity(a);

            }});
        ats_but_ats.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Ats.this,Ats.class);
                startActivity(a);

            }});
        ats_but_muss.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Ats.this,Muss.class);
                startActivity(a);

            }});
        ats_but_sle.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Ats.this,Sle.class);
                startActivity(a);

            }});
        ats_but_tra.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Ats.this,Tra.class);
                startActivity(a);

            }});
    }

}
