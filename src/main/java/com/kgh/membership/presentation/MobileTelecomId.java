package com.kgh.membership.presentation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidNumberValidator.class)
@Documented
public @interface MobileTelecomId {
    String message() default "Invalid MobileTelecom Id";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
