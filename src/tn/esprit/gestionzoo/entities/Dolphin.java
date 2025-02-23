package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;
    public void setSwimmingSpeed(float swimmingSpeed) {this.swimmingSpeed = swimmingSpeed;}
    public float getSwimmingSpeed() {return swimmingSpeed;}
    public Dolphin(String name, int age, boolean isMammal, String habitat,float swimmingSpeed) {
        this.family = "Aquatic";
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.habitat = habitat;
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat='" + habitat + '\'' +
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}
