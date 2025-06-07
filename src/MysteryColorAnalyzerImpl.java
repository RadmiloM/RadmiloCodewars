import java.util.List;

/*
Problem Description:
Create the implementation for the interface MysteryColorAnalyzer.
The implementation needs to be called "MysteryColorAnalyzerImpl".
 */
public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {

    /**
     * This method will determine how many distinct colors are in the given list
     *
     * <p>
     * Colors are defined via the {@link Color} enum.
     * </p>
     *
     * @param mysteryColors list of colors from which to determine the number of distinct colors
     * @return number of distinct colors
     */
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        return mysteryColors.stream().distinct().toList().size();
    }

    /**
     * This method will count how often a specific color is in the given list
     *
     * <p>
     * Colors are defined via the {@link Color} enum.
     * </p>
     *
     * @param mysteryColors list of colors from which to determine the count of a specific color
     * @param color         color to count
     * @return number of occurrence of the color in the list
     */

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int counter = 0;
        for (Color c : mysteryColors) {
            if (c.equals(color)) {
                counter++;
            }
        }
        return counter;
    }
}
