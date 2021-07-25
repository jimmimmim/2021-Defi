package com.example.wallet_bottom_nav_2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import android.os.Bundle;

import static android.widget.Toast.*;

public class login2 extends AppCompatActivity {
    //Spinner
    private Spinner spinner_coins;
    String[] spinnerNames;
    int[] spinnerImages;
    int selected_coin_idx = 0;

    /*//Button
    private EditText Mnemonic = (EditText) findViewById(R.id.Mnemonic)
    private Button nextButton = (Button) findViewById(R.id.nextButton);
    private Button addButton = (Button) findViewById(R.id.addButton);
    private EditText privatekey = (EditText) findViewById(R.id.editPassword);
    boolean eth = false;
    boolean write = false;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*//Button Setting
        Mnemonic.setVisibility(View.GONE);
        nextButton.setVisibility(View.GONE);
        addButton.setVisibility(View.GONE);*/

        //Spinner
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        spinner_coins = (Spinner)findViewById(R.id.spinner_coins);

        spinnerNames = new String[]{"Bitcoin", "Ethereum", "Ethereum Classic", "Binance coin", "ChainLink"};
        spinnerImages = new int[]{R.drawable.bitcoin
                , R.drawable.ethereum
                , R.drawable.ethereum_classic
                , R.drawable.binance
                , R.drawable.link};

        CustomSpinnerAdapter customSpinnerAdapter = new CustomSpinnerAdapter(login2.this, spinnerNames, spinnerImages);
        spinner_coins.setAdapter(customSpinnerAdapter);

        spinner_coins.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                selected_coin_idx = spinner_coins.getSelectedItemPosition();
                //button
                /*if ( i == 1 )   { eth = true; }*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        /*if(eth){
            Mnemonic.setVisibility(View.VISIBLE);
            addButton.setVisibility(View.VISIBLE);

            Mnemonic.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (editable.length() > 3) write = true;
                }
            });
        }
        else{
            write=true;
        }*/


        /*privatekey.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                nextButton.setClickable(editable.length() > 3 && write);
            }
        });*/

        /*nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (eth) {
                    if (Mnemonic==privatekey){
                        Intent intent = new Intent(login2.this, login_popup_great.class);
                    }
                    else{
                        Intent intent = new Intent(login2.this, login_popup_error.class);
                    }
                }
                else{
                    Intent intent = new Intent(login2.this, login_popup_great.class);
                }
            }

        });*/

        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();
    }
}