/**
 * A merge sorter
 * 
 * @author Aaron Knestaut
 */

import java.util.*;
import java.io.*;

public class MergeSort {
    static ArrayList<Integer> file = new ArrayList<Integer>();
    static ArrayList<Integer> help = new ArrayList<Integer>();

    /**
     * Main method, with a scanner
     * 
     * @param command line arguments
     */
    public static void main (String args[]) {
        try{
            Scanner fileScan = new Scanner(new BufferedReader(new FileReader("nums.txt")));
            readFile(fileScan);

            int low = 0;
            int high = file.size();
            splitter(low, high);

            //just for output, if desired
            /*for(int i : file){
                System.out.println(i);
            }*/
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Reads the file into an ArrayList
     * 
     * @param the scanned file
     */
    public static void readFile (Scanner fileScan) {
        while(fileScan.hasNext()){
            file.add(fileScan.nextInt());
        }
    }

    /**
     * Splits the array into individual indices
     * 
     * @param lowest index of the array
     * @param highest index of the array
     */
    public static void splitter (int low, int high) {
        if(low < high){
            int mid = high / 2;
            splitter(low, mid);
            splitter(mid + 1, high);
            merger(low, mid, high);
        }
    }

    /**
     * Merges the indices together and sorts them appropriately
     * 
     * @param lowest index of the array
     * @param middle of the array set
     * @param highest index of the array
     */
    public static void merger (int low, int mid, int high) {
        int count = low;
        int count2 = mid + 1;
        int count3 = low;
        
        System.out.println("Test");

        for(int i = low; i <= high; i++)
            help.set(i, file.get(i));

        while(count <= mid && count2 <= high){
            if(help.get(count) <= help.get(count2)){
                file.set(count3, help.get(count));
                count++;
            }
            else{
                file.set(count3, help.get(count2));
                count2++;
            }
            count3++;
        }

        while(count <= mid){
            file.set(count3, help.get(count));
            count3++;
            count++;
        }
    }
}