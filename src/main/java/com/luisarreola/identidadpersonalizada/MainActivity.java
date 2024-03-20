package com.luisarreola.identidadpersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText nombre, fecha, telefono, email, descripcion;
    Button siguiente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         nombre = (TextInputEditText)findViewById(R.id.edt1Nom);
         telefono = (TextInputEditText)findViewById(R.id.edt2Tel);
         fecha = (TextInputEditText)findViewById(R.id.edt5Fec);
         email = (TextInputEditText)findViewById(R.id.edt3Ema);
         descripcion = (TextInputEditText)findViewById(R.id.edt4Des);
         siguiente = (Button)findViewById(R.id.btnSig);

         siguiente.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String name= nombre.getText().toString();
                 String date= fecha.getText().toString();
                 String phone= telefono.getText().toString();
                 String corr= email.getText().toString();
                 String desc= descripcion.getText().toString();

                 Intent siguiente = new Intent(MainActivity.this, DetalleContacto.class);
                 siguiente.putExtra ("name", (Parcelable) nombre);
                 siguiente.putExtra("date", (Parcelable) fecha);
                 siguiente.putExtra("phone", (Parcelable) telefono);
                 siguiente.putExtra("corr", (Parcelable) email);
                 siguiente.putExtra("desc", (Parcelable) descripcion);


                 startActivity(siguiente);
             }
         });
    }


}