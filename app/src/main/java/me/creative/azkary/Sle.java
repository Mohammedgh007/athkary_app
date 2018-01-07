package me.creative.azkary;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Sle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sle);
        Button sle_but_sub= (Button) findViewById(R.id.sle_button_sub);
        Button sle_but_ats= (Button) findViewById(R.id.sle_button_afs);
        Button sle_but_muss= (Button) findViewById(R.id.sle_button_mus);
        Button sle_but_sle= (Button) findViewById(R.id.sle_button_sle);
        Button sle_but_tra= (Button) findViewById(R.id.sle_button_tra);

        sle_but_sub.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sle.this,Sub.class);
                startActivity(a);

            }});
        sle_but_ats.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sle.this,Ats.class);
                startActivity(a);

            }});
        sle_but_muss.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sle.this,Muss.class);
                startActivity(a);

            }});
        sle_but_sle.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sle.this,Sle.class);
                startActivity(a);

            }});
        sle_but_tra.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sle.this,Tra.class);
                startActivity(a);

            }});
    }

}
