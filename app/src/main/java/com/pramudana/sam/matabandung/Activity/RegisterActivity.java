package com.pramudana.sam.matabandung.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pramudana.sam.matabandung.Model.Register.ResponseRegister;
import com.pramudana.sam.matabandung.Network.ApiService;
import com.pramudana.sam.matabandung.Network.InstanceRetrofit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Callback;
import retrofit2.Response;

import com.pramudana.sam.matabandung.R;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.etFirstName)
    EditText etFirstName;
    @BindView(R.id.etLastName)
    EditText etLastName;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.etconfirmPassword)
    EditText etconfirmPassword;
    @BindView(R.id.etcompanyName)
    EditText etcompanyName;
    @BindView(R.id.btnMasuk)
    Button btnMasuk;

    String strNamaDepan, strNamaAkhir, strEmail, strPassword, strCompany, strPassConfirm;

    String accesskey = "fe00a11d02f3e3ced53486ff3f6e3b";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnMasuk)
    public void onViewClicked() {

        if (TextUtils.isEmpty(strNamaDepan)) {
            etFirstName.setError("Nama Cannot be null");
        } else if (TextUtils.isEmpty(strNamaAkhir)) {
            etLastName.setError("Alamat Cannot be null");
        } else if (TextUtils.isEmpty(strEmail)) {
            etEmail.setError("No Telp Cannot be null");
        } else if (TextUtils.isEmpty(strCompany)) {
            etcompanyName.setError("Username Cannot be null");
        } else if (TextUtils.isEmpty(strPassword)) {
            etPassword.setError("Password Cannot be null");
        } else if (TextUtils.isEmpty(strPassConfirm)) {
            etconfirmPassword.setError("This is required");
        } else if (strPassword.length()<6) {
            etPassword.setError("Password Minimal 6 character");
        } else if (strPassConfirm.length()<6) {
            etconfirmPassword.setError("Password Confirmation Minimal 6 character");
        } else if (!strPassword.equals(strPassConfirm)) {
            etconfirmPassword.setError("Password Confirmation Not Same");
        } else {
            registerUser();
        }

    }

    private void registerUser() {
        final ProgressDialog dialog = ProgressDialog.show(RegisterActivity.this, "Loading...", "");
        ApiService api = InstanceRetrofit.getInstance();
        retrofit2.Call<ResponseRegister> call = api.response_register(accesskey,strNamaDepan, strNamaAkhir, strEmail, strPassword, strCompany, strPassConfirm);
        call.enqueue(new Callback<ResponseRegister>() {
            @Override
            public void onResponse(retrofit2.Call<ResponseRegister> call, Response<ResponseRegister> response) {
                dialog.dismiss();
                int result = response.body().getStatus();
                if (result == 200) {
                    Toast.makeText(RegisterActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                } else {
                    Toast.makeText(RegisterActivity.this, ""+response.body().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<ResponseRegister> call, Throwable t) {
                dialog.dismiss();
                Toast.makeText(RegisterActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
