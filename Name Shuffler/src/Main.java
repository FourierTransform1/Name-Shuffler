import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    private static String[] firstNames = {"Anna" , "Karl" , "Kajsa", "Petter" , "Sophia"};
    private static String[] lastNames = {"Nilsson" , "Svensson" , "Persson" , "Karlsson" , "Davidson"};
    private static Scanner input = new Scanner(System.in);
    private static int amount;
    String[] fullNames;
    private SecureRandom random = new SecureRandom();
    private int a;
    private int b;






    public static void main(String[] args) {

        Main obj = new Main();



        System.out.println("Hello");
        System.out.println("How many names do you want to generate?");
        amount = input.nextInt();
        String[] randomlyGenerated = obj.generateFullNames(firstNames,lastNames,amount);
        obj.printArray(randomlyGenerated);

    }


    private String[] generateFullNames(String[]firstNames, String []lastNames , int am){

        fullNames = new String[am];

        for (int i = 0; i < am ; i++){

            a = random.nextInt(5);
            b = random.nextInt(5);

            fullNames[i] = firstNames[a] + ", " + lastNames[b];
        }

        return fullNames;
    }


    private void printArray(String[] a){


        System.out.println("First names: ");
        for (int i  = 0; i < firstNames.length  ;i++ ){
            System.out.print("---");
            System.out.print(firstNames[i]);
        }


        System.out.println();
        System.out.println("last names: ");
        for (int i  = 0; i < lastNames.length  ;i++ ){
            System.out.print("---");
            System.out.print(lastNames[i]);
        }




        for (int i = 0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }




    }















}
