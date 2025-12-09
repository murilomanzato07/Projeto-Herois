// Nome do arquivo: superman.java

public class superman extends combatente {

    public superman(){
        super("Superman", 30, 3, 2); 
    }
    
    @Override 
    public void moveset(combatente alvo){
        java.util.Random generator = new java.util.Random(); 
        int op = generator.nextInt(3);
        
        if (op == 0) { // Soco Rápido
            this.setNomeAtaque("Soco Rápido");
            // Usa as interfaces IStatus
            this.ataques.ataque(this.status, alvo.getStatus(), 1);
        }else if(op == 1){ // Visão de Calor
            this.setNomeAtaque("Visão de Calor");
            this.ataques.ataque(this.status, alvo.getStatus(), 3);
        }else if (op == 2) { // Sopro Congelante
            this.setNomeAtaque("Sopro Congelante");
            this.ataques.ataque(this.status, alvo.getStatus(), 2);
        }
    }
}