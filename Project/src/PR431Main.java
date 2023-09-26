public class PR431Main {
    public static void main(String[] args) {
        System.out.println("Iniciant 0");
        PR431Objecte instance1 = PR431Objecte.getInstance("Manel", "Polar", "18");
        System.out.println("Iniciant 1");
        PR431Objecte instance2 = PR431Objecte.getNewDestroyedInstance("Laura", "Gelada", "19");
        System.out.println("Iniciant 2");
        PR431Objecte instance3 = PR431Objecte.getNewDestroyedInstance("Pingu", "Ice", "22");
        System.out.println(instance1.toString());
        System.out.println(instance2.toString());
        System.out.println(instance3.toString());
    }
    
}
