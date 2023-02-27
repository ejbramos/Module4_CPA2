import java.util.LinkedList;
import java.util.Scanner;

public class josephus {
    static LinkedList<Integer> prisoner = new LinkedList<Integer>();
    static int INTERVAL = 0;
    static int counter = 0;
    static int temp = 0;
    static int numPris = 0;
    static void initialize(){
        System.out.println("Input number of prisoner: ");
        Scanner input1 = new Scanner(System.in);



        numPris = input1.nextInt();
        for(int i = 1; i<numPris+1; i++){
            prisoner.add(i);
        }
        System.out.println("Input Interval: ");
        Scanner input2 = new Scanner(System.in);
        INTERVAL = input2.nextInt();
    }

    static void killing(){
        initialize();
        while((prisoner.size() != 1)){
            temp = ((temp) + (INTERVAL-1)) % (prisoner.size());

             prisoner.remove(temp);
         counter++;
        }
        System.out.println("The surviving prisoner is: "+prisoner.peek());
    }
    public static void main(String[] args){
        killing();



    }
}


