package com.example.celmira.a12171581;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Gaji extends AppCompatActivity {
    public void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.gaji);

        //mengambil data dari id nama_pengajar yang bertipe TextView yang disimpan dalam variabel nama
        TextView nama = (TextView) findViewById (R.id.nama_pengajar);
        TextView waktu = (TextView) findViewById(R.id.total_mengajar);
        TextView gaji = (TextView) findViewById(R.id.gaji);
        TextView hitung = (TextView) findViewById(R.id.hitung);

        //membuat variabel dengan tipe Bundle yang isinya adalah menerima perpindahan dari activity lain
        //beserta data yang dibawa
        Bundle ambil = getIntent().getExtras();
        //mengambil key dari activity sebelumnya (nama) yang disimpan dalam variabel nama_p yang bertipe data String
        String nama_p = ambil.getString("nama_pengajar");
        final String waktu_m = ambil.getString("waktu_mengajar");
        String gaji_p = ambil.getString("gaji");

        //mengubah variabel gaji yang bertipe data String menjadi Integer
        Integer gaji_m = Integer.parseInt(gaji_p);
        Integer waktu_p = Integer.parseInt(waktu_m);

        //total gaji berupa perkalian gaji per hari dikali waktu mengajar per menit
        Integer total_gaji = gaji_m*(waktu_p/60);

        //menampilkan teks pada variable nama yang didapat dari variabel nama_p
        nama.setText(nama_p);
        waktu.setText(waktu_m);
        gaji.setText(gaji_p);
        hitung.setText(total_gaji.toString());



    }
}
