package com.pramudana.sam.matabandung.Network;

import com.pramudana.sam.matabandung.Model.ListEvent.ResponseListEvent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Hoidar on 10/6/18.
 */

public interface ApiService {
    @POST("api/v1/public/event/list-event")
    Call<ResponseListEvent> readListEvent();
}

