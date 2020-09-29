package com.example.a07_interaksi_pengguna_room_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2Intent extends AppCompatActivity {
    TextView datanama;
    TextView datanim;
    TextView datatgl;
    TextView datakelamin;
    TextView datajurusan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_intent);

        datanama=(TextView)findViewById(R.id.datanama);
        datanim=(TextView)findViewById(R.id.datanim);
        datatgl=(TextView)findViewById(R.id.datatgl);
        datakelamin=(TextView)findViewById(R.id.datakelamin);
        datajurusan=(TextView)findViewById(R.id.datajurusan);

        datanama.setText(getIntent().getStringExtra("data1"));
        datanim.setText(getIntent().getStringExtra("data2"));
        datatgl.setText(getIntent().getStringExtra("data3"));
        datakelamin.setText(getIntent().getStringExtra("data4"));
        datajurusan.setText(getIntent().getStringExtra("data5"));

    }
}