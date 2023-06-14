package com.example.tugas4_infosurat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class AdapterInfo extends AppCompatActivity {
    TextView txtIdsurah,txtUrutanSurat,txtJumlahAyatt,txtJudul,txtTempatTurun,txtArtiSurat;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_info);

        int id = getIntent().getIntExtra("id",0);
        txtIdsurah = findViewById(R.id.tvSuratKe);
        txtIdsurah.setText("Surat Ke : "+(id));

        int Urutan = getIntent().getIntExtra("Urutan",0);
        txtUrutanSurat = findViewById(R.id.tvUrutanSurat);
        txtUrutanSurat.setText("Urutan turunnya surah : "+(Urutan));

        int JumlahAyat = getIntent().getIntExtra("JumlahAyat",0);
        txtJumlahAyatt = findViewById(R.id.tvJumlahAyat);
        txtJumlahAyatt.setText("Jumlah Ayat : "+(JumlahAyat));

        String Judul = getIntent().getExtras().getString("Judul");
        txtJudul = findViewById(R.id.tvJudul);
        txtJudul.setText((Judul));

        String revelation_place = getIntent().getExtras().getString("revelation_place");
        txtTempatTurun = findViewById(R.id.tvTempatTurun);
        txtTempatTurun.setText("Tempat Diturunkan : "+(revelation_place));

        String ArtiSurat = getIntent().getExtras().getString("ArtiSurat");
        txtArtiSurat = findViewById(R.id.tvArtisurat);
        txtArtiSurat.setText("Arti Nama Surat : "+(ArtiSurat));

    }
}