package br.com.fiap.exercicios.listview.RM77282;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }
}
