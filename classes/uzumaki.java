package NinjasOOP.classes;

public class uzumaki extends ninja {
    
    public void Rasengan() {
        System.out.println(getName() + " use <rasengan>");
    }

    public void shadowClones() {
        System.out.println(getName() + " use <shadow_clones>");
    }

    public void Sealing() {
        System.out.println(getName() + " use <sealing>");
    }

    public void wiseMode() {
        String nameWise = getName().toLowerCase();

        if (nameWise == "naruto") {
            System.out.println(getName() + " use < : ] WISE MODE [ : >");
        }
        else {
            System.out.println("no has CHAKRA");
        }
    }



    @Override
    public void useKunai() {
        
        System.out.println(getName() + " used <wind_kunai>");

    }

    @Override
    public void useShuriken() {
        
        System.out.println(getName() + " used <Rasenshuriken>");

    }

}
