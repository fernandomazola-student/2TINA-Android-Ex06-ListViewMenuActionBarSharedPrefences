package br.com.fiap.exercicios.listview.RM77282;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraPizza {
    public static List<Pizza> listaPizza(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Calabresa com Queijo", 40, R.drawable.calabresaqueijo, R.drawable.pizzacalabresacomqueijo, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano",1 ));
        pizzas.add(new Pizza("Pizza de Milho", 30, R.drawable.milho, R.drawable.pizzamilho, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano", 5 ));
        pizzas.add(new Pizza("Frango com Catupiry", 100, R.drawable.frangocatupiry, R.drawable.pizzafrangocatupiry, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano", 3));
        pizzas.add(new Pizza("Pizza de Strogonoff", 45, R.drawable.strogonoff, R.drawable.pizzastrogonoff, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano", 2));
        return pizzas;
    }
}
