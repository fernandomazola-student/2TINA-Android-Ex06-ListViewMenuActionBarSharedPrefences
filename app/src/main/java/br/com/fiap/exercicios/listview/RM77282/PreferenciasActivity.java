package br.com.fiap.exercicios.listview.RM77282;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class PreferenciasActivity extends AppCompatActivity {

    SharedPreferences sp;
    EditText splashtxt;
    Switch desativarsplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        splashtxt = (EditText) findViewById(R.id.txtSplash);
        desativarsplash = (Switch) findViewById(R.id.desativarSplash);
        sp = getSharedPreferences("PizzaPreferencia", MODE_PRIVATE);

        splashtxt.setText(String.valueOf( sp.getInt("temposplash", 3000) ));
        desativarsplash.setChecked( sp.getBoolean("desativar", false) );

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.preferencias));
        actionBar.setDisplayHomeAsUpEnabled(true);

    }


    public void salvarPreferencias(View view) {
        int time = Integer.valueOf( splashtxt.getText().toString() );
        boolean disable = desativarsplash.isChecked();

        SharedPreferences.Editor e = sp.edit();
        e.putBoolean("desativar", disable);
        e.putInt("temposplash", time);
        e.commit();
        finish();
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
