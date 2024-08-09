package NinjasOOP;

import NinjasOOP.classes.ninja;
import NinjasOOP.classes.uchiha;
import NinjasOOP.classes.uzumaki;

public class App {

    public static void main(String[] args) {

        //create here your ninja (uzumaki or uchiha)

    }


    public static ninja createNinja(String new_name, String new_village, Boolean is_biju) {
        ninja new_ninja = new ninja();

        new_ninja.setName(new_name);
        new_ninja.setVillage(new_village);
        new_ninja.setBiju(is_biju);

        return new_ninja;
    }

    public static uchiha createUchiha(String new_name, String new_village, Boolean is_biju) {
        uchiha new_uchiha = new uchiha();

        new_uchiha.setName(new_name);
        new_uchiha.setVillage(new_village);
        new_uchiha.setBiju(is_biju);

        return new_uchiha;
    }

    public static uzumaki createUzumaki(String new_name, String new_village, Boolean is_biju) {
        uzumaki new_uzumaki = new uzumaki();

        new_uzumaki.setName(new_name);
        new_uzumaki.setVillage(new_village);
        new_uzumaki.setBiju(is_biju);

        return new_uzumaki;
    }
}
