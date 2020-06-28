package com.example.appejerciciocinco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv3;
    private CheckBox chbSuma, chbResta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv3 = (TextView) findViewById(R.id.tv3);
        chbSuma = (CheckBox) findViewById(R.id.chbSuma);
        chbResta = (CheckBox) findViewById(R.id.chbResta);
    }

    public void operar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        //variable para mostrar el resultado
        String resu = "";
        //comprobamos si alguno de los números están vacíos
        if ( valor1.isEmpty() || valor2.isEmpty()){
            resu = "Error. Alguno de los números están vacíos";
            tv3.setText(resu);
        }else {
            //pasamos los números de String a Integer
            int nro1 = Integer.parseInt(valor1);
            int nro2 = Integer.parseInt(valor2);

            try {
                //comprobamos que se ha seleccionado alguna de las operaciones a realizar
                if (chbSuma.isChecked() == false && chbResta.isChecked() == false) {
                    resu = "No se ha seleccionado ninguna operación";
                } else {
                    if (chbSuma.isChecked() == true) {
                        int suma = nro1 + nro2;
                        resu = "La suma de " + nro1 + " y de " + nro2 + " es: " + suma + "\n";
                    }
                    if (chbResta.isChecked() == true) {
                        int resta = nro1 - nro2;
                        resu = resu + "La resta es: " + resta;
                    }
                }
                //mostramos el resultado
                tv3.setText(resu);
            } catch (Exception e) {
                //en caso de error se muestra la exception
                System.out.println("Error!! Exception: " + e);
            }
        }
    }
}