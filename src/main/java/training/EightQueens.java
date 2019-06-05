package training;

import java.util.ArrayList;
import java.util.List;

public class EightQueens {

    private int nSolution;
    private static final int BOARD_SIZE = 8;

    public int solve(){
        solve(new ArrayList<>(), 0);
        return nSolution;
    }

    private void solve(List<Integer> positionsInRow, int rowIndex){
        if (rowIndex == BOARD_SIZE) {
            System.out.println(positionsInRow);
            nSolution++;
            return;
        }

        for (int columnIdx = 0; columnIdx < BOARD_SIZE; columnIdx++) {
            if (checkConstraint(positionsInRow, columnIdx)) {
                positionsInRow.add(columnIdx);
                solve(positionsInRow, rowIndex + 1);
                positionsInRow.remove(positionsInRow.size() - 1);
            }
        }

    }

    private boolean checkConstraint(List<Integer> progressivePositionsInRow, int newColumn) {
        if (progressivePositionsInRow.contains(newColumn))
            return false;
        int insertIndex = progressivePositionsInRow.size();
        for (int i = 0; i < progressivePositionsInRow.size(); i++) {
            if (progressivePositionsInRow.get(i) + (insertIndex - i) == newColumn || progressivePositionsInRow.get(i) - (insertIndex - i) == newColumn)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        EightQueens eightQueen = new EightQueens();
        System.out.println("Total number of solutions: "+eightQueen.solve());
    }

}
