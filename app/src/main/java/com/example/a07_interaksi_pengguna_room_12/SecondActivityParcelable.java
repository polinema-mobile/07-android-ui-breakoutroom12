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
        setContentView(R.layout.activity_second_activity_parcelable);

        textViewNama = (TextView) findViewById(R.id.textViewNama);
        textViewNim = (TextView) findViewById(R.id.textViewNim);
        textViewTanggalLahir = (TextView) findViewById(R.id.textViewTanggalLahir);
        textViewJenisKelamin = (TextView) findViewById(R.id.textViewJenisKelamin);
        textViewJurusan = (TextView) findViewById(R.id.textViewJurusan);

        Intent intent = getIntent();
        DataMahasiswaParcelable mhs = intent.getParcelableExtra("DataMahasiswaParcelable");

        textViewNama.setText( mhs.getNama());
        textViewNim.setText(mhs.getNim());
        textViewTanggalLahir.setText(mhs.getTanggalLahir());
        textViewJenisKelamin.setText (mhs.getJenisKelamin());
        textViewJurusan.setText(mhs.getJurusan());


    }
}