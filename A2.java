@Two(first = "Hello", second = 42) //Аннотируем класс и указываем значения свойств first и second
@Cache(value = {"method1", "method2"}) //Аннотируем класс и указываем значение свойства value

class A2 {
    String stringField;
    int intField;

    public A2(String str, int num) {
        stringField = str;
        intField = num;
    }

    public int cacheTest() {
        System.out.println("original method");
        return 42;
    }
}