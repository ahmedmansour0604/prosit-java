package tn.esprit.gestionzoo.entities;

abstract public class Aquatic extends Animal {
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
    abstract public void swim();
    //{System.out.println("This aquatic animal is swimming.");}
    public boolean equals(Aquatic aquatic){
        if(this.name.equals(aquatic.getName()) && this.age==aquatic.getAge() && this.habitat.equals(aquatic.getHabitat()) ){
            return true;
        }
        return false;
    }
}
