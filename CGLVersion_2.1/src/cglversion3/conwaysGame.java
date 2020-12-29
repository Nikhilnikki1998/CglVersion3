package cglversion3;
/*
 * @author  - R.V.Nikhil - 2020501117
 * Took help from my team mate Sai chandra for explaning the concept.
 */
public class conwaysGame {
	public Board Board1;
	private int boardsize;
	Board Board2;



	public void Start(int[][] arr, int boardsize) {
		// initializing the board with given live cells
		this.boardsize = boardsize;
		this.Board1 = new Board(boardsize);
		//creating the board.
		this.Board1.createBoard();
		for (int i = 0; i < arr.length; i++) {
			int row = arr[i][0];
			int col = arr[i][1];
			this.Board1.grid[row][col].check = true;
		}
	}

	public void nextGen() {
		//creating the next generation
		Board2 = new Board(boardsize);
		Board2.createBoard();
		Board2 = Board1.generateNextGeneration(Board2);
		Board1 = Board2;

	}

	public void NthGen(int n) {
		//creating the Nth generation
		for (int i = 0; i < n; i++) {
			Board2 = new Board(boardsize);
			Board2.createBoard();
			Board2 = Board1.generateNextGeneration(Board2);
			if (Board1.printBoard().equals(Board2.printBoard())) {
				break;
			} else {
				Board1 = Board2;
			}
		}
	}

	public void checkingGen() {
		//checking the current and the next gen for the infinite loop
		for (;;) {
			Board2 = new Board(boardsize);
			Board2.createBoard();
			Board2 = Board1.generateNextGeneration(Board2);
//			System.out.println(Board1.printBoard());
//			System.out.println(Board1.printBoard().equals(Board2.printBoard()));
			
			if (Board1.printBoard().equals(Board2.printBoard())) {
				Board1 = Board2;
				break;
			} else {
				Board1 = Board2;
			}

		}

	}
}
