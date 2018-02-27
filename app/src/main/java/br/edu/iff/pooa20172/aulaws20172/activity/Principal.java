package br.edu.iff.pooa20172.aulaws20172.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.edu.iff.pooa20172.aulaws20172.R;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void irParaMarcas(View v){
        Intent marca = new Intent(this,MarcaActivity.class);
        startActivity(marca);
    }
}
