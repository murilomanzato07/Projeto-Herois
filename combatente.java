
import java.util.Random;

public class combatente {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected String nomeAtaque;
    protected Random generator = new Random();
    protected Random generator2 = new Random();
    

    public combatente(String nome, int  vida, int ataque, int  defesa){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nomeAtaque = null;
       
    }

    public String getNome() {
        return nome;
    }
    public int getVida() {
        return vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setNomeAtaque(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public int defesaCritico(){
        int defesaBase = this.getDefesa();

        if(generator.nextInt(10) ==  generator2.nextInt(10)){
            return defesaBase * 2;
        }
        return defesaBase;
    }
    
    public void moveset(combatente alvo){
        int op = generator.nextInt(3);
        int dano = getAtaque();

        if (op == 0) {// soco base
            this.ataque(alvo,dano,1);
        }else if(op == 1){// ataque 1
            
            this.ataque(alvo, dano,2);
        }else if (op == 2) {// ataque 2
            
            this.ataque(alvo,dano,3);
        }
    }
    

    public void ataque(combatente alvo, int valorAtaque, int multiplicacaoDano){
        if (alvo == this) { // verifica se esta atancando a si mesmo
            System.out.println("NAO se pode se atacar!");
        }

        int defesaCritica = alvo.defesaCritico();

        int danoSofrido = valorAtaque - defesaCritica;

        if (danoSofrido < 1) {
            danoSofrido = 1;    
        }

        alvo.receberDano(danoSofrido * multiplicacaoDano);


    }


    public void receberDano(int valorDano){
        int novaVida = this.vida - valorDano;;

        if (novaVida < 0) {
            novaVida = 0;
        }

        setVida(novaVida);

        System.out.println(this.nome+" recebeu "+ valorDano +" de Dano / Vida atual: "+novaVida);
    }


    public void exibirStatus(){
        System.out.println("Status:  Nome: "+nome+" Vida: "+vida+" Ataque:"+ataque+" Defesa: "+defesa);
    }

    

}