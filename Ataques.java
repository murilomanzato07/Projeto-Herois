// Nome do Arquivo: Ataques.java

import java.util.Random;

// Implementa a nova interface
public class Ataques implements IAtaques { 
    private Random generator = new Random();
    private String nomeAtaque;

    public Ataques() {
        this.nomeAtaque = null;
    }

    @Override
    public void setNomeAtaque(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public int defesaCritico(int defesaBase){
        if(generator.nextInt(10) == generator.nextInt(10)){
            return defesaBase * 2;
        }
        return defesaBase;
    }
    
    // Agora o alvo é referenciado pela interface IStatus, não mais pela classe concreta Combatente ou Status.
    @Override
    public void ataque(IStatus statusAtacante, IStatus statusAlvo, int multiplicacaoDano) {
        int valorAtaque = statusAtacante.getAtaque(); // Interagindo via interface
        int defesaBaseAlvo = statusAlvo.getDefesa();  // Interagindo via interface
        
        int defesaCritica = this.defesaCritico(defesaBaseAlvo);

        int danoSofrido = valorAtaque - defesaCritica;

        if (danoSofrido < 1) {
            danoSofrido = 1;    
        }
        
        int danoTotal = danoSofrido * multiplicacaoDano;
        
        // Aplicamos o dano diretamente no status do alvo
        int novaVida = statusAlvo.getVida() - danoTotal;

        if (novaVida < 0) {
            novaVida = 0;
        }
        statusAlvo.setVida(novaVida);
        
        System.out.println(statusAlvo.getNome() + " recebeu " + danoTotal + " de Dano / Vida atual: " + novaVida);
    }
}