package cglversion3;
/*
 * @author  - R.V.Nikhil - 2020501117
 * Took help from my team mate Sai chandra for explaning the concept.
 */
public class Board {
	public Cell[][] grid;
	private int size;
	private int rectSize; 
	public Board(int size , int rectSize) {
		// declaring the size of the board
		this.size = size;
		this.rectSize = rectSize;
		this.grid = new Cell[size][rectSize];
	}
	public Board createBoard() {
		//creating the board function with default false.
		for (int i=0;i<this.size;i++) {
			for (int j=0; j<this.rectSize;j++) {
				this.grid[i][j] = new Cell(false);
			}
		}
		return this;
	}
	public String printBoard () {
		// printing the board length and other elements like current generation next generation which will be used for futher code
		String con ="";
		for (int i=0 ; i<this.size;i++) {
			for (int j=0;j<this.rectSize;j++) {
				if(this.grid[i][j].check==true) {
					con +="*";
					
				}else {
					con +=".";
					if(j==this.rectSize-1 && i<this.size -1) {
						con =con+"\n";
					}
				}
			}
		}
		return con;
	}
	public int modularDiv(int nan) {
		// modular division for corner cases
		
		return ((nan % size) + size) % size;
	}
	public int modularDiv2(int nan) {
		// modular division for corner cases
		
		return ((nan % rectSize) + rectSize) % rectSize;
	}
	public Board generateNextGeneration(Board gen) {
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.rectSize;j++){
            	//checking all the conditions for the cells to check for the next generations. 
                int count=0;
                if(this.grid[modularDiv(i-1)][modularDiv2(j-1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i-1)][modularDiv2(j)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i-1)][modularDiv2(j+1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i)][modularDiv2(j-1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i)][modularDiv2(j+1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i+1)][modularDiv2(j-1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i+1)][modularDiv2(j)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i+1)][modularDiv2(j+1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i)][modularDiv2(j)].check){
                    if(count==2 || count==3){
                        gen.grid[i][j].check=true;
                        
                    }
                }
                else{
                    if(count==3){
                        gen.grid[i][j].check=true;
                    }
                }
            }
            

        }
        

//        System.out.println();
//        System.out.println("NextGenration");
//        printBoard(g);
        return gen;
    }
}
