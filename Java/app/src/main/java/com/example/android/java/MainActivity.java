package com.example.android.java;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * Ova metoda se pokaže kad se naruči kava.
 */
public class MainActivity extends ActionBarActivity {
    int brojKava = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Ova metoda se poziva kada se pritisne dugme.
     */
    public void submitOrder(View view) {

        display(brojKava);
        displayPrice(brojKava * 7);
    }
    public void increment(View view) {
        brojKava = brojKava + 1;
        display(brojKava);

    }
    public void decrement(View view) {
        brojKava = brojKava -1;
        display(brojKava);


    }

    /**
     * Ova metoda pokaže količinu na ekranu.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * Ova metoda prikazuje danu cijenu na ekranu.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}