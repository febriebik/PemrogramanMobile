package com.example.user_pc.pahlawan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPahlawanAdapter extends RecyclerView.Adapter<ListPahlawanAdapter.CategoryViewHolder> {
    public ListPahlawanAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Pahlawan> getListPahlawan() {
        return listPahlawan;
    }

    public void setListPahlawan(ArrayList<Pahlawan> listPahlawan) {
        this.listPahlawan = listPahlawan;
    }

    private ArrayList<Pahlawan> listPahlawan;

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_pahlawan, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int position) {
        categoryViewHolder.tvName.setText(getListPahlawan().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListPahlawan().get(position).getRemarks());
        Glide.with(context)
                .load(getListPahlawan().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.linear.setOnClickListener(new View.OnClickListener()

        {@Override
        public void onClick(View v) {
        Intent i = new Intent(context.getApplicationContext(), DetailListPahlawan.class);
        i.putExtra("name", getListPahlawan().get(position).getName());
        i.putExtra("remarks", getListPahlawan().get(position).getRemarks());
        i.putExtra("desc", getListPahlawan().get(position).getDesc());
        i.putExtra("gambar", getListPahlawan().get(position).getPhoto());
        context.startActivity(i);

        }
         });
        }

    @Override
    public int getItemCount() {
        return getListPahlawan().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        TextView tvDesc;
        ImageView imgPhoto;
        LinearLayout linear;


        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvDesc = itemView.findViewById(R.id.tv_item_desc);
            linear = itemView.findViewById(R.id.linear);
        }
    }
}
