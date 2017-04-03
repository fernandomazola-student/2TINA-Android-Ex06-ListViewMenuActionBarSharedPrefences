package br.com.fiap.exercicios.listview.RM77282;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraPizza {
    public static List<Pizza> listaPizza(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Calabresa com Queijo", 40, R.drawable.calabresaqueijo, R.drawable.pizzacalabresacomqueijo, "2 xícaras de leite, 1/4 de xícara de óleo, 3 ovos, 3 colheres de queijo parmesão ralado, Sal a gosto, 2 1/2 xícaras de farinha de trigo, 1 colher de fermento em pó, RECHEIO: 1 xícara de molho de tomate, 200g de linguiça calabresa defumada, 300g de queijo mussarela ralado grosso, Orégano e azeite a gosto",1 ));
        pizzas.add(new Pizza("Pizza de Milho", 30, R.drawable.milho, R.drawable.pizzamilho, " 2 colheres (sopa) de manteiga, 500g de mussarela ralada, 1 disco de pizza pronto, 1 lata de milho verde, 1 lata de creme de leite, 1 cebola grande, 1 pitada de sal", 5 ));
        pizzas.add(new Pizza("Frango com Catupiry", 100, R.drawable.frangocatupiry, R.drawable.pizzafrangocatupiry, " 2 xícaras de água, 1 massa de pizza, 1 colher de orégano, 400g de peito de frango, 400g de queijo catupiry, 1 pitada de sal, 1 colher de salsa, 4 tomates", 3));
        pizzas.add(new Pizza("Pizza de Strogonoff", 45, R.drawable.strogonoff, R.drawable.pizzastrogonoff, "500 g de farinha de trigo, 10 g (1 sachê) de fermento biológico seco, 1 colher (sopa) de açúcar, 1 ovo grande, 55 ml de óleo de soja, 240 ml de água morna (35°), 1 e 1/2 colher (chá) de sal, Carne picadinha ensopada com temperos, Queijo mussarela, Requeijão, Batata palha, Orégano", 2));
        pizzas.add(new Pizza("Pizza Moda da Casa", 45, R.drawable.modadacasa, R.drawable.pizzamodadacasa, "1 sachê 10 g de fermento biológico, 2 xicaras cha de farinha de trigo, 1 colher de sobremesa de açúcar, 1 colher de café de sal, 1 ovo, 1/2 xícara de chá de água morna, 1 colher de margarina, 200 g de mussarela, 200 g de pressunto ou apresuntado, 100 g de queijo prato, 3 tomates cortado em rodelas, 1 cebola grande cortado em rodelas, 2 ovos cosidos e cortado em rodela, Orégano a gosto", 4));
        pizzas.add(new Pizza("Pizza de Mussarela", 45, R.drawable.mussarela, R.drawable.pizzamussarela, "500 g de farinha de trigo, 2 tabletes de fermento biológico, 1 colher de chá de sal, 1 colher de chá de açúcar, 1 colher de sopa de óleo, 1 copo de água morna RECHEIO:, 500 g de queijo de mussarela, Molho de tomate a gosto, Tomate em rodelas a gosto, Orégano a gosto", 5));
        return pizzas;
    }
}
