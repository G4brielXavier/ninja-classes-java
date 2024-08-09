package NinjasOOP.classes;

public class uchiha extends ninja{
    
    public void Sharingan(int chakra) {
        
        if (chakra > 100 && chakra < 200) {
            System.out.println(getName() + " used |:<SHARINGAN>:|");
        } 
        else if (chakra > 200 && chakra < 400) {
            System.out.println(getName() + " used |:<MANGEKYOU>:|");
        }
        else if (chakra > 400 && chakra < 700) {
            System.out.println(getName() + " used |:<RINNEGAN>:|");
        }
        else if (chakra > 700 && chakra < 1000) {
            System.out.println(getName() + " used |:<MANGEKYOU SHARINGAN>:|");
        }
        else {
            System.out.println(getName() + " no has CHAKRA");
        }

    }

    public void Susanno(int chakra) {
        if (chakra >= 1000) {
            System.out.println("<  : ]  SUSANNO [ :  >");
        }
        else
        {
            System.out.println(getName() + "no has CHAKRA");
        }
    }

    @Override
    public void useKunai() {
        
        System.out.println(getName() + " used <master_kunai>");

    }

    @Override
    public void useShuriken() {
        
        System.out.println(getName() + " used <big_shuriken>");

    }

}
