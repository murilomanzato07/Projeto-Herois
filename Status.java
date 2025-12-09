// Nome do Arquivo: Status.java

// Implementa a nova interface
public class Status implements IStatus { 
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Status(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    // Getters
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getDefesa() {
        return defesa;
    }

    // Setter de Vida
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void exibirStatus() {
        System.out.println("Status: Nome: " + nome + " Vida: " + vida + " Ataque:" + ataque + " Defesa: " + defesa);
    }
}