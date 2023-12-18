class ColumnWithZero
{
    public static int findZeroColumn(int[][] matrix, int n)
     {
            n = matrix.length;
            int maxZeros = 0;
            int maxZeroColumnIndex =-1;
    
            for (int col = 0; col < n; col++) 
               {
                int zeroCount = 0;
                for (int row = 0; row < n; row++) 
                  {
                    if (matrix[row][col] == 0) {
                        zeroCount++;
                    }
                }
    
                if (zeroCount > maxZeros)
                 {
                    maxZeros = zeroCount;
                    maxZeroColumnIndex = col;
                    if (maxZeros == n)
                     { 
                        break;
                    }
                }
            }
    
            return maxZeroColumnIndex;
        }
    
    public static void main(String[] args)
    {
        int matrix[][]={{1, 0, 1}, {0, 0, 0,}, {1,0,0}};

        int result = findZeroColumn(matrix ,3);

        if(result==-1){
            System.out.println("No column with zero found");
        }
        else{
            System.out.println("Column with zero matrix:"+result); 
        }

    }

}
