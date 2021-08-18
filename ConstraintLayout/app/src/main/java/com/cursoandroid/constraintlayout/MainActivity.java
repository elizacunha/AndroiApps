package com.cursoandroid.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        TextView dataNoticia = findViewById(R.id.txtDataNoticia);
        dataNoticia.setText(formatoData.format(new Date()));
    }

    public void onClickBotaoAnterior(View view) {
       TextView txtTituloNoticia = findViewById(R.id.txtTituloNoticia);
       txtTituloNoticia.setText(getResources().getString(R.string.txtTituloNoticia_1));
       TextView txtNoticia = findViewById(R.id.txtNoticia);
       txtNoticia.setText(getResources().getString(R.string.txtNoticia_1));
        findViewById(R.id.btnAnterior).setEnabled(false);
        findViewById(R.id.btnProximo).setEnabled(true);
    }
    public void onClickBotaoProximo(View view) {
        TextView txtTituloNoticia = findViewById(R.id.txtTituloNoticia);
        txtTituloNoticia.setText(getResources().getString(R.string.txtTituloNoticia_2));
        TextView txtNoticia = findViewById(R.id.txtNoticia);
        txtNoticia.setText(getResources().getString(R.string.txtNoticia_2));
        findViewById(R.id.btnAnterior).setEnabled(true);
        findViewById(R.id.btnProximo).setEnabled(false);
    }
}
