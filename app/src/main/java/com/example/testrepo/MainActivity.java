package com.example.testrepo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_documento,et_nombre,et_apellido;
    private RadioButton rb_estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_documento = (EditText)findViewById(R.id.);
        et_nombre = (EditText)findViewById(R.id.);
        et_apellido = (EditText)findViewById(R.id.);
        rb_estado = (RadioButton)findViewById(R.id);
    }

    public void Insertar(){
        AdminSQLite admin = new AdminSQLite(this,"persona",null,1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String documento = et_documento.getText().toString();
        String nombre = et_nombre.getText().toString();
        String apellido = et_apellido.getText().toString();
        int estado = rb_estado.;

        if (!documento.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty()){
            ContentValues datos = new ContentValues();
            datos.put("documento",documento);
            datos.put("nombre",nombre);
            datos.put("apellido",apellido);
            datos.put("estado",estado);
            BaseDeDatos.insert("persona",null,datos);
            BaseDeDatos.close();
            et_documento.setText("");
            et_nombre.setText("");
            et_apellido.setText("");
            rb_estado.;
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {

    }
}
