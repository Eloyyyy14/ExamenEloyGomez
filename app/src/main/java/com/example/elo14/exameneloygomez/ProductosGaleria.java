package com.example.elo14.exameneloygomez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductosGaleria extends AppCompatActivity {

    ListView lvProductos;
    ArrayList<Producto> listProducto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        lvProductos=(ListView)findViewById(R.id.listViewProductos);
        listProducto=new ArrayList<Producto>();


        listProducto.add(new Producto(1, R.drawable.televisor_lg, "Televisor LG F21-40", "Televisión imagen 4K de 40 pulgadas 400Mhz", 399, R.drawable.galeria_tv1, R.drawable.galeria_tv2, R.drawable.galeria_tv3));
        listProducto.add(new Producto(2, R.drawable.minicadena_sony, "Microcadena Sony HT-100sd", "Cadena musical conexión USB y iPod 40W", 199, R.drawable.galeria_microcadena1, R.drawable.galeria_microcadena2, R.drawable.galeria_microcadena3));
        listProducto.add(new Producto(3, R.drawable.plancha_rowenta, "Plancha Rowenta Soft FX-1", "Plancha profesional 7 funciones de planchado 1800W", 90, R.drawable.galeria_plancha1, R.drawable.galeria_plancha2, R.drawable.galeria_plancha3));
        listProducto.add(new Producto(4, R.drawable.portatil_acer, "Ordenador portátil Acer R235", "Ordenador portátil ACer I5, 8GB, SSD240GB", 589.90, R.drawable.galeria_portatil1, R.drawable.galeria_portatil2, R.drawable.galeria_portatil3));

        AdaptadorProductos miAdaptador=new AdaptadorProductos(getApplicationContext(), listProducto);

        lvProductos.setAdapter(miAdaptador);

        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Producto obj = (Producto) adapterView.getItemAtPosition(i);

                Intent paso = new Intent(getApplicationContext(), Galeria.class);
                paso.putExtra("objeto", (Serializable)obj);
                startActivity(paso);

            }
        });

    }
}
