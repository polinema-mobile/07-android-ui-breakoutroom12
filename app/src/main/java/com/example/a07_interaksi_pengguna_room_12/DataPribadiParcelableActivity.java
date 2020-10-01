package com.example.a07_interaksi_pengguna_room_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataPribadiParcelableActivity extends AppCompatActivity {

    private TextView textView6, textView7, textView5, textView8, textView9, textView10, textView11, textView12, textView13;
    private  TextView textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22;
    private  TextView textView23, textView24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pribadi_parcelable);

        textView6 = (TextView)findViewById(R.id.textView6);
        textView7 = (TextView)findViewById(R.id.textView7);
        textView5 = (TextView)findViewById(R.id.textView5);
        textView8 = (TextView)findViewById(R.id.textView8);
        textView9 = (TextView)findViewById(R.id.textView9);
        textView10 = (TextView)findViewById(R.id.textView10);
        textView11 = (TextView)findViewById(R.id.textView11);
        textView12 = (TextView)findViewById(R.id.textView12);
        textView13 = (TextView)findViewById(R.id.textView13);
        textView14 = (TextView)findViewById(R.id.textView14);
        textView15 = (TextView)findViewById(R.id.textView15);
        textView16 = (TextView)findViewById(R.id.textView16);
        textView17 = (TextView)findViewById(R.id.textView17);
        textView18 = (TextView)findViewById(R.id.textView18);
        textView19 = (TextView)findViewById(R.id.textView19);
        textView20 = (TextView)findViewById(R.id.textView20);
        textView21 = (TextView)findViewById(R.id.textView21);
        textView22 = (TextView)findViewById(R.id.textView22);
        textView23 = (TextView)findViewById(R.id.textView23);
        textView24 = (TextView)findViewById(R.id.textView24);

        Intent intent = getIntent();
        DataPribadiParcelable dataPribadi = intent.getParcelableExtra("DataPribadiParcelable");

        textView6.setText("Nama: " + dataPribadi.getNama());
        textView7.setText("Fakultas: " + dataPribadi.getFakultas());
        textView5.setText("Program studi: " + dataPribadi.getProdi());
        textView8.setText("Status pendaftaran: " + dataPribadi.getStatusPendaftaran());
        textView9.setText("Alasan: " + dataPribadi.getAlasan());
        textView10.setText("NIK: " + dataPribadi.getNik());
        textView11.setText("Prestasi: " + dataPribadi.getPrestasi());
        textView12.setText("Tempat lahir: " + dataPribadi.getTempatLahir());
        textView13.setText("Jenis kelamin: " + dataPribadi.getJenisKelamin());
        textView14.setText("Kewarganegaraan: " + dataPribadi.getKewarganegaraan());
        textView15.setText("Agama: " + dataPribadi.getAgama());
        textView16.setText("Alamat: " + dataPribadi.getAlamat());
        textView17.setText("RT: " + dataPribadi.getRt());
        textView18.setText("RW: " + dataPribadi.getRw());
        textView19.setText("Kode pos: " + dataPribadi.getKodePos());
        textView20.setText("Provinsi: " + dataPribadi.getProvinsi());
        textView21.setText("Kota/Kabupaten: " + dataPribadi.getKota());
        textView22.setText("No HP: " + dataPribadi.getNoHp());
        textView23.setText("No Telp: " + dataPribadi.getNoTelp());
        textView24.setText("Email: " + dataPribadi.getEmail());
    }
}