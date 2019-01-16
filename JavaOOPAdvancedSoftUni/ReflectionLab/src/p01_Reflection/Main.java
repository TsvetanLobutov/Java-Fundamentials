package p01_Reflection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class<?> reflection = Reflection.class;

        System.out.println(reflection);
        System.out.println(reflection.getSuperclass());
        Class<?>[] interfaces = reflection.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Reflection ref = (Reflection) reflection.getDeclaredConstructor().newInstance();
        System.out.println(ref);

    }
}
