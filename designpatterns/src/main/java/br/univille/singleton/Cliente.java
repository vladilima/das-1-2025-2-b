package br.univille.singleton;

public class Cliente {
    public static void main(String[] args) {
        String segredo = "Palmeiras tem mundial";
        
        Singleton singleton = Singleton.getInstance();

        singleton.setSegredo(segredo);

        // Código para caramba
        // Acessando o segredo através do Singleton
        System.out.println(
            Singleton.getInstance().getSegredo()
        );
    }
}
