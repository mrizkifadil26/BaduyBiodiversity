package com.example.mrizkifadil26.bioapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mrizkifadil26.bioapp.R;
import com.example.mrizkifadil26.bioapp.adapter.ObatAdapter;
import com.example.mrizkifadil26.bioapp.model.Obat;

import java.util.ArrayList;

public class ObatList extends AppCompatActivity {

    private static final String TAG = "ObatList";

    ArrayList<Obat> mObat = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obat_list);

        Log.d(TAG, "onCreate: started");

        setTitle("Tanaman Obat");
        prepareData();
    }

    private void prepareData() {
        Log.d(TAG, "prepareData: preparing.");

        mObat.add(new Obat(1,"Rane","Selaginella willdenowii Baker.","Selaginellaceae","Untuk khitanan, obat sariawan, obat sakit badan","Daun, batang","Dicampur dengan umbi kencur dan jahe, dikunyah dan diletakkan di kemaluan","0.1",R.drawable.rane_1));
        mObat.add(new Obat(2,"Jukut wisa","Achyranthes aspera L.","Amaranthaceae","Digigit ular","Daun","Ditumbuk dan balurkan ke luka","0.03",R.drawable.jukut_wisa_1));
        mObat.add(new Obat(3,"Hareundang","Clidemia hirta","Melastomataceae","Radang","Daun","Ditumbuk dan dioleskan","0.03",R.drawable.hareundang_1));
        mObat.add(new Obat(4,"Harendong","Melastoma malabathicum L.","Melastomataceae","Sakit maag, Sakit perut, Obat sakit badan.","Daun","Dimakan pucuknya","0.1",R.drawable.harendong));
        mObat.add(new Obat(5,"Palumpung","Merremia peltata (L.) Merr","Convolvulaceae","Agar perut bayi kuat, Obat batuk, Obat cacingan","Daun","Dileumpeuh dauunnya dan diletakkan di perut bayi atau dicampur dengan daun mara kemudian di rebus dan airnya diminum","0.1",R.drawable.palumpung_1));
        mObat.add(new Obat(6,"Jukut bau","Ageratum conyzoides","Asteraceae","Obat mag, Obat masuk angin, Obat sakit badan, Obat masuk angin, Obat sakit kepala, sakit panas.","Daun","Daun harendong, capeutuheur, jukut bau, dan mara di rebus dan airnya diminum","0.2",R.drawable.jukut_bau_1));
        mObat.add(new Obat(7,"Mara","Macaranga sp.","Euphorbiaceae","Obat maag, Agar perut bayi kuat, Agar air nira tambah segar","Daun","Daun harendong, capeutuheur, jukut bau, dama ara di rebus dan airnya diminum","0.1",R.drawable.mara));
        mObat.add(new Obat(8,"Pacing","Costus specious","Zingiberaceae","Di gigit ular, Obat bisul, Obat luka.","Batang","Dipupuy dibuih di oleskan, atau ditambah jukut wisa, jukut wisa","0.1",R.drawable.pacing_1));
        mObat.add(new Obat(9,"Dadap","Erythrina lithosperma","Fabaceae","Sakit panas, Obat gatal, meriang","Daun","Ditumbuk di balurkan ke kepala, atau Daun di tumbuk dan diperas dengan air, airnya diminum","0.1",R.drawable.dadap_1));
        mObat.add(new Obat(10,"Beunying","Ficus fistulosa Reinw","Moraceae","Obat batuk, Obat jantung.","Dibuat tuak batangnya","Tuaknya diminum","0.06",R.drawable.beunying_1));
        mObat.add(new Obat(11,"Nangsi","Villebrunea rubescens","Urticaceae","Obat batuk, Obat meriang, panas.","Dibuta tuak batangnya","Tuaknya/getahnya diminum","0.1",R.drawable.nangsi));
        mObat.add(new Obat(12,"Reundeu carat","Staurogyne elongata Bl.","Acanthaceae","Panas dalam, Obat panas, Obat sakit perut","Daun","Ditumbuk dengan daun capeu dan di beri air, air perasannya diminum","0.1",R.drawable.reundeu_carat));
        mObat.add(new Obat(13,"Ki toke","Galearia filiformis Pax.","Euphorbiaceae","Encok","Daun","Dipeprek dan dibalurkan di bagian yang encok","0.03",R.drawable.ki_toke_1));
        mObat.add(new Obat(14,"Jahe","Zingiber officinale Rosc.","Zingiberaceae","Obat batuk, Obat rematik, pilek.","Umbi","Umbinya ditumbuk dan diberi air, airnya diminum","0.1",R.drawable.jahe));
        mObat.add(new Obat(15,"Mayasih","Erechtites valerianifolia","Asteraceae","Rematik, Penambah darah, Obat encok","Daun muda","Dilalap","0.1",R.drawable.mayasih_1));
        mObat.add(new Obat(16,"Laja","Alpinia galanga Sw.","Zingiberaceae","Jamur kulit, Panu","Batang","Batangnya ditumbuk dan dioleskan ke kulit","0.6",R.drawable.laja_1));
        mObat.add(new Obat(17,"Cikur","Kaempferia galanga L.","Zingiberaceae","Obat untuk luka khitanan, Sakit badan","Rimpang","Dicampur dengan rimpang kencur dan jahe dikunyah dan diletakkan di kemaluan, atau rimpang di tumbuk dan dioleskan atau bisa di makan langsung","0.06",R.drawable.cikur_1));
        mObat.add(new Obat(18,"Capeu","Blumea balsamifera","Asteraceae","Sakit badan, setelah melahirkan, dan untuk bayi","Daun, Akar","Daunnya dan akarnya direbus air, kemudian airnya diminum. Untuk bayi, daunnya di tempel di perut","0.16",R.drawable.capeu_1));
        mObat.add(new Obat(19,"Jawer kotok","Solenostemon scutellarioides","Lamiaceae","Obat rematik, Obat panas dingin","Daun","Diremas dengan air dan diminum","0.06",R.drawable.jawer_kotok_1));
        mObat.add(new Obat(20,"Kateupeung","Senna alata (L.) Roxb.","Fabaceae","Obat gatal","Daun","Diremas dengan air dan diminum","0.06",R.drawable.kateupeung_1));
        mObat.add(new Obat(21,"Jambu batu","Psidium guajava L.","Myrtaceae","Obat diare, Obat gatal, Sakit perut","","","0",R.drawable.jambu_batu_1));
        mObat.add(new Obat(22,"Kacapi","Sandoricum koetjape Merr.","Meliaceae","Obat gatal, Sakit badan","Daun","Dibalurkan ke daerah yang gatal","0.06",R.drawable.ic_biologo_480));
        mObat.add(new Obat(23,"Awi","Gigantochloa apus Kurz.","Poaceae","Batuk, Obat mabuk/keracunan","Dibuat tuaknya","Dimunim air tuaknya","0.06",R.drawable.awi));
        mObat.add(new Obat(24,"Koneng","Curcuma domestica L","Zingiberaceae","Obat yang baru melahirkan, pegal linu, maag, Obat flu, masuk angin,","Umbi","Ditumbuk dan di beri air, air perasannya diminum","0.2",R.drawable.koneng_1));
        mObat.add(new Obat(25,"Koneng siang","","","Obat yang baru melahirkan, pegal linu, Obat flu, masuk angin,maag","Umbi","Ditumbuk dan di minum air perasannya","0.2",R.drawable.ic_biologo_480));
        mObat.add(new Obat(26,"Koneng bodas","","Zingiberaceae","Obat yang baru melahirkan, pegal linu, maag, Obat flu, masuk angin,","Umbi","Umbinya ditumbuk dan diberi air, airnya diminum","0.2",R.drawable.ic_biologo_480));
        mObat.add(new Obat(27,"Koneng gede","Curcuma xanthorrhiza Roxb.","Zingiberaceae","Obat yang baru melahirkan, pegal linu, maag, Obat flu, masuk angin,","Umbi","Umbinya ditumbuk dan diberi air, airnya diminum","0.2",R.drawable.ic_biologo_480));
        mObat.add(new Obat(28,"Panglai","Zingiber pupureum","Zingiberaceae","Obat gatal","Daun, umbi","Daunnya ditumbuk dan diletakkan di bagian yang gatal, atau umbinya digosokkan langsung","0.03",R.drawable.panglai));
        mObat.add(new Obat(29,"Nangkalawanda","Annona muricata L","Annonaceae","Sakit panas","Daun","Ditumbuk dan diletakkan di kepala","0.06",R.drawable.nangkala_wanda));
        mObat.add(new Obat(30,"Laja goah","Alpinia galanga (L.) Willd.","Zingiberaceae","Nafsu makan","Batang","Langsung dimakan","0.06",R.drawable.laja_goah_1));
        mObat.add(new Obat(31,"Buntiris","Kalanchoe crenata Andrews","Crassulaceae","Memar","Daun","Daunnya ditumbuk dan dibalurkan","0.06",R.drawable.buntiris_1));
        mObat.add(new Obat(32,"Limus","Mangifera foetida Lour.","Anacardiaceae","Obat kuat","Daun","Daun ditumbuk dan diberi air, airnya di minum","0.06",R.drawable.limus_1));
        mObat.add(new Obat(33,"Sereh","Andropogon nardus L.","Gramineae","Untuk anak yang masih ngompol","Pangkal batang","Pangkal batangnya langsung dimakan","0.03",R.drawable.sereh));
        mObat.add(new Obat(34,"Seureuh","Piper betle L.","Piperaceae","Agar gigi kuat","Daun","Apu, gambir, pinang dibungkus dengan daun seureuh kemudian di gosokkan ke gigi","0.06",R.drawable.seureuh));
        mObat.add(new Obat(35,"Kanyere","Bridelia monoica Merr.","Euphorbiaceae","Sakit kepala","Daun","Dipeureuhkeun ke mata","0.06",R.drawable.kanyere_1));
        mObat.add(new Obat(36,"Pecah beling","Strobilanthes crispus Bl.","Acanthaceae","Sakit kencing, kencing manis/diabetes","Daun","Dikucek dengan air dan air perasannya diminum","0.06",R.drawable.pecah_beling_1));
        mObat.add(new Obat(37,"Ki tajam","Polygala glomerata Lour.","Polygalaceae","Ambeyen","Daun muda","Langsung dimakan","0.13",R.drawable.ic_biologo_480));
        mObat.add(new Obat(38,"Cangkudu","Morinda citrifolia L.","Rubiaceae","Nafsu makan","Daun muda, buah","bisa langsung dimakan buahnya, daunnya ditumbuk dan diberi air, airnya diminum","0.13",R.drawable.cangkudu));
        mObat.add(new Obat(39,"Reungdeu","Staurogvne elongata","Acanthaceae","Melancarkan kencing","Daun","Daunnya ditumbuk dan diberi air dan airnya diminum","0.03",R.drawable.reungdeu));
        mObat.add(new Obat(40,"Antanan","Cantela asiatica","Apiaceae","Luka teriris, pegal-pegal","Daun","Untuk luka daunnya dikucek dan ditempelkan di luka, untuk pegal-pegal daunnya direbus dan dimakan","0.1",R.drawable.antanan));
        mObat.add(new Obat(41,"Nampong","Clibadium surinamense","Asteraceae","Penambah darah","Daun","Langsung dimakan","0.03",R.drawable.nampong));
        mObat.add(new Obat(42,"Lame putih","Alstonia scholaris L.","Apocynaceae","Pegal-pegal, sakit badan","Kulit","Direbus dan diminum airnya","0.06",R.drawable.lame_putih_1));
        mObat.add(new Obat(43,"Jambe","Areca catechu L.","Arecaceae","Obat kuat, untuk nyirih","Buah","Dimakan buahnya","0.06",R.drawable.jambe));
        mObat.add(new Obat(44,"Ki sabrang/Sungke","Peronema canescens","Verbenaceae","Sakit badan","Daun","Daun direbus dan airnya diminum","0.1",R.drawable.ki_sabrang_1));
        mObat.add(new Obat(45,"Wera","Hibiscus rosa-sinensis","Malvaceae","Obat Rambut","Daun","Daunnya dikucek dan di oleskan kerambut, kemudian rambut dibilas","0.03",R.drawable.wera));
        mObat.add(new Obat(46,"Ki calung","Momordica cochinchinensis Spreng","Cucurbitaceae","Amandel, Kencing manis, Sakit tenggorokan","Daun","Daunnya ditumbuk dan diminum airnya","0.1",R.drawable.ki_calung_1));
        mObat.add(new Obat(47,"Cecenet","Physalis angulata L.","Solanaceae","Kanker","Daun","Daunnya direbus dan diminum airnya","0.03",R.drawable.cecenet));
        mObat.add(new Obat(48,"Jampang pait","Paspalum conjugatum Berg.","Poaceae","Obat teriris","Daun","Daunnya dihancurkan dengan tangan dan diletakkan di luka","0.03",R.drawable.jampang_pait_1));
        mObat.add(new Obat(49,"Kumis kucing","Orthosiphon stamineus","Lamiaceae","Semua penyakit","Daun","Direbus dan diminum airnya","0.16",R.drawable.kumis_kucing_1));
        mObat.add(new Obat(50,"Paku peupeur","","","Patah tulang","Daun","Bisa dimakan/dibalurkan yang sebelumnya ditumbuk terlebih dahulu daunnya","0.13",R.drawable.paku_peupeur));
        mObat.add(new Obat(51,"Jirak bodas","Symplocos javanica Kurz.","Caesalpiniaceae","Batu ginjal","Tuak","Tuaknya diminum","0.1",R.drawable.jirak_bodas));
        mObat.add(new Obat(52,"Palered","","","Luka iris","Daun","Dicuci dan dihancurkan dengan tangan dan diletakkan di luka","0.03",R.drawable.paku_bedak));
        mObat.add(new Obat(53,"Paku bedak","","","Sakit perut","Daun","Ditumbuk dan dimakan","0.03",R.drawable.ki_batuk));
        mObat.add(new Obat(54,"Ki batuk","","","Obat batuk","Daun muda","Dimakan langsung","0.03",R.drawable.jukut_hideung));
        mObat.add(new Obat(55,"Jukut hideung","","","Obat panas","Daun","Dikucek","0.13",R.drawable.ic_biologo_480));
        mObat.add(new Obat(56,"Angsana","Pterocarpus indicus Willd","Fabaceae","Sariawan, sakit gigi","Getah","Langsung dikenai pada sariawan/sakit gigi","0.06",R.drawable.ic_biologo_480));
        mObat.add(new Obat(57,"Annul","","","Obat gatal/Cacar","Daun/ kulit batang","Daun ditumbuk dan ditambah sedikit air dan dioleskan","0.1",R.drawable.ic_biologo_480));
        mObat.add(new Obat(58,"Kisarini","","","Agar badan berisi/penambah berat badan","Daun","Ditumbuk dan diminum air perasannya","0.06",R.drawable.jukut_palengpeng));
        mObat.add(new Obat(59,"Jukut palengpeng","","","Obat kurang pendengaran","Rimpang","Umbinya dibakar dan ditempelkan ke telinga","0.03",R.drawable.ki_caang));
        mObat.add(new Obat(60,"Ki Caang","","","Membersihkan rambut","Daun","Daun ki caang dan batang honje ditumbuk dan diratakan di rambut","0.03",R.drawable.tengek_caah));
        mObat.add(new Obat(61,"Tengek Caah","","","Anak kecil yang belum lancar jalan atau yang belum lancar bicara","Daun muda","Daunnya langsung dimakan","0.06",R.drawable.ic_biologo_480));
        mObat.add(new Obat(62,"Ginggiang","","","Obat terkena air panas","Daun","Dihancurkan dengan tangan dan dikenakan di daerah yang terkena air panas","0.08",R.drawable.ic_biologo_480));
        mObat.add(new Obat(63,"Jukut tiis","","","Digigit ular","Semua bagian","Ditumbuk dan dibalurkan ke luka","0.06",R.drawable.ic_biologo_480));
        mObat.add(new Obat(64,"Ki Peruh","","","Sakit badan, suara serak","Daun","Direbus dan diminum airnya","0.06",R.drawable.ic_biologo_480));
        mObat.add(new Obat(65,"Angkasa","","","Nafsu makan, maag","Barus (batang muda di paling dalam)","Langsung dimakan","0.06",R.drawable.ic_biologo_480));
        mObat.add(new Obat(66,"Hantu kalabang","","","Sakit kepala","Semua bagian","Dililitkan di kepala","0.03",R.drawable.hantu_kalabang));
        mObat.add(new Obat(67,"Sihurungan","","","Obat alergi","Buah","Buahnya langsung dimakan","0.03",R.drawable.ic_biologo_480));
        mObat.add(new Obat(68,"Tikadal","","","Obat rambut agar sehat","Daun","Daunnya ditumbuk dan dioleskan ke rambut","0.03",R.drawable.ic_biologo_480));
        mObat.add(new Obat(69,"Buah balang","","","Cacingan","Buah","Buahnya dijemur dan ditumbuk, diminum seperti kopi.","0.03",R.drawable.buah_balang));
        mObat.add(new Obat(70,"Ki Calung","","","Amandel, kencing manis, Sakit tenggorokan","Daun","Daunnya ditumbuk dan diminum airnya","0.1",R.drawable.ic_biologo_480));
        mObat.add(new Obat(71,"Capeutuheur","Mikunia cordata","Composite","Obat maag","Daun","Daun harendong, capeutuheur, jukut bau, dan mara direbus dan airnya diminum","0.16",R.drawable.ic_biologo_480));
        mObat.add(new Obat(72,"Rane diuk","Selaginella braunii Baker","Selaginellaceae","Luka terkena ular","Daun","Daunnya ditumbuk dan dioleskan pada luka","0.03",R.drawable.ic_biologo_480));


        initRecyclerObat();
    }

    private void initRecyclerObat() {
        Log.d(TAG, "initRecyclerObat: initializing.");

        RecyclerView recyclerObat = (RecyclerView) findViewById(R.id.recycler_obat);
        ObatAdapter mAdapter = new ObatAdapter(this, mObat);
        recyclerObat.setAdapter(mAdapter);
        recyclerObat.setLayoutManager(new LinearLayoutManager(this));
    }
}
