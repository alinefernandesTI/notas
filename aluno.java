
package alinefernandes;
import java.util.Scanner;

public class aluno {
    private int matricula;
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private static int auxMatricula=1;
   

    Scanner ler = new Scanner (System.in);
    
    public aluno(){
            this.nome=nome;
            this.nota1=0;
            this.nota2=0;
            this.nota3=0;
            this.matricula = gerarMatricula();
}   
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    private static int gerarMatricula(){
        return auxMatricula++;
    }
    public void lancarNotas(){
       do{
            System.out.println("Informe nota 1: ");
             setNota1(ler.nextInt());
            if(getNota1()<1||getNota1()>10)
             System.out.println("Valor inválido");
        }while(getNota1()<1|| getNota1()>10);
       do{
            System.out.println("Informe nota 2: ");
             setNota2(ler.nextInt());
            if(getNota2()<1||getNota2()>10)
             System.out.println("Valor inválido");
        }while(getNota2()<1|| getNota2()>10);
       do{
            System.out.println("Informe nota 3: ");
             setNota3(ler.nextInt());
            if(getNota3()<1 || getNota3()>10)
             System.out.println("Valor inválido");
        }while(getNota3()<1|| getNota3()>10);
    }
    private float calcularMedia(float a, float b, float c){
        a= getNota1();
        b= getNota2();
        c= getNota3();
       
       return ((getNota1()+getNota2()+getNota3())/3);
    }
    private boolean verificarAprovacao(float x){
        x= calcularMedia(getNota1(), getNota2(), getNota3());
       
        if (x>=7) {            
                return true;
        }        
        else {            
                return false;    
        } 
    }    
    public void exibirDados(){
        System.out.println("Mtricula: "+ getMatricula()+"\nNome: "+getNome()+"\nNotas "+ "\nNota 1: "+getNota1()+"\nNota 2: "+getNota2()+"\nNota 3: "+getNota3()+ "\nMédia: "+ calcularMedia(nota1, nota1, nota1));
        boolean y = verificarAprovacao(nota1);
        if ( y == true){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }  
    }      
}
   