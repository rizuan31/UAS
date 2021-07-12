package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String Inama,Inim, Iumur, Iemail, Iphone;
    EditText Inputnama, Inputnim,Inputumur,Inputemail,Inputphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inputnama = (EditText)findViewById(R.id.Nama);
        Inputnim = (EditText)findViewById(R.id.Nim);
        Inputemail = (EditText)findViewById(R.id.Email);
        Inputphone = (EditText)findViewById(R.id.Phone);
        Inputumur = (EditText)findViewById(R.id.Umur);

        Button hapus = (Button)findViewById(R.id.hapus);
        hapus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Inputnama.setText("");
                Inputnim.setText("");
                Inputemail.setText("");
                Inputphone.setText("");
                Inputumur.setText("");
            }
        });

        Button submit = (Button)findViewById(R.id.simpan);
        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Inama= Inputnama.getText().toString();
                Inim = Inputnim.getText().toString();
                Iphone = Inputphone.getText().toString();
                Iemail = Inputemail.getText().toString();
                Iumur = Inputumur.getText().toString();
                Intent i = null;
                i = new Intent(MainActivity.this, tampil.class);
                Bundle b = new Bundle();
                b.putString("parse_nama",Inama);
                b.putString("parse_nim",Inim);
                b.putString("parse_phone",Iphone);
                b.putString("parse_email",Iemail);
                b.putString("parse_umur",Iumur);

                i.putExtras(b);
                startActivity(i);

            }
        });

        Button keluar = (Button)findViewById(R.id.exit);
        keluar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });

    }
}
