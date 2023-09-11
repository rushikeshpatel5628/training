package thread_demo;
import java.lang.annotation.*;
import java.security.PublicKey;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface SmartPhone {
	String os(); default "Android";

	int version() default 1;
}
