package me.creative.azkary;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Muss extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muss);
        Button muss_but_sub= (Button) findViewById(R.id.muss_button_sub);
        Button muss_but_ats= (Button) findViewById(R.id.muss_button_afs);
        Button muss_but_muss= (Button) findViewById(R.id.muss_button_mus);
        Button muss_but_sle= (Button) findViewById(R.id.muss_button_sle);
        Button muss_but_tra= (Button) findViewById(R.id.muss_button_tra);

        muss_but_sub.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Muss.this,Sub.class);
                startActivity(a);

            }});
        muss_but_ats.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Muss.this,Ats.class);
                startActivity(a);

            }});
        muss_but_muss.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Muss.this,Muss.class);
                startActivity(a);

            }});
        muss_but_sle.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Muss.this,Sle.class);
                startActivity(a);

            }});
        muss_but_tra.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Muss.this,Tra.class);
                startActivity(a);

            }});
    }

}
