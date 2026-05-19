package kr.ac.kopo.yoon._026exam.domain;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MemberIdValidator implements ConstraintValidator<MemberId, String> {

    @Override
    public void initialize(MemberId constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s.equals("admin")) {
            return false;
        }

        return false;
    }
}
