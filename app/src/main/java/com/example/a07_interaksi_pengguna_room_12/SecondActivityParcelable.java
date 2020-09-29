package com.example.a07_interaksi_pengguna_room_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivityParcelable extends AppCompatActivity {

    private TextView textViewNama, textViewNim, textViewTanggalLahir, textViewJenisKelamin, textViewJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activuty_parcelable);

        textViewNama = (TextView) findViewById(R.id.textViewNama);
        textViewNim = (TextView) findViewById(R.id.textViewNim);
        textViewTanggalLahir = (TextView) findViewById(R.id.textViewTanggalLahir);
        textViewJenisKelamin = (TextView) findViewById(R.id.textViewJenisKelamin);
        textViewJurusan = (TextView) findViewById(R.id.textViewJurusan);

        Intent intent = getIntent();
        DataMahasiswaParcelable mhs = intent.getParcelableExtra("DataMahasiswaParcelable");

        textViewNama.setText("Nama:" + mhs.getNama());
        textViewNim.setText("NIM:" + mhs.getNim());
        textViewTanggalLahir.setText("Tanggal lahir:" + mhs.getTanggalLahir());
        textViewJenisKelamin.setText("Jenis Kelamin:" + mhs.getJenisKelamin());
        textViewJurusan.setText("Jurusan:" + mhs.getJurusan());


    }
}