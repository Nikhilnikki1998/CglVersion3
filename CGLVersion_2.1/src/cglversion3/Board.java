package cglversion3;
/*
 * @author  - R.V.Nikhil - 2020501117
 * Took help from my team mate Sai chandra for explaning the concept.
 */
public class Board {
	public Cell[][] grid;
	private int size;
	public Board(int size) {
		// declaring the size of the board
		this.size = size;
		this.grid = new Cell[size][size];
	}
	public Board createBoard() {
		//creating the board function with default false.
		for (int i=0;i<this.size;i++) {
			for (int j=0; j<this.size;j++) {
				this.grid[i][j] = new Cell(false);
			}
		}
		return this;
	}
	public String printBoard () {
		// printing the board length and other elements like current generation next generation which will be used for futher code
		String con ="";
		for (int i=0 ; i<this.size;i++) {
			for (int j=0;j<this.size;j++) {
				if(this.grid[i][j].check==true) {
					con +="*";
					
				}else {
					con +=".";
					if(j==this.size-1 && i<this.size -1) {
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
	public Board generateNextGeneration(Board gen) {
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
            	//checking all the conditions for the cells to check for the next generations. 
                int count=0;
                if(this.grid[modularDiv(i-1)][modularDiv(j-1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i-1)][modularDiv(j)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i-1)][modularDiv(j+1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i)][modularDiv(j-1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i)][modularDiv(j+1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i+1)][modularDiv(j-1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i+1)][modularDiv(j)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i+1)][modularDiv(j+1)].check){
                    count+=1;
                }
                if(this.grid[modularDiv(i)][modularDiv(j)].check){
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
