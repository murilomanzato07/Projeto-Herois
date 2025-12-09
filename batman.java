// Nome do Arquivo: batman.java

public class batman extends combatente {

    public batman(){
        super("Batman", 20, 2, 1);
    }
    
    @Override 
    public void moveset(combatente alvo){
        java.util.Random generator = new java.util.Random(); 
        int op = generator.nextInt(3);
        
        if (op == 0) { // Soco Base
            this.setNomeAtaque("Soco");
            // Usa as interfaces IStatus (this.status e alvo.getStatus()) no método ataque
            this.ataques.ataque(this.status, alvo.getStatus(), 1); 
        } else if (op == 1) { // Batrangue
            this.setNomeAtaque("Batrangue");
            this.ataques.ataque(this.status, alvo.getStatus(), 2);
        } else if (op == 2) { // Anel de Kriptonita
            this.setNomeAtaque("Anel de Kriptonita");
            this.ataques.ataque(this.status, alvo.getStatus(), 3);
        }
    }
}