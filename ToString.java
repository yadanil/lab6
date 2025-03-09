import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Аннотация доступна во время выполнения
@Target({ElementType.TYPE, ElementType.FIELD}) // Аннотация может быть применена к типам (классам) и полям
public @interface ToString {
    // Необязательное свойство value с двумя вариантами значений: YES или NO
    ToStringOption value() default ToStringOption.YES;

    // Перечисление для возможных значений свойства value
    enum ToStringOption {
        YES, NO
    }
}
