/*Take Student information such as name, age, weight, height, city, phone from user and store it 
in the file using DataOutputStream and FileOutputStream and Retrieve data using 
DataInputStream and FileInputStream and display the result. Use Serialization concept and 
Bytestream classes.  */
import java.io.*;
import java.util.Scanner;

public class Exp12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter the Name : ");
            String name=sc.nextLine();
            System.out.print("Enter the Age: ");
            int age=sc.nextInt();
            System.out.print("Enter the weight: ");
            int weight=sc.nextInt();
            System.out.print("Enter Height: ");
            int height=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter City: ");
            String city=sc.nextLine();
            System.out.print("Enter Phone number: ");
            String Phone_number=sc.nextLine();

            FileOutputStream fo=new FileOutputStream("Ex_12.txt");
            DataOutputStream dos=new DataOutputStream(fo);
            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeInt(weight);
            dos.writeInt(height);
            dos.writeUTF(city);
            dos.writeUTF(Phone_number);
            dos.close();
            fo.close();
            System.out.println("Data added successfully");

            FileInputStream fis=new FileInputStream("Ex_12.txt");
            DataInputStream dis=new DataInputStream(fis);
            
            String rname=dis.readUTF();
            int rage = dis.readInt();
            int rwt=dis.readInt();
            int rht=dis.readInt();
            String rcity=dis.readUTF();
            int ph_no=dis.readInt();

            dis.close();
            fis.close();

            System.out.println("\n----- Student Information -----");
            System.out.println("Name   : " + rname);
            System.out.println("Age    : " + rage);
            System.out.println("Weight : " + rwt);
            System.out.println("Height : " + rht);
            System.out.println("City   : " + rcity);
            System.out.println("Phone  : " + ph_no);
}
catch(IOException e){
    System.out.println("Exception Occur"+e.getMessage());
}
    }
}