package hl.t1.ejemplo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText resultado;
    int n1=0;
    int n2=0;
    int result;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=findViewById(R.id.etVisor);

    }



    public void limpiar(View view) {
        resultado.setText("");
    }
    public void escribiruno(View view) {
        resultado.setText(resultado.getText().toString()+"1");
    }

    public void escribirdos(View view) {
        resultado.setText(resultado.getText().toString()+"2");
    }

    public void escribirtres(View view) {
        resultado.setText(resultado.getText().toString()+"3");
    }

    public void escribircuatro(View view) {
        resultado.setText(resultado.getText().toString()+"4");
    }

    public void escribircinco(View view) {
        resultado.setText(resultado.getText().toString()+"5");
    }

    public void escribirseis(View view) {
        resultado.setText(resultado.getText().toString()+"6");
    }

    public void escribirsiete(View view) {
        resultado.setText(resultado.getText().toString()+"7");
    }

    public void escribirocho(View view) {
        resultado.setText(resultado.getText().toString()+"8");
    }

    public void escribirnueve(View view) {
        resultado.setText(resultado.getText().toString()+"9");
    }
    public void escribircero(View view) {
        resultado.setText(resultado.getText().toString()+"0");
    }

    public void multiplicar(View view) {
        n1=Integer.parseInt(resultado.getText().toString());
        resultado.setText("");
        operador="*";
    }

    public void dividir(View view) {
        n1=Integer.parseInt(resultado.getText().toString());
        resultado.setText("");
        operador="/";
    }

    public void sumar(View view) {
        operador="+";
        if(resultado.getText()!=null){
            n1=Integer.parseInt(resultado.getText().toString());
            resultado.setText("");

        }else{
            resultado.setText(0);
        }

    }

    public void restar(View view) {
        n1=Integer.parseInt(resultado.getText().toString());
        resultado.setText("");
        operador="-";
    }

    public void igual(View view) {
        n2=Integer.parseInt(resultado.getText().toString());
        result=0;
        switch (operador){
            default:
                break;
            case "+":
                result=n1+n2;
                break;
            case "-":
                result=n1-n2;
                break;
            case "*":
                result=n1*n2;
                break;
            case "/":
                result=n1/n2;
                break;
        }

        resultado.setText(Integer.toString(result));

    }


    public void restart(View view) {
        n1=0;
        n2=0;
        resultado.setText("");
    }
}