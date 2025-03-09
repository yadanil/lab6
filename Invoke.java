import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //Аннотация доступна во время выполнения
@Target(ElementType.METHOD) //Аннотация может быть применена только к методам
public @interface Invoke {
    //Аннотация не имеет свойств
}