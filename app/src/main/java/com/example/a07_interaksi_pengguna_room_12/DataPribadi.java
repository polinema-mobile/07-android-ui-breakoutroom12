package com.example.a07_interaksi_pengguna_room_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class DataPribadi extends AppCompatActivity {

    private EditText nama,tempatLahir,rw,rt,kodePos,provinsi, password, passwordUlang, alasanMemilihProdi, nik, prestasi, alamat, kotaKab, noHp, telepon, email;
    private Spinner fakultas, programStudi, statusPendaftaran,agama;
    private RadioGroup jenisKelaminRadioGroup, kewarganegaraanRadioGroup;
    private RadioButton jenisKelamin, kewarganegaraan;
    private Button selanjutnya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pribadi);

        nama = (EditText) findViewById(R.id.insertnama);
        fakultas = (Spinner)findViewById(R.id.spinfakultas);
        programStudi = (Spinner)findViewById(R.id.spinpil1);
        statusPendaftaran = (Spinner)findViewById(R.id.statsus);
        password = (EditText) findViewById(R.id.editpass);
        passwordUlang = (EditText) findViewById(R.id.editpass2);
        alasanMemilihProdi = (EditText) findViewById(R.id.alasan);
        nik = (EditText) findViewById(R.id.editTextNumber);
        prestasi = (EditText) findViewById(R.id.prestasi);
        tempatLahir = (EditText) findViewById(R.id.edittempatlahir);
        jenisKelaminRadioGroup=(RadioGroup)findViewById(R.id.radioGroup2);
        kewarganegaraanRadioGroup=(RadioGroup) findViewById(R.id.radioGroup3);
        agama=(Spinner) findViewById(R.id.spinagama);
        alamat = (EditText) findViewById(R.id.isialamat);
        rt = (EditText) findViewById(R.id.editrt);
        rw = (EditText) findViewById(R.id.editrw);
        kodePos = (EditText) findViewById(R.id.editkodepos);
        provinsi = (EditText) findViewById(R.id.editprovinsi);
        kotaKab = (EditText) findViewById(R.id.editkota);
        noHp = (EditText) findViewById(R.id.edithp);
        telepon = (EditText) findViewById(R.id.edittelpon);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        selanjutnya =(Button) findViewById(R.id.sbmitbutton);

        //test parcelable menggunakan button "selanjutnya" ke "DataPribadiParcelableActivity" activity
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectIdJenisKelamin, selectIdKewarganegaraan;
                selectIdJenisKelamin = jenisKelaminRadioGroup.getCheckedRadioButtonId();
                jenisKelamin=(RadioButton)findViewById(selectIdJenisKelamin);
                selectIdKewarganegaraan=kewarganegaraanRadioGroup.getCheckedRadioButtonId();
                kewarganegaraan=(RadioButton) findViewById(selectIdKewarganegaraan);

                DataPribadiParcelable dataPribadi = new DataPribadiParcelable(nama.getText().toString(),fakultas.getSelectedItem().toString(),
                programStudi.getSelectedItem().toString(),statusPendaftaran.getSelectedItem().toString(),alasanMemilihProdi.getText().toString(),
                    nik.getText().toString(), prestasi.getText().toString(),tempatLahir.getText().toString(),
                        jenisKelamin.getText().toString(), kewarganegaraan.getText().toString(),agama.getSelectedItem().toString(), alamat.getText().toString(),
                        rt.getText().toString(),rw.getText().toString(),kodePos.getText().toString(),provinsi.getText().toString(),kotaKab.getText().toString(),
                        noHp.getText().toString(),telepon.getText().toString(),email.getText().toString());

                Intent intent = new Intent(DataPribadi.this, DataPribadiParcelableActivity.class);
                intent.putExtra("DataPribadiParcelable", dataPribadi);
                startActivity(intent);
            }
        });

    }
}