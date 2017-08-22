package com.example.juanpablo.gmail;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Juan Pablo on 21/08/2017.
 */

public class ContactoAdapter extends BaseAdapter {

    private List<Contacto> contactos;


    //constructor
    public ContactoAdapter(List<Contacto> contactos){

        this.contactos = contactos;
    }

    @Override
    public int getCount() {
        return contactos.size();
    }

    @Override
    public Object getItem(int position) {
        return contactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        View row;

        if (convertView == null){
            //si esta vacia la vamos llenando
            row = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item_row,parent, false);

        }else{
            row = convertView;
        }

        Contacto contacto = (Contacto)getItem(position);

        TextView tvInicialContact = (TextView) row.findViewById(R.id.tvInicialContact);
        TextView tvContacto = (TextView) row.findViewById(R.id.tvContacto);
        TextView tvAsunto = (TextView) row.findViewById(R.id.tvAsunto);
        TextView tvMensaje = (TextView) row.findViewById(R.id.tvMensaje);

        tvInicialContact.setText(contacto.getIncial_contacto());
        tvContacto.setText(contacto.getNombre_contacto());
        tvAsunto.setText(contacto.getAsunto());
        tvMensaje.setText(contacto.getMsj());

        //retornar vista
        return row;
    }


}
