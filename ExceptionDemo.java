/*Develop application which can handle any 5 combinations of predefined compile time and 
runtime exceptions using multiple catch blocks. Use throws and finally keywords as well.*/

import java.io.*;

class ExceptionDemo {
    static void test(int ch) throws IOException{
        switch(ch) {
            case 1: {
                System.out.println("Arithmetic Exception");
                System.out.println(10/0);
                break;
            }
            case 2: {
                System.out.println("Array Index Out of Bounds Exception");
                int a [] = {1, 2};
                System.out.println(a[5]);
                break;
            }
            case 3: {
                System.out.println("Null Pointer Exception");
                String s = null;
                System.out.println(s.length());
                break;
            }
            case 4: {
                System.out.println("Number Format Exception");
                int n = Integer.parseInt("abc");
                break;
            }
            case 5: {
                FileReader f = new FileReader("abc.txt"); // IOException
                break;
            }
            default: {
                System.out.println("Invalid choice");
            }
        }
    }
    
} 
