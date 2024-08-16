
import java.util.Scanner;



class  Demo{
    public static void main(String args[]){
        System.out.println("enter a number : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the num is : "+ num);
        sc.close();
    }
}