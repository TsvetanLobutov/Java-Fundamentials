package p02_GettersAndSetters;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));
        TreeSet<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));

        try {
            Class<?> reflection = Class.forName("p02_GettersAndSetters." + "Reflection");
            Method[] declaredMethods = reflection.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                if (declaredMethod.getName().startsWith("set") &&
                        declaredMethod.getReturnType().equals(void.class) &&
                        declaredMethod.getParameterTypes().length == 1){
                    setters.add(declaredMethod);
                } else if (declaredMethod.getName().startsWith("get") &&
                        !declaredMethod.getReturnType().equals(void.class) &&
                        declaredMethod.getParameterTypes().length == 0) {
                    getters.add(declaredMethod);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Method getter : getters) {
            System.out.println(String.format("%s will return %s",
                    getter.getName(),
                    getter.getReturnType().getSimpleName()));
        }
        for (Method setter : setters) {
            System.out.println(String.format("%s and will set field of %s",
                    setter.getName(),
                    setter.getReturnType().getSimpleName()));
        }
    }
}
