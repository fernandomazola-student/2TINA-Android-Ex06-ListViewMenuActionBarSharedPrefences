package br.com.fiap.exercicios.listview.RM77282;

import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class PizzaInfo extends AppCompatActivity {

    ImageView imgView;
    TextView txtNome;
    TextView txtIngredientes;
    RatingBar ratingBar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_info);
        imgView = (ImageView) findViewById(R.id.imgPizzainfo);
        txtNome = (TextView) findViewById(R.id.txtNomeinfo);
        txtIngredientes = (TextView)findViewById(R.id.txtIngredientesinfo);
        ratingBar = (RatingBar)findViewById(R.id.rating);
         actionBar = getSupportActionBar();
        //Ativa a setinha para voltar para a tela anterior
        actionBar.setDisplayHomeAsUpEnabled(true);

        Pizza pizza = (Pizza)getIntent().getExtras().get("pizza");

        actionBar.setTitle(pizza.getNome());
        imgView.setImageResource(pizza.getImagemgrande());
        txtIngredientes.setText(pizza.getIngredientes());
        txtNome.setText(pizza.getNome());
        ratingBar.setRating(pizza.getPontuacao());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Verifica se foi o botao de voltar da actionbar
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
