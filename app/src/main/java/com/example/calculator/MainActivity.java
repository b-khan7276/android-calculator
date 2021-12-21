package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnAdd,btnSub,btnMul,btnDev,btnEqual,btnMode,btnClear;
    EditText ed1;
    Float res1, res2;
    Boolean Add, Sub,Dev,Mul,Mode;
    Float ans;

    void storePre(){
        res1 = Float.parseFloat(ed1.getText()+ "");
    }
    void setFalse(){
        Add=Sub=Dev=Mul=Mode = false;
    }
    void Clear(){
        res1=null;
        ed1.setText(null);
        setFalse();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=(Button) findViewById(R.id.btn0);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnSub=(Button) findViewById(R.id.btnSub);
        btnMul=(Button) findViewById(R.id.btnMul);
        btnDev=(Button) findViewById(R.id.btnDev);
        btnDot=(Button) findViewById(R.id.btnDot);
        btnEqual=(Button) findViewById(R.id.btnEqual);
        btnMode=(Button) findViewById(R.id.btnMode);
        btnClear=(Button) findViewById(R.id.btnClear);
        ed1 =(EditText) findViewById(R.id.ed1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");

            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");

            }
        });



        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");

            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");

            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");

            }
        });


        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");

            }
        });


    btnAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(ed1 == null){
                ed1.setText("");
            }
            else{
                storePre();
                setFalse();
                Add = true;
                ed1.setText(null);
            }
        }
    });




        btnDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Dev = true;
                    ed1.setText(null);
                }
            }
        });



        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Mul = true;
                    ed1.setText(null);
                }
            }
        });



        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Sub = true;
                    ed1.setText(null);
                }
            }
        });




        btnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    storePre();
                    setFalse();
                    Mode = true;
                    ed1.setText(null);
                }
            }
        });



        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add){
                    ed1.setText(res1+Float.parseFloat(ed1.getText()+ "")+"");
                }
                if(Sub){
                    ed1.setText(res1-Float.parseFloat(ed1.getText()+ "")+"");
                }
                if(Dev){
                    ed1.setText(res1/Float.parseFloat(ed1.getText()+ "")+"");
                }
                if(Mul){
                    ed1.setText(res1*Float.parseFloat(ed1.getText()+ "")+"");
                }
                if(Mode){
                    ed1.setText(res1%Float.parseFloat(ed1.getText()+ "")+"");
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
    }
}