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
import com.example.mrizkifadil26.bioapp.activities.ObatDetailActivity;
import com.example.mrizkifadil26.bioapp.model.Obat;

import java.util.ArrayList;

public class ObatAdapter extends RecyclerView.Adapter<ObatAdapter.ViewHolder> {

    private static final String TAG = "ObatAdapter";

    private ArrayList<Obat> mObat;

    private Context mContext;

    public ObatAdapter(Context mContext, ArrayList<Obat> mObat) {
        this.mObat = mObat;
        this.mContext = mContext;
    }

    @Override
    public ObatAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_obat_list, viewGroup, false);

        ObatAdapter.ViewHolder holder = new ObatAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ObatAdapter.ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.namaLokalObat.setText(mObat.get(position).getNamaLokal());
        viewHolder.namaIlmiahObat.setText(mObat.get(position).getNamaIlmiah());
        viewHolder.imageObat.setImageResource(mObat.get(position).getGambar());
        viewHolder.uvTextObat.setText(mObat.get(position).getUv());

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on" + mObat.get(position).getNamaLokal());

                Intent intent = new Intent(mContext, ObatDetailActivity.class);
                intent.putExtra("namaLokal", mObat.get(position).getNamaLokal());
                intent.putExtra("namaIlmiah", mObat.get(position).getNamaIlmiah());
                intent.putExtra("famili", mObat.get(position).getFamili());
                intent.putExtra("penyakit", mObat.get(position).getPenyakit());
                intent.putExtra("bagianTanaman", mObat.get(position).getBagianTanaman());
                intent.putExtra("caraPenggunaan", mObat.get(position).getCaraPenggunaan());
                intent.putExtra("uv", mObat.get(position).getUv());
                intent.putExtra("gambarObat", mObat.get(position).getGambar());

                mContext.startActivity(intent);

//                Toast.makeText(mContext, mSpecies.get(position).getName(), Toast.LENGTH_SHORT).show();
            }

        });
    }

    @Override
    public int getItemCount() {
        return mObat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageObat;
        CardView parentLayout;
        TextView namaLokalObat, namaIlmiahObat, uvTextObat;

        public ViewHolder(View itemView) {
            super(itemView);

            imageObat = (ImageView) itemView.findViewById(R.id.imageObat);
            parentLayout = (CardView) itemView.findViewById(R.id.parent_obat);
            namaLokalObat = (TextView) itemView.findViewById(R.id.namaObat);
            namaIlmiahObat = (TextView) itemView.findViewById(R.id.namaIlmiahObat);
            uvTextObat = (TextView) itemView.findViewById(R.id.uvObatValue);
        }
    }

}
