package com.ykv;

import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.stream.IntStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //#####Basic Java#####

//        System.out.println("What is your name?");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hi "+input.nextLine());
//        System.out.println("What is your age?");
//        System.out.println("Your age is "+input.nextInt());
//        System.out.println("Am i correct?");
//        input.nextLine();
//        System.out.println(input.nextLine());
//        System.out.println("Good");

//          boolean choice;
//          char ini;
//          String name = "adam";
//          long y;
//          float a;
//          double b;
//          long x = 123243545433463443L;
//          byte num = 121;


//            int a = 1;
//            int b = 2;
//            int temp;
//            System.out.println("a : "+a);
//            System.out.println("b : "+b);
//            temp = a;
//            a=b;
//            b=temp;
//            System.out.println("a : "+a);
//            System.out.println("b : "+b);
              Scanner input = new Scanner(System.in);
//            int num1 = input.nextInt();
//            int num2 = input.nextInt();
//            int sum = num1 + num2;
//            System.out.println("The sum is  : "+sum);

        //##### Using JOptionPane class for GUI #####

//              String name = JOptionPane.showInputDialog("What's your name?");
//              JOptionPane.showMessageDialog(null,"Hello "+name);
//              int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?"));
//              JOptionPane.showMessageDialog(null,"Ok,your are "+age+" years old.");
//              double weight = Double.parseDouble(JOptionPane.showInputDialog("What's your weight?"));
//              JOptionPane.showMessageDialog(null,"Your weight is "+weight+" kgs");
//              int a = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE FIRST NUMBER"));
//              int b = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE SECOND NUMBER"));
//              int sum = a+b;
//              JOptionPane.showMessageDialog(null,"The sum of "+a+" and "+b+" is "+sum);

                //#####Hypotenuse finder GUI#####

//                int a = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE FIRST SIDE"));
//                int b = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE SECOND SIDE"));
//                double hypo = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//                JOptionPane.showMessageDialog(null,"The length of hypotenuse is "+hypo);

                 //#####Random class#####

//                  Random random = new Random();
//                  int x = random.nextInt(3)+1;
//                  System.out.println(x);

                //#####Conditionals (if-else-else if)#####

//              int age = Integer.parseInt(JOptionPane.showInputDialog("What's your age?"));
//              if(age>18 && age <50){
//                  JOptionPane.showMessageDialog(null,"Ok,your are adult.You are welcome!!!");
//              }
//              else if(age>50){
//                  JOptionPane.showMessageDialog(null,"Sorry,your are too old.You are not welcome!!!");
//              }
//              else{
//                  JOptionPane.showMessageDialog(null,"Poda,your are child.You are not welcome!!!");
//              }

            //####Conditionals (switch)####
//                Scanner input = new Scanner(System.in);
//                int button = input.nextInt();
//                input.nextLine();
//                switch(button){
//                    case 1 : System.out.println("You presses 1");
//                             break;
//                    case 2 : System.out.println("You presses 2");
//                             break;
//                    case 3 : System.out.println("You presses 3");
//                             break;
//                    case 4 : System.out.println("You presses 4");
//                             break;
//                    case 5 : System.out.println("You presses 5");
//                             break;
//                    case 6 : System.out.println("You presses 6");
//                             break;
//                    default: System.out.println("Invalid Number");
//                }

        //####  LOGICAL OPERATORS #####//
           /*
            AND - &&
            OR - ||
            NOT - !
            */

        //##### equals() method #####//

