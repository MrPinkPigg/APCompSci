/**
 * A merge sorter
 * 
 * @author Aaron Knestaut
 */

import java.util.*;
import java.io.*;

public class RevisedMergeSort {
    static ArrayList<Integer> help = new ArrayList<Integer>();

    /**
     * Main method, with a scanner
     * 
     * @param command line arguments
     */
    public static void main (String args[]) {
        try{
            Scanner fileScan = new Scanner(new BufferedReader(new FileReader("nums.txt")));

            ArrayList<Integer> temp = new ArrayList<Integer>();
            while(fileScan.hasNext()){
                temp.add(fileScan.nextInt());
            }
            int size = temp.size();
        
            int [] file = new int [size];
            int count = 0;
            while(count < size){
                file[count] = temp.get(count);
                count++;
            }

            file = splitter(file);
            
            //just for output, if desired
            for(int i : file){
                System.out.println(i);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    /**
     * Splits the array into individual indices
     * 
     * @param [parameter-name] [description]
     * @param [parameter-name] [description]
     */
    public static int[] splitter (int[] file) {
            if(file.length == 1)
                return file;

            else{
                int [] low = new int [file.length / 2];
                int [] high = new int [file.length - low.length];

                low = splitter(low);
                high = splitter(high);
                
                file = merger(low, high);
                return file;
            }
    }

    
    /**
     * Merges the indices together and sorts them appropriately
     *
     * @param [parameter-name] [description]
     * @param [parameter-name] [description]
     * @param [parameter-name] [description]
     */
    public static int[] merger (int[] low, int[] high) {
        int [] fin = new int [low.length + high.length];

        return fin;
    }
}