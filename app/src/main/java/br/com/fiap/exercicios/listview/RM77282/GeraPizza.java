package br.com.fiap.exercicios.listview.RM77282;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraPizza {
    public static List<Pizza> listaPizza(){
        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Pizza de Calabresa com Queijo", ));
        pizzas.add(new Pizza("Pizza de Milho",));
        pizzas.add(new Pizza("Pizza de Frango com Catupiry",));
        pizzas.add(new Pizza("Pizza de Strogonoff",));
        return pizzas;
    }
}
