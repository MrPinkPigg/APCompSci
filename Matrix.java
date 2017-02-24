/**
 * Can perform various mathmatical matrix actions
 * 
 * @author Aaron Knestaut
 */

import java.util.*;

public class Matrix {
    int rowLength;
    int colLength;
    double [][] matrix;
    /**
     * Constructor that creates matricies
     * @param  row number of rows
     * @param  col number of cols
     */
    public Matrix (int row, int col) {
        matrix = new double [row][col];
        rowLength = row;
        colLength = col;
    }

    /**
     * sets a value in a matrix
     * @param row   what row
     * @param col   what col
     * @param input value to input into (row, col)
     */
    public void set (int row, int col, double input){
        matrix[row][col] = input;
    }

    /**
     * gets a value in a matrix
     * @param  row what row
     * @param  col what col
     * @return     returns the value at (row, col)
     */
    public double get (int row, int col){
        return matrix[row][col];
    }

    /**
     * adds two matricies together
     * @param  a               first matrix
     * @param  b               second matrix
     * @return                 matrix of sums
     * @throws MatrixException if the matricies are empty or not equal
     */
    public static Matrix add (Matrix a, Matrix b) throws MatrixException{
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

        for(int x = 0; x < aRows; x++){
            for(int y = 0; y < aCols; y++){
                answ = a.get(x, y) + b.get(x, y);
                sum.set(x, y, answ);
            }
        }

        return sum;
    }

    /**
     * subtracts two matricies
     * @param  a               first matrix
     * @param  b               second matrix
     * @return                 matrix of differences
     * @throws MatrixException if matricies are empty or not equal
     */
    public static Matrix sub (Matrix a, Matrix b) throws MatrixException{
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

        for(int x = 0; x < aRows; x++){
            for(int y = 0; y < aCols; y++){
                answ = a.get(x, y) - b.get(x, y);
                dif.set(x, y, answ);
            }
        }

        return dif;
    }

    /**
     * multiplies a matrix by a matrix
     * @param  a               first matrix
     * @param  b               second matrix
     * @return                 matrix of products
     * @throws MatrixException if matricies are empty 
     */
    public static Matrix mult (Matrix a, Matrix b) throws MatrixException{
        int aRows = a.rowLength;
        int aCols = a.colLength;
        int bRows = b.rowLength;
        int bCols = b.colLength;

        if(a == null || b == null){
            throw new MatrixException("Empty Matrix");
        }
        else if(aRows != bCols || aCols != bRows){
            throw new MatrixException("Cannot Multiply Matricies");
        }
        
        Matrix prod = new Matrix(aRows, bCols);
        double answ;
        double sum = 0;
        
        for(int x = 0; x < aRows; x++){
            for(int y = 0; y < bCols; y++){
                for(int z = 0; z < aCols; z++){
                	answ = a.get(x, z) * b.get(z, y);
                	sum = sum + answ;
                	prod.set(x, y, sum);
                }
            }
        }
        
        return prod;
    }

    /**
     * multiplies a matrix by a set value
     * @param  a               matrix
     * @param  b               value
     * @return                 matirx of porducts
     * @throws MatrixException if matrix is empty
     */
    public static Matrix mult (Matrix a, double b) throws MatrixException{
        int aRows = a.rowLength;
        int aCols = a.colLength;

        if(a == null){
            throw new MatrixException("Empty Matrix");
        }
        
        Matrix prod = new Matrix(aRows, aCols);
        double answ;
        
        for(int x = 0; x < aRows; x++){
            for(int y = 0; y < aCols; y++){
                answ = a.get(x, y) * b;
                prod.set(x, y, answ);
            }
        }
        
        return prod;
    }

    /**
     * transposes a matrix
     * @param  a               matrix
     * @return                 transposed matrix
     * @throws MatrixException if matrix is empty
     */
    public static Matrix transpose (Matrix a) throws MatrixException{
    	int aRows = a.rowLength;
        int aCols = a.colLength;

        if(a == null){
            throw new MatrixException("Empty Matrix");
        }

        Matrix trans = new Matrix(aCols, aRows);
        double move;

        for(int x = 0; x < aRows; x++){
            for(int y = 0; y < aCols; y++){
                trans.set(y, x, a.get(x, y));
            }
        }

        return trans;
    }
}