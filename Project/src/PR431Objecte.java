import java.lang.reflect.Constructor;

public final class PR431Objecte{

    private static PR431Objecte instance;
    private String nom, cognom, edat;


    private PR431Objecte(String nom,String cognom, String edat){
            // Simulem una inicialització lenta
            this.nom = nom;
            this.cognom = cognom;
            this.edat = edat;
        
    }

    @Override
    public String toString() {
        return "Nom: "+nom+"    cognom: "+cognom+"  edat:"+edat;
    }
    
    public static PR431Objecte getInstance(String nom,String cognom, String edat){
        if (instance == null) {
            instance = new PR431Objecte(nom,cognom, edat);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return instance;
    }

    static PR431Objecte getNewDestroyedInstance (String nom,String cognom, String edat) {
        
        PR431Objecte result = null;
        try {
            Constructor<?>[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                result = (PR431Objecte) constructor.newInstance(nom,cognom,edat);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
