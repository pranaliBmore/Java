/*Develop application which can handle any 5 combinations of predefined compile time and 
runtime exceptions using multiple catch blocks. Use throws and finally keywords as well.*/

import java.util.Scanner;

public class ExceptionDemo {
    static void exceptionTest(int choice, Scanner sc)
            throws ArithmeticException, ArrayIndexOutOfBoundsException,
                   NumberFormatException, NullPointerException,
                   StringIndexOutOfBoundsException {
        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                System.out.println("Result = " + (a / b));
                break;
            case 2:
                int arr[] = {10, 20, 30};
                System.out.print("Enter array index: ");
                int index = sc.nextInt();
                System.out.println("Value = " + arr[index]);
                break;
            case 3:
                System.out.print("Enter a number: ");
                String str = sc.next();
                int num = Integer.parseInt(str);
                System.out.println("Number = " + num);
                break;
            case 4:
                System.out.print("Enter a string: ");
                String s = sc.next();
                if (s.equals("null")) {
                    s = null;
                }
                System.out.println("Length = " + s.length());
                break;
            case 5:
                System.out.print("Enter a string: ");
                String name = sc.next();
                System.out.print("Enter character index: ");
                int i = sc.nextInt();
                System.out.println("Character = " + name.charAt(i));
                break;
            case 6:
                System.out.println("Program terminated.");
                break;
            default:
                System.out.println("Invalid choice!");
        }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n===== EXCEPTION HANDLING =====");
            System.out.println("1. Arithmetic Exception");
            System.out.println("2. Array Index Exception");
            System.out.println("3. Number Format Exception");
            System.out.println("4. Null Pointer Exception");
            System.out.println("5. String Index Exception");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            try {
                exceptionTest(choice, sc);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception: " + e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Exception: " + e.getMessage());
            }
            catch (NumberFormatException e) {
                System.out.println("Number Format Exception: " + e.getMessage());
            }
            catch (NullPointerException e) {
                System.out.println("Null Pointer Exception: " + e.getMessage());
            }
            catch (StringIndexOutOfBoundsException e) {
                System.out.println("String Index Exception: " + e.getMessage());
            }
            finally {
                System.out.println("Finally Block is Executed");
            } }
        sc.close();
    }}