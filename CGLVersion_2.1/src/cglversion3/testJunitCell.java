package cglversion3;
/*
 * @author  - R.V.Nikhil - 2020501117 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testJunitCell {
	 @Test
	   public void testcell() {
		   Cell check = new Cell(false);
	       Assertions.assertEquals("false",check.toString());
//	       System.out.println(check.checkingStatus());
	       
	   }

}
