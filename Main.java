package PhoneNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String []args){
        printTask();
        int N = scan();
        for(int i = 0; i < N; i++){
            printElement(i+1);
            List.addNumber();
        }
        List.printNumbers();
        List.recreate();
        NewList.printNumbers();
    }

    static int scan(){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int N;
        try{
            N = Integer.parseInt(line);
        }catch(Exception e){
            printError();
            N = scan();
        }
        if(N > 10){
            printError();
            N = scan();
        }
        return N;
    }

    static void printError(){
        System.out.println("Number is incorrect. Try again");
    }

    static void printTask(){
        System.out.println("Enter quantity of PhoneNumbers");
    }

    static void printElement(int element){
        System.out.println("Enter " + element + " number");
    }
}
