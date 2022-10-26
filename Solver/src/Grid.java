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
        int[][][][][] work1 = {

                {
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} }
                    },
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} }
                    },
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} } }
                },
                {
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} }
                    },
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} }
                    },
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} } }
                },
                {
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} }
                    },
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} }
                    },
                    {
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} },
                        { {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0} } }
                }
            };

        // INDICE CREATION
        int blocLine = 0; int blocColumn = 0;
        int boxLine = 0; int boxColumn = 0;
        // SHORT RENAME
        int[][][][] a = arGlobToSolve;
        int bl = blocLine; int bc = blocColumn;
        int xl = boxLine; int xc = boxColumn;
        
        for ( bl = 0 ; bl < 3 ; bl++){
            for ( bc = 0 ; bc < 3 ; bc++){
                for ( xl = 0 ; xl < 3 ; xl++){
                    for ( xc = 0 ; xc < 3 ; xc++){
                        //System.out.print(a[bl][bc][xl][xc]+" "+bl+bc+xl+xc+"\t");
                        if ( a[bl][bc][xl][xc] == 0 ){
                            System.out.print( a[bl][bc][xl][xc] + " " + bl+bc+xl+xc + "\t");

                            // IDENTIFIER ET STOCKER LES CAS POSSIBLES
                            //int ref[] = {1,2,3,4,5,6,7,8,9};
                            // PARCOURS DU BLOC
                            for (int lb = 0 ; lb < 3 ; lb++){
                                for (int cb = 0 ; cb < 3 ; cb++) {
                                    switch (a[bl][bc][lb][cb]) {
                                        case 1:
                                            //Tableau[0][0] = 1;
                                            //a[bl][bc][xl][xc]
                                            //work1[bl][bc][xl][xc][0] = 1;
                                        case 2:
                                            //Tableau[0][1] = 1;
                                        case 3:
                                            //Tableau[0][2] = 1;
                                        case 4:
                                            //Tableau[0][2] = 1;
                                        case 5:
                                            //Tableau[0][2] = 1;
                                        case 6:
                                            //Tableau[0][2] = 1;
                                        case 7:
                                            //Tableau[0][2] = 1;
                                        case 8:
                                            //Tableau[0][2] = 1;
                                        case 9:
                                            //Tableau[0][2] = 1;
                                    }
                                }
                            }
                            // PARCOURS DE LA LIGNE
                            for (int ll = 0 ; ll < 3 ; ll++){
                                for (int cl = 0 ; cl < 3 ; cl++) {
                                    switch (a[bl][bc][ll][cl]) {
                                        case 1:
                                            //Tableau[0][0] = 1;
                                            //a[bl][bc][xl][xc]
                                            //work1[bl][bc][xl][xc][0] = 1;
                                        case 2:
                                            //Tableau[0][1] = 1;
                                        case 3:
                                            //Tableau[0][2] = 1;
                                        case 4:
                                            //Tableau[0][2] = 1;
                                        case 5:
                                            //Tableau[0][2] = 1;
                                        case 6:
                                            //Tableau[0][2] = 1;
                                        case 7:
                                            //Tableau[0][2] = 1;
                                        case 8:
                                            //Tableau[0][2] = 1;
                                        case 9:
                                            //Tableau[0][2] = 1;
                                    }
                                }
                            }
                            // PARCOURS DE LA COLONNE
                            for (int lc = 0 ; lc < 3 ; lc++){
                                for (int cc = 0 ; cc < 3 ; cc++) {
                                    switch (a[bl][bc][lc][cc]) {
                                        case 1:
                                            //Tableau[0][0] = 1;
                                            //a[bl][bc][xl][xc]
                                            //work1[bl][bc][xl][xc][0] = 1;
                                        case 2:
                                            //Tableau[0][1] = 1;
                                        case 3:
                                            //Tableau[0][2] = 1;
                                        case 4:
                                            //Tableau[0][2] = 1;
                                        case 5:
                                            //Tableau[0][2] = 1;
                                        case 6:
                                            //Tableau[0][2] = 1;
                                        case 7:
                                            //Tableau[0][2] = 1;
                                        case 8:
                                            //Tableau[0][2] = 1;
                                        case 9:
                                            //Tableau[0][2] = 1;
                                    }
                                }
                            }
                            // AFFICHER LES CAS POSSIBLES
                            for ( int i : work1[bl][bc][xl][xc]) {
                                System.out.print(i);
                            }
                            System.out.print("\t");
                        }
                    }
                }
                System.out.print("\n");
            }
        }
        System.out.print("\n");
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