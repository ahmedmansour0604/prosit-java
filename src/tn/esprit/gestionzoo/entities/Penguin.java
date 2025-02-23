package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;
    public void setSwimmingDepth(float swimmingDepth) {this.swimmingDepth = swimmingDepth;}
    public float getSwimmingDepth() {return swimmingDepth;}
    public Penguin(String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
        this.family = "Aquatic";
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.habitat = habitat;
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat='" + habitat + '\'' +
                ", swimmingDepth=" + swimmingDepth +
                '}';
    }
}
