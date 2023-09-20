import java.util.Scanner;
/* 
 -9 - closed 
 -5 - open and have nothing 
 -3 flag 
 -1 mine 
 */
class MineGrid{
    static Scanner scanner = new Scanner (System.in); 
    //step1 
    public static int[][] createGrid(int n , int m , double p){
        int [][] grid = new int [n][m];
        for (int i =0;  i < grid.length ; i++){
            for (int j = 0; j< grid[i].length; j++){
                if (Math.random() <p){
                    grid[i][j]= -1;
                }
            }
        }
        return grid; 
    }

    //print the grid with the mines 
    public static void displayGrid(int [][] mineGrid) {
       for (int i = 0; i < mineGrid.length; i++) {
            for (int j = 0; j < mineGrid[i].length; j++) {
                if(mineGrid[i][j] == -1){
                    System.out.print("x ");
                }else{
                    System.out.print(mineGrid[i][j] + " ");
                }
                
            } 
              System.out.println();
       }

    }


    //updating the nieghboring tiles of the mines 
public static int[][] newGrid(int[][] inputArr) {
    int row = inputArr.length;      // Get the number of rows
    int col = inputArr[0].length;   // Get the number of columns
    int[][] newArr = new int[row][col];
    int count = 1;

    // Copy inputArr to newArr
    for (int q = 0; q < row; q++) {
        for (int y = 0; y < col; y++) {
            newArr[q][y] = inputArr[q][y];
        }
    }

    // Update values in the function
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            if (newArr[i][j] == -1) {
                // Check and update neighboring cells
                if (j + 1 < col) {
                    newArr[i][j + 1] += count;
                }
                if (j - 1 >= 0) {
                    newArr[i][j - 1] += count;
                }
                if (i + 1 < row) {
                    newArr[i + 1][j] += count;
                }
                if (i - 1 >= 0) {
                    newArr[i - 1][j] += count;
                }
                if (i + 1 < row && j + 1 < col) {
                    newArr[i + 1][j + 1] += count;
                }
                if (i - 1 >= 0 && j + 1 < col) {
                    newArr[i - 1][j + 1] += count;
                }
                if (i + 1 < row && j - 1 >= 0) {
                    newArr[i + 1][j - 1] += count;
                }
                if (i - 1 >= 0 && j - 1 >= 0) {
                    newArr[i - 1][j - 1] += count;
                }
            }
        }
    }
    return newArr;
}

// get the value of specific coordinate step3
public static  int coorspecific(int[][] inputArr1 , int x , int y){
    int row = inputArr1[0].length;
    int col = inputArr1[1].length;
    if((x>=0 && x<row) && (y>=0 && y<col)){
        return inputArr1[x][y];
    }else{
        return -1; //mean that is out of index 
        }
    }

//step 4 
    public static int [][] click(int [][] inputArr2 , int c , int d ){
        //the status array 
        int row1 = inputArr2.length;
        int col1 = inputArr2[0].length; 
        int [][] newStatus = new int [row1][col1];
        for (int i = 0 ; i<row1; i++){
            for (int j =0 ; j<col1; j++){
                newStatus[i][j] = -9;
            }
        }

        if(inputArr2[c][d] == -1){
            newStatus[c][d] = -1;
        }
        if (inputArr2[c][d]>0){
            newStatus[c][d]=inputArr2[c][d];
        }else if (inputArr2[c][d] == 0){
            newStatus[c][d]=-5;
        }
        return newStatus;
    }


//step 5 - mark the specific coordinate as a flag 
    public static int [][] chooseflag( int[][] inputArr3 , int e, int f){
        int [][] flagArr = inputArr3; 
        if (inputArr3[e][f] == -9){
            flagArr[e][f] = -3;
        }else if(inputArr3[e][f] == -3){
            flagArr[e][f] = -9; 
        }


        return flagArr; 
    }
//give us the array with the tiles close and shown tiles in the loop 
    public static int[][] newArray(int[][] inputArr5){
        int row1 = inputArr5.length;
        int col1 = inputArr5[0].length; 
        int [][] newStatus = new int [row1][col1];
        for (int i = 0 ; i<row1; i++){
            for (int j =0 ; j<col1; j++){
                newStatus[i][j] = -9;
            }
        }
        return newStatus; 
    }

    //print the array in the loop 
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array[i].length; j++) {
              System.out.print(" " + array[i][j] + " ");
            }
           System.out.println();
        }
    }

    //check if the game complete
    public static boolean isGameComplete(int[][] inputArr6){
        boolean complete = true; 
        for (int i = 0; i<inputArr6.length; i++){
            for (int j =0 ; j< inputArr6[0].length; j++){
                if (inputArr6[i][j] == -3 || inputArr6[i][j] >= 0){
                    continue; 
                }else if(inputArr6[i][j] != -3 || inputArr6[i][j] < 0){
                    complete = false;
                }
            }
        }
        return complete; 

    }
        
        
    
    
        

 /////--------------------------------------
 //createGrid = make a random grid, displayGrid = void function that display the array , newGrid = change the array to the mine field, coorspecific = give specific coordinate 
 // click = give a status of the array after choosing a coordinate



public static void main(String[] args) {
    //check the step 1 and 2 
    //define the start grid with hidden mines and size
    int n = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    double p = Double.parseDouble(args[2]);
     int [][] mineGrid = createGrid(n, m, p); 
     mineGrid = newGrid(mineGrid); 
     int[][] statusfornow = newArray(mineGrid);
     System.out.println("this is for the test");
     displayGrid(mineGrid); // this is for the test 
     String open = "o" , flag = "f"; // compare to the input
 
    

    
        while (true){
            System.out.println("f for flag  or o for open ?");
            String tileMove = scanner.nextLine().toLowerCase(); // Convert the srting to lowercase to ensure

            if (tileMove.equals("f") ) {
                System.out.println("Enter row and column to flag ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                chooseflag(statusfornow, x, y);
                 

            } else if (tileMove.equals("o")) {
                System.out.println("Enter row and column to open ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                click(mineGrid, x, y);
                if(mineGrid[x][y] == -1){
                    System.out.println("you lost");
                    break;
                }
                statusfornow[x][y] = mineGrid[x][y];

                } else if (tileMove != open || tileMove != flag){
                System.out.println("Invalid choice. Please enter 'F' or 'O'.");
                }
                
        printArray(statusfornow);

            if(isGameComplete(statusfornow) == true){
                System.out.println("you won");
                break; 
            }

        }
       
    
    } 
    
    




}

    








    


    
