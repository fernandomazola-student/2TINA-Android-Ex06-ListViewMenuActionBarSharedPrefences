package br.com.fiap.exercicios.listview.RM77282;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class PizzaCardapioActivity extends AppCompatActivity {


    ListView lstPizzas;
    List<Pizza> pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_cardapio);

        pizzas = GeraPizza.listaPizza();
        PizzaAdapter contatoAdapter = new PizzaAdapter(this, pizzas);
        lstPizzas = (ListView)findViewById(R.id.lstpizzas);
        lstPizzas.setAdapter(contatoAdapter);


        lstPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pizza pizza = pizzas.get(i);
                Intent it = new Intent(PizzaCardapioActivity.this, PizzaInfo.class);
                it.putExtra("pizza", pizza);
                startActivity(it);
            }
        });



}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //INFLA O MENU COM ITENS DO XML
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //VERIFICA QUAL ITEM FOI CLICADO NA ACTIONBAR E REALIZA UMA AÇÃO
        if(item.getItemId() == R.id.preferencias){
            Intent it = new Intent(this, PreferenciasActivity.class);
            startActivity(it);
        }
        return super.onOptionsItemSelected(item);
    }
}
