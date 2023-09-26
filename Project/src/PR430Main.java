public class PR430Main {
    public static void main(String[] args) {
        System.out.println("Iniciant 0");
        PR430Objecte instance1 = PR430Objecte.getInstance("Manel", "Polar", "18");
        System.out.println("Iniciant 1");
        PR430Objecte instance2 = PR430Objecte.getInstance("Laura", "Gelada", "19");
        System.out.println("Iniciant 2");
        PR430Objecte instance3 = PR430Objecte.getInstance("Pingu", "Ice", "22");
        System.out.println(instance1.toString());
        System.out.println(instance2.toString());
        System.out.println(instance3.toString());
    }
    
}
