public class searchInSortedMatrix {
    public static boolean staircaseSearch(int matrix[][], int key){ //O(n+m)
        int row = 0, col = matrix[0].length-1;

        while(row<matrix.length && col >= 0){
            if(matrix[col][row] == key){
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4}, 
                          {5, 6, 7, 8}, 
                          {9, 10, 11, 12}, 
                          {13, 14, 15, 16}};
        int key = 14;
        System.out.println(staircaseSearch(matrix, key));
    }
}
