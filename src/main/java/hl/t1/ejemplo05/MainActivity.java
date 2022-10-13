package hl.t1.ejemplo05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnmult=findViewById(R.id.btnf1);
        Button btndiv=findViewById(R.id.btnf2);
        Button btnsum=findViewById(R.id.btnf3);
        Button btnrest=findViewById(R.id.btnf4);
        Button btnReiniciar=findViewById(R.id.btnf5);
        resultado=findViewById(R.id.etVisor);

    }


    public int suma(int a,int b){
        return a+b;
    }
    public int resta(int a,int b){
        return a-b;
    }
    public int dividir(int a,int b){
        return a/b;
    }

    public int multiplicacion(int a,int b){
        return a*b;
    }

    public void limpiar(View view) {
        resultado.setText("0");
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

}