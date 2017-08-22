package com.example.juanpablo.gmail;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    //declarar list view
    private ListView listview;

    private Context context;

    private void cargarLista(){
        final List<Contacto> contactos = new ArrayList<>();

        contactos.add(new Contacto("Carlos","Facebook","Te ha mandado una solicitud de amigo"));
        contactos.add(new Contacto("Juan","Facebook","Te ha mandado una solicitud de amigo"));
        contactos.add(new Contacto("Messi","Facebook","Te ha mandado una solicitud de amigo"));
        contactos.add(new Contacto("Google","Equipo Google","Has querido abrir tu cuenta desde"));

        listview.setAdapter(new ContactoAdapter(contactos));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mnuBuscar :
                Toast.makeText(context, "Buscar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnuCerrar :
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       context = MainActivity.this;

        listview = (ListView) findViewById(R.id.listview);

        cargarLista();

      /*  listview.setOnClickListener(); */



    }


}
