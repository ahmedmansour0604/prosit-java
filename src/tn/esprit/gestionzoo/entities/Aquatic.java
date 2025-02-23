package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    protected String habitat;
    public void setHabitat(String habitat) {this.habitat = habitat;}
    public String getHabitat() {return this.habitat;}
    public Aquatic(String name, int age, boolean isMammal, String habitat) {
        this.family = "Aquatic";
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.habitat = habitat;
    }
    public Aquatic() {}

    @Override
    public String toString() {
        return "Aquatic{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat='" + habitat + '\'' +
                '}';
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
