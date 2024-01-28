package com.kgh.membership.presentation.annotation;

import com.kgh.membership.presentation.ValidNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidNumberValidator.class)
@Documented
public @interface CarrierId {
    String message() default "Invalid number";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
