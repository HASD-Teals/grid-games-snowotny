public class GridGamesDemo {
    char[][] gameboard;
    char temp;
    public static void main(String[] args) throws Exception {
        char [][] myGrid= createGrid(6, 6, '*');
        showGrid(myGrid);
    }
    public static char[][] createGrid(int row, int column, char symbol){
        char [][] gameboard= new char [row] [column];
        for(int i=0; i< row; i++){
            for (int k=0; k< column; k++){
                gameboard [i] [k] = symbol;
            }
        }
    return gameboard;
    }
    public static void showGrid(char [][] gameboard){
        for (int row1=0; row1<gameboard.length; row1++){
            for(int column1=0; column1< gameboard[row1].length; column1++){
                System.out.print(gameboard[row1][column1]+" ");
            }
        System.out.println(" ");
        }
    }
    public static char [][] writeBlock(char [][] gameboard, int row2, int column2, char character){
        gameboard[row2][column2]  = character;
        return gameboard;
    }
    public static void hWin(char [][] gameboard, char character2, int row3){
        for(int column3=0;column3<=gameboard.length;column3++){
           gameboard[row3][column3]=character2;
            if(gameboard[row3][column3]==character2){
            System.out.println("Win");
            }else{
            System.out.println("Lose");
            }
        }
    }
    public static void vWin(char [][] gameboard, char character3, int column4){
        for(int row4=0;row4<=gameboard.length;row4++){
            gameboard[row4][column4]=character3;
            if(gameboard[row4][column4]==character3){
                System.out.println("Win");
            }else{
                System.out.println("Lose");
            }
        }
    }
    public static boolean writeBlock(char [][] gameboard, int row5, int column5, char symbol,Boolean overwrite){
        if(gameboard [row5][column5] == symbol){
            return true;
        }else{
            return false;
        }  
    }
    public static void reverseRow(char [][] gameboard, int row6, int column6, char temp){
        for(column6= 0; column6 < gameboard[row6].length/2; column6++){
            temp = gameboard[row6][column6] = gameboard[row6][gameboard[row6][gameboard[row6].length-1]];
            gameboard[row6][column6] = gameboard[row6][gameboard[column6][gameboard[row6].length-1]];
            temp = gameboard[row6][gameboard[column6].length-1];
        }
    }
    public static void reverseColumn(char [][] gameboard, int row6, int column6, char temp){
        for(row6 = 0; row6 <= gameboard[column6].length/2; row6++){
            temp = gameboard[row6][column6];
            gameboard[row6][column6] = gameboard[row6][gameboard[row6][gameboard[column6].length-1]];
            temp = gameboard[row6][gameboard[column6].length-1];
        }
    }
    public static void blast(char [][] gameboard, int row7, int column7, char symbol2){
        int targetRow = row7;
        int targetColumn = column7 -1;
        if (targetRow<gameboard.length && targetColumn< gameboard[row7][column7]){
            gameboard[targetRow][targetColumn] = symbol2;
        }
    }
    public static void scoreboard(char [][] gameboard, char symbol3, int row8){

    }
}