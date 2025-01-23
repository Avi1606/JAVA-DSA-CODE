package com.JavaDSA.Previous_Concepts;

class Pattern_Question {
    public static void main(String[] args) {
    pattern4(5);
    }

    static void pattern(int n){
        for (int Row = 1; Row <= n; Row++) {
            for (int Col = 1; Col <=Row ; Col++) {
                System.out.print("Avi ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int Row = 1; Row <= n; Row++) {
            for (int Col = 1; Col <=Row ; Col++) {
                System.out.print(Col+" ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int Row = 1; Row <= 2*n; Row++) {
            int totalColInRow = Row>n ? 2*n-Row : Row;
            for (int Col = 0; Col <totalColInRow ; Col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }


    static void pattern4(int n){
        for (int Row = 1; Row <= 2*n; Row++) {
            int totalColInRow = Row>n ? 2*n-Row : Row;

            int noOfCol= n-totalColInRow;
            for (int S = 0; S < noOfCol; S++) {
                System.out.print(" ");
            }
            for (int Col = 0; Col <totalColInRow ; Col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
