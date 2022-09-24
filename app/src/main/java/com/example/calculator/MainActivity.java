package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    Integer first, second;
    private Boolean isOperationClick;
    String operation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                if(textView.getText().toString().equals("0")){
                    textView.setText("1");
                }else if (isOperationClick){
                    textView.setText("1");
                }
                else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if(textView.getText().toString().equals("0")){
                    textView.setText("2");
                }else if (isOperationClick){
                    textView.setText("2");
                }
                else {
                    textView.append("2");
                }
                break;
            case R.id.btn_three:
                if(textView.getText().toString().equals("0")){
                    textView.setText("3");
                }else if (isOperationClick){
                    textView.setText("3");
                }
                else {
                    textView.append("3");
                }
                 break;
            case R.id.btn_four:
                if(textView.getText().toString().equals("0")){
                    textView.setText("4");
                }else if (isOperationClick){
                    textView.setText("4");
                }
                else {
                    textView.append("4");
                }
                 break;
            case R.id.btn_five:
                if(textView.getText().toString().equals("0")){
                    textView.setText("5");
                }else if (isOperationClick){
                    textView.setText("5");
                }
                else {
                    textView.append("5");
                }
                 break;
            case R.id.btn_six:
                if(textView.getText().toString().equals("0")){
                    textView.setText("6");
                }else if (isOperationClick){
                    textView.setText("6");
                }
                else {
                    textView.append("6");
                }
                 break;
            case R.id.btn_seven:
                if(textView.getText().toString().equals("0")){
                    textView.setText("7");
                }else if (isOperationClick){
                    textView.setText("7");
                }
                else {
                    textView.append("7");
                }
                 break;
            case R.id.btn_eight:
                if(textView.getText().toString().equals("0")){
                    textView.setText("8");
                }else if (isOperationClick){
                    textView.setText("8");
                }
                else {
                    textView.append("8");
                }
                 break;
            case R.id.btn_nine:
                if(textView.getText().toString().equals("0")){
                    textView.setText("9");
                }else if (isOperationClick){
                    textView.setText("9");
                }
                else {
                    textView.append("9");
                }
                 break;
            case R.id.btn_zero:
                if(textView.getText().toString().equals("0")){
                    textView.setText("0");
                }else if (isOperationClick){
                    textView.setText("0");
                }
                else {
                    textView.append("0");
                }
                 break;
            case R.id.tochka:
                break;
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
        break;
        }
        isOperationClick = false;
    }



    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_x:
                first = Integer.parseInt(textView.getText().toString());
                operation = "*";
                break;
            case R.id.btn_minus:
                first = Integer.parseInt(textView.getText().toString());
                operation = "-";
                break;
            case R.id.btn_division:
                first = Integer.parseInt(textView.getText().toString());
                operation = "/";
                break;
            case R.id.btn_plus:
               first = Integer.parseInt(textView.getText().toString());
               operation = "+";
                break;
            case R.id.btn_res:
                second = Integer.parseInt(textView.getText().toString());
                if(operation == "*"){
                   Integer result = first * second;
                   textView.setText(result.toString());
                } else if (operation == "-"){
                    Integer result = first - second;
                    textView.setText(result.toString());
                } else if (operation == "/"){
                    Integer result = first/second;
                    textView.setText(result.toString());
                } else if (operation == "+"){
                    Integer result = first + second;
                    textView.setText(result.toString());
                }
                break;

        }
        isOperationClick = true;
    }

    private void SwitchClick(String numbers){

        if(textView.getText().toString().equals("0")){
            textView.setText(numbers);
        }else if (isOperationClick){
            textView.setText(numbers);
        }
        else {
            textView.append(numbers);
        }
    }
}

