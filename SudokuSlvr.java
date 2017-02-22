public class SudokuSlvr {

static final int BLOCKSIZE = 3;
static final int BOARDSIZE = 9;

    public static void main(String[] args) {
    	/*
    	int [] line1 = new int[3];
    	line1[0] = 2;
    	line1[1] = 4;
    	line1[2] = 6;

 //   	printLine(line1);

    	int [] line2 = new int[3];
    	line2[0] = 3;
    	line2[1] = 7;
    	line2[2] = 9;

 //   	printLine(line2);
 */

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



/*
	try { 
		Thread.sleep(1000);
		Runtime.getRuntime().exec("ls");} 
	catch (Exception e){}

        System.out.println("-------------");
        System.out.println("|   |   |   |");
        System.out.println("| - | - | - |");
        System.out.println("|   |   |   |");

        System.out.println("-------------");
        System.out.println("|   |   |   |");
        System.out.println("| - | 2 | - |");
        System.out.println("|   |   |   |");

        System.out.println("-------------");
        System.out.println("|   |   |   |");
        System.out.println("| - | - | - |");
        System.out.println("|   |   |   |");
        System.out.println("-------------");
        */
    }

    static void printLine(int[] contents){

    	System.out.println("-------------");
        System.out.println("|   |   |   |");

        for (int i = 0; i < 3; i++){
        	System.out.print("| ");
        	System.out.print(contents[i]);
        	System.out.print(" ");
        }
        System.out.print("|\n");
        System.out.println("|   |   |   |");

        System.out.println("-------------");
        System.out.println("|   |   |   |");
        System.out.println("| - | 1 | - |");
        System.out.println("|   |   |   |");

        System.out.println("-------------");
        System.out.println("|   |   |   |");
        System.out.println("| - | - | - |");
        System.out.println("|   |   |   |");
        System.out.println("-------------");

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
    	// Add code here
    	return false;

    }

    static boolean isValidColumn (int[][] board, int rowIndex, int colIndex){
    	// Add code here
    	return false;

    }

}
