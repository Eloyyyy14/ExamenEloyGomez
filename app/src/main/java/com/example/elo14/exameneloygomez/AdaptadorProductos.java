package com.example.elo14.exameneloygomez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elo14 on 12/12/2017.
 */

public class AdaptadorProductos extends BaseAdapter {

    Context contexto; //contexto de la aplicacion
    ArrayList<Producto> ListaObjetos; //lista de datos a generar. Podemos usar tb un ArrayList

    public AdaptadorProductos(Context contexto, ArrayList<Producto> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;

    }

    @Override
    public int getCount() {
        return ListaObjetos.size(); //Devuelve la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int i) { //Devuelve el objeto de la lista en la posición indicada como parametro
        return ListaObjetos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaObjetos.get(i).getIdProducto();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista=view;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista=inflate.inflate(R.layout.itemlistview_productos, null);

        ImageView imgProducto=(ImageView)vista.findViewById(R.id.imgProducto);
        TextView tvNombreProducto=(TextView)vista.findViewById(R.id.tvNombreProducto);
        TextView tvPrecio=(TextView)vista.findViewById(R.id.tvPrecio);
        TextView tvDescripcion=(TextView)vista.findViewById(R.id.tvDescripcion);

        imgProducto.setImageResource(ListaObjetos.get(i).getImagen());
        tvNombreProducto.setText(ListaObjetos.get(i).getNombreProducto());
        tvPrecio.setText(String.valueOf(ListaObjetos.get(i).getPrecio()));
        tvDescripcion.setText(ListaObjetos.get(i).getDescripcion());

        return vista;

    }
}
