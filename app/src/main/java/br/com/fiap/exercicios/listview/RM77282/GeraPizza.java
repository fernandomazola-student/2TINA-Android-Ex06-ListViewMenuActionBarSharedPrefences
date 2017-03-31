package br.com.fiap.exercicios.listview.RM77282;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraPizza {
    public static List<Pizza> listaPizza(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Pizza de Calabresa com Queijo", 40, R.drawable.calabresaqueijo, R.drawable.pizzacalabresacomqueijo, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano",10 ));
        pizzas.add(new Pizza("Pizza de Milho", 50, R.drawable.milho, R.drawable.pizzamilho, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano", 6 ));
        pizzas.add(new Pizza("Pizza de Frango com Catupiry", 45, R.drawable.frangocatupiry, R.drawable.pizzafrangocatupiry, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano", 7));
        pizzas.add(new Pizza("Pizza de Strogonoff", 30, R.drawable.calabresaqueijo, R.drawable.pizzacalabresacomqueijo, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano", 8));
        return pizzas;
    }
}
