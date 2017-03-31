package br.com.fiap.exercicios.listview.RM77282;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fernando.oliveira on 30/03/2017.
 */

public class PizzaAdapter extends BaseAdapter {

    private Context context;
    private List<Pizza> pizzas;

    public PizzaAdapter(Context context, List<Pizza> pizza){
        this.context = context;
        this.pizzas = pizza;
    }

    @Override
    public int getCount() {
        return this.pizzas.size();
    }

    @Override
    public Object getItem(int position) {
        return this.pizzas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Pizza pizza = this.pizzas.get(position);
        View view = layoutInflater.inflate(R.layout.listview_pizzas, null);
        ImageView imgPizza = (ImageView) view.findViewById(R.id.calabresaqueijo);
        TextView txtValor = (TextView) view.findViewById(R.id.txtValor);
        TextView txtDescricao = (TextView) view.findViewById(R.id.txtDescricao);

        imgPizza.setImageResource(pizza.getImagempequena());
        txtValor.setText(pizza.getNome());
        txtDescricao.setText(pizza.getIngredientes());
        return view;
    }
}
