import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
   
      System.out.print("�g��(m):");
      double height = stdIn.nextDouble(); 
      System.out.print("�̏d:");
      double weight = stdIn.nextDouble(); 
   
      double bmi = weight / Math.pow(height, 2);
   
      System.out.println("BMI�l��" + Math.floor(bmi*100)/100 +"�ł��B" );
    }
  }
