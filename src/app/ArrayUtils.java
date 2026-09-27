package app;

public class ArrayUtils {
    @Author(firstName = "Alex", lastName = "Khristenko")
    @MethodInfo(
            name = "sum",
            returnType = "int",
            description = "The sum of two integers"
    )
    public static int sum(int x, int y) {
        return x + y;
    }

    @Author(firstName = "Alex", lastName = "Khristenko")
    @MethodInfo(
            name = "difference",
            returnType = "int",
            description = "The difference of two integers"
    )
    public static int difference(int x, int y) {
        return x - y;
    }
}
