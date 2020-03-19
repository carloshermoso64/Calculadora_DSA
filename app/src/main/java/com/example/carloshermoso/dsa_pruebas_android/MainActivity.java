package com.example.carloshermoso.dsa_pruebas_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtdisplay;
    Button btac, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btpunto, btsuma, btresta, btmulti, btdivi,btigual;
    Double res, operand1, operand2;
    boolean op = false;
    boolean equal =false;
    int mode;
    DecimalFormat df = new DecimalFormat("###.#");
    NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtdisplay= (EditText) findViewById(R.id.txtdisplay);
        btac= (Button) findViewById(R.id.btac);

        bt1= (Button) findViewById(R.id.bt1);
        bt2= (Button) findViewById(R.id.bt2);
        bt3= (Button) findViewById(R.id.bt3);
        bt4= (Button) findViewById(R.id.bt4);
        bt5= (Button) findViewById(R.id.bt5);
        bt6= (Button) findViewById(R.id.bt6);
        bt7= (Button) findViewById(R.id.bt7);
        bt8= (Button) findViewById(R.id.bt8);
        bt9= (Button) findViewById(R.id.bt9);
        bt0= (Button) findViewById(R.id.bt0);
        btpunto= (Button) findViewById(R.id.btpunto);

        btsuma= (Button) findViewById(R.id.btsuma);
        btresta= (Button) findViewById(R.id.btresta);
        btmulti= (Button) findViewById(R.id.btmulti);
        btdivi= (Button) findViewById(R.id.btdivi);

        btigual=(Button) findViewById(R.id.btigual);


        btac.setOnClickListener(this);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        btpunto.setOnClickListener(this);


        btsuma.setOnClickListener(this);
        btresta.setOnClickListener(this);
        btmulti.setOnClickListener(this);
        btdivi.setOnClickListener(this);

        btigual.setOnClickListener(this);

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


        switch (v.getId()){
            case R.id.bt1:
                if (equal==true){
                    txtdisplay.setText("1");
                    equal=false;
                }
                else {
                    num = num + "1";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt2:
                if (equal==true){
                    txtdisplay.setText("2");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "2";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt3:
                if (equal==true){
                    txtdisplay.setText("3");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "3";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt4:
                if (equal==true){
                    txtdisplay.setText("4");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "4";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt5:
                if (equal==true){
                    txtdisplay.setText("5");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "5";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt6:
                if (equal==true){
                    txtdisplay.setText("6");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "6";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt7:
                if (equal==true){
                    txtdisplay.setText("7");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "7";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt8:
                if (equal==true){
                    txtdisplay.setText("8");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "8";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt9:
                if (equal==true){
                    txtdisplay.setText("9");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "9";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.bt0:
                if (equal==true){
                    txtdisplay.setText("0");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + "0";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.btpunto:
                if (equal==true){
                    txtdisplay.setText(".");
                    equal=false;
                }
                else {
                    num = txtdisplay.getText().toString();
                    num = num + ".";
                    txtdisplay.setText(num);
                }
                break;
            case R.id.btac:
                txtdisplay.setText("");
                equal = false;
                break;
            case R.id.btsuma:
                if (op == true){
                }
                else {
                    op = true;
                    mode = 1; //Suma mode 1
                    try {
                        operand1 = format.parse(txtdisplay.getText().toString()).doubleValue();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    txtdisplay.setText("");
                }
                break;
            case R.id.btresta:
                if (op == true){
                }
                else {
                    op = true;
                    mode = 2; //resta mode 2
                    try {
                        operand1 = format.parse(txtdisplay.getText().toString()).doubleValue();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    txtdisplay.setText("");
                }
                break;
            case R.id.btmulti:
                if (op == true){
                }
                else {
                    op = true;
                    mode = 3; //multiplicacion mode 3
                    try {
                        operand1 = format.parse(txtdisplay.getText().toString()).doubleValue();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    txtdisplay.setText("");
                }
                break;
            case R.id.btdivi:
                if (op == true){
                }
                else {
                    op = true;
                    mode = 4; //division mode 4
                    try {
                        operand1 = format.parse(txtdisplay.getText().toString()).doubleValue();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    txtdisplay.setText("");
                }
                break;

            case R.id.btigual:
                if (op==false){
                }
                else{
                    operand2 = Double.parseDouble(txtdisplay.getText().toString());
                    if (mode == 1){
                        res = operand1 + operand2;
                        txtdisplay.setText(df.format(res));
                        op = false;
                        equal = true;

                    }
                    if (mode == 2){
                        res = operand1 - operand2;
                        txtdisplay.setText(df.format(res));
                        op = false;
                        equal = true;

                    }
                    if (mode == 3){
                        res = operand1 * operand2;
                        txtdisplay.setText(df.format(res));
                        op = false;
                        equal = true;

                    }
                    if (mode == 4){
                        res = operand1 / operand2;
                        txtdisplay.setText(df.format(res));
                        op = false;
                        equal = true;

                    }

                }
                break;


        }

    }
}
