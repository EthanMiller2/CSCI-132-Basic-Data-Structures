/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionmaze;

/**
 *
 * @author ethanmiller
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Hard Coded Maze
        char maze[][] = new char[][]{
        {'#','#','#','#','#','#','#','#','#','#','#','#'},
        {'#','.','.','.','#','.','.','.','.','.','.','#'},
        {'O','.','#','.','#','.','#','#','#','#','.','#'},
        {'#','#','#','.','#','.','.','.','.','#','.','#'},
        {'#','.','.','.','.','#','#','#','.','#','.','#'},
        {'#','#','#','#','.','#','F','#','.','#','.','#'},
        {'#','.','.','#','.','#','.','#','.','#','.','#'},
        {'#','#','.','#','.','#','.','#','.','#','.','#'},
        {'#','.','.','.','.','.','.','.','.','#','.','#'},
        {'#','#','#','#','#','#','.','#','#','#','.','#'},
        {'#','.','.','.','.','.','.','#','.','.','.','#'},
        {'#','#','#','#','#','#','#','#','#','#','#','#'}  
        };  
        
        //Set Starting point
        int row = 2;
        int col = 0;
        int handRow = 3;
        int handCol = 0;
        
        //Create a Maze instance
        Maze maze1 = new Maze(maze);
        
        //Print with starting position
        maze1.printMaze(maze);
        
        //Traverse the Maze
        maze1.traverseMaze(maze, row, col, handRow, handCol);
    }
    
}
