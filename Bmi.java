import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
        for(int i=1;i<=2;i++){
        System.out.print(i+"�l�ڂ̐g��(m):");
        double height = stdIn.nextDouble(); 
        System.out.print(i+"�l�ڂ̑̏d:");
        double weight = stdIn.nextDouble(); 
 
        double bmi = weight / Math.pow(height, 2);
 
        System.out.println(i+"�l�ڂ�BMI�l��" + Math.floor(bmi*100)/100 + "�ł��B");
        }
    }
}
