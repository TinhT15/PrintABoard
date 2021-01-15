
/**
 * Write a description of class PrintABoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintABoard
{
    static void printData(int[][] intArray, int arraySize) {
               
        for (int x = 0; x < arraySize; x++) {
                for (int y = 0; y < arraySize; y++) { 
                    
                    int myInt = intArray[x][y];
                    
                               
                    if (intArray[x][y] == 1){
                        System.out.print("X");
                    }
                    else
                    {
                        System.out.print("O");
                    }
                }
                System.out.println("");
        }
    }
    
    static void printX(String x) {
        for (int i = 0; i < 5; i++) {           
            for (int j = 0; j < 5; j++) {
                System.out.print(x);              
            }
            System.out.println("");
        }       
    }
    
    public static void main(String[] args){
        System.out.print("\u000C");
        
        int[][] myBoardArray = { {1,2,3,4,5},
                                 {5,2,1,4,5},
                                 {1,1,3,4,5},
                                 {2,4,3,3,1},
                                 {4,2,3,1,5},
                                };
        printData(myBoardArray, 5);
        
    }
}
