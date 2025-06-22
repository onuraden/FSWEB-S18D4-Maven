package com.workintech.s18d1.util;

import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void checkName(String name) {
        if(name == null || name.isEmpty()) {
            throw new BurgerException("Name is null or empty", HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkId(Long id) {
        if(id <= 0) {
            throw new BurgerException("Id 0 veya 0'dan küçük olamaz", HttpStatus.BAD_REQUEST);
        }
    }
}
