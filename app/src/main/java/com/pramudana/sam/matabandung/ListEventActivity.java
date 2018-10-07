package com.pramudana.sam.matabandung;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.pramudana.sam.matabandung.Activity.HomeActivity;
import com.pramudana.sam.matabandung.Model.ListEvent.DataItem;
import com.pramudana.sam.matabandung.Model.ListEvent.DetailsEvent.Data;
import com.pramudana.sam.matabandung.Model.ListEvent.ResponseListEvent;
import com.pramudana.sam.matabandung.Network.ApiService;
import com.pramudana.sam.matabandung.Network.InstanceRetrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListEventActivity extends AppCompatActivity {

    RecyclerView rcListEvent;
    CustomAdapter adapter;
    String accesskey = "fe00a11d02f3e3ced53486ff3f6e3b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_event);
        
        rcListEvent = findViewById(R.id.rcListEvent);
        
        getData();
    }

    private void getData() {
        final ApiService apiService = InstanceRetrofit.getInstance();
        Call<ResponseListEvent> call = apiService.readListEvent(accesskey);
        call.enqueue(new Callback<ResponseListEvent>() {
            @Override
            public void onResponse(Call<ResponseListEvent> call, Response<ResponseListEvent> response) {
                if (response.body().getStatus() == 200){
                    List<DataItem> dataItems = response.body().getData();
                    adapter = new CustomAdapter(rcListEvent, ListEventActivity.this, dataItems);
                    rcListEvent.setAdapter(adapter);
                    rcListEvent.setLayoutManager(new LinearLayoutManager(ListEventActivity.this));
                } else {

                }

            }

            @Override
            public void onFailure(Call<ResponseListEvent> call, Throwable t) {

            }
        });
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

        Context context;
        List<DataItem> dataItems;

        public CustomAdapter(RecyclerView rcNews, Context context, List<DataItem> dataItems) {
            this.context = context;
            this.dataItems = dataItems;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.listevent, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.txtTitle.setText(dataItems.get(position).getTitle());

            Glide.with(context)
                    .load(dataItems.get(position).getImage())
                    .centerCrop()
                    .into(holder.image);
        }

        @Override
        public int getItemCount() {
            return dataItems.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            TextView txtName, txtTitle, txtAuthor, txtPublish, txtDesc;
            ImageView image;

            public MyViewHolder(View itemView) {
                super(itemView);

                txtTitle = itemView.findViewById(R.id.txtTitle);
                txtName = itemView.findViewById(R.id.txtname);
                txtPublish = itemView.findViewById(R.id.txtPublished);
                image = itemView.findViewById(R.id.img);
            }
        }
    }
}
