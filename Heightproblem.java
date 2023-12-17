
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("How many people will be registered?");
        int num = sc.nextInt();

        String[] name = new String[num];
        int[] age = new int[num];
        double[] height = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("person data %d:\n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for(int i = 0 ; i < height.length;i++){
            sum+=height[i]/(num);
        }
        int minors = 0;
        double percentage = 0;
        for(int i = 0 ; i < age.length;i++) {
           if(age[i] < 16){
               minors++;
           }

        }
        percentage = ((double)minors / num) * 100.0;
        System.out.println("Average Height: "+sum);
        System.out.printf("People under 16: %.1f%%\n", percentage);

        for(int i=0; i<num; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }
    }
      }

