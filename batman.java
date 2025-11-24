
public class batman extends combatente {

    public batman(){
        super("Batman", 20, 2, 1);
    }
    public void moveset(combatente alvo){
        int op = generator.nextInt(3);
        int dano = getAtaque();

        if (op == 0) {// soco base
            nomeAtaque = "Soco";
            this.setNomeAtaque(nomeAtaque);
            this.ataque(alvo,dano,1);
        }else if(op == 1){// ataque 1
            nomeAtaque = "Batrangue";
            this.setNomeAtaque(nomeAtaque);
            this.ataque(alvo, dano,2);
        }else if (op == 2) {// ataque 2
            nomeAtaque = "Anel de Kriptonita";
            this.setNomeAtaque(nomeAtaque);
            this.ataque(alvo,dano,3);
        }
    }
}
