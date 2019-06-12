package training;

import java.util.ArrayList;
import java.util.List;

public class EightQueens {


    private static final int BOARD_SIZE = 8;

    private int m_nSolution;
    private int[] m_positionsInRow;

    public EightQueens(){
        m_nSolution = 0;
        m_positionsInRow = new int[BOARD_SIZE];
    }

    public int solve(){
        solve( 0);
        return m_nSolution;
    }


    private void solve(int rowIndex){
        if (rowIndex == BOARD_SIZE) {
            displayPosition();
            m_nSolution++;
            return;
        }

        for (int columnIdx = 0; columnIdx < BOARD_SIZE; columnIdx++) {
            if (checkConstraint(rowIndex, columnIdx)) {
                m_positionsInRow[rowIndex] = columnIdx;
                solve( rowIndex + 1);
            }
        }

    }

    private void displayPosition() {

        for (int i = 0; i < BOARD_SIZE; i++){
            System.out.print(m_positionsInRow[i]);
        }
        System.out.println();
    }

    private boolean checkConstraint(int rowIndex, int newColumn) {

        if (rowIndex == 0)
            return (true);

        for (int i = 0; i < rowIndex; i++){
            if (m_positionsInRow[i] == newColumn)
                return (false);

            if ((rowIndex - i == newColumn - m_positionsInRow[i]) || (rowIndex - i == m_positionsInRow[i] - newColumn))
                return (false);

        }

        return (true);
    }

    public static void main(String[] args) {
        EightQueens eightQueen = new EightQueens();
        System.out.println("Total number of solutions: "+eightQueen.solve());
    }

}
