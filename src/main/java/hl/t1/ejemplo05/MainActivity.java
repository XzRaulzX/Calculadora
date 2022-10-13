package hl.t1.ejemplo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText resultado;
    double n1=0;
    double n2=0;
    double result;
    TextView pastResult;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultado=findViewById(R.id.etVisor);
        pastResult=findViewById(R.id.txtPast);
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
        n1=Double.parseDouble(resultado.getText().toString());
        pastResult.setText(String.valueOf(n1));
        resultado.setText("");
        operador="*";
    }

    public void dividir(View view) {
        n1=Double.parseDouble(resultado.getText().toString());
        pastResult.setText(String.valueOf(n1));
        resultado.setText("");
        operador="/";
    }

    public void sumar(View view) {
        operador="+";
        n1=Double.parseDouble(resultado.getText().toString());
        pastResult.setText(String.valueOf(n1));
        resultado.setText("");
        }



    public void restar(View view) {
        n1=Double.parseDouble(resultado.getText().toString());
        pastResult.setText(String.valueOf(n1));
        resultado.setText("");
        operador="-";
    }

    public void igual(View view) {
        n2=Double.parseDouble(resultado.getText().toString());
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
        pastResult.setText(String.valueOf(result));
        resultado.setText(String.valueOf(result));

    }


    public void restart(View view) {
        n1=0;
        n2=0;
        resultado.setText("");
        pastResult.setText("");
    }

    public void escribircoma(View view) throws InterruptedException {
        if(resultado.getText().toString().contains(".")){

        }
        else{
            resultado.setText(resultado.getText().toString()+".");

        }


    }
}