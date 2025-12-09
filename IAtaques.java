// Nome do Arquivo: IAtaques.java

public interface IAtaques {
    void setNomeAtaque(String nomeAtaque);
    // O método ataque agora recebe as informações necessárias, 
    // garantindo que não dependa diretamente da classe Combatente.
    void ataque(IStatus statusAtacante, IStatus statusAlvo, int multiplicacaoDano);
}