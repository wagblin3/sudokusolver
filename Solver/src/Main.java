public class Main {
    public static void main(String[] args) {
        System.out.println("Sudoku Solver");
        // ENTREE BRUTE
        //97 1    5  5 9 2 18   4        8       7         26  92  3    6   2  9    19 4572
        String input0 = "97 1    5  5 9 2 18   4        8       7         26  92  3    6   2  9    19 4572";
        // EQUIVALENT EN GRILLE SUDOKU
        int[][][][] input1 = {
                { { {9,7,0},{1,0,0},{0,0,5} },
                  { {0,0,5},{0,9,0},{2,0,1} },
                  { {8,0,0},{0,4,0},{0,0,0} } },
                { { {0,0,0},{0,8,0},{0,0,0} },
                  { {0,0,0},{7,0,0},{0,0,0} },
                  { {0,0,0},{0,2,6},{0,0,9} } },
                { { {2,0,0},{3,0,0},{0,0,6} },
                  { {0,0,0},{2,0,0},{9,0,0} },
                  { {0,0,1},{9,0,4},{5,7,2} } }
        };


        int[][][][] input2 = {
                { { {9,4,0},{3,0,0},{5,7,8} },
                  { {6,0,0},{0,4,7},{1,0,0} },
                  { {0,2,0},{0,0,1},{0,0,0} } },
                { { {0,7,0},{0,0,0},{0,5,1} },
                  { {0,0,4},{0,0,0},{7,0,0} },
                  { {3,5,0},{0,0,0},{0,2,0} } },
                { { {0,0,0},{8,0,0},{0,3,0} },
                  { {0,0,5},{4,2,0},{0,0,9} },
                  { {2,3,8},{0,0,9},{0,4,7} } }
        };

        Grid gridin = new Grid(input2);
        gridin.arGlobPrint();

        //TRANSPOSEE LINEAIRE DE LA GRILLE DANS LE CONSTRUCTEUR
        //int[][][][] input1 = {
        //        { { {9,7,0},{0,0,5},{8,0,0} },
        //          { {1,0,0},{0,9,0},{0,4,0} },
        //          { {0,0,5},{2,0,1},{0,0,0} } },
        //        { { {0,0,0},{0,0,0},{0,0,0} },
        //          { {0,8,0},{7,0,0},{0,2,6} },
        //          { {0,0,0},{0,0,0},{0,0,9} } },
        //        { { {2,0,0},{0,0,0},{0,0,1} },
        //          { {3,0,0},{2,0,0},{9,0,4} },
        //          { {0,0,6},{9,0,0},{5,7,2} } }
        //};
        }
}

