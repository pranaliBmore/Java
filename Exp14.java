/*Write a program to read a text file one line at a time. Read each line as a String and
place that String object into a LinkedList. Print all of the lines in the LinkedList in
reverse order.*/

import java.io.*;
import java.util.*;

class Exp14 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("input.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                list.add(line);
            }

            br.close();

            System.out.println("Lines in reverse order:");

            ListIterator<String> itr = list.listIterator(list.size());

            while (itr.hasPrevious()) {
                System.out.println(itr.previous());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}