import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .reduce(0, Integer::sum);
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers)
            .filter(x -> x % 2 != 0)
            .sorted()
            .toArray();
    }
}
