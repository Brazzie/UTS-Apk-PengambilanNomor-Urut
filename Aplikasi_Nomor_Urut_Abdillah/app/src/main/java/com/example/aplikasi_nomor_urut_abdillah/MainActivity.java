package com.example.aplikasi_nomor_urut_abdillah;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplikasi_nomor_urut_abdillah.R;

public class MainActivity extends AppCompatActivity {

    private int mNumber = 0; // variabel untuk menyimpan nomor urut

    private TextView mTvNumber; // komponen TextView untuk menampilkan nomor urut
    private Button mBtnTakeNumber; // komponen Button untuk mengambil nomor urut

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi komponen layout
        mTvNumber = findViewById(R.id.tv_number);
        mBtnTakeNumber = findViewById(R.id.btn_take_number);

        // atur event onClick pada Button
        mBtnTakeNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // tambah nomor urut
                mNumber++;

                // tampilkan nomor urut pada TextView
                mTvNumber.setText(String.valueOf(mNumber));
            }
        });
    }
}
