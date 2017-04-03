package br.com.fiap.exercicios.listview.RM77282;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sp = getSharedPreferences("PizzaPreferencia", MODE_PRIVATE);
        int temposplash = sp.getInt("temposplash", 3000);
        boolean desativar = sp.getBoolean("desativar", false);


        if(!desativar){
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //Lógica para abrir a outra activity aqui
                    Intent it = new Intent(MainActivity.this, PizzaCardapioActivity.class);
                    startActivity(it);
                    finish(); //Finalizamos essa activity para o usuário não voltar
                }
            }, temposplash);

        }else{
            Intent it = new Intent(this, PizzaCardapioActivity.class);
            startActivity(it);
            finish();
        }
    }
}
