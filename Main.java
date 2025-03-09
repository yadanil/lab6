import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        //Задание 2 1
        System.out.println("\nЗадание 2.1\n");

        A a = new A("test");

        //Получаем все методы класса A
        for (Method method : A.class.getDeclaredMethods()) {
            //Проверяем, есть ли аннотация @Invoke
            if (method.isAnnotationPresent(Invoke.class)) {
                System.out.println("Вызов метода: " + method.getName());
                //Вызываем метод
                Object result = method.invoke(a);
                System.out.println("Результат: " + result);
            }
        }


        //Задание 2 2
        System.out.println("\nЗадание 2.2\n");

        //Получаем аннотацию @Default у класса A
        Default defaultAnnotation = A.class.getAnnotation(Default.class);

        if (defaultAnnotation != null) {
            //Извлекаем значение свойства value
            Class<?> defaultValue = defaultAnnotation.value();
            System.out.println("Значение по умолчанию для класса A: " + defaultValue.getName());
        } else {
            System.out.println("Класс A не аннотация с @Default");
        }


        //Задание 2 3
        System.out.println("\nЗадание 2.3\n");

        //Получаем аннотацию @ToString у класса A
        ToString toStringAnnotation = A.class.getAnnotation(ToString.class);

        if (toStringAnnotation != null) {
            //Извлекаем значение свойства value
            ToString.ToStringOption value = toStringAnnotation.value();
            System.out.println("Значение ToString для класса A: " + value);
        } else {
            System.out.println("Класс A не аннотация с @ToString");
        }


        //Задание 2 4
        System.out.println("\nЗадание 2.4\n");

        //Получаем аннотацию @Validate у класса A
        Validate validateAnnotation = A.class.getAnnotation(Validate.class);

        if (validateAnnotation != null) {
            //Извлекаем значение свойства value
            Class<?>[] classes = validateAnnotation.value();
            System.out.println("Классы указанные в @Validate для класса A:");
            for (Class<?> clazz : classes) {
                System.out.println(clazz.getName());
            }
        } else {
            System.out.println("Класс A не аннотация с @Validate");
        }


        //Задание 2 5
        System.out.println("\nЗадание 2.5\n");

        //Получаем аннотацию @Two у класса A
        Two twoAnnotation = A2.class.getAnnotation(Two.class);

        if (twoAnnotation != null) {
            //Извлекаем значения свойств first и second
            String firstValue = twoAnnotation.first();
            int secondValue = twoAnnotation.second();

            System.out.println("Значения указанные в @Two для класса A:");
            System.out.println("Первое: " + firstValue);
            System.out.println("Второе: " + secondValue);
        } else {
            System.out.println("Класс A не аннотация с @Two");
        }


        //Задание 2 6
        System.out.println("\nЗадание 2.6\n");

        //Получаем аннотацию @Cache у класса A
        Cache cacheAnnotation = A2.class.getAnnotation(Cache.class);

        if (cacheAnnotation != null) {
            //Извлекаем значение свойства value
            String[] values = cacheAnnotation.value();
            System.out.println("Значения указанные в @Cache для класс A:");
            for (String value : values) {
                System.out.println(value);
            }
        } else {
            System.out.println("Класс A не аннотация с @Cache");
        }


    }
}