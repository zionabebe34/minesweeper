# Minesweeper Game (Java)

A simple text-based implementation of the classic Minesweeper game in Java. This program generates a Minesweeper field, lets users open tiles or place flags, and determines win or loss.

## Features

- Randomly generated mine grid based on user input for size and mine probability.
- Supports opening tiles and flagging suspected mines.
- Console-based interface with live grid printing.
- Win detection and game-over handling.
- Customizable board size and mine probability via command-line arguments.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later

### How to Run

1. **Clone or download this repository.**
2. **Navigate to the project directory containing `עותק של MineGrid.java`.**
3. **Compile the Java source code:**

   ```sh
   javac 'minesweeper introCS/עותק של MineGrid.java'
   ```

4. **Run the program:**

   ```sh
   java -cp "minesweeper introCS" "עותק של MineGrid" <rows> <columns> <mine_probability>
   ```
   - `<rows>`: Number of rows (e.g., 5)
   - `<columns>`: Number of columns (e.g., 5)
   - `<mine_probability>`: Probability (between 0.0 and 1.0) that a cell contains a mine (e.g., 0.15)

   **Example run:**
   ```sh
   java -cp "minesweeper introCS" "עותק של MineGrid" 5 5 0.15
   ```

### How to Play

- When prompted, enter `o` to open a tile or `f` to place/remove a flag.
- After choosing an action, enter the coordinates (row and column) of the tile you want to open or flag.
- The game ends once you hit a mine (lose) or clear all non-mine spaces (win).

### Code Structure

- Main logic in `עותק של MineGrid.java`
- All game functions are in a single class: `MineGrid`
- Board and tile states are managed via 2D arrays

### Legend

- **-9**: Closed tile
- **-5**: Open, empty tile
- **-3**: Flagged tile
- **-1**: Mine

## Notes

- Make sure your terminal supports UTF-8 to display some symbols/characters.
- Coordinates are zero-based (first row/column is 0).

## License

This project is for educational purposes. You may use or modify it as you like.

---

Feel free to contribute or raise issues for improvements!
