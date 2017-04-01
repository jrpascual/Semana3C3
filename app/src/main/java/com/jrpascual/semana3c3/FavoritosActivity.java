package com.jrpascual.semana3c3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private ArrayList<Mascota> mascotasFavs;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarFav);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /*
        Bundle paremtros = getIntent().getExtras();
        mascotasFavs = (ArrayList<Mascota>) paremtros.get("favoritas");
        */
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFav);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotasFavs);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotasFavs = new ArrayList<Mascota>();
        mascotasFavs.add(new Mascota("Jacky",R.drawable.jacky,9));
        mascotasFavs.add(new Mascota("Sira",R.drawable.sira,7));
        mascotasFavs.add(new Mascota("Coco",R.drawable.coco,6));
        mascotasFavs.add(new Mascota("Doro",R.drawable.doro,5));
        mascotasFavs.add(new Mascota("Toni",R.drawable.toni,3));
    }

}
