package NinjasOOP.classes;

public class ninja {

    private String name;
    private String village;
    private Boolean biju = false;

    //gets
    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public Boolean getBiju() {
        return biju;
    }

    //sets
    public void setName(String new_name) {
        name = new_name;
    }

    public void setVillage(String new_village) {
        village = new_village;
    }

    public void setBiju(Boolean new_biju) {
        biju = new_biju;
    }

    //Functions

    public void attack() {
        System.out.println(name + " used <punch>");
    }

    public void improveChakra() {
        System.out.println(name + " used <improve chakra>");
    }

    public void useKunai() {
        System.out.println(name + " used <kunai>");
    }

    public void useShuriken() {
        System.out.println(name + " used <shuriken>");
    }

}
