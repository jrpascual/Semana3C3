package com.jrpascual.semana3c3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        ImageView estrella = (ImageView) findViewById(R.id.imvEstrella);
        estrella.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  //  Toast.makeText(getBaseContext(), "No tienes favoritos", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,FavoritosActivity.class);
                //intent.putExtra("favoritas",mascotas);
                startActivity(intent);
            }
        });
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Jacky",R.drawable.jacky,0));
        mascotas.add(new Mascota("Bruno",R.drawable.bruno,0));
        mascotas.add(new Mascota("Clara",R.drawable.clara,0));
        mascotas.add(new Mascota("Lana",R.drawable.lana,0));
        mascotas.add(new Mascota("Buffo",R.drawable.buffo,0));
        mascotas.add(new Mascota("Baby",R.drawable.jackb,0));
        mascotas.add(new Mascota("Pipin",R.drawable.pipi,0));
        mascotas.add(new Mascota("Sira",R.drawable.sira,0));
        mascotas.add(new Mascota("Coco",R.drawable.coco,0));
        mascotas.add(new Mascota("Doro",R.drawable.doro,0));
        mascotas.add(new Mascota("Toni",R.drawable.toni,0));


    }
}
