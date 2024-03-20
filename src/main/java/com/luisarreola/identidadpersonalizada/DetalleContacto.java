package com.luisarreola.identidadpersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetalleContacto extends AppCompatActivity {

    TextView tvNom,tvFec, tvTel, tvEma, tvDesc;
    Button btnEdtDa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);
        tvNom =(TextView)findViewById(R.id.tvNom);
        tvFec =(TextView)findViewById(R.id.tvFec);
        tvTel =(TextView)findViewById(R.id.tvTel);
        tvEma =(TextView)findViewById(R.id.tvEma);
        tvDesc =(TextView)findViewById(R.id.tvDesc);
        btnEdtDa =(Button)findViewById(R.id.btnEdtDa);

        btnEdtDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DetalleContacto.this, MainActivity.class);
                startActivity(intent);
            }
        });


        contactoDetalle();

    }

    private void contactoDetalle() {
        Bundle contacto= this.getIntent().getExtras();
        String nombre = contacto.getString("name");
        String fecha=    contacto.getString("date");
        String telefono= contacto.getString( "phone");
        String email=    contacto.getString("corr");
        String descripcion= contacto.getString("desc");

        tvNom.setText(nombre);
        tvFec.setText(fecha);
        tvTel.setText(telefono);
        tvEma.setText(email);
        tvDesc.setText(descripcion);

    }
}