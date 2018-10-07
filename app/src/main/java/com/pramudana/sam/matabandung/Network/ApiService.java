package com.pramudana.sam.matabandung.Network;

import com.pramudana.sam.matabandung.Model.ListEvent.DetailsEvent.ResponseDetailsEvent;
import com.pramudana.sam.matabandung.Model.ListEvent.ResponseListEvent;
import com.pramudana.sam.matabandung.Model.Login.ResponseLogin;
import com.pramudana.sam.matabandung.Model.Register.ResponseRegister;
import com.pramudana.sam.matabandung.Model.Tenant.Data.ResponseDataTenant;
import com.pramudana.sam.matabandung.Model.Tenant.Detail.ResponseDetail;
import com.pramudana.sam.matabandung.Model.Tenant.SubSector.ResponseSubSectorTenant;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by Hoidar on 10/6/18.
 */

public interface ApiService {
    @POST("api/v1/public/event/list-event")
    Call<ResponseListEvent> readListEvent(
            @Header("access-key") String accesskey
    );
    @GET("api/v1/public/tenant/detail-tenant?tenant_id=")
    Call<ResponseDetailsEvent> detailsEvent(
            @Header("access-key") String accesskey
    );
    @GET("api/v1/public/tenant/list-subsector")
    Call<ResponseSubSectorTenant> SubSectorTenant(
            @Header("access-key") String accesskey
    );
    @POST("api/v1/public/tenant/list-tenant")
    Call<ResponseDataTenant> dataTenant(
            @Header("access-key") String accesskey
    );
    @GET("api/v1/public/tenant/detail-tenant?tenant_id=24")
    Call<ResponseDetail> detailTenant(
            @Header("access-key") String accesskey
    );

    @FormUrlEncoded
    @POST("api/v1/public/client/login")
    Call<ResponseLogin> response_login(
            @Header("access-key") String accesskey,
            @Field("password") String username,
            @Field("username") String password
            );


    @FormUrlEncoded
    @POST("api/v1/public/client/register")
    Call<ResponseRegister> response_register(
            @Header("access-key") String accesskey,
            @Field("client_first_name") String namadepan,
            @Field("client_last_name") String namaakhir,
            @Field("client_email") String email,
            @Field("client_password") String password,
            @Field("client_password_confirmation ") String passwordconf,
            @Field("company_name")String companyName
    );


}

