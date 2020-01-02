/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionmaze;

import java.util.Scanner;

/**
 *
 * @author ethanmiller
 */
public class Maze {

    private char maze[][];

    private Scanner pause = new Scanner(System.in);//Scanner to pause between each move
    //Constructor to build a maze

    public Maze(char inMaze[][]) {
        maze = inMaze;

    }
    

    //Method to move through the maze
    public void traverseMaze(char x[][], int row, int col, int handRow, int handCol) {
        {
            if (x[row - 1][col] == 'F')//Base Case for finish line
            {
                System.out.println("You are a winner!");
            } else if (row < handRow && col == handCol)// Facing East
            {
                if (maze[handRow][handCol] == '.' || maze[handRow][handCol] == 'X')//If there is a dot or x to your right 
                {
                    maze[row][col] = 'X';
                    handCol--;
                    row++;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row][col + 1] == '.' || maze[row][col + 1] == 'X')//If there is a dot or x in front of you
                {

                    maze[row][col] = 'X';
                    col++;
                    handCol++;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row][col + 1] == '#')//If there is an # in front of you
                {
                    handRow--;
                    handCol++;
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                }
            }//End of East if Statement
            else if (col < handCol && row == handRow)// Facing North
            {
                if (maze[handRow][handCol] == '.' || maze[handRow][handCol] == 'X')//If there is a dot or x to your right
                {
                    maze[row][col] = 'X';
                    handRow++;
                    col++;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row - 1][col] == '.' || maze[row - 1][col] == 'X')//If there is a dot or x in front of you
                {
                    maze[row][col] = 'X';
                    handRow--;
                    row--;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row - 1][col] == '#')//If there is an # in front of you
                {
                    handRow--;
                    handCol--;
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                }
            }//End of North Statement
            else if (col > handCol && row == handRow)//Facing South
            {
                if (maze[handRow][handCol] == '.' || maze[handRow][handCol] == 'X')//If there is a dot or x to your right
                {
                    maze[row][col] = 'X';
                    handRow--;
                    col--;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row + 1][col] == '.' || maze[row + 1][col] == 'X')//If there is a dot or x in front of you
                {
                    maze[row][col] = 'X';
                    handRow++;
                    row++;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row + 1][col] == '#')//If there is an # in front of you
                {
                    handRow++;
                    handCol++;
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                }
            }//End of south if Statement
            else if (row > handRow && col == handCol)//Facing West
            {
                if (maze[handRow][handCol] == '.' || maze[handRow][handCol] == 'X')//If there is a dot or x to your right
                {
                    maze[row][col] = 'X';
                    handCol++;
                    row--;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row][col - 1] == '.' || maze[row][col - 1] == 'X')//If there is a dot or x in front of you
                {

                    maze[row][col] = 'X';
                    col--;
                    handCol--;
                    maze[row][col] = 'O';
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                } else if (maze[row][col - 1] == '#')//If there is an # in front of you
                {
                    handRow++;
                    handCol--;
                    printMaze(x);
                    pause.nextLine();
                    traverseMaze(x, row, col, handRow, handCol);
                }
            }//End of West if Statement 
        }
    }

    //Method to print out the mehod
    public void printMaze(char x[][]) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
