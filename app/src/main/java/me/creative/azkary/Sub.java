package me.creative.azkary;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Sub extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        Button sub_but_sub= (Button) findViewById(R.id.sub_button_sub);
        Button sub_but_ats= (Button) findViewById(R.id.sub_button_afs);
        Button sub_but_muss= (Button) findViewById(R.id.sub_button_mus);
        Button sub_but_sle= (Button) findViewById(R.id.sub_button_sle);
        Button sub_but_tra= (Button) findViewById(R.id.sub_button_tra);

        sub_but_sub.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sub.this,Sub.class);
                startActivity(a);

            }});
        sub_but_ats.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sub.this,Ats.class);
                startActivity(a);

            }});
        sub_but_muss.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sub.this,Muss.class);
                startActivity(a);

            }});
        sub_but_sle.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sub.this,Sle.class);
                startActivity(a);

            }});
        sub_but_tra.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent a= new Intent(Sub.this,Tra.class);
                startActivity(a);

            }});


    }

}
