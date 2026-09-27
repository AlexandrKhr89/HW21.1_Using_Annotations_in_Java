package app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        int result = ArrayUtils.sum(x, y);
        System.out.printf("The sum of %s and %s is %s.\n", x, y, result);

        Method[] methods = ArrayUtils.class.getDeclaredMethods();
        String simpleClassName = ArrayUtils.class.getSimpleName();
        System.out.printf("\nReflection.\nThe methods of class %s:\n", simpleClassName);
        System.out.printf("%-15s %-20s %-20s %-20s %s\n",
                "Name",
                "Author`s first name",
                "Author`s last name",
                "Return Type",
                "Description"
        );

        for (Method method : methods) {
            System.out.printf("%-15s ", method.getName());

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.printf("%-20s ", author.firstName());
                System.out.printf("%-20s ", author.lastName());
            }

            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                System.out.printf("%-20s %s\n",
                        methodInfo.returnType(),
                        methodInfo.description()
                );
            }


        }
    }
}
