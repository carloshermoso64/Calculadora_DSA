package com.example.carloshermoso.dsa_pruebas_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtdisplay;
    Button bt1, bt2, btac, btsuma;
    public double operan1, operan2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtdisplay= (EditText) findViewById(R.id.txtdisplay);
        bt1= (Button) findViewById(R.id.bt1);
        bt2= (Button) findViewById(R.id.bt2);
        btac= (Button) findViewById(R.id.btac);
        btsuma= (Button) findViewById(R.id.btsuma);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        btac.setOnClickListener(this);
        btsuma.setOnClickListener(this);

    }



/*    public void bt1(View v){
        String cap = pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }
    public void bt2(View v){
        String cap = pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);
    }*/

    @Override
    public void onClick(View v) {
        String num = txtdisplay.getText().toString();
        Double res = 0.0;

        switch (v.getId()){
            case R.id.bt1:
                num=num+"1";
                txtdisplay.setText(num);
                break;
            case R.id.bt2:
                num = txtdisplay.getText().toString();
                num=num+"2";
                txtdisplay.setText(num);
                break;
            case R.id.btac:
                txtdisplay.setText("");
                break;
            case R.id.btsuma:
                res= Double.parseDouble(txtdisplay.getText().toString()) + res;
                txtdisplay.setText("");
                break;


        }

    }
}
