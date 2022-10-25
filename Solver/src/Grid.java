public class Grid {
    int[][][][] arGlobToSolve = new int[3][3][3][3];
    int[][][][] arGlobSolved =  {
            { { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
              { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} } ,
              { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} } },

            { { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
              { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
              { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} } },

            { { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
              { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
              { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} } }
    };
    //int[][] arUnit = {{0,0,0},{0,0,0},{0,0,0}};

    public Grid(int[][][][] myGrid) {
        setArGlobToSolve (myGrid);
        arSolve();
        //arPrint(getArUnit());
    }

    public void arSolve() {
/*
        int iteration = 0;

        int cptZBloc = 0;
        int cptZHoriz = 0;
        int cptZVerti = 0;

        int indHBloc = 0;
        int indVBloc = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arUnit[i][j] = arGlobToSolve[i + indHBloc][j + indVBloc];
                if (arUnit[i][j] == 0) {
                    cptZBloc++;
                }
            }
        }
        System.out.print(cptZBloc+"\n");

 */
    }

    public int[][][][] getArGlobSolved() {
        return arGlobSolved;
    }

    public void setArGlobSolved(int[][][][] arGlobSolved) {
        this.arGlobSolved = arGlobSolved;
    }

    public int[][][][] getArGlobToSolve() {
        return arGlobToSolve;
    }

    public void setArGlobToSolve(int[][][][] arGlobToSolve) {
        this.arGlobToSolve = arGlobToSolve;
    }

    /*public int[][] getArUnit() {
        return arUnit;
    }

    public void setArUnit(int[][] arUnit) {
        this.arUnit = arUnit;
    }

     */
    
    public void arLoad() {

    }

    public void arSave() {

    }

    public void arGlobPrint() {
        arPrint(getArGlobToSolve());
    }

    public void arPrint(int[][][][] arrayToPrint) {
        for (int[][][] gtab:arrayToPrint) {
            for (int[][] ltab : gtab) {
                for (int[] tab : ltab) {
                    for (int s : tab) {
                        System.out.print(s + "\t");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}