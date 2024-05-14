package Day9;

import java.util.Scanner;

public class Main extends Employee {
    public void display(){
        System.out.println("Bye");

    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        Main m=new Main();

        m.display();// single level
        m.showAddress();//multilevel


//        Hierarchical Inheritance
//                    Class A
//                       |
//                _______|________
//                |              |
//            Class B          Class C

        //        HYbrid Inheritance



//                    Class D             ----------------           ----------|
//                       |                               | Single level        |
//                       |                               | Inheritance         |
//                    Class A             ----------------                     |Hybrid
//                       |                                |                    |Inheritance
//                _______|________                        |  Hierarchical      |
//                |              |                        |  Inheritance
//                |
//            Class B          Class C    ----------------|            --------|




    }
}
