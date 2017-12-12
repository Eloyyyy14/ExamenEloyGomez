package com.example.elo14.exameneloygomez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Galeria extends AppCompatActivity {

    TextView tvNombreProducto, tvPrecio, tvProducto, tvIdProducto, tvDescripcion;
    ImageView imgGaleria;
    Producto obj;
    Button btnAtras, btnDelante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        tvNombreProducto=(TextView)findViewById(R.id.tvNombreProducto);
        tvPrecio=(TextView)findViewById(R.id.tvPrecio);
        tvProducto=(TextView)findViewById(R.id.tvProducto);
        tvIdProducto=(TextView)findViewById(R.id.tvIdProducto);
        tvDescripcion=(TextView)findViewById(R.id.tvDescripcion);
        imgGaleria=(ImageView)findViewById(R.id.imgGaleria);
        btnAtras=(Button)findViewById(R.id.btnAtras);
        btnDelante=(Button)findViewById(R.id.btnDelante);

        obj = (Producto) getIntent().getExtras().getSerializable("objeto");
        tvNombreProducto.setText(obj.getNombreProducto());
        tvPrecio.setText(String.valueOf(obj.getPrecio()));
        tvIdProducto.setText(String.valueOf(obj.getIdProducto()));
        tvDescripcion.setText(obj.getDescripcion());
        imgGaleria.setImageResource(obj.getGaleriaImagenes1());
    }

    public void onClick(View v){
        int id=v.getId();
        if(id==R.id.btnDelante){

        }
    }
}
