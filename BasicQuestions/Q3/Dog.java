public class Dog {
    private String name;
    private String breed;

    Dog(String Name,String Breed){
        this.name = Name;
        this.breed = Breed;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String Breed){
        this.breed = Breed;
    }
}