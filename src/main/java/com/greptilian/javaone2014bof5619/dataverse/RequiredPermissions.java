package com.greptilian.javaone2014bof5619.dataverse;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @assoc - - 1..* Permission
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RequiredPermissions {

    Permission[] value();

    String dvObjectName() default "";
}