//        String response = input.nextLine();
//        if((response.equals("q") ) ||(response.equals("Q"))){
//            System.out.println("You quit!");
//        }
//        else{
//            System.out.println("You continue");
//        }

        //##### FOR LOOPS #####//

        /*
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        */

        //##### WHILE LOOPS #####//

        /*
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        */

        //##### DO-WHILE LOOPS #####//

        /*
        int i=0;
        do{
            System.out.println(i);
        }while(i<0);
        */

        //##### NESTED LOOPS #####//

        /*
        System.out.print("ENTER THE NUMBER OF ROWS : ");
        int r = input.nextInt();
        System.out.print("ENTER THE NUMBER OF COLUMNS : ");
        int c = input.nextInt();
        input.nextLine();
        System.out.print("ENTER THE SYMBOL : ");
        String symbol = input.nextLine();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        */

        //##### ARRAYS #####//

        /*
        System.out.print("How many guests in total : ");
        int n = input.nextInt();
        input.nextLine();
        //System.out.println();
        String[] names = new String[n];
        System.out.println("ENTER THE GUEST NAMES : ");
        for(int i=0;i<n;i++){
            System.out.print("Enter name of guest "+(i+1)+" :");
            String name = input.nextLine();
            //System.out.println();
            names[i] = name;
        }
        System.out.println("####YOUR GUEST LIST####");
        for(int i=0;i<n;i++){
            System.out.println(names[i]);
        }

         */

        //##### 2D ARRAYS #####//

        /*

        int[][] nums = new int[3][3];
        System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print("ENTER THE ELEMENT "+"["+i+"]"+"["+j+"]" +" : ");
                int n = input.nextInt();
                input.nextLine();
                nums[i][j] = n;
            }
        }
        for (int[] num : nums) {//for each array num in nums i.e each row
            for (int i : num) {//for each element i in num
                System.out.print(i+" ");
            }
            System.out.println();
        }
         */

        //##### STRING ACTIONS #####//

        /*
        String name = "   Yadhu    ";
        String test = "     ";
        char a = name.charAt(1);
        System.out.println(a);
        System.out.println(name.toLowerCase());
        IntStream stream = name.codePoints();//gets ascii values of chars present in the string
        System.out.println("ASCII Values are: ");
        // Print the code points
        stream.forEach(System.out::println);
        System.out.println(name.startsWith("Y"));
        System.out.println(name.compareTo("Yadhu"));//can only take string as parameter
        System.out.println(name.equals(1));//can take any datatype as parameter
        System.out.println(name.equals(1));
        System.out.println(test.isEmpty());
        System.out.println(name.trim());
         */

        //AUTOBOXING = Automatic conversion that JAVA compiler makes between primitive data types and corresponding object wrapper class i.e int ==> Integer
        //UNBOXING   = Reverse of autoboxing i.e wrapper class to primitive

        //##### WRAPPER CLASS #####//

        /*
        Integer i = 10;
        System.out.println(i.hashCode());
        System.out.println(i.compareTo(10));
         */

        //##### ARRAYLISTS #####//
        //ArrayLists ==> Can add/delete any number of elements from array even after compilation.i.e dynamic arrays.
        /*
        ArrayList<String> pros = new ArrayList<String>();
        System.out.println("ENTER THE NAMES OF PRO FOOTBALLERS");
        String ch = "y";
        while(ch.equals("y")){
            System.out.print("ENTER THE NAME : ");
            String name = input.nextLine();
            pros.add(name);
            System.out.println("Do you want to continue?(y/n)");
            ch = input.nextLine();
        }
        for(int i=0;i<pros.size();i++){
            System.out.println(pros.get(i));
        }
         */

        //##### GETTING NAMES AND ROLL NUMBERS USING ARRAYLISTS #####
        /*
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> rollno = new ArrayList<Integer>();
        System.out.println("!!!!!ENTER THE NAMES AND ROLL NUMBERS OF THE STUDENTS!!!!!");
        String ch = "y";
        while(ch.equals("y")||ch.equals("Y")){
            System.out.print("Enter the name of the student : ");
            String name = input.nextLine();
            names.add(name);
            System.out.print("Enter the roll number of the student : ");
            int roll_no = input.nextInt();
            input.nextLine();
            rollno.add(roll_no);
            System.out.print("Do you want to continue?(y/n)");
            ch = input.nextLine();
        }
        for(int i=0;i<names.size();i++){
            System.out.print("Name : "+names.get(i)+"----");
            System.out.println("Roll no : "+rollno.get(i));
        }
        System.out.println("List completed "+(names.size()+"/"+names.size()));
         */

        //##### 2D ARRAYLISTS #####//

        /*
        ArrayList<ArrayList<String>> Team = new ArrayList<>();

        ArrayList<String> Forwards = new ArrayList<>();
        Forwards.add("Messi");
        Forwards.add("Ronaldo");
        Forwards.add("Neymar");

        ArrayList<String> Mid = new ArrayList<>();
        Mid.add("Xavi");
        Mid.add("Busquets");
        Mid.add("Iniesta");

        ArrayList<String> Defense = new ArrayList<>();
        Defense.add("Dani Alves");
        Defense.add("Ramos");
        Defense.add("Pique");
        Defense.add("Jordi Alba");

        System.out.println(Forwards);
        System.out.println(Mid);
        System.out.println(Defense);

        Team.add(Forwards);
        Team.add(Mid);
        Team.add(Defense);
        System.out.println(Team);
        System.out.println(Team.get(0).get(0));
        System.out.println(Team.get(1).get(2));
        System.out.println(Team.get(2).get(2));
        */

        //##### FOR-EACH LOOP [OR] ENHANCED FOR LOOP #####//

        /*
        ArrayList<String> phones = new ArrayList<>();
        phones.add("Iphone");
        phones.add("Samsung");
        phones.add("Google pixel");

        for(String phone : phones){
            System.out.println(phone);
        }
         */

        //#####  METHODS #####//

        /*
        printHello("Yadhu",21,"India");
        int x = 4;
        int y = 5;
        int res = add2nums(x,y);
        System.out.print(res);
         */
        /*
        int res = mulNums(2,4,5);
        System.out.print(res);
         */

        //##### printf() method #####//
        /*
        int x = 500000;
        String name = "Yadhu Krishnan";
        double val = 3.4;
        float fl = 2.1f;
        boolean bool = true;
        System.out.printf("This is %,d",x);
         */

        //##### final keyword #####//
        /*
        final double PI = 3.14159;
        System.out.println(PI);
         */

        /*
        Phones ph = new Phones();
        System.out.println(ph.brand);
        System.out.println(ph.model);
        System.out.println(ph.price);
        System.out.println(ph.make_year);
        ph.getBbrand();
        ph.getPhoneDetails();
        ph.makeYear();
         */
        /*
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        int ret = LinearSearch(array,-8);
        if(ret != -1){
            System.out.println("Item found at "+ret);
        }
        else{
            System.out.println("Item not found");
        }
         */

        /*
        String name = "Malayalam";
        char target = 'a';
        int c =  count(name,target);
        System.out.println("Count of occurrences of "+target+" in "+name+ " is "+c+".");
         */

        boolean isString = input.hasNextLine();
        System.out.println(isString);
    }

    /*
    static void printHello(String name,int age,String country){
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("You are from "+country);
    }
     */
    /*
    static int add2nums(int a,int b){
        int x = a+b;
        return x;
    }
     */

    //##### OVERLOADED METHODS #####//
    /*
    static int mulNums(int x,int y){
        return x*y;
    }
    static int mulNums(int x,int y,int z){
        return x*y*z;
    }

    static int LinearSearch(int[] arr,int target){
        if(arr.length == 0){
            System.out.println("Array empty");
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int count(String string,char target){
        int count=0;
        if(string.length()==0){
            return -1;
        }
        for (int i=0;i<string.length();i++){
            if(string.charAt(i)==target){
                count++;
            }
        }
        return count;
    }
     */
}