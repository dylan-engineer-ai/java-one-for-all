package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] days = new int[3][3];
        System.out.println(days[0][0]);
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
    }
}
