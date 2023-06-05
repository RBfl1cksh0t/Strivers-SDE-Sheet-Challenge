package Day1Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {

    }



    static int[][] bruteset (int[][] twoDarr){

        for (int i = 0; i < twoDarr.length; i++) {
            for (int j = 0; j < twoDarr[0].length; j++) {
                if (twoDarr[i][j] == 0){

                }
            }
        }

        for (int i = 0; i < twoDarr.length; i++) {
            for (int j = 0; j < twoDarr[0].length; j++) {
                if (twoDarr[i][j] == -1){
                    twoDarr[i][j] = 0;
                }
            }

        }

        return twoDarr;
    }
}
