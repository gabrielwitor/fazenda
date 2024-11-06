package org.example.fazenda;

import org.example.fazenda.modelo.Vaca;
import org.example.fazenda.util.Dao;

class Test{
    public static void main(String[] args) {
        Dao<Vaca> dao = new Dao<>(Vaca.class);
        Vaca vaca = new Vaca("A1","Mimosa","Gir");

        dao.inserir(vaca);
    }
}