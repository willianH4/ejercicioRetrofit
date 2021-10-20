package com.willianhdz.usoretrofit;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.willianhdz.usoretrofit.adapters.ListaTransaccionesAdapter;
import com.willianhdz.usoretrofit.models.Transaccion;
import com.willianhdz.usoretrofit.utilidades.Settings_VAR;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class TodasTransacciones extends Fragment {

    ArrayList<String> lista = null;
    ArrayList<Transaccion> listaTransacciones;

    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    private ListaTransaccionesAdapter transaccionAdapter;

    public TodasTransacciones() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_todas_transacciones, container, false);

        progressBar = root.findViewById(R.id.progress);
        recyclerView = root.findViewById(R.id.rvTransacciones);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recibirAllTransacciones();
        return root;
    }

    private void recibirAllTransacciones(){

    }
}