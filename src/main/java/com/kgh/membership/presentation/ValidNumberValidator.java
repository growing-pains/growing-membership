package com.kgh.membership.presentation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidNumberValidator implements ConstraintValidator<CarrierId, Long> {
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if(value == null){
            return false;
        }
        return isValidNumber(value);
    }
    private boolean isValidNumber(Long value){
        return (value instanceof Long);
    }
}
