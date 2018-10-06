package com.pramudana.sam.matabandung.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Hoidar on 10/6/18.
 */

public class InstanceRetrofit {

    public static final String WebUrl = "http://patrakomala.disbudpar.bandung.go.id:8080/";

    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl(WebUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ApiService getInstance() {
        return setInit().create(ApiService.class);
    }

}
