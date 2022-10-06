package assisted;

public class MultiplyMatrix {



public static int[][] MatrixMultiply(int[][] m1, int[][] m2, int r1, int c1, int c2) 
{
	int[][] product = new int[r1][c2];
	for(int i = 0; i < r1; i++) 
{
			for (int j = 0; j < c2; j++) 
{
    			for (int k = 0; k < c1; k++) 
{
        				product[i][j] +=m1[i][k] * m2[k][j];
    			}
			}
	}
return product;
}
public static void  Display(int[][] product) 
{
	System.out.println("Product of two matrices is: ");
	for(int[] row : product) 
{
			for (int column : row) 
{
    			System.out.print(column + "    ");
			}
			System.out.println();
	}
}
public static void main(String[] args) 
{

	int r1 = 2, c1 = 3;
	int r2 = 3, c2 = 2;
	int[][] m1 = { {3, -2, 5}, {3, 0, 4} };
	int[][] m2 = { {2, 3}, {-9, 0}, {0, 4} };
    int[][] product= MatrixMultiply(m1, m2, r1, c1, c2);
     Display(product);
}

}
