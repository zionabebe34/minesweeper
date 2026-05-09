# Minesweeper Game

A classic Minesweeper game implementation in Java. This project was created as part of a computer science pre-course to practice object-oriented programming concepts and GUI development.

## Overview

This is a fully functional Minesweeper game where players uncover cells on a grid to reveal mines and numbers indicating the number of adjacent mines. The goal is to uncover all safe cells without hitting any mines.

## Features

- **Interactive GUI**: User-friendly graphical interface built with Java Swing
- - **Customizable Board**: Adjustable grid size and difficulty levels
  - - **Game Logic**: Proper mine placement, number calculation, and win/lose detection
    - - **Flood Fill Algorithm**: Automatically uncovers adjacent safe cells when clicking on a cell with zero adjacent mines
      - - **Timer**: Tracks gameplay duration
        - - **Mine Counter**: Displays remaining mine count
          - - **Right-Click Flagging**: Flag/unflag suspected mine locations
            - - **Game Reset**: Start a new game at any time
             
              - ## Installation
             
              - ### Prerequisites
              - - Java Development Kit (JDK) 8 or higher
                - - Git (optional, for cloning the repository)
                 
                  - ### Setup Steps
                 
                  - 1. **Clone or download the repository**
                    2.    ```bash
                             git clone https://github.com/zionabebe34/minesweeper.git
                             cd minesweeper
                             ```

                          2. **Compile the Java files**
                          3.    ```bash
                                   javac *.java
                                   ```

                                3. **Run the game**
                                4.    ```bash
                                         java Main
                                         ```

                                      ## How to Play

                                  1. **Start the Game**: Launch the application to begin with a new board
                                  2. 2. **Left-Click**: Click on a cell to uncover it
                                     3.    - If the cell contains a mine, the game ends (loss)
                                           -    - If the cell is safe, it displays the number of adjacent mines
                                                -    - If adjacent mines = 0, all adjacent cells automatically uncover
                                                     - 3. **Right-Click**: Flag or unflag cells you suspect contain mines
                                                       4. 4. **Win Condition**: Successfully uncover all non-mine cells
                                                          5. 5. **Reset**: Click the reset button to start a new game
                                                            
                                                             6. ## Game Difficulty Levels
                                                            
                                                             7. - **Easy**: 8x8 grid with 10 mines
                                                                - - **Medium**: 12x12 grid with 30 mines
                                                                  - - **Hard**: 16x16 grid with 99 mines
                                                                   
                                                                    - ## Project Structure
                                                                   
                                                                    - ```
                                                                      minesweeper/
                                                                      ├── Minesweeper.java        # Main game class
                                                                      ├── GameBoard.java          # Board logic and mine management
                                                                      ├── Cell.java               # Individual cell representation
                                                                      ├── GameGUI.java            # Graphical user interface
                                                                      └── Main.java               # Application entry point
                                                                      ```

                                                                      ## Technologies Used

                                                                      - **Language**: Java
                                                                      - - **GUI Framework**: Java Swing
                                                                        - - **Design Pattern**: Model-View Controller (MVC)
                                                                          - - **Data Structures**: 2D Arrays
                                                                           
                                                                            - ## Key Concepts Implemented
                                                                           
                                                                            - - Object-oriented programming (Classes, Encapsulation, Inheritance)
                                                                              - - Event handling and user interaction
                                                                                - - 2D array manipulation
                                                                                  - - Recursive algorithms (flood fill)
                                                                                    - - Game state management
                                                                                      - - GUI components and layout management
                                                                                       
                                                                                        - ## Future Enhancements
                                                                                       
                                                                                        - - Difficulty selection menu
                                                                                          - - Score tracking and leaderboard
                                                                                            - - Sound effects
                                                                                              - - Different grid themes/visual styles
                                                                                                - - Undo/Redo functionality
                                                                                                  - - Online multiplayer mode
                                                                                                   
                                                                                                    - ## Author
                                                                                                   
                                                                                                    - Created as a CS pre-course project by Zion Abebe
                                                                                                   
                                                                                                    - ## License
                                                                                                   
                                                                                                    - This project is open source and available under the MIT License.
