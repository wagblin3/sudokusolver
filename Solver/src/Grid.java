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
        //for ( int nbDeFois = 0 ; nbDeFois < 3*3*3*3 ; nbDeFois++){
        for ( int nbDeFois = 0 ; nbDeFois < 3*3*3*3 ; nbDeFois++){
        int[][][][][] work1 = {


                {
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} }
                    },
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} }
                    },
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} } }
                },
                {
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} }
                    },
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} }
                    },
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} } }
                },
                {
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} }
                    },
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} }
                    },
                    {
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} },
                            { {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9}, {1,2,3,4,5,6,7,8,9,9} } }
                }
            };






            // INDICE CREATION
            int blocLine = 0; int blocColumn = 0;
            int boxLine = 0; int boxColumn = 0;
            // SHORT RENAME
            int[][][][] a = arGlobToSolve;
            arPrint(a);
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
                                int ref[] = {1,2,3,4,5,6,7,8,9};
                                // PARCOURS DU BLOC
                                for (int lb = 0 ; lb < 3 ; lb++){
                                    for (int cb = 0 ; cb < 3 ; cb++) {
                                        switch (a[bl][bc][lb][cb]) {
                                            case 1:
                                                work1[bl][bc][xl][xc][0]=0; break;
                                            case 2:
                                                work1[bl][bc][xl][xc][1]=0; break;
                                            case 3:
                                                work1[bl][bc][xl][xc][2]=0; break;
                                            case 4:
                                                work1[bl][bc][xl][xc][3]=0; break;
                                            case 5:
                                                work1[bl][bc][xl][xc][4]=0; break;
                                            case 6:
                                                work1[bl][bc][xl][xc][5]=0; break;
                                            case 7:
                                                work1[bl][bc][xl][xc][6]=0; break;
                                            case 8:
                                                work1[bl][bc][xl][xc][7]=0; break;
                                            case 9:
                                                work1[bl][bc][xl][xc][8]=0; break;
                                        }
                                    }
                                }

                                // PARCOURS DE LA LIGNE
                                for (int ll = 0 ; ll < 3 ; ll++){
                                    for (int cl = 0 ; cl < 3 ; cl++) {
                                        switch (a[bl][ll][xl][cl]) {
                                            case 1:
                                                work1[bl][bc][xl][xc][0]=0; break;
                                            case 2:
                                                work1[bl][bc][xl][xc][1]=0; break;
                                            case 3:
                                                work1[bl][bc][xl][xc][2]=0; break;
                                            case 4:
                                                work1[bl][bc][xl][xc][3]=0; break;
                                            case 5:
                                                work1[bl][bc][xl][xc][4]=0; break;
                                            case 6:
                                                work1[bl][bc][xl][xc][5]=0; break;
                                            case 7:
                                                work1[bl][bc][xl][xc][6]=0; break;
                                            case 8:
                                                work1[bl][bc][xl][xc][7]=0; break;
                                            case 9:
                                                work1[bl][bc][xl][xc][8]=0; break;
                                        }
                                    }
                                }

                                // PARCOURS DE LA COLONNE
                                for (int lc = 0 ; lc < 3 ; lc++){
                                    for (int cc = 0 ; cc < 3 ; cc++) {
                                        switch (a[lc][bc][cc][xc]) {
                                            case 1:
                                                work1[bl][bc][xl][xc][0]=0; break;
                                            case 2:
                                                work1[bl][bc][xl][xc][1]=0; break;
                                            case 3:
                                                work1[bl][bc][xl][xc][2]=0; break;
                                            case 4:
                                                work1[bl][bc][xl][xc][3]=0; break;
                                            case 5:
                                                work1[bl][bc][xl][xc][4]=0; break;
                                            case 6:
                                                work1[bl][bc][xl][xc][5]=0; break;
                                            case 7:
                                                work1[bl][bc][xl][xc][6]=0; break;
                                            case 8:
                                                work1[bl][bc][xl][xc][7]=0; break;
                                            case 9:
                                                work1[bl][bc][xl][xc][8]=0; break;
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

            //ajouter le nombre possibilité en case 9 / AFFICHER LES POSSIBILITES
            for ( int m= 0 ; m < 3 ; m++){
                for ( int n = 0 ; n < 3 ; n++){
                    for ( int o = 0 ; o < 3 ; o++){
                        for ( int p = 0 ; p < 3 ; p++){
                            int nbPossible = 0;
                            int[] s = work1[m][n][o][p];
                            for ( int q = 0 ; q < 9 ; q++){
                                System.out.print(s[q]);
                                if ( s[q] != 0){
                                    nbPossible++;
                                }
                            }
                            s[9] = nbPossible;
                            System.out.print(s[9]);
                            System.out.print("\t");
                        }
                    }
                    System.out.print("\n");
                }
            }
            System.out.print("\n");

            //CHOISIR LE CAS OU IL Y A LE MOINS DE POSSIBILITE
            int moinsPossible = 9;
            int[] posMoinsPossible = {0,0,0,0};
            for ( int i= 0 ; i < 3 ; i++){
                for ( int j = 0 ; j < 3 ; j++){
                    for ( int k = 0 ; k < 3 ; k++){
                        for ( int l = 0 ; l < 3 ; l++){
                            if ( work1[i][j][k][l][9] < moinsPossible){
                                moinsPossible = work1[i][j][k][l][9];
                                posMoinsPossible[0] = i;
                                posMoinsPossible[1] = j;
                                posMoinsPossible[2] = k;
                                posMoinsPossible[3] = l;
                            }
                        }
                    }
                }
            }
            System.out.print(moinsPossible+" "+posMoinsPossible[0]+posMoinsPossible[1]+posMoinsPossible[2]+posMoinsPossible[3]);


            //RECUPERER LA VALEUR ET L'AFFECTER
            int valeur = 0;
            for ( int ind=0 ; ind < 9 ; ind++){
                if (work1[posMoinsPossible[0]][posMoinsPossible[1]][posMoinsPossible[2]][posMoinsPossible[3]][ind] != 0){
                    valeur=work1[posMoinsPossible[0]][posMoinsPossible[1]][posMoinsPossible[2]][posMoinsPossible[3]][ind];
                }
            }
            System.out.print(" "+valeur+" "+nbDeFois);
            System.out.print("\n\n");

            a[posMoinsPossible[0]][posMoinsPossible[1]][posMoinsPossible[2]][posMoinsPossible[3]]=valeur;

        }

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