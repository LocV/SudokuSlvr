public class SudokuSlvr {

static final int BLOCKSIZE = 3;
static final int BOARDSIZE = 9;

    public static void main(String[] args) {

    	int [][] sBoard = new int [9][9];
    	initBoard (sBoard);
    	sBoard[0][0] = 1;
    	sBoard[1][1] = 2;
    	sBoard[2][2] = 3;

    	sBoard[3][3] = 4;
    	sBoard[4][4] = 5;
    	sBoard[5][5] = 6;

    	sBoard[6][6] = 7;
    	sBoard[7][7] = 8;
    	sBoard[8][8] = 9;

    	printBoard(sBoard);

        int [][] cBoard = cloneBoard(sBoard);

        printBoard(cBoard);

        System.out.println("Make a change and test the deep copy");
        // Make a change and test the deep copy
        sBoard [0][8] = 9;
        cBoard [8][0] = 1;
        printBoard(sBoard);
        printBoard(cBoard);

    }

    static void printBoard(int[][] board){

    	System.out.println(" -------------------");
        for (int i = 0; i < BOARDSIZE; i++){
        	System.out.print(" | ");
        	for (int j = 0; j < BOARDSIZE; j++){
        		if (board[i][j] == 0) { System.out.print(" ");}
        		else {System.out.print(board[i][j]);}

        		if ((j+1)%BLOCKSIZE == 0){System.out.print(" | ");}
        	}
        	System.out.print("\n");
        	if ((i+1)%BLOCKSIZE == 0){System.out.println(" -------------------");}
        }

    }

// Initialize the board all zero
    static void initBoard (int[][] board){
    	for (int i = 0; i < BOARDSIZE; i++){
        	for (int j = 0; j < BOARDSIZE; j++){
        		board [i][j] = 0;
        	}
        }
    }

    static boolean isValidBlock (int[][] board, int rowIndex, int colIndex){
    	// Add code here
    	return false;

    }

    static boolean isValidRow (int[][] board, int rowIndex, int colIndex){
    	// Add code here`
    	return false;

    }

    static boolean isValidColumn (int[][] board, int rowIndex, int colIndex){
    	// Add code here
    	return false;

    }

    static int getNextValue (int[][] board, int rowIndex, int colIndex){
        return 0;

    }

    // clone two dimensional array using Array deep copy utility
    public static int[][] cloneBoard(int[][] sourceBoard) {
        int[][] copyBoard = new int[sourceBoard.length][sourceBoard.length];

        for (int i = 0; i < sourceBoard.length; i++) {
            copyBoard[i] = java.util.Arrays.copyOfRange(sourceBoard[i], 0, BOARDSIZE);
        }

        return copyBoard;
    }

    static void solveBoard (int[][] board){

    }

}
