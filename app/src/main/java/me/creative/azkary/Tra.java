package me.creative.azkary;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Tra extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tra);
        Button tra_but_sub= (Button) findViewById(R.id.tra_button_sub);
        Button tra_but_ats= (Button) findViewById(R.id.tra_button_afs);
        Button tra_but_muss= (Button) findViewById(R.id.tra_button_mus);
        Button tra_but_sle= (Button) findViewById(R.id.tra_button_sle);
        Button tra_but_tra= (Button) findViewById(R.id.tra_button_tra);

        tra_but_sub.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Tra.this,Sub.class);
                startActivity(a);

            }});
        tra_but_ats.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Tra.this,Ats.class);
                startActivity(a);

            }});
        tra_but_muss.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Tra.this,Muss.class);
                startActivity(a);

            }});
        tra_but_sle.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Tra.this,Sle.class);
                startActivity(a);

            }});
        tra_but_tra.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Tra.this,Tra.class);
                startActivity(a);

            }});
    }

}
