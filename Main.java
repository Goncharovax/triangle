import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        class  Triangle {

            public int a,b,c;


             public void  Program(int a, int b, int c){
                if ((a==b)&&(b==c)) {
                   System.out.println("This is equilateral triangle");
                }
                else if((a == b ) || (a == c) || (b == c)){
                    System.out.println("This is isosceles triangle");
                }  else {
                    System.out.println("This is scalene triangle");
                }


            }

        }



        Scanner con = new Scanner(System.in);
        System.out.println("Enter a:");
            int a = con.nextInt();

            if(a<0){
                System.out.println("The side cannot be negative.");
                System.exit(0);
            } else {System.out.println(a);}



        System.out.println("Enter b:");
        int b = con.nextInt();
        if(b<0){
            System.out.println("The side cannot be negative.");
            System.exit(0);
        } else {System.out.println(b);}
        System.out.println("Enter c:");
        int c = con.nextInt();
        if(c<0){
            System.out.println("The side cannot be negative.");
            System.exit(0);
        } else {System.out.println(c);}



        Triangle tr= new Triangle();
        tr.Program(a,b,c);


        con.close();

    }

}








