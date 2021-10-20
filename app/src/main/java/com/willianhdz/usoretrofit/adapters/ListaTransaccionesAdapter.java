package com.willianhdz.usoretrofit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.willianhdz.usoretrofit.R;
import com.willianhdz.usoretrofit.models.Transaccion;

import java.util.ArrayList;
import java.util.List;

public class ListaTransaccionesAdapter extends RecyclerView.Adapter<ListaTransaccionesAdapter.TransaccionHolder>{


    private Context mCtx;
    List<Transaccion> listaTransacciones;

    public ListaTransaccionesAdapter(Context mCtx, ArrayList<Transaccion> listaTransacciones){
        this.mCtx = mCtx;
        this.listaTransacciones = listaTransacciones;
    }

    @Override
    public TransaccionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.historial_transacciones, null);
        return new TransaccionHolder(view);
    }

    @Override
    public void onBindViewHolder(TransaccionHolder holder, int position) {
        Transaccion transac = listaTransacciones.get(position);
        holder.tvOrigen.setText(transac.getPhoneNumberFrom());
        holder.tvDestino.setText(transac.getPhoneNumberTo());
        holder.tvConcepto.setText(transac.getConcept());
        holder.tvFecha.setText(transac.getCreateDate());
        holder.tvMonto.setText(transac.getBalance());
    }

    @Override
    public int getItemCount() {
        return listaTransacciones.size();
    }

    public static class TransaccionHolder extends RecyclerView.ViewHolder {
        TextView tvOrigen, tvDestino, tvConcepto, tvFecha, tvMonto;
        public TransaccionHolder(View itemView) {
            super(itemView);
            tvOrigen = itemView.findViewById(R.id.tvOrigen);
            tvDestino = itemView.findViewById(R.id.tvDestino);
            tvConcepto = itemView.findViewById(R.id.tvConcepto);
            tvFecha = itemView.findViewById(R.id.tvFecha);
            tvMonto = itemView.findViewById(R.id.tvMonto);
        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}