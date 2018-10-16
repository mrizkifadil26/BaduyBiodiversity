package com.example.mrizkifadil26.bioapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mrizkifadil26.bioapp.R;
import com.example.mrizkifadil26.bioapp.adapter.JamurAdapter;
import com.example.mrizkifadil26.bioapp.model.Jamur;

import java.util.ArrayList;

public class JamurList extends AppCompatActivity {

    private static final String TAG = "JamurList";

    ArrayList<Jamur> mJamur = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamur_list);

        Log.d(TAG, "onCreate: started");

        setTitle("Tanaman Jamur");
        prepareData();
    }

    private void prepareData() {
        Log.d(TAG, "prepareData: preparing.");

        mJamur.add(new Jamur(1,"Supa Cau", "Lentinus sp.", "Lentinus", "Di tanah, Di daerah ladang Cikartawana", "Dapat dikonsumsi", "0.03", R.drawable.supa_cau));
        mJamur.add(new Jamur(2,"Supa Bereum", "Pycnoporus sp.", "Pycnoporus", "Di tanah, Di daerah ladang cikartawana", "Dapat digunakan sebagai obat bengkak", "0.03", R.drawable.supa_bereum));
        mJamur.add(new Jamur(3,"Supa Kayas Hideng","Rigidoporus sp.","Meripilaceae","di kayu di ladang Cikartawana","Tidak dapat dikonsusmi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(4,"Supa Lumar Kiray","Mycena sp.","Mycenaceae","di kayu di sekitar jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_lumar_kiray));
        mJamur.add(new Jamur(5,"Supa Lumar Catang","Rigidoporus sp.","Meripilaceae","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_lumar_catang));
        mJamur.add(new Jamur(6,"Supa Padali","Cellulariella sp.","Polyporaceae","di kayu di daerah sekitar sungai Cikartawana","Ada yang dapat dikonsusmi ada yang tidak dapat dikonsusmi","0",R.drawable.supa_padali));
        mJamur.add(new Jamur(7,"Supa Kayas 2","","","di kayu di daerah ladang Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_kayas_2));
        mJamur.add(new Jamur(8,"Supa Payung", "", "","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_payung));
        mJamur.add(new Jamur(9,"Supa Kincir Coklat", "", "","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_kincir_coklat));
        mJamur.add(new Jamur(10,"Supa Kayas Bereum","Laetiporus sp.","Polyporaceae","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_kayas_bereum));
        mJamur.add(new Jamur(11,"Supa Tanah","Coprinus sp.","Psathyrellaceae","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_tanah));
        mJamur.add(new Jamur(12,"Supa Amis", "", "","di tanah di daerah sekitar kampung","Dapat dikonsumsi","0.03",R.drawable.supa_amis));
        mJamur.add(new Jamur(13,"Supa Tutung","Fomitopsis sp.","Fomitopsidae","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_tutung));
        mJamur.add(new Jamur(14,"Supa Lember Lutung","Auricularia sp.","Auriculariaceae","di kayu mati di daerah ladang dan sungai Cikeusik","Dapat dikonsusmi","0.03",R.drawable.supa_lember_lutung));
        mJamur.add(new Jamur(15,"Supa Lember Sangu","Auricularia sp.","Auriculariaceae","di kayu mati di daerah ladang dan sungai Cikeusik","Dapat dikonsusmi","0.03",R.drawable.supa_lember_sangu));
        mJamur.add(new Jamur(16,"Supa Kincir Bereum","Sarcoscypha sp.","Sarcoscyphaceae","di kayu hutan kolot Cikartawana","Dapat digunakan sebagai obat pusing 7 keliling","0.03",R.drawable.supa_kincir_bereum));
        mJamur.add(new Jamur(17,"Supa Tutung Bodas","","","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0.03",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(18,"Supa Tutung Hideng","","","di kayu di hutan kolot Cikartawana","Tidak dapat dikonsumsi","0.03",R.drawable.supa_tutung_hideng));
        mJamur.add(new Jamur(19,"Supa Akar","","","di kayu di hutan kolot Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_akar));
        mJamur.add(new Jamur(20,"Supa Baseh","","","di tanah di daerah sungai Cikartawana","Dapat dikonsumsi","0.03",R.drawable.supa_baseh));
        mJamur.add(new Jamur(21,"Supa Mireg","","","di kayu mati di daerah ladang dan sungai Cikartawana","Dapat dikonsumsi","0.03",R.drawable.supa_mireg));
        mJamur.add(new Jamur(22,"Supa Akar 2","","","di kayu mati di daerah ladang Cikartawana","Tidak dapat dikonsumsi","0.03",R.drawable.supa_akar_2));
        mJamur.add(new Jamur(23,"Supa Kayas Putih","Trametes sp.","Polyporaceae","di kayu mati di daerah jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_kayas_putih));
        mJamur.add(new Jamur(24,"Supa Jarami","","","di kayu mati di daerah ladang dan sekitar sungai Cikeusik","Dapat dikonsumsi","0.03",R.drawable.supa_jarami));
        mJamur.add(new Jamur(25,"Supa Kayas Coklat","Ganoderma sp.","Ganodermataceae","di kayu di jalan Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_kayas_coklat));
        mJamur.add(new Jamur(26,"Supa Padali 2","","","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_padali_2));
        mJamur.add(new Jamur(27,"Suum Cau Hideng","Volvariela sp.","Pluteaceae","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(28,"Suum Cau Orange","","","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(29,"Suum Cau Leutik","Coprinus sp.","","di kayu di jalan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(30,"Supa Kayu Putih","","","di kayu mati di daerah ladang perbatasan Cikartawana dan cikeusik","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(31,"Supa Koneng","Calocera sp. ","Dacrymycetales","di kayu mati di daerah ladang perbatasan Cikartawana dan cikeusik","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(32,"Supa Kayu Hejo","","","di kayu mati di daerah ladang perbatasan Cikartawana dan cikeusik","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(33,"Supa Bangkong","","","di kayu hidup di jalan hutan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(34,"Supa Akar Hideng","Laccaria sp.","Hydnangiaceae","di akar pohon durian di daerah jalan hutan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(35,"Supa Batok","Cyathus sp.","Nidulariaceae","di kayu batok kelapa di jalan hutan Cikartawana","Tidak dapat dikonsumsi", "0", R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(36,"Supa Tai Kotok","Lepiota sp.","Lepiotaceae","di tanah di daerah jalan hutan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(37,"Supa Kasongket","","","di tanah berlumut di jalan hutan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.ic_biologo_480));
        mJamur.add(new Jamur(38,"Supa Tikukur","","","di kayu mati di daerah jalan keluar Cikeusik","Dapat dikonsumsi","0.03",R.drawable.supa_tikukur));
        mJamur.add(new Jamur(39,"Supa Bayaka","Ganoderma sp.","","di kayu hidup di daerah jalan keluar Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_bayaka));
        mJamur.add(new Jamur(40,"Supa Jangkar","","","di akar pohon bambu di daerah hutan kolot Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_jangkar));
        mJamur.add(new Jamur(41,"Supa Tanah","Conocybe sp.","","di tanah di daerah hutan kolot Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_tanah));
        mJamur.add(new Jamur(42,"Supa Arey","","","di akar pohon di daerah hutan kolot Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_arey));
        mJamur.add(new Jamur(43,"Supa Catang","Gymnopus sp.","Omphalotaceae","di kayu lapuk bambu di daerah hutan kolot Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_catang));
        mJamur.add(new Jamur(44,"Supa Awi","","","di pohon bambu mati di daerah hutan kolot Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_awi));
        mJamur.add(new Jamur(45,"Supa Cau 2","","","di tanah sekitar pohon pisang di daerah hutan kolot Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_cau_2));
        mJamur.add(new Jamur(46,"Supa Taneh 2","Caprinus sp.","Psathyrellaceae","di tanah di daerah hutan kolot Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_taneh_2));
        mJamur.add(new Jamur(47,"Supa Kamanden","Amaroderma sp.","Ganodermataceae","di kayu di ladang Cikeusik","Dapat digunakan sebagai obat kamanden","0.03",R.drawable.supa_kamanden));
        mJamur.add(new Jamur(48,"Supa Kayang","Daedalea sp.","Fomitopsidaceae","di kayu hidup di daerah ladang Baduy Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_kayang));
        mJamur.add(new Jamur(49,"Supa Koja","Clavaria sp.","Clavariaceae","di tanah di daerah sekitar sungai Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_koja));
        mJamur.add(new Jamur(50,"Supa Kiray","Mycena sp.","Mycenaceae","di pohon kiray hidup di daerah hutan Cikartawana","Tidak dapat dikonsumsi","0",R.drawable.supa_kiray));
        mJamur.add(new Jamur(51,"Supa Nyiruan","","","di kayu mati di daerah sekitar ladang Cikartawana","Dapat dikonsumsi","0.03",R.drawable.supa_nyiruan));
        mJamur.add(new Jamur(52,"Supa Kasungka","","","di kayu hidup di daerah sekitar ladang Cikeusik","Tidak dapat dikonsumsi","0",R.drawable.supa_kasungka));


        initRecyclerJamur();
    }

    private void initRecyclerJamur() {
        Log.d(TAG, "initRecyclerJamur: initializing.");

        RecyclerView recyclerJamur = (RecyclerView) findViewById(R.id.recycler_jamur);
        JamurAdapter mAdapter = new JamurAdapter(this, mJamur);
        recyclerJamur.setAdapter(mAdapter);
        recyclerJamur.setLayoutManager(new LinearLayoutManager(this));
    }
}
