package com.example.listafilme.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.listafilme.R;
import com.example.listafilme.model.Filme;

import java.util.List;

public class AdapterFilme extends RecyclerView.Adapter<AdapterFilme.MyViewHolder> {
    private List<Filme> listaFilmes;

    public AdapterFilme(List<Filme> lista) {
        listaFilmes = lista;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);
        }
    }

    // Cria a visualizacao dos itens na tela
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista,parent,false);

        return new MyViewHolder(itemLista);
    }

    // Popula os objetos view com os dados
    @Override
    public void onBindViewHolder(AdapterFilme.MyViewHolder holder, int position) {
        if (listaFilmes != null) {
            holder.titulo.setText(listaFilmes.get(position).getTituloFilme());
            holder.genero.setText(listaFilmes.get(position).getGeneroFilme());
            holder.ano.setText(listaFilmes.get(position).getAnoFilme());
        }
    }

    // Quantidade de exibicoes do ViewHolder (dados) na tela
    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }
}
