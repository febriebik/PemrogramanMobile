package com.example.user_pc.pahlawan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailListPahlawan extends AppCompatActivity {

        TextView tvName, tvRemarks, tvDesc;
        ImageView imgPhoto;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail_list);

            tvName= findViewById(R.id.tv_item_name);
            tvRemarks=findViewById(R.id.tv_item_remarks);
            tvDesc=findViewById(R.id.tv_item_desc);
            imgPhoto=findViewById(R.id.img_item_photo);

            Intent i = getIntent();

            String tvName1= i.getStringExtra("name");
            String tvRemarks1= i.getStringExtra("remarks");
            String imgPhoto1 = i.getStringExtra("gambar");
            String tvDesc1 = i.getStringExtra("desc");

            tvName.setText(tvName1);
            tvRemarks.setText(tvRemarks1);
            tvDesc.setText(tvDesc1);
            Glide.with(this)
                    .load(imgPhoto1)
                    .apply(new RequestOptions())
                    .into(imgPhoto);

        }
    }