import org.example.Main;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    Main mainClass = new Main();

    @Test
    public void theLengthIsRight(){
        int[][] testMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int row = testMatrix.length;
        int column = testMatrix[0].length;

        assertThat(row).isEqualTo(3);
        assertThat(column).isEqualTo(4);
    }

    @Test
    public void isTransposedRight(){
        int[][] testMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int row = testMatrix.length;
        int column = testMatrix[0].length;

        int[][] transposedMatrix = mainClass.transposedMatrix(testMatrix, row, column);

        int[][] finalMatrix = {{1, 5, 9}, {2, 6, 10}, {3, 7, 11}, {4, 8, 12}};
        assertThat(transposedMatrix).isEqualTo(finalMatrix);
    }
}
