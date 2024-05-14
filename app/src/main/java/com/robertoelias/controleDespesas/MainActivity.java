package com.robertoelias.controleDespesas;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robertoelias.controleDespesas.adapter.DespesaAdapter;
import com.robertoelias.controleDespesas.model.Despesa;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DespesaAdapter despesaAdapter;
    private List<Despesa> listaDespesas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.myRecyclerView);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(getApplicationContext(),AdicionarDespesas.class);
                    startActivity(intent);

             }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


    public void carregarListaDespesas(){

        //listar despesas
        Despesa despesa1 = new Despesa();
        despesa1.setNomeDespesa("Alimentação");
        listaDespesas.add(despesa1);

        Despesa despesa2 = new Despesa();
        despesa2.setNomeDespesa("Faculdade");
        listaDespesas.add(despesa2);

        Despesa despesa3 = new Despesa();
        despesa2.setNomeDespesa("Seguro");
        listaDespesas.add(despesa3);

        //configurar o adapter
        despesaAdapter = new DespesaAdapter(listaDespesas);

        // configurar o recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(despesaAdapter);
    }

    protected void onStart() {
        carregarListaDespesas();
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}