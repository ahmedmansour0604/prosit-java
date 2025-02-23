package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal{
    int nbrLegs;
    public void setNbrLegs(int nbrLegs) {this.nbrLegs = nbrLegs;}
    public int getNbrLegs() {return nbrLegs;}
    public Terrestrial(String family, String name, int age, boolean isMammal,int nbrLegs) {
        this.family = "Terrestrial";
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}
