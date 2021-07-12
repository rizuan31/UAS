package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class tampil extends AppCompatActivity {

    TextView Tnama, Tnim, Temail, Tumur ,Tphone;
    String tampil_nama, tampil_nim, tampil_phone,tampil_email,tampil_umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);
        Tnama = (TextView)findViewById(R.id.Nama2);
        Tphone = (TextView)findViewById(R.id.PhoneNumber);
        Temail = (TextView)findViewById(R.id.Email2);
        Tumur = (TextView)findViewById(R.id.Umur2);

        Bundle b = getIntent().getExtras();

        tampil_nama = b.getString("parse_nama");
        tampil_nim = b.getString("parse_nim");
        tampil_phone = b.getString("parse_phonr");
        tampil_email = b.getString("parse_email");
        tampil_umur = b.getString("parse_umur");

        Tnama.setText(""+tampil_nama);
        Tphone.setText(""+tampil_phone); ;
        Temail.setText(""+tampil_email);
        Tumur.setText(""+tampil_umur);
        Tnim.setText(""+tampil_nim);

        Button kembali = (Button) findViewById(R.id.kembali);
        kembali.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(tampil.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
