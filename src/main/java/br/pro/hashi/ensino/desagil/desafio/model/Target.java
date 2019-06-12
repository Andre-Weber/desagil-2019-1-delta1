package br.pro.hashi.ensino.desagil.desafio.model;


public class Target extends Element {
    private final Board board;


    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }


    public void move(int rowShift, int colShift) {
        if (rowShift == -1 && colShift == 0) {
            if (row > 0 && !board.isWall(row - 1, col)) {
                row += rowShift;
                col += colShift;

            }
        } else if (rowShift == 0 && colShift == 1) {
            if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1)) {
                row += rowShift;
                col += colShift;
            }
        } else if (rowShift == 1 && colShift == 0) {
            if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col)) {
                row += rowShift;
                col += colShift;

            }

        } else if (rowShift == 0 && colShift == -1) {
            if (col > 0 && !board.isWall(row, col - 1)) {
                row += rowShift;
                col += colShift;

            }


        }


    }


}
