package com.example.mrizkifadil26.bioapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mrizkifadil26.bioapp.R;
import com.example.mrizkifadil26.bioapp.adapter.PanganAdapter;
import com.example.mrizkifadil26.bioapp.model.Pangan;

import java.util.ArrayList;

public class PanganList extends AppCompatActivity {

    private static final String TAG = "PanganList";

    ArrayList<Pangan> mPangan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangan_list);

        Log.d(TAG, "onCreate: started");

        setTitle("Tanaman Pangan");
        prepareData();
    }

    private void prepareData() {
        Log.d(TAG, "prepareData: preparing");

        mPangan.add(new Pangan(1, "Cau Abu", "Musa Paradisiaca L.", "Musaceae", "Bunga:\n" +
                "Disayur santen, Ditumis, Disambel, Dimakan Langsung, Direbus, Dikukus\n" +
                "Buah:\n" +
                "Diperam hingga masak, Digoreng pakai tepung atau tidak, Direbus, Dikukus, Dibakar.", "Daun:\n" +
                "Untuk pembungkus", "0.33", R.drawable.ic_biologo_480));

        mPangan.add(new Pangan(2, "Cau paray", "Musa Paradisiaca L.", "Musaceae", "Buah: diperam hingga masak, dimakan langsung", "Daun: untuk pembungkus", "0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(3, "Cau emas", "Musa Paradisiaca L.", "Musaceae", "Buah: diperam hingga masak, dimakan langsung", "Daun: untuk pembungkus", "0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(4, "Tundun/Rambutan", "Nephelium lappaceum L.", "Sapindaceae", "Buah: dimakan langsung", "Daun: dikompres untuk penurun panas", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(5, "Ranji", "Dialium indum L.", "Fabaceae", "Buah: dimakan langsung", "-", "0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(6, "Cau galek", "Musa Paradisiaca L.", "Musaceae", "Buah: diperam hingga masak, dimakan langsung", "Daun: untuk pembungkus", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(7, "Cengkaleng/ kawung/aren", "Arenga pinnata Merr.", "Arecaceae", "Tuak : dibuat gul kawung; \n" +
                "Batang : dibuat sagu; \n" +
                "Batang muda/Birus : dimakan langsung, disayur bening, sayur santen; \n" +
                "Buah : dibuat campuran minuman", "-", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(8, "Pandan", "Pandanus amaryllifolius Roxb.", "Pandanaceae", "Pewangi dan bumbu", "-", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(9, "Cau paray", "Musa Paradisiaca L.", "Musaceae", "Buah langsung dimakan", "Daun untuk pembungkus", "0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(10,"Taleus bogor", "Colocasia gigantea Hook.", "Araceae", "Umbi : direbus, dikukus, digoreng, dibakar; \n" + "Batang muda/Birus : disayur bening", "-", "0.16", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(11,"Taleus endog","Colocasia esculenta (L.) Schott","Araceae","Umbi : direbus, dikukus, digoreng, dibakar\n" + "Batang muda/Birus : disayur Bening","-","0.16",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(12,"Binglu/ kemang","Mangifera caesia Jack.","Anacardiaceae","Buah dimakan langsung","-","0.03",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(13,"Semangka","Citrulus vulgaris Schard.","Cucurbitaceae","Buah dimakan langsung","-","0.03",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(14,"Limus","Mangifera foetida Lour.","Anacardiaceae","Buah dimakan langsung","-","0.03",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(15,"Kaweni","Mangifera odorata Griff","Anacardiaceae","Daun muda dan buah Dimakan langsung","-","0.06",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(16,"Cecenet","Physalis angulata L.","Solanaceae","Akar dan buah Akar : direbus lalu diminum\n"+"Buah: dimakan langsung","Akar (direbus lalu diminum) untuk obat susah buang air karena makan jengkol","0.1",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(17,"Muncang","Aleurites moluccana","Euphorbiaceae","Bumbu masak","Daun bungkus tape, biji untuk","0.1",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(18,"Honje","Nicolaia solaris var. Aurantiaca Horan.","Zingiberaceae","Batang muda/Birus : dimakan langsung, disambel\n"+"Buah : disambal, dan untuk penambah rasa asam pada sambal","tuak dan batang muda dimakan langsung sebagaiobat sakit kuning","0.2",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(19,"Tiwu","Saccharum officinarum L.","Poaceae","Buah : dimakan langsung", "-", "0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(20,"Kadu","Durio zibethinus Murr.","Bombacaceae","Buah dimakan langsung","Bahan bangunan","0.06",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(21,"Cau gembor","Musa Paradisiaca L.","Musaceae","Buah dimakan langsung","Daun untuk pembungkus","0.06",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(22,"Teureup","Artocarpus elasticus Bl.","Moraceae","Buah : dimakan langsung\n"+"Biji : disangrai","-","0.06",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(23,"Mayasih/Sintrong","Erechtites valerianifolia (Wolf.) DC","Asteraceae","Daun dimakan langsung","-","0.03",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(24,"Mantang (Ubi Jalar)","Ipomoea batatas","Convolvulaceae","Umbinya direbus, digodog,dibakar, \'dibubuy\', digoreng, dikolek, dibuat tape, comro","-","0.26",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(25,"Cau kulutuk hideng","Musa paradisiaca L.","Musaceae","Buah dimakan langsung","Daun untuk pembungkus","0.06",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(26,"Huwii ramo","Dioscorea sp.","Dioscoreaceae","Umbi : direbus, dikukus, digoreng, dibakar\n"+"Daun muda : disayur, dikukus, dimakan langsung","-","0.23",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(27,"Pari","Mangifera similis Bl.","Anacardiaceae","Buah dimakan langsung","-","0.03",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(28,"Picung","Pangium edule Reinw.","Flacourtiaceae","Sayur/Lalap","-","0.03",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(29,"Hanjeli","Coix lacryma-jobi L.","Poaceae","Ditanak sebagai nasi, dijadikan tape, dan kue dicampur gula/kue gipang","-","0.1",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(30,"Kupa","Syzygium polycephala Miq.","Myrtaceae","Buah dimakan langsung","-","0.03",R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(31,"Takokak","Solanum torvum Swartz.","Solanaceae","Buah Dimakan langsung, direbus, disambel, dikukus","-","0.13", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(32,"Jengkol","Pithecellobium lobatum Benth","Fabaceae","Dimakan langsung, di sayur, dibuat kerupuk, disayur santan, direbus, dibakar.","Daun untuk obat sakit kulit","0.23", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(33,"Parasi","Curculigo latifolia Dryand.","Amarillydaceae","Buah dimakan langsung","Batang muda untuk obat gigitan ular","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(34,"Cau papan","Musa Paradisiaca L","Musaceae","Buah dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(35,"Salak","Salacca edulis Reinw.","Arecaceae","Buah dimakan langsung","Daun untuk obat panas dalam, dan obat mencret","0.1", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(36,"Reungdeu","Staurogyne elongata Bl","Acanthaceae","Daun muda dimakan langsung","Daun untuk obat demam","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(37,"Kalapa hejo","Cocos nucifera L","Arecaceae","Batang muda/Birus: dimakan langsung, disayur bening, di oseng\n"+"Buah: dimakan langsung, sebagai bumbu (santan)","Duwegan/kelapa muda sumber minuman dan rujak","0.23", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(38,"Cau beleum","Musa Paradisiaca L.","Musaceae","Bunga : disayur santen, direbus, disambel, dimakan langsung, ditumis\n"+"Buah: direbus, dibakar, digoreng, dimakan langsung","Daun untuk pembungkus","0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(39,"Jambu mbol","Syzygium malaccense L.","Myrtaceae","Buah Dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(40,"Jaat","Psopocarpus tetragonolobus DC.","Fabaceae","Buah: dimakan langsung, direbus, disayur bening, disayur santen, ditumis\n"+"Biji: yang tua disangrai","-","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(41,"Cau kepok","Musa Paradisiaca L.","Musaceae","Bunga : disayur santen, ditumis, disambel, dimakan langsung, direbus,dikukus\n"+"Buah: diperam hingga masak, digoreng pakai tepung atau tidak,direbus, dikukus, dibakar.","Daun untuk pembungkus","0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(42,"Menteng","Baccaurea racemosa Muell. Arg.","Euphorbiaceae","Daun dan Buah dimakan langsung","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(43,"Manggu","Garcinia mangostana L.","Clusiaceae","Buah dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(44,"Nangka","Artocarpus heterophyllus Lmk.","Moraceae","Buah Dimakan langsung, yang muda disayur","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(45,"Cereme","Phyllanthus acidus Skeels.","Euphorbiaceae","Daun dan buah Sebagai perasa asam pada sambal","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(46,"Markisa","Passiflora edulis Sims.","Passifloraceae","Buah dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(47,"Cau gejloh","Musa paradisiaca L.","Musaceae","Bunga: disayur santen, ditumis, disambel, dimakan langsung, direbus, dikukus\n"+"Buah: diperam hingga masak, digoreng pakai tepung atau tidak,direbus, dikukus, dibakar","Daun untuk pembungkus","0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(48,"Boled","Gymnopetalum integrifolium Kurz.","Cucurbitaceae","Daun muda: dikukus, dipepes\n"+"Buah: disayur dengan santan, disayur bening, direbus","-","0.16", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(49,"Jagong","Zea mays L.","Poaceae","Buah yang muda disayur bening, dan digoreng dengan tepung.","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(50,"Seuhang","Ficus grossularioides Burm.f.","Moraceae","Daun muda: dimakan langsung, disayur santen, sayur bening, untuk pembukus ikan (dimakan)\n"+"Buah: dimakan langsung","Getah untuk obat luka","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(51,"Kundur","Benincasa hispida (Thunb.) Cogn.","Cucurbitaceae","Buah: disayur bening, disayur santen, direbus, dioseng\n"+"Biji: disangrai","Biji disangrai lalu di makan untuk menurunkan gula darah","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(52,"Lopang","Luffa cylindrica Roem.","Cucurbitaceae","Buah Dioseng, ditumis, disayur santen, disambel","-","0.13", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(53,"Waluh","Curcubita pepo","Cucurbitaceae","Daun muda: dikukus\n"+"Buah: disayur bening, sayur santen, dikukus","Akar untuk melancarkan buang air kecil dengan caradirebus dan diminum airnya\n"+"Daun: untuk membungkus lauk dan dimakan","0.16", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(54,"Cau gembor","Musa paradisiaca L","Musaceae","Bunga: disayur santen, ditumis, disambel, dimakan langsung, direbus, dikukus\n"+"Buah: diperam hingga masak, digoreng pakai tepung atau tidak, direbus, dikukus, dibakar","Daun untuk pembungkus","0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(55,"Nangka beurit","Artocarpus champeden Spreng.","Moraceae","Buah Dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(56,"Terong hijau","Solanum melongena L.","Solanaceae","Buah Dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(57,"Sasawi/Sawi","Brassica rugosa Prain.","Cruciferae","Daun Dimakan langsung, dikukus, direbus, disayur bening, sayur santen, ditumis, dioseng","-","0.23", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(58,"Cau mulih","Musa Paradisiaca L.","Musaceae","Buah dimakan langsung","Daun untuk pembungkus","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(59,"Huwi kalapa","Dioscorea alata L.","Diocoreaceae","Umbi: direbus, dikukus, digoreng, dibakar\n"+"Daun muda: disayur. dikukus, dimakan langsung","-","0.23", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(60,"Rampai","Solanum lycopersicum var. cerasiforme L.","Solanaceae","Buah disambel","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(61,"Gamas","Sechium edule (Jacq.) Swartz","Cucurbitaceae","Daun muda: disayur bening\n"+"Buah: disayur bening, direbus, ditumis, dioseng","Meredakan panas dalam","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(62,"Mangga","Mangifera indica L.","Anacardiaceae","Buah dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(63,"Jeruk nipis","Citrus aurantifolia","Rutaceae","Buah dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(64,"Taleus hideng","Colocasia esculenta (L.) Schott","Araceae","Umbi: direbus, dikukus, digoreng, dibakar\n"+"Batang muda/Birus: disayur bening","Getah untuk obat luka bakar","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(65,"Taleus hejo","Colocasia esculenta (L.) Schott","Araceae","Umbi: direbus, dikukus, digoreng, dibakar\n"+"Batang muda/Birus: disayur","Getah untuk obat luka bakar","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(66,"Antanan","Centella asiatica Urban.","Apiaceae","Dilalap, disayur santen, dikukus, di tumis","-","0.13", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(67,"Cau lutung","Musa paradisiaca L.","Musaceae","Buah dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(68,"Cau uli","Musa paradisiaca L.","Musaceae","Buah dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(69,"Dukuh","Lansium domesticum Corr.","Meliaceae","Buah Dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(70,"Heras tulang","Chloranthus offwinalis Bl","Chloranthaceae","Daun dan batang: dikeringkan kemudian dibuat seperti teh","Mencegah osteoporosis","0.1", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(71,"Tok brai","Blumeodendron tokbrai Kurz.","Euphorbiaceae","Buah dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(72,"Kucai","Alium odorum","Aliaceae","Seluruh bagian Dimakan langsung, ditumis, di oseng, sebagai bumbu","-","0.13", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(73,"Kacang panjang","Vigna sinensis","Fabaceae","Daun muda: dimakan langsung, dikukus, disayur bening dan sayur santen\n"+"Buah: dimakan langsung","-","0.16", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(74,"Kondang","Ficus variegata Bl.","Moraceae","Buah Dimakan langsung","Getah untuk obat sakit perut dan bisul","0.1", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(75,"Cau raja","Musa paradisiaca L.","Musaceae","Buah dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(76,"Lampeuni","Ardisia humilis Vahl.","Myrsinaceae","Buah dapat dimakan","Obat gatal","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(77,"Pare nangsih","Oryza sativa L.","Poaceae","Biji: Ditumbuk lalu ditanak, dibuat laksa","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(78,"Pare sereh","Oryza sativa L.","Poaceae","Biji: Ditumbuk lalu ditanak, dibuat laksa","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(79,"Pare cokrom","Oryza sativa L.","Poaceae","Biji: Ditumbuk lalu ditanak, dibuat laksa.","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(80,"Pare reumay","Oryza sativa L.","Poaceae","Biji Ditumbuk lalu ditanak, dibuat laksa.","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(81,"Tomat","Solanum lycopersicum L.","Solanaceae","Buah Disambel, sebagai bumbu","Buah untuk menurunkan tekanan darah","0.1", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(82,"Cau Ambon","Musa paradisiaca var. sapientum L. Kunt","Musaceae","Buah diperam hingga masak,dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(83,"Peuteuy","Parkia speciasa","Fabaceae","Dimakan langsung, direbus, sebagai campuran, disayur, dioseng, disambel, ditumis","-","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(84,"Tangkil","Gnetum gnemon L.","Gnetaceae","Daun muda: dimakan langsung, disayur bening, sayur\n"+"Buah: kulit buah digoreng, dioseng\n"+"Biji: emping, keceprek, disayur","-","0.33", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(85,"Cau parey","Musa Paradisiaca L.","Musaceae","Buah diperam hingga masak,dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(86,"Cau raja sereh","Musa Paradisiaca L.","Musaceae","Buah diperam hingga masak,dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(87,"Cau lampeneng","Musa Paradisiaca L.","Musaceae","Buah diperam hingga masak,dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(88,"Jambe/Pinang","Areca catechu L.","Arecaceae","Dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(89,"Awi apus","Gigantochloa apus Kurz.","Poaceae","Tuak diminum\n"+"Daun muda: dimakan langsung\n"+"Seluruh bagian muda: direbus, disayur santen, sayur bening","Daun dimakan bila keracunan","0.23", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(90,"Katuk","Sauropus androginus","Euphorbiaceae","Sayur/lalap","-","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(91,"Walang Cina","Eryngium foetidum L.","Apiaceae","Daun muda dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(92,"Tiwu Hideng","Saccharum officinarum L","Poaceae","Batang dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(93,"Jeruk bali","Citrus maxima Merr.","Rutaceae","Dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(94,"Koneng/Kunir","Curcuma domestica Val.","Zingiberaceae","Rimpang: Dimakan langsung, disambel, diparut lalu diminum airnya.","Obat setelah melahirkan, dan obat tipus","0.16", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(95,"Kalapa beureum","Cocos nucifera L. var. rubescens","Arecaceae","Batang muda/Birus: dimakan langsung, disayur bening, di oseng\n"+"Buah: dimakan langsung, sebagai bumbu (santan)","Duwegan/kelapa muda sumber minuman dan rujak","0.26", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(96,"Cau seblot","Musa paradisiaca L.","Musaceae","Buah diperam hingga masak, dimakan langsung","Daun untuk pembungkus","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(97,"Huni","Antidesma bunius","Euphorbiaceae","Buah dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(98,"Ceuri","Garcinia dioica Bl.","Lusiaceae","Daun muda dan buah Dimakan langsung","Pereda sesak nafas dan nyeri dada","0.13", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(99,"Jambu Batu","Psidium guajava L.","Myrtaceae","Daun muda dan buah Dimakan langsung","-","0.1", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(100,"Hiris","Cajanus cajan Mill.","Poaceae","Dimakan langsung, disayur bening, dan biji muda disambel.","-","0.1", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(101,"Kanas","Ananas comosus Merr.","Bromeliaceae","Biji Dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(102,"Paku hurang","Stenochlaena palustris Bedd","Filices","Dimakan langsung, disayur bening, sayur santen, ditumis, dioseng, direbus, dikukus","-","0.23", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(103,"Pisitan","Dysoxylum allaceum Bl.","Meliaceae","Buah dimakan langsung","Kulit buah obat padi","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(104,"Kalapa tawa","Cocos nucifera L. var. Viridis","Arecaceae","Batang muda/Birus: dimakan langsung, disayur bening, di oseng\n"+"Buah: dimakan langsung, sebagai bumbu (santan)","Duwegan/kelapa muda: sumber minuman dan rujak","0.26", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(105,"Senggang/Bayam","Amaranthus lividus L.","Amaranthaceae","Sayur","Menurunkan darah tinggi","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(106,"Bonteng/Mentimun","Cucumis sativus L.","Cucurbitaceae","Buah dimakan langsung","Menurunkan darah tinggi","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(107,"Cabe rawit","Capsicum fructescens L.","Solanaceae","Bumbu masak","Menambah nafsu makan","0.06", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(108,"Cangkudu","Morinda citrifolia L.","Rubiaceae","Daun muda: direbus\n"+"Buah: dimakan langsung","Daun: untuk obat padi, buah dan daun untuk obat darah tinggi dan buah juga untuk obat penyakit typhus","0.2", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(109,"Terong ungu","Solanum melongena L.","Solanaceae","Buah dimakan langsung","-","0.03", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(110,"Huwi kumbili","Coleus tuberosus Benth.","Labiatae","Umbi: direbus, dikukus, digoreng, dibakar\n"+"Daun muda: disayur, dikukus, dimakan langsung","-","0.23", R.drawable.ic_biologo_480));
        mPangan.add(new Pangan(111,"Sentul/Kacapi","Sandoricum koetjape Merr.","Meliaceae","Daun muda: Direbus\n"+"Buah: Dimakan langsung","Daun direbus air lalu diminum untuk mengobati sakit perut","0.1", R.drawable.ic_biologo_480));


        initRecyclerPangan();
    }

    private void initRecyclerPangan() {
        Log.d(TAG, "initRecyclerPangan: initializing.");

        RecyclerView recyclerPangan = (RecyclerView) findViewById(R.id.recycler_pangan);
        PanganAdapter mAdapter = new PanganAdapter(this, mPangan);
        recyclerPangan.setAdapter(mAdapter);
        recyclerPangan.setLayoutManager(new LinearLayoutManager(this));
    }
}
