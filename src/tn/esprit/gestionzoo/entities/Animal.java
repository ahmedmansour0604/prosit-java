package tn.esprit.gestionzoo.entities;
public class Animal {

    protected String family, name;
    protected int age;
    protected boolean isMammal;


    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        if (age < 0) {throw new InvalidAgeException("Invalid Age!");}
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public boolean setAge(int age) throws InvalidAgeException {
        if (age < 0) throw new InvalidAgeException("Invalid Age!");
        this.age = age;
        return true;
    }
    public int getAge() {return age;}
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setFamily(String family) {this.family = family;}
    public String getFamily() {return family;}
    public void setIsMammal(boolean isMammal) {this.isMammal = isMammal;}
    public boolean getIsMammal() {return isMammal;}
}

