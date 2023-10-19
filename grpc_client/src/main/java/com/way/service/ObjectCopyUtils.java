package com.way.service;

import org.apache.commons.beanutils.BeanUtils;

public class ObjectCopyUtils {
    public static <T, U> U copyProperties(T source, Class<U> destinationClass) {
        U destination = null;
        try {
            destination = destinationClass.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(destination, source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return destination;
    }
}