package com.pramudana.sam.matabandung.Activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pramudana.sam.matabandung.Model.Login.ResponseLogin;
import com.pramudana.sam.matabandung.Network.ApiService;
import com.pramudana.sam.matabandung.Network.InstanceRetrofit;
import com.pramudana.sam.matabandung.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.etUsername)
    EditText etUsername;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.btnMasukLogin)
    Button btnMasukLogin;
    @BindView(R.id.txtDaftar)
    TextView txtDaftar;

    Context context;
    String strusername,strpassword;
    String accesskey = "fe00a11d02f3e3ced53486ff3f6e3b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.btnMasukLogin, R.id.txtDaftar})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnMasukLogin:

                strusername = etUsername.getText().toString();
                strpassword = etPassword.getText().toString();
                if (TextUtils.isEmpty(strusername)){
                    etUsername.setError("Dont leave empty");
                } else if (TextUtils.isEmpty(strpassword)){
                    etPassword.setError("Dont leave empty");
                } else{
                    loginUserr();
                }
                break;
            case R.id.txtDaftar:
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                break;
        }
    }

    private void loginUserr() {
//        final ProgressDialog dialog = new ProgressDialog(this);
//        dialog.setTitle("Tunggu");
//        dialog.setIndeterminate(true);
//        dialog.show();

        ApiService api = InstanceRetrofit.getInstance();
        Call<ResponseLogin> call = api.response_login (accesskey,strusername,strpassword);

        call.enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
//                dialog.dismiss();
//                List<Object> error = response.body().getErrors();
                if (response.body().getStatus() == 200){
//                    Toast.makeText(LoginActivity.this,""+error, Toast.LENGTH_SHORT).show();
//                    sessionManager.createSession(strusername);
                    startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                }else{
//                    Toast.makeText(LoginActivity.this, ""+error, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {
//                dialog.dismiss();
                Toast.makeText(LoginActivity.this,""+t.getMessage(), Toast.LENGTH_SHORT);
            }
        });
    }
}
