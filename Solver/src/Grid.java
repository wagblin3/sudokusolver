public class Grid {
    int[][] arGlobToSolve= new int[9][9];
    int[][] arUnit = new int[3][3];

    public Grid(int[][] myGrid) {

        setArGlobToSolve (myGrid);
        
        System.out.println(myGrid.getClass().getSimpleName());
        for (int[] tab:myGrid) {
            for (int s: tab) {
                System.out.print(s + "\t");
            }
            System.out.print("\n");
        }

    }

    public int[][] getArGlobToSolve() {
        return arGlobToSolve;
    }

    public void setArGlobToSolve(int[][] arGlobToSolve) {
        this.arGlobToSolve = arGlobToSolve;
    }

    public int[][] getArUnit() {
        return arUnit;
    }

    public void setArUnit(int[][] arUnit) {
        this.arUnit = arUnit;
    }



    
    public void load() {

    }

    public void print() {

    }

    public void solve() {
        

    }

    public void save() {

    }

}
