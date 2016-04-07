package com.example.android.kosarka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.java.R;

public class MainActivity extends AppCompatActivity {
    int rezultatdomaci = 0;
    int rezultatgosti = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * prikazuje rezultat domaćih.
     */
    public void rezultatDomaci(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }
    /**
     *Prikazuje rezultat od domaćih plus tri.
     */
    public void plus_tri_domaci(View view) {
        rezultatdomaci = rezultatdomaci + 3;
        rezultatDomaci(rezultatdomaci);

    }
    /**
     *Prikazuje rezultat domaćih sa plus dva.
     */
    public void plus_dva_domaci(View view) {
        rezultatdomaci= rezultatdomaci+2;
        rezultatDomaci(rezultatdomaci);

    }
    /**
     *Omogućava domaćima da imaju jedno slobodno bacanje.
     */
    public void slobodno_bacanje_domaci(View view) {
        rezultatdomaci=rezultatdomaci+1;
        rezultatDomaci(rezultatdomaci);

    }

    /**
     * prikazuje rezultat gosta.
     */
    public void rezultatGosti(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.gosti_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }
    /**
     *Prikazuje rezultat gostiju sa plus tri.
     */
    public void plus_tri_gosti(View view) {
        rezultatgosti = rezultatgosti+3;
        rezultatGosti(rezultatgosti);
    }
    /**
     *Prikazuje rezultat gostiju sa plus dva.
     */
    public void plus_dva_gosti(View view) {
        rezultatgosti= rezultatgosti+2;
        rezultatGosti(rezultatgosti);
    }
    /**
     *Omogućava gostima da imaju jedno slobodno bacanje.
     */
    public void slobodno_bacanje_gosti(View view) {
        rezultatgosti=rezultatgosti+1;
        rezultatGosti(rezultatgosti);
    }

    /**
     *Kada napravi Reset sve počinje od nule.
     */
    public void reset(View view) {
        rezultatgosti=0;
        rezultatdomaci=0;
        rezultatGosti(rezultatgosti);
        rezultatDomaci(rezultatdomaci);

    }
}