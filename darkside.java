public class darkside extends combatente{
    public darkside(){
        super("Darkside", 20, 4, 5);
    }
    public void moveset(combatente alvo){
        int op = generator.nextInt(3);
        int dano = getAtaque();

        if (op == 0) {// soco base
            nomeAtaque = "Soco";
            this.setNomeAtaque(nomeAtaque);
            this.ataque(alvo,dano,1);
        }else if(op == 1){// ataque 1
            nomeAtaque = "Raios Omega";
            this.setNomeAtaque(nomeAtaque);
            this.ataque(alvo, dano,2);
        }else if (op == 2) {// ataque 2
            nomeAtaque = "Equacao Anti-Vida";
            this.setNomeAtaque(nomeAtaque);
            this.ataque(alvo,dano,3);
        }
    }
}
