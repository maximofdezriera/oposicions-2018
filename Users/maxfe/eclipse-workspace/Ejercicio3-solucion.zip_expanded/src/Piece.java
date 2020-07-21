import java.util.ArrayList;

/**
 * Model object for Piece. All pieces of ChessBoard are child of this abstract
 * class.
 *
 * @author Maximo Fernandez Riera
 *         Taller JAVA para iniciados a la programación
 *         Universitat Oberta de Catalunya (UOC)
 * @version 4.0
 */
public abstract class Piece {

	public static boolean WHITE = true;
	public static boolean BLACK = false;
	public static int TOTAL_WHITE_PIECES = 0;
	public static int TOTAL_BLACK_PIECES = 0;

	private boolean colour;
	protected Cell cell;

	/**
	 * Piece's constructor. It set its colour attribute.
	 * 
	 * @param colour the colour of the Piece: white = true, black = false
	 */
	public Piece(boolean colour) {
		this.setColour(colour);
		if (colour) {
			TOTAL_WHITE_PIECES++;
		} else {
			TOTAL_BLACK_PIECES++;
		}
		this.cell = null;
	}

	/**
	 * Returns the color of the Piece.
	 * 
	 * @return boolean Returns the color of this Piece as a boolean: white = true,
	 *         black = false
	 */
	public boolean getColour() {
		return this.colour;
	}

	/**
	 * Set the colour of the Piece.
	 * 
	 * @param colour Colour must be set as a boolean: white = true, black = false
	 */
	protected void setColour(boolean colour) {
		this.colour = colour;
	}

	/**
	 * Set the Cell of the Piece.
	 * 
	 * @param cell the Cell assigned to current Piece
	 */
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	/**
	 * This method just calls this.setCell(cell)
	 * 
	 * @param cell the Cell assigned to current Piece
	 */
	public void move(Cell cell) {
		this.setCell(cell);
	}

	/**
	 * Abstract method that all child classes must implement
	 * 
	 * @param chessBoard the chessBoard of the game
	 * @return ArrayList<Cell> all possible valid moves of the piece
	 * @exception ChessPlayerException throws all ChessPlayerException generated by
	 *                                 the methods used here.
	 */
	public abstract ArrayList<Cell> getMoves(ChessBoard chessBoard) throws CheckersException;
}