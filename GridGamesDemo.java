public class GridGamesDemo {
    private static final char[][] gameboard = null;
    public static void main(String[] args) throws Exception {
        char [] [] myGrid= createGrid(6,6,'*');
        showGrid(myGrid);
        writeBlock(gameboard,0,2,'a');
        hWin(gameboard,'a',3);
        vWin(gameboard,'a',4);
    }
    public static char[][] createGrid(int row, int column, char symbol){
        char [] [] gameboard= new char [row] [column];
        for(int i=0; i< row; i++){
            for (int k=0; k< column; k++){
                gameboard [i] [k] = symbol;
            }
        }
    return gameboard;
    }
    public static void showGrid(char [] [] gameboard){
        for (int j=0; j<gameboard.length; j++){
            for(int i=0; i< gameboard[j].length; i++){
                System.out.print(gameboard[j][i]+" ");
            }
        System.out.println(" ");
        }
    }
    public static char[][] writeBlock(char [][] gameboard, int c, int d, char character){
        gameboard[c][d]  = character;
        return gameboard;
    }
    public static void hWin(char[][] gameboard, char character2, int e){
        for(int m=0;m<=gameboard.length;m++){
           gameboard[m][e]=character2;
        if(gameboard[m][e]==character2){
            System.out.println("Win");
        }else{
            System.out.println("Lose");
        }
    }
}
    public static void vWin(char [][] gameboard, char character3, int f){
        for(int n=0;n<=gameboard.length;n++){
            gameboard[n][f]=character3;
            if(gameboard[n][f]==character3){
                System.out.println("Win");
            }else{
                System.out.println("Lose");
            }
        }
    }
}