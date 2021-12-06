package com.f_canio.mqtt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class listaView extends AppCompatActivity /*implements View.OnClickListener*/ {
    private Sensor Item;
    private TextView nombre, fechayhora,valSensor, ubicacion;
    private EditText observacion;
    private Button Guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_view);

        //boton guardar datos en caso de editar el campo observaciones
        //Button Guardar = findViewById(R.id.btnguardar);
        //Guardar.setOnClickListener(this);

        Item = (Sensor) getIntent().getSerializableExtra("objectodata");

        nombre =(TextView) findViewById(R.id.nombresen);
        nombre.setText(Item.getNombreSensor());

        valSensor=(TextView)findViewById(R.id.valorsen);
        valSensor.setText(Item.getValorSensor());

        ubicacion=(TextView)findViewById(R.id.ubicansen);
        ubicacion.setText(Item.getUbicacionSensor());

        fechayhora=(TextView) findViewById(R.id.fechayhorasen);
        fechayhora.setText(Item.getFechaRegistro());

        observacion=(EditText) findViewById(R.id.observacionsen);
        observacion.setText(Item.getObservacionSensor());
    }
/*
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnguardar){

        }
    }*/
}