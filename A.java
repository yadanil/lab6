@Default(value = String.class) //Аннотируем класс и указываем значение свойства value
@ToString(value = ToString.ToStringOption.YES) //Аннотируем класс и указываем значение свойства value
@Validate(value = {String.class, Integer.class}) //Аннотируем класс и указываем значение свойства value

class A {
    String stringField;

    public A(String str) {
        stringField = str;
    }

    @Invoke //Аннотируем метод
    public int cacheTest() {
        System.out.println("original method");
        return 42;
    }
}