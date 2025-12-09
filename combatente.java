// Nome do Arquivo: combatente.java

// A classe agora referencia as Interfaces
public abstract class combatente { 

    // COMPOSIÇÃO: Agora usando as interfaces (Baixo Acoplamento)
    protected IStatus status;
    protected IAtaques ataques;
    
    // Adicionado o gerador de números aleatórios para uso nas subclasses (para escolher o ataque no moveset)
    protected java.util.Random generator = new java.util.Random(); 
    
    // Construtor inicializa com as implementações concretas (Status e Ataques)
    public combatente(String nome, int vida, int ataque, int defesa){
        this.status = new Status(nome, vida, ataque, defesa); // Instancia o concreto
        this.ataques = new Ataques();                       // Instancia o concreto
    }

    // Método para acessar a interface Status
    public IStatus getStatus() {
        return status;
    }
    
    // Método getVida() é fundamental para o laço de combate em batalha.java
    public int getVida() {
        return status.getVida();
    }
    
    // Delegando métodos para os objetos de composição (via Interfaces)
    public String getNome() {
        return status.getNome();
    }

    public void setNomeAtaque(String nomeAtaque) {
        ataques.setNomeAtaque(nomeAtaque);
    }

    // Método abstrato de moveset
    public abstract void moveset(combatente alvo); 

    public void exibirStatus(){
        status.exibirStatus();
    }
}