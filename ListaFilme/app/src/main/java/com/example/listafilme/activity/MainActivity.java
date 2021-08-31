package com.example.listafilme.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.listafilme.R;
import com.example.listafilme.adapter.AdapterFilme;
import com.example.listafilme.listener.RecyclerItemClickListener;
import com.example.listafilme.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<Filme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Listagem de filmes (pode vir de arquivos, banco de dados etc.
        this.criarFilmes();

        // Configurar o AdapterFilme
        AdapterFilme filmeAdapterFilme = new AdapterFilme(this.listaFilmes);

        // Configurar RecyclerView layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(filmeAdapterFilme);

        // Configurar o evento click
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), recyclerView,
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(),listaFilmes.get(position).getTituloFilme(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Toast.makeText(getApplicationContext(),listaFilmes.get(position).toString(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }));
    }

    public void criarFilmes() {
        Filme novoFilme = new Filme("O Silêncio dos Inocentes","Suspense","1991");
        listaFilmes.add(novoFilme);
        novoFilme = new Filme("Seven - Os 7 Crimes Capitais","Policial","1995");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("Star Wars - Uma Nova Esperança","Ficção Científica","1977");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("Um Sonho de Liberdade","Drama","1994");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("A Lista de Schindler","Guerra","1993");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("Clube da Luta","Drama","1999");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("O Diabo Veste Prada","Comédia/Romance","2006");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("Stigmata","Terror/Suspense","1999");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("Hannibal","Suspense","2001");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("La La Land: Cantando Estações","Musical/Romance","2016");
        listaFilmes.add(novoFilme);

        novoFilme = new Filme("Titanic","Drama/Romance","1997");
        listaFilmes.add(novoFilme);
    }

}