// Nome do Arquivo: batalha.java

import java.util.Scanner;
public class batalha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usa a classe abstrata como tipo de referência (Polimorfismo)
        combatente j1 = null; 
        combatente j2 = null;

        for (;;) {
            System.out.println("=====================");
            System.out.println("/////////DC X DC\\\\\\\\\\");
            System.out.println("1- Selecionar lutadores ");
            System.out.println("2- Sair ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.println("Escolha o Jogador 1:");
                System.out.println("1- Superman");
                System.out.println("2- Batman");
                System.out.println("3- Darkside");
                op = sc.nextInt();
                if (op == 1) {
                    j1 = new superman();
                }else if (op == 2) {
                    j1 = new batman();
                }else if(op == 3){
                    j1 = new darkside();
                }
                System.out.println("Escolha o Jogador 2:");
                System.out.println("1- Superman");
                System.out.println("2- Batman");
                System.out.println("3- Darkside");
                op = sc.nextInt();
                if (op == 1) {
                    j2 = new superman();
                }else if (op == 2) {
                    j2 = new batman();
                }else if(op == 3){
                    j2 = new darkside();
                }
               iniciarBatalha(j1, j2, sc);
                
            }else if (op == 2) {
                System.out.println("Saindo...");
                return;
            }else{
                System.out.println("Numero Invalido!!");
                continue;
            }
        }
    }

    public static void iniciarBatalha(combatente j1, combatente j2, Scanner sc) {
        combatente atacante = j1;
        combatente defensor = j2;
        int turno = 1;

       while (j1.getVida() > 0 && j2.getVida() > 0) {
            System.out.println(" TURNO - " + turno + " -");

            // O método moveset chamado aqui será o moveset ESPECÍFICO 
            // do tipo de objeto em 'atacante' (Superman, Batman ou Darkside).
            atacante.moveset(defensor); 
            
            // Troca de papéis
            combatente temp = atacante;
            atacante = defensor;
            defensor = temp;
            
            turno++;
            j1.exibirStatus();
            j2.exibirStatus();
        
    }
    
    if (j1.getVida() > j2.getVida()) {
        System.out.println("Vitoria do Jogador 1!");
    }else if (j1.getVida() < j2.getVida()) {
        System.out.println("Vitoria do Jogador 2!");
    }else{
        System.out.println("EMPATE entre os Jogadores 1 e 2!!");
    }
}
}