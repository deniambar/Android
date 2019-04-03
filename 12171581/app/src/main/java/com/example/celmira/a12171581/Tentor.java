package com.example.celmira.a12171581;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tentor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentor);

        //mengambil data dari id nama_pengajar yang bertipe EditText yang disimpan dalam variabel nama
        final EditText nama = (EditText)  findViewById(R.id.nama_pengajar);
        final EditText waktu = (EditText) findViewById(R.id.total_mengajar);
        final EditText gaji = (EditText) findViewById(R.id.gaji);

        //mengambil data dari id hitung yang bertipe Button yang disimpan dalam variabel hitung
        Button hitung = (Button) findViewById(R.id.hitung);

        //jika Button diklik maka data yang dari View yang diinputkan akan diambil lalu disimpan disimpan dalam variabel
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //variabel nama disimpan dengan variabel nama_p dengan tipe data String
                String nama_p = nama.getText().toString();
                String waktu_p = waktu.getText().toString();
                String gaji_p = gaji.getText().toString();

                //membuat pindah activity dari activity Tentor ke activity Gaji
                Intent pindah = new Intent(Tentor.this,Gaji.class);
                //saat pemindahan activity membawa data yang diinput di View yang setiap inputen diberi key atau name agar
                //dapat diambil datanya berdasarkan name atau key oleh activity yang dituju
                pindah.putExtra("nama_pengajar",nama_p);
                pindah.putExtra("waktu_mengajar",waktu_p);
                pindah.putExtra("gaji",gaji_p);


                //memulai perpindahan activity
                startActivity(pindah);
            }
        });


    }
}
