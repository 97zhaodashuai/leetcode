package com.example.leetaccode;

public class problem_36 {

    public static void test() {


        char[][] nums = {

                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
    };


        boolean result = isValidSudoku(nums);
        System.out.println(result);
    }
        public static  boolean isValidSudoku ( char[][] board){

            for (int i = 0; i < 9; i++) {
                int[] hr = new int[10];
                int[] vr = new int[10];
                for (int j = 0; j < 9; j++) {
                    if(board[i][j]!='.'){
                        if (hr[board[i][j] - '0'] != 0) {
                            return false;
                        }
                        hr[board[i][j] - '0'] = 1;
                    }

                   if(board[j][i]!='.'){
                       if (vr[board[j][i] - '0'] != 0) {
                           return false;
                       }
                       vr[board[j][i] - '0'] = 1;
                   }
                }
            }


            for (int m = 0; m < 9; m += 3) {
                for (int n = 0; n < 9; n += 3) {
                    int[] xr = new int[10];
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {

                            if(board[i + m][j + n] == '.'){
                                continue;
                            }else{
                                if (xr[board[i + m][j + n] - '0'] != 0) {
                                    return false;
                                }
                                xr[board[i + m][j + n] - '0'] = 1;
                            }

                        }
                    }
                }
            }
            return true;
        }

    }
