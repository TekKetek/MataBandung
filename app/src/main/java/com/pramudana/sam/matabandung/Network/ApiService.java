package com.pramudana.sam.matabandung.Network;

import com.pramudana.sam.matabandung.Model.ListEvent.DetailsEvent.ResponseDetailsEvent;
import com.pramudana.sam.matabandung.Model.ListEvent.ResponseListEvent;
import com.pramudana.sam.matabandung.Model.Tenant.Data.ResponseDataTenant;
import com.pramudana.sam.matabandung.Model.Tenant.Detail.ResponseDetail;
import com.pramudana.sam.matabandung.Model.Tenant.SubSector.ResponseSubSectorTenant;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Hoidar on 10/6/18.
 */

public interface ApiService {
    @POST("api/v1/public/event/list-event")
    Call<ResponseListEvent> readListEvent();
    @GET("api/v1/public/tenant/detail-tenant?tenant_id=")
    Call<ResponseDetailsEvent> detailsEvent();
    @GET("api/v1/public/tenant/list-subsector")
    Call<ResponseSubSectorTenant> SubSectorTenant();
    @POST("api/v1/public/tenant/list-tenant")
    Call<ResponseDataTenant> dataTenant();
    @GET("api/v1/public/tenant/detail-tenant?tenant_id=24")
    Call<ResponseDetail> detailTenant();


}

