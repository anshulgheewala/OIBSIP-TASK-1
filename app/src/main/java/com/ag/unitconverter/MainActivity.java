package com.ag.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button b_gtokg,b_kgtog,b_ctof,b_ftoc,b_mtocm,b_cmtom,b_clr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edittext);
        textView=findViewById(R.id.result);
        b_gtokg=findViewById(R.id.gtokg);
        b_kgtog=findViewById(R.id.kgtog);
        b_ctof=findViewById(R.id.ctof);
        b_ftoc=findViewById(R.id.ftoc);
        b_cmtom=findViewById(R.id.cmtom);
        b_mtocm=findViewById(R.id.mtocm);
        b_clr=findViewById(R.id.clr);


      b_gtokg.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              gm_to_kg();
          }
      });
      b_kgtog.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              kg_to_gm();
          }
      });
      b_mtocm.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              m_to_cm();
          }
      });
      b_cmtom.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              cm_to_m();
          }
      });
      b_ftoc.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              f_to_c();
          }
      });
      b_ctof.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              c_to_f();
          }
      });
      b_clr.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              clr();
          }
      });

    }



    public void gm_to_kg(){

      String abc=editText.getText().toString();
      Float y=Float.parseFloat(abc)/1000;
      String z=Float.toString(y);
      textView.setText(z +" Kg");

    }
    public void kg_to_gm(){

        String abc=editText.getText().toString();
        Float y=Float.parseFloat(abc)*1000;
        String z=Float.toString(y);
        textView.setText(z +" gm");

    }
    public void m_to_cm(){

        String abc=editText.getText().toString();
        Float y=Float.parseFloat(abc)*100;
        String z=Float.toString(y);
        textView.setText(z +" cm");

    }
    public void cm_to_m(){

        String abc=editText.getText().toString();
        Float y=Float.parseFloat(abc)/100;
        String z=Float.toString(y);
        textView.setText(z +" m");

    }
    public void f_to_c(){

        String abc=editText.getText().toString();
        Float y=(Float.parseFloat(abc)-32)*5/9;
        String z=Float.toString(y);
        textView.setText(z +" C");

    }
    public void c_to_f(){

        String abc=editText.getText().toString();
        Float y=(Float.parseFloat(abc)+32)*9/5;
        String z=Float.toString(y);
        textView.setText(z +" F");

    }
    public void clr(){

        textView.setText("");

    }

}