import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Аннотация доступна во время выполнения
@Target(ElementType.TYPE) // Аннотация может быть применена только к типам (классам)
public @interface Cache {
    // Необязательное свойство value типа String[]
    String[] value() default {}; // Значение по умолчанию — пустой массив
}