// Nome do arquivo: darkside.java

public class darkside extends combatente {

    public darkside(){
        super("Darkside", 40, 4, 3); 
    }
    
    @Override 
    public void moveset(combatente alvo){
        java.util.Random generator = new java.util.Random(); 
        int op = generator.nextInt(3);
        
        if (op == 0) { // Soco de Força
            this.setNomeAtaque("Soco de Força");
            // Usa as interfaces IStatus
            this.ataques.ataque(this.status, alvo.getStatus(), 1);
        }else if(op == 1){ // Raio Ômega
            this.setNomeAtaque("Raio Ômega");
            this.ataques.ataque(this.status, alvo.getStatus(), 4);
        }else if (op == 2) { // Força Apokolips
            this.setNomeAtaque("Força Apokolips");
            this.ataques.ataque(this.status, alvo.getStatus(), 2);
        }
    }
}