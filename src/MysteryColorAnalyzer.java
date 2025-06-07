import java.util.List;

public interface MysteryColorAnalyzer {

    int numberOfDistinctColors(List<Color> mysteryColors);

    /**
     * This method will count how often a specific color is in the given list
     *
     * <p>
     * Colors are defined via the {@link Color} enum.
     * </p>
     *
     * @param mysteryColors list of colors from which to determine the count of a specific color
     * @param color color to count
     * @return number of occurrence of the color in the list
     */
    int colorOccurrence(List<Color> mysteryColors, Color color);
}
