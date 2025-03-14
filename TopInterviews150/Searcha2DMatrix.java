public class Searcha2DMatrix {
    public boolean search(int[][] matrix, int target) {
        int left = 0, right = matrix.length * matrix[0].length - 1, n = matrix[0].length;

        while(left <= right) {
            int middle = (left + right) / 2;
            int row = middle / 2;
            int col = middle % 2;

            System.out.println("Row " + row + " col" + col + " " + matrix[row][col]);
            // System.out.println("Col " + col + " " + matrix[row][col]);

            int currentMiddle = matrix[row][col];
            if(currentMiddle == target) {
                return true;
            }else if(currentMiddle < target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return false;
    }    

    public static void main(String[] args) {
        Searcha2DMatrix s = new Searcha2DMatrix();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        boolean b = s.search(matrix, target);
        System.out.println("Result " + b);

    }

}
