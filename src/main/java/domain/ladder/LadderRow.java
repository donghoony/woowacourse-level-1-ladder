package domain.ladder;

import dto.RowPatternDto;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class LadderRow {

    private final List<Boolean> rowPattern;

    public LadderRow(int playerCount) {
        this.rowPattern = new ArrayList<>();
        for (int i = 0; i < playerCount - 1; i++) {
            rowPattern.add(false);
        }
    }

    public void createPattern(BooleanSupplier patternCreationStrategy) {
        for (int index = 0; index < rowPattern.size(); index++) {
            boolean isExpectingToPlace = patternCreationStrategy.getAsBoolean();
            rowPattern.set(index, isPlaceableWhenTryingToPlace(index, isExpectingToPlace));
        }
    }

    private boolean isPlaceableWhenTryingToPlace(int index, boolean isPlacing) {
        return isPlacing && isPreviousIndexEmpty(index);
    }

    private boolean isPreviousIndexEmpty(int index) {
        return index == 0 || !rowPattern.get(index - 1);
    }

    public RowPatternDto getRowPattern() {
        return new RowPatternDto(List.copyOf(rowPattern));
    }
}
