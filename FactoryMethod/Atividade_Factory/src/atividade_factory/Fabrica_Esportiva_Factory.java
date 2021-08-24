package atividade_factory;

public class Fabrica_Esportiva_Factory {

    public Fab_Esport gerFabrica_Esportiva(String marca, String time) {

        if (time.equals("BRASIL")) {
            return new Prod_Nike(marca);
        } else {
            if (time.equals("FLAMENGO")) {
                return new Prod_Adidas(marca);
            } else {
                if (time.equals("BOTAFOGO")) {
                    return new Prod_Puma(marca);

                } else {
                    if (time.equals("FLUMINENSE")) {
                        return new Prod_Umbro(marca);
                    } else {
                        return new Prod_Kapa(marca);
                    }

                }
            }
        }
    }
}
