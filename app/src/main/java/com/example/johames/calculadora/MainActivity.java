package com.example.johames.calculadora;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnmas, btnigual, btnmenos, btnpor, btnentre, btnce, btnraiz, siguiente;
    private TextView editValor;

    double result=0, result1=0, resultado=0;
    boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValor=(TextView)findViewById(R.id.EditValor);
        siguiente=(Button)findViewById(R.id.Show_Activity);

        siguiente.setOnClickListener(this);

        btnigual=(Button)findViewById(R.id.BtnIgual);
        btnmas=(Button)findViewById(R.id.BtnMas);
        btnmenos=(Button)findViewById(R.id.BtnMenos);
        btnpor=(Button)findViewById(R.id.BtnPor);
        btnentre=(Button)findViewById(R.id.BtnEntre);
        btnraiz=(Button)findViewById(R.id.BtnRaiz);
        btnce=(Button)findViewById(R.id.BtnCE);
        btn1=(Button)findViewById(R.id.Btn1);
        btn2=(Button)findViewById(R.id.Btn2);
        btn3=(Button)findViewById(R.id.Btn3);
        btn4=(Button)findViewById(R.id.Btn4);
        btn5=(Button)findViewById(R.id.Btn5);
        btn6=(Button)findViewById(R.id.Btn6);
        btn7=(Button)findViewById(R.id.Btn7);
        btn8=(Button)findViewById(R.id.Btn8);
        btn9=(Button)findViewById(R.id.Btn9);
        btn0=(Button)findViewById(R.id.Btn0);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn1.getText().toString());
                editValor.setText(editValor.getText().toString()+btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn2.getText().toString());
                editValor.setText(editValor.getText().toString()+btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn3.getText().toString());
                editValor.setText(editValor.getText().toString()+btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn4.getText().toString());
                editValor.setText(editValor.getText().toString()+btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn5.getText().toString());
                editValor.setText(editValor.getText().toString()+btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn6.getText().toString());
                editValor.setText(editValor.getText().toString()+btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn7.getText().toString());
                editValor.setText(editValor.getText().toString()+btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn8.getText().toString());
                editValor.setText(editValor.getText().toString()+btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn9.getText().toString());
                editValor.setText(editValor.getText().toString()+btn9.getText().toString());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1=Integer.parseInt(btn0.getText().toString());
                editValor.setText(editValor.getText().toString()+btn0.getText().toString());
            }
        });
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado=result;
                editValor.setText(result+"");
                result1=0;
            }
        });
        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=result+result1;
                editValor.setText(editValor.getText().toString()+btnmas.getText().toString());
            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=result-result1;
                editValor.setText(editValor.getText().toString()+btnmenos.getText().toString());
            }
        });
        btnpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=result*result1;
                editValor.setText(editValor.getText().toString()+btnpor.getText().toString());
            }
        });
        btnentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=result/result1;
                editValor.setText(editValor.getText().toString()+btnentre.getText().toString());
            }
        });
        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editValor.setText("");
            }
        });
        btnraiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=Math.sqrt(result+result1);
                editValor.setText(editValor.getText().toString()+btnraiz.getText().toString());
            }
        });
    }

    @Override
    public void onClick(View v){
        //Iniciando la actividad Visor
        Intent intent = new Intent(this,Calculadora.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
