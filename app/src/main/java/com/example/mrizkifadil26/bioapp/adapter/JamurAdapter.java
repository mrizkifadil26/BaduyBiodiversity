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
import com.example.mrizkifadil26.bioapp.activities.JamurDetailActivity;
import com.example.mrizkifadil26.bioapp.model.Jamur;

import java.util.ArrayList;

public class JamurAdapter extends RecyclerView.Adapter<JamurAdapter.ViewHolder> {

    private static final String TAG = "JamurAdapter";

    private ArrayList<Jamur> mJamur;

    private Context mContext;

    public JamurAdapter(Context mContext, ArrayList<Jamur> mJamur) {
        this.mJamur = mJamur;
        this.mContext = mContext;
    }

    @Override
    public JamurAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_jamur_list, viewGroup, false);

        JamurAdapter.ViewHolder holder = new JamurAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(JamurAdapter.ViewHolder viewHolder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        viewHolder.namaLokalJamur.setText(mJamur.get(position).getNamaLokal());
        viewHolder.namaIlmiahJamur.setText(mJamur.get(position).getNamaIlmiah());
        viewHolder.imageJamur.setImageResource(mJamur.get(position).getGambar());
        viewHolder.uvTextJamur.setText(mJamur.get(position).getUv());

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on" + mJamur.get(position).getNamaLokal());

                Intent intent = new Intent(mContext, JamurDetailActivity.class);
                intent.putExtra("namaLokal", mJamur.get(position).getNamaLokal());
                intent.putExtra("namaIlmiah", mJamur.get(position).getNamaIlmiah());
                intent.putExtra("famili", mJamur.get(position).getFamili());
                intent.putExtra("lokasi", mJamur.get(position).getLokasi());
                intent.putExtra("manfaat", mJamur.get(position).getManfaat());
                intent.putExtra("uv", mJamur.get(position).getUv());
                intent.putExtra("gambarJamur", mJamur.get(position).getGambar());

                mContext.startActivity(intent);

//                Toast.makeText(mContext, mSpecies.get(position).getName(), Toast.LENGTH_SHORT).show();
            }

        });
    }

    @Override
    public int getItemCount() {
        return mJamur.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageJamur;
        CardView parentLayout;
        TextView namaLokalJamur, namaIlmiahJamur, uvTextJamur;

        public ViewHolder(View itemView) {
            super(itemView);

            imageJamur = (ImageView) itemView.findViewById(R.id.jamur_image);
            parentLayout = (CardView) itemView.findViewById(R.id.parent_jamur);
            namaLokalJamur = (TextView) itemView.findViewById(R.id.jamur_nama);
            namaIlmiahJamur = (TextView) itemView.findViewById(R.id.jamur_nama_ilmiah);
            uvTextJamur = (TextView) itemView.findViewById(R.id.jamur_uv);
        }
    }

}
