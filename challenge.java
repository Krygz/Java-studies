import java.util.*;
public class Main {
    public static void main(String[] args) {
int aprovados = 0;
int reprovados = 0;
int counter = 1;
Scanner input = new Scanner(System.in);

while(counter <= 10){
    counter = counter +1;
    System.out.println("insira o resultado:");
    double result = input.nextInt();
      if (result >= 7.5){
      aprovados = aprovados + 1;
      System.out.println("+"+aprovados+" aprovado(s)");


      }else {
          reprovados = reprovados + 1;
          System.out.println("+"+reprovados+" reprovado(s)");
      }

}
        System.out.println("total de aprovados :"+aprovados);
        System.out.println("total de reprovados :"+reprovados);

if(aprovados >= 8){
       System.out.println("a maior parte da turma foi aprovada, o instrutor ganhou um bônus");

        }else {
       System.out.println("a maior parte da turma foi reprovada , o instrutor não ganhou um bônus");
        }
    }
}
