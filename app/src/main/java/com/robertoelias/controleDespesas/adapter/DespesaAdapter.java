package com.robertoelias.controleDespesas.adapter;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.robertoelias.controleDespesas.R;
import com.robertoelias.controleDespesas.model.Despesa;

import java.util.List;

public class DespesaAdapter extends RecyclerView.Adapter <DespesaAdapter.MyViewHolder> {

    private List<Despesa> listaDespesas;
    public DespesaAdapter(List<Despesa> lista) {
        this.listaDespesas = lista;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_despesa_adapter, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Despesa despesa = listaDespesas.get(position);
        holder.despesa.setText(despesa.getNomeDespesa());


    }

    @Override
    public int getItemCount() {
        return this.listaDespesas.size();
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView despesa;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            despesa = itemView.findViewById(R.id.textDespesa);
        }
    }


}
