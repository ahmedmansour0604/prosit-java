package tn.esprit.gestionzoo.entities;
public class Zoo {

    static final int NUMBER_OF_CAGES = 3;
    static final int NUMBER_OF_AQUATIC_ANIMALS = 10;
    protected Animal[] animals;
    protected String name;
    protected String city;
    protected int nbrAnimals;
    protected Aquatic[] aquaticAnimals;
    protected int nbrAquatic;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        nbrAnimals = 0;
        nbrAquatic = 0;
        aquaticAnimals = new Aquatic[NUMBER_OF_AQUATIC_ANIMALS];
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (searchAnimal(animal) != -1)
            return;
        if (isZooFull()) {
            throw new ZooFullException("Le Zoo est plein!");
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        this.nbrAnimals--;
        animals[nbrAnimals] = null;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals >= NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public boolean setName(String name) {
        if (name.isEmpty()) return false;
        this.name = name;
        return true;
    }
    public String getName() {return this.name;}
    public void setCity(String city) {this.city = city;}
    public String getCity() { return this.city;}
    public int getNbrAnimals() {return this.nbrAnimals;}

    public int searchAquatic(Aquatic aquatic) {
        int index = -1;
        for (int i = 0; i < nbrAquatic; i++) {
            if (aquatic.name == aquaticAnimals[i].name)
                return i;
        }
        return index;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if (searchAquatic(aquatic) != -1 || nbrAquatic == NUMBER_OF_AQUATIC_ANIMALS)
            return;
        aquaticAnimals[nbrAquatic] = aquatic;
        nbrAquatic++;
    }
    public void aquaticSwim(){
        for(int i = 0; i < nbrAquatic; i++){
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float max=-1;
        for (int i = 0; i < nbrAquatic; i++){
            if(aquaticAnimals[i].getClass()==Penguin.class){
                Penguin penguin = (Penguin)aquaticAnimals[i];
                if(penguin.getSwimmingDepth()>max){
                    max=penguin.getSwimmingDepth();
                }
            }
        }
        return max;
    }
    public void displayNumberOfAquaticsByType(){
        int nbrPenguins=0,nbrDolphins=0;
        for(int i = 0; i < nbrAquatic; i++){
            if(aquaticAnimals[i].getClass()==Penguin.class){nbrPenguins++;}
            if(aquaticAnimals[i].getClass()==Dolphin.class){nbrDolphins++;}
        }
        System.out.println("Dolphins : "+nbrDolphins+" Penguins : "+nbrPenguins);
    }


}
