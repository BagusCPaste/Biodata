package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.txt_nim);
        textView.setMovementMethod(new ScrollingMovementMethod());

        Button NoHp = (Button) findViewById(R.id.btn_NoHp);
        Button Email = (Button) findViewById(R.id.btn_Email);
        Button Alamat = (Button) findViewById(R.id.btn_Alamat);

        NoHp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "+6281391782589";
                Intent memangggil = new Intent(Intent.ACTION_DIAL);
                memangggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memangggil);

            }
        });

        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "muh.bagussa@gmail.com" });
                startActivity(Intent.createChooser(intent, "Send Email"));



            }
        });

        Alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://goo.gl/maps/Cxt1k4q8VxUuqAga7";
                Intent bukaurl = new Intent(Intent.ACTION_VIEW);
                bukaurl.setData(Uri.parse(url));
                startActivity(bukaurl);

            }
        });
    }
}