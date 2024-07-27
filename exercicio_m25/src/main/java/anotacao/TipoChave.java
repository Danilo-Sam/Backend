package anotacao;

import java.lang.annotation.*;

/**
 * @author danilo.sampaio
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

	String value();
}