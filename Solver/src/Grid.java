public class Grid {
    public int[][][][] arGlobToSolve = new int[3][3][3][3];

    public Grid(int[][][][] myGrid) {
        int[][][][] lineGrid = new int[3][3][3][3];
        lineGrid = transpos (myGrid);
        setArGlobToSolve (lineGrid);
        ToSolve();
        //arPrint(getArUnit());
    }

    public void ToSolve (){

        int[][][][] work1 = {
                { { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
                  { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
                  { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} } },
                { { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
                  { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
                  { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} } },
                { { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
                  { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} },
                  { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} } }
        };

        // CREATION D'INDICE
        int blocLine = 0; int blocColumn = 0;
        int boxLine = 0; int boxColumn = 0;
        int saveBlocLine = 0; int saveBlocColumn = 0;
        // RENOMMAGE COURT
        int[][][][] a = arGlobToSolve;
        int bl = blocLine; int bc = blocColumn;
        int xl = boxLine; int xc = boxColumn;
        int sbl = saveBlocLine;  int sbc = saveBlocColumn;
        
        for ( bl = 0 ; bl < 3 ; bl++){
            for ( bc = 0 ; bc < 3 ; bc++){
                for ( xl = 0 ; xl < 3 ; xl++){
                    for ( xc = 0 ; xc < 3 ; xc++){
                        System.out.print(a[bl][bc][xl][xc]+" "+bl+bc+xl+xc+"\t");
                        /*if (a[bl][bc][xl][xc] == 0){
                            sbl = bl; sbc = bc;
                            System.out.print(a[bl][bc][xl][xc]+" "+bl+bc+xl+xc+" "+sbl+sbc+"\t");
                            //afficher le bloc
                            for ( int i = 0 ; i < 3 ; i++ ){
                                for ( int j = 0; j < 3 ; j++){
                                    //System.out.print(a[i][j]+"\t");
                                }
                            }
                        }

                         */
                    }

                }
                System.out.print("\n");

            }
        }
        System.out.print("\n");
            //refToSolve;

            //refbloc = [1][1][][];

            //refline = [1][][1][];

            //.refColumn [][1][][1];

        /*int iteration = 0;

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

    public int[][][][] getArGlobToSolve() {
        return arGlobToSolve;
    }

    public void setArGlobToSolve(int[][][][] arGlobToSolve) {
        this.arGlobToSolve = arGlobToSolve;
    }
    
    public void arLoad() {

    }

    public int[][][][] transpos(int[][][][] brutToLinea){

        int[][][][] linea = new int[3][3][3][3];

        for (int a = 0 ; a < 3 ; a++) {
            for (int b = 0 ; b < 3 ; b++) {
                for (int c = 0; c < 3; c++) {
                    for (int d = 0; d < 3; d++) {
                        linea[a][b][c][d] =brutToLinea[a][c][b][d];
                    }
                }
            }
        }
        return linea;
    }

    public void arSave() {

    }

    public void arGlobPrint() {
        //arPrint(getArGlobToSolve());

        int[][][][] fromLinear = getArGlobToSolve();
        int[][][][] reBrut = new int[3][3][3][3];
        reBrut = retranspos (fromLinear);
        arPrint(reBrut);

    }

    public int[][][][] retranspos(int[][][][] lineaToBrut){

        int[][][][] rebrut = new int[3][3][3][3];

        for (int a = 0 ; a < 3 ; a++) {
            for (int b = 0 ; b < 3 ; b++) {
                for (int c = 0; c < 3; c++) {
                    for (int d = 0; d < 3; d++) {
                        rebrut[a][b][c][d] =lineaToBrut[a][c][b][d];
                    }
                }
            }
        }
        return rebrut;
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
        System.out.print("\n");
    }

}