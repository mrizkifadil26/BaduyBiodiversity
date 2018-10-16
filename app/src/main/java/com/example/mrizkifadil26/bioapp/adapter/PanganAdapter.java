package com.example.mrizkifadil26.bioapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mrizkifadil26.bioapp.R;
import com.example.mrizkifadil26.bioapp.activities.PanganDetailActivity;
import com.example.mrizkifadil26.bioapp.model.Pangan;

import java.util.ArrayList;

public class PanganAdapter extends RecyclerView.Adapter<PanganAdapter.ViewHolder> {

    private static final String TAG = "PanganAdapter";

    private ArrayList<Pangan> mPangan;

    private Context mContext;

    public PanganAdapter(Context mContext, ArrayList<Pangan> mPangan) {
        this.mPangan = mPangan;
        this.mContext = mContext;
    }

    @Override
    public PanganAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_pangan_list, viewGroup, false);

        PanganAdapter.ViewHolder holder = new PanganAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PanganAdapter.ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.namaLokalPangan.setText(mPangan.get(position).getNamaLokal());
        viewHolder.namaIlmiahPangan.setText(mPangan.get(position).getNamaIlmiah());
        viewHolder.imagePangan.setImageResource(mPangan.get(position).getGambar());
        viewHolder.uvTextPangan.setText(mPangan.get(position).getUv());

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on" + mPangan.get(position).getNamaLokal());

                Intent intent = new Intent(mContext, PanganDetailActivity.class);
                intent.putExtra("namaLokal", mPangan.get(position).getNamaLokal());
                intent.putExtra("namaIlmiah", mPangan.get(position).getNamaIlmiah());
                intent.putExtra("famili", mPangan.get(position).getFamili());
                intent.putExtra("fungsiUtama", mPangan.get(position).getFungsiUtama());
                intent.putExtra("fungsiSamping", mPangan.get(position).getFungsiSamping());
                intent.putExtra("uv", mPangan.get(position).getUv());
                intent.putExtra("gambarObat", mPangan.get(position).getGambar());

                mContext.startActivity(intent);

//                Toast.makeText(mContext, mSpecies.get(position).getName(), Toast.LENGTH_SHORT).show();
            }

        });
    }

    @Override
    public int getItemCount() {
        return mPangan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imagePangan;
        CardView parentLayout;
        TextView namaLokalPangan, namaIlmiahPangan, uvTextPangan;

        public ViewHolder(View itemView) {
            super(itemView);

            imagePangan = (ImageView) itemView.findViewById(R.id.pangan_image);
            parentLayout = (CardView) itemView.findViewById(R.id.parent_pangan);
            namaLokalPangan = (TextView) itemView.findViewById(R.id.pangan_name);
            namaIlmiahPangan = (TextView) itemView.findViewById(R.id.pangan_ilmiah);
            uvTextPangan = (TextView) itemView.findViewById(R.id.pangan_uv);
        }
    }

}
