package com.willianhdz.usoretrofit.interfaces;

import com.willianhdz.usoretrofit.models.Transaccion;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AllTransaccionesService {
    String API_ROUTE = "/posts";

    @GET(API_ROUTE)
    Call<List<Transaccion>> getAll();
}
