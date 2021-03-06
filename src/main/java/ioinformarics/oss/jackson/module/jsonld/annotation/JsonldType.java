package ioinformarics.oss.jackson.module.jsonld.annotation;


import java.lang.annotation.*;

/**
 * @author Alexander De Leon
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@JsonldResource
public @interface JsonldType {
    String value();
}