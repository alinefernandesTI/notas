
package alinefernandes;
import java.util.Scanner;

public class Alinefernandes { 

    public static void main(String[] args) {
     
        aluno aluno1 = new aluno();
        System.out.println("Informe seu nome: ");
        Scanner ler=new Scanner(System.in);
        aluno1.setNome(ler.nextLine());
        aluno1.lancarNotas();
        aluno1.exibirDados();
        aluno aluno2=new aluno();
        System.out.println("Informe seu nome: ");
        aluno2.setNome(ler.nextLine());
        aluno2.lancarNotas();
        aluno2.exibirDados();
    
    
    }
}    