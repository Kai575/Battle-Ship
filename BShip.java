import java.util.Scanner;
/**
 * Write a description of class BShip here.
 *
 * @author (Kai)
 * @version (2.0)
 */
public class BShip
{
    int HitN = 0;
    
    static void clearScreen() {
        System.out.print('\u000C');
    }
    
    static String[][] buildBoard() {
       String[][] board = {{"0","0","0","0","0"}, {"0","0","0","0","0"}, {"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
       
       for (int i = 0; i < 5; i++) {  // Rows
           for (int j = 0; j < 5; j++) {  // Columns
               board[i][j] = "Empty";
           }
       }
        
       return board;
    }
    
    static void printBoard(String[][] board)  {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("     " + board[i][j] + "     ");
            }
            System.out.println();
        }
        
    }
        
    
    static String[][] changeBoardElement(String[][] board, int x, int y) {
        Scanner key = new Scanner(System.in);
        int HitN = 0;
        if (x == 2)
        {
            if (y == 2)
            {
                System.out.println("Hit");
                board[x][y] = "Hit  ";
                HitN = HitN +1;
            }
            else if (y == 3)
            {
                System.out.println("Hit");
                board[x][y] = "Hit  "; 
                HitN = HitN +1;
            }
            else if (y == 4)
            {
                System.out.println("Hit");
                board[x][y] = "Hit  ";
                HitN = HitN +1;
            }
            else 
            {
                System.out.println("Miss");
                board[x][y] = "Miss ";
            }
        }
        else
        {
            System.out.println("Miss");
            board[x][y] = "Miss ";
        }
       
        return board;
    }
    
    public static void main(String[] args) {
        boolean playAgain = true;
        boolean fillAnElement = true;
        int x, y;
        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"}, {"0","0","0","0","0"}, {"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        int elementNumber;
        Scanner myScanner = new Scanner(System.in);
        


        do {
            clearScreen();
            
            System.out.println("Welcome to the BattleShip Game");

            System.out.println("Here is the board.");
            
            myBoard = buildBoard();
            
            printBoard(myBoard);
            
            System.out.println("Now its time to guess where the ship is at");
            
            int HitN = 0;
            while (true) 
            {
            System.out.print("Type in the x axis");
            x = myScanner.nextInt();
            System.out.print("Type in the y axis");
            y = myScanner.nextInt();
            
            changeBoardElement(myBoard, x, y);
            
            printBoard(myBoard);
            
            if (HitN == 3)
            {
            System.out.println("Nice, you shank the ship.");    
            System.out.print("Would you like to start this process again!?  Type true or false:  ");
            playAgain = myScanner.nextBoolean();
        }
        
        }
          
        } while (playAgain);  // Program loops while user enters true, ends when user enters false.
    }
}
    

