/**
 * Test for Matrix
 */
public class MatrixTest {
    public static void main(String[] args) {
        try {
            Matrix a = new Matrix(3, 3);
            a.set(0, 0, 1);  a.set(0, 1, 2);  a.set(0, 2, 3);
            a.set(1, 0, 4);  a.set(1, 1, 5);  a.set(1, 2, 6);
            a.set(2, 0, 2);  a.set(2, 1, 3);  a.set(2, 2, 4);
            
            Matrix b = new Matrix(3, 3);
            b.set(0, 0, 7);  b.set(0, 1, 8);  b.set(0, 2, 3);
            b.set(1, 0, 9);  b.set(1, 1, 10);  b.set(1, 2, 2);
            b.set(2, 0, 11);  b.set(2, 1, 12);  b.set(2, 2, 1);
            
            Matrix temp = Matrix.mult(a, b);
            
            System.out.println(temp.get(1, 1));
        }
        catch(MatrixException e) {
            System.out.println(e);
        }
    }
}