package com.cursoandroid.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mudaTexto(View view) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.US);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        TextView texto = findViewById(R.id.textoExibido);
        texto.setText("Hora atual: "+formatoData.format(calendar.getTime()));
    }
}
