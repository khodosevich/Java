package Enum;
public enum Animal {
    DOG("собака"),CAT ("кот"),FROG("лягушка");


    private String translation;

    Animal(){}

     Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}