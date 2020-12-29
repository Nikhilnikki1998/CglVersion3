package cglversion3;
/*
 * @author  - R.V.Nikhil - 2020501117 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class testJunitConwaysgame {
	@Test
	public void conwaytestCase() {
		
		conwaysGame start=new conwaysGame();
		
		int[][] arr={{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		start.Start(arr, 10);
		start.nextGen();
		Assertions.assertEquals("..........\n"
				+ "...**.....\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "..........\n"
				+ "..***.....\n"
				+ "..**......\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "..........",
				start.Board1.printBoard());
		start.nextGen();
//		System.out.println(game.Board1.printBoard());
//		System.out.println(game.Board2.printBoard());
		Assertions.assertEquals("..........\n"
				+ "...**.....\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "...*......\n"
				+ "..*.*.....\n"
				+ "..........\n"
				+ "..***.....\n"
				+ "..........\n"
				+ "..........",start.Board1.printBoard());
		
		
		
		start.NthGen(3);
		Assertions.assertEquals("..........\n"
				+ "...**.....\n"
				+ "..*.*.....\n"
				+ ".**.......\n"
				+ ".*..*.....\n"
				+ ".*..*.....\n"
				+ ".*...*....\n"
				+ "..*.*.....\n"
				+ "...*......\n"
				+ "..........",
				 start.Board1.printBoard());
		start.checkingGen();
		Assertions.assertEquals("..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ ".**.......\n"
				+ ".**.......\n"
				+ "..........\n"
				+ "..........",
				 start.Board1.printBoard());
	}
	@Test
	public void conwaytestCase1() {
conwaysGame start1=new conwaysGame();
		
		int[][] arr={{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		start1.Start(arr, 10);
		start1.NthGen(20);
		Assertions.assertEquals("..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ ".**.......\n"
				+ ".**.......\n"
				+ "..........\n"
				+ "..........",
				 start1.Board1.printBoard());
		
	}

	


}
