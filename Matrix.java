/**
 * Can perform various mathmatical matrix actions
 * 
 * @author Aaron Knestaut
 */

import java.util.*;

public class Matrix {
    int rowLength;
    int colLength;
    /**
     *
     */
    public Matrix (int row, int col) {
        double [][] temp = new double [row][col];
        rowLength = row;
        colLength = col;
    }

    /**
     * 
     */
    public void set (int row, int col, double input){
        
    }

    /**
     * 
     */
    public double get (int row, int col){
        return 1;
    }

    /**
     * 
     */
    public Matrix add (Matrix a, Matrix b) throws MatrixException{
        int aRows = a.rowLength;
        int aCols = a.colLength;
        int bRows = b.rowLength;
        int bCols = b.colLength;

        if(a == null || b == null){
            throw new MatrixException("Empty Matrix");
        }
        else if(aRows != bRows || aCols != bCols){
            throw new MatrixException("Inequal Matricies");
        }

        Matrix sum = new Matrix(aRows, aCols);
        double answ;

        for(int x = 0; x <= aRows; x++){
            for(int y = 0; y <= aCols; y++){
                answ = a.get(x, y) + b.get(x, y);
                sum.set(x, y, answ);
            }
        }

        return sum;
    }

    /**
     * 
     */
    public Matrix sub (Matrix a, Matrix b) throws MatrixException{
        int aRows = a.rowLength;
        int aCols = a.colLength;
        int bRows = b.rowLength;
        int bCols = b.colLength;

        if(a == null || b == null){
            throw new MatrixException("Empty Matrix");
        }
        else if(aRows != bRows || aCols != bCols){
            throw new MatrixException("Inequal Matricies");
        }

        Matrix dif = new Matrix(aRows, aCols);
        double answ;

        for(int x = 0; x <= aRows; x++){
            for(int y = 0; y <= aCols; y++){
                answ = a.get(x, y) - b.get(x, y);
                dif.set(x, y, answ);
            }
        }

        return dif;
    }

    /**
     * 
     */
    public Matrix mult (Matrix a, Matrix b) throws MatrixException{
        int aRows = a.rowLength;
        int aCols = a.colLength;
        int bRows = b.rowLength;
        int bCols = b.colLength;

        if(a == null || b == null){
            throw new MatrixException("Empty Matrix");
        }
        else if(aRows != bCols || aCols != bRows){
            throw new MatrixException("Inequal Matricies");
        }
        
        Matrix prod = new Matrix(aRows, bCols);
        double answ;
        
        for(int x = 0; x <= aRows; x++){
            for(int y = 0; y <= bCols; y++){
                
            }
        }
        
        return prod;
    }

    /**
     * 
     */
    /*public Matrix transpose (Matrix a){

    }*/

    /**
     * MatrixException
     * This exception is thrown for any error associated with the
     * methods in the Matrix class.
     * 
     * @author Mr. Kramer
     * 
     * @version 10/3/2010
     */

    public class MatrixException extends Exception
    {
        public MatrixException() { super(); }

        public MatrixException (String s) { super (s); }
    }
}