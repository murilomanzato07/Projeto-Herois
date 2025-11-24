public class combatente{
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;

    public combatente(String nome, int  vida, int ataque, int  defesa){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }
    public float getVida() {
        return vida;
    }
    public float getAtaque() {
        return ataque;
    }
    public float getDefesa() {
        return defesa;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void ataque(combatente alvo, int valorAtaque){
        if (alvo == this) { // verifica se esta atancando a si mesmo
            System.out.println("NAO se pode se atacar!");
        }

        
    }
    public void receberDano(int valorDano){
        int novaVida = this.vida - valorDano;;

        if (novaVida < 0) {
            novaVida = 0;
        }

        setVida(novaVida);

        System.out.println(this.nome+" recebeu "+ valorDano +" vida atual: "+novaVida);
    }


    public void exibirStatus(){
        System.out.println("Status:  Nome: "+nome+" Vida: "+vida+" Ataque:"+ataque+" Defesa: "+defesa);
    }


}