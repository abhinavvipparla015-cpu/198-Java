class Animal {
    String name, sound, food, shelter;
    Animal(String n, String s, String f, String sh){
    name=n;
    sound=s;
    food=f;
    shelter=sh;
    }
    void display() {
        System.out.println("Animal : " + name );
        System.out.println(" Sound : " + sound);
        System.out.println("Eats : " + food );
        System.out.println( "Lives in: "+ shelter);
        System.err.println("---------------------------------------");
    }
}
class Cow extends Animal {
     Cow(){
         super("Cow","Moo","Grass & Hay","Barn");
    } 
}
class Dog extends Animal {
     Dog(){
         super("Dog","Woof","Meat","Kennel");
    }
 }
class Hen extends Animal {
     Hen(){
         super("Hen","Cluck","Grains","Coop");
    }
}
public class FarmAnimals {
    public static void main(String[] args) {
        Animal[] farm = { new Cow(), new Dog(), new Hen() };
        for(int i=0;i<farm.length;i++)
             farm[i].display();
    }
}