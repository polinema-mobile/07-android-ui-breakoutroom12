package com.example.a07_interaksi_pengguna_room_12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView TanggalLahir;
    Calendar calendar;
    DatePickerDialog datePickerDialog;

    Button btnSubmit;
    Button btnSubmit2;
    EditText mhsNama,mhsNim;
    RadioButton radioButton;
    RadioGroup radioGroup;
    Spinner spinJurusan;

    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        mhsNama = (EditText) findViewById(R.id.edtNama);
        mhsNim = (EditText) findViewById(R.id.edtNim);
        spinJurusan = (Spinner) findViewById(R.id.spinnerJurusan);
        TanggalLahir = (TextView)findViewById(R.id.TanggalLahir);

        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        TanggalLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar=Calendar.getInstance();
                int hari =calendar.get(Calendar.DAY_OF_MONTH);
                int bulan =calendar.get(Calendar.MONTH);
                int tahun =calendar.get(Calendar.YEAR);

                datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mhari, int mbulan, int mtahun) {
                        TanggalLahir.setText(mhari+"/"+(mbulan+1)+"/"+mtahun);
                    }
                }, hari, bulan, tahun);
                datePickerDialog.show();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectedId);
                DataMahasiswaParcelable mhs = new DataMahasiswaParcelable(mhsNama.getText().toString(),
                        mhsNim.getText().toString(),TanggalLahir.getText().toString(),radioButton.getText().toString(),spinJurusan.getSelectedItem().toString());

                Intent intent = new Intent(MainActivity.this, SecondActivityParcelable.class);
                intent.putExtra("DataMahasiswaParcelable", mhs);
                startActivity(intent);
            }
        });


//        =================================== intent=======================================
        btnSubmit2=(Button)findViewById(R.id.btnSubmit2);
        btnSubmit2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton;
        radioButton = (RadioButton) findViewById(selectedId);
        switch (view.getId()){
            case R.id.btnSubmit2:
                Intent sendData = new Intent(MainActivity.this,MainActivity2Intent.class);
                sendData.putExtra("data1", mhsNama.getText().toString());
                sendData.putExtra("data2", mhsNim.getText().toString());
                sendData.putExtra("data3",TanggalLahir.getText().toString());
                sendData.putExtra("data4",radioButton.getText().toString());
                sendData.putExtra("data5", spinJurusan.getSelectedItem().toString());

                startActivity(sendData);



            case R.id.button2:
                Intent intent = new Intent(MainActivity.this, DataPribadi.class);
                startActivity(intent);
        }
    }



}