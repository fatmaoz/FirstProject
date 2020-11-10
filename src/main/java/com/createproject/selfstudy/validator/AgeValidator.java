package com.createproject.selfstudy.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

    private int lower;
    private int upper;
    public void initialize(Age constraint) {
        //it is for write the post construct method whenever you owerrite the default lower and upper vauest it will pick up here
        this.lower = constraint.lower();
        this.upper = constraint.upper();

    }

    public boolean isValid(Integer age, ConstraintValidatorContext context) {
        //logic, will be there
        if(age == null){
            return false;
        }
        if(age < lower || age > upper ){
            return false;
        }
        return true;
    }
}
