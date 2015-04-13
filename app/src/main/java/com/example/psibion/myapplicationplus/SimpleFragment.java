package com.example.psibion.myapplicationplus;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.psibion.myapplicationplus.R;

import java.lang.Math;

public class SimpleFragment extends Fragment implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnBksp, btnC, btnPlusMinus, btnEquals, btnDiv,
            btnMultiply, btnDot, btnPlus, btnMinus;
    public EditText display;

    String operation = "clear";
    float tempNumb=0;
    float num1=0;
    int num2=0;
    float result=0;

    public SimpleFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.simple_fragment, container, false);
        btn1 = (Button) rootView.findViewById(R.id.btn1);
        btn2 = (Button) rootView.findViewById(R.id.btn2);
        btn3 = (Button) rootView.findViewById(R.id.btn3);
        btn4 = (Button) rootView.findViewById(R.id.btn4);
        btn5 = (Button) rootView.findViewById(R.id.btn5);
        btn6 = (Button) rootView.findViewById(R.id.btn6);
        btn7 = (Button) rootView.findViewById(R.id.btn7);
        btn8 = (Button) rootView.findViewById(R.id.btn8);
        btn9 = (Button) rootView.findViewById(R.id.btn9);
        btn0 = (Button) rootView.findViewById(R.id.btn0);

        btnBksp = (Button) rootView.findViewById(R.id.btnBks);
        btnC = (Button) rootView.findViewById(R.id.btnC);
        btnPlusMinus = (Button) rootView.findViewById(R.id.btnPlusMinus);
        btnEquals = (Button) rootView.findViewById(R.id.btnRowne);
        btnDiv = (Button) rootView.findViewById(R.id.btnDzielenie);
        btnMultiply = (Button) rootView.findViewById(R.id.btnRazy);
        btnDot = (Button) rootView.findViewById(R.id.btnKropka);
        btnPlus = (Button) rootView.findViewById(R.id.btnPlus);
        btnMinus = (Button) rootView.findViewById(R.id.btnMinus);
        display = (EditText ) rootView.findViewById(R.id.display);
        display.setKeyListener(null);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnBksp.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnPlusMinus.setOnClickListener(this);
        btnEquals.setOnClickListener(this);

        btnDiv.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);

        return rootView;
    }

    public void operation()
    {

        if (operation.equals("+")) {
            result = tempNumb + Float.parseFloat(display.getText().toString().substring(1));
            display.setText(Float.toString(result));
        }

        else if (operation.equals("-")) {
            result = tempNumb - Float.parseFloat(display.getText().toString().substring(1));
            display.setText(Float.toString(result));
        }


        else if (operation.equals("*")) {
            result = tempNumb * Float.parseFloat(display.getText().toString().substring(1));
            display.setText(Float.toString(result));
        }

        else if (operation.equals("/")) {
            if(display.getText().toString().substring(1).equals("0")){
                Context context = getActivity().getApplicationContext();
                Toast t =  Toast.makeText(context, "Błąd! Dzielisz przez 0.", Toast.LENGTH_LONG);
                t.show();
            }
        }

        else if (operation.equals("clear")) {
            display.setText("0");
        }
    }


    @Override
    public void onClick(View arg0) {
        Editable str  = display.getText();
        String temp="0 ";
        switch (arg0.getId()) {
            case R.id.btn1:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn1.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn1.getText());
                }
                else
                {
                    str = str.append(btn1.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn2:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn2.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn2.getText());
                }
                else
                {
                    str = str.append(btn2.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn3:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn3.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn3.getText());
                }
                else
                {
                    str = str.append(btn3.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn4:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn4.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn4.getText());
                }
                else
                {
                    str = str.append(btn4.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn5:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn5.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn5.getText());
                }
                else
                {
                    str = str.append(btn5.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn6:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn6.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn6.getText());
                }
                else
                {
                    str = str.append(btn6.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn7:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn7.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn7.getText());
                }
                else
                {
                    str = str.append(btn7.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn8:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn8.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn8.getText());
                }
                else
                {
                    str = str.append(btn8.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn9:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn9.getText());
                    display.setText(str);
                }
                else if (temp.startsWith("0")){
                    display.setText(btn9.getText());
                }
                else
                {
                    str = str.append(btn9.getText());
                    display.setText(str);
                }
                break;
            case R.id.btn0:
                if (num2 != 0) {
                    num2 = 0;
                    display.setText("");
                }
                temp = String.valueOf(display.getText());
                if(temp.contains("0.")){
                    str = str.append(btn0.getText());
                    display.setText(str);
                }
                else if(temp.startsWith("0")){
                }
                else
                {
                    str = str.append(btn0.getText());
                    display.setText(str);
                };
                break;
            case R.id.btnC:
                tempNumb=0;
                num1=0;
                num2=0;
                result=0;
                display.setText("0");
                operation = "clear";
                temp="0 ";
                break;
            case R.id.btnKropka:
                temp = String.valueOf(display.getText());
                if(!temp.contains("."))
                {
                    str = str.append(".");
                    display.setText(str);
                }
                break;

            case R.id.btnBks:
                temp = String.valueOf(display.getText());
                if(temp.length()>0)
                {
                    display.setText(temp.substring(0, temp.length() - 1));
                }
                break;
            case R.id.btnPlus:
                operation = "+";
                tempNumb = Float.parseFloat(display.getText().toString());
                display.setText("+");
                break;
            case R.id.btnMinus:
                operation = "-";
                if(display.getText().toString().contains("s"))
                    tempNumb = Float.parseFloat(display.getText().toString());
                display.setText("-");

                break;
            case R.id.btnRazy:
                operation = "*";
                tempNumb = Float.parseFloat(display.getText().toString());
                display.setText("*");
                break;
            case R.id.btnDzielenie:
                operation = "/";
                tempNumb = Float.parseFloat(display.getText().toString());
                display.setText("/");
                break;
            case R.id.btnRowne:
                operation();
                break;
            case R.id.btnPlusMinus:
                temp = String.valueOf(display.getText());
                float a = Float.parseFloat(temp);
                temp = String.valueOf(-a);
                display.setText(temp);
                break;

            default:
                display.setText("def");
        }

    }
}