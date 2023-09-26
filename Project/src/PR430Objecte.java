public final class PR430Objecte{

    private static PR430Objecte instance;
    private String nom, cognom, edat;


    private PR430Objecte(String nom,String cognom, String edat){
            // Simulem una inicialització lenta
            this.nom = nom;
            this.cognom = cognom;
            this.edat = edat;
        
    }

    @Override
    public String toString() {
        return "Nom: "+nom+"    cognom: "+cognom+"  edat:"+edat;
    }
    
    public static PR430Objecte getInstance(String nom,String cognom, String edat){
        if (instance == null) {
            instance = new PR430Objecte(nom,cognom, edat);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return instance;
    }

}
