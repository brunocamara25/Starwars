package com.brunocamara.letscode.starwars.models;

public enum ItensNegociacaoType {

    ARMA(4),
    MUNICAO(3),
    AGUA(2),
    COMIDA(1);

    private int item;

    private ItensNegociacaoType(int item){
        this.item = item;
    }

    public int getValorItem(){
        return item;
    }
}
