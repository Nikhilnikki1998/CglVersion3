package cglversion3;
/*
 * @author  - R.V.Nikhil - 2020501117
 */
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class testJunitBoard {
	@Test
	public void boardtestone() {
		Board board1=new Board(10,10);
		Board board2=new Board(10,10);
		board1.createBoard();
		board2.createBoard();
		board2=board1.generateNextGeneration(board2);
//		board1=board1;
//		Assertions.assertEquals("false", cell.toString());
		Assertions.assertEquals("..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........",board1.printBoard());
	}
	@Test
	public void boardtesttwo() {
		Board board1=new Board(10,10);
		Board board2=new Board(10,10);
		board1.createBoard();
		board2.createBoard();
		board1.grid[1][3].check=true;
		board1.grid[1][4].check=true;
		board1.grid[2][4].check=true;
		board1.grid[5][3].check=true;
		board1.grid[5][4].check=true;
		board1.grid[6][2].check=true;
		board1.grid[6][3].check=true;
		board1.grid[7][5].check=true;
		board1.grid[8][4].check=true;
		board2=board1.generateNextGeneration(board2);


	
	board2=board1.generateNextGeneration(board2);
	Assertions.assertEquals("..........\n"
			+ "...**.....\n"
			+ "...**.....\n"
			+ "..........\n"
			+ "..........\n"
			+ "..***.....\n"
			+ "..**......\n"
			+ "...**.....\n"
			+ "..........\n"
			+ "..........", board2.printBoard());
	
}


}
	
