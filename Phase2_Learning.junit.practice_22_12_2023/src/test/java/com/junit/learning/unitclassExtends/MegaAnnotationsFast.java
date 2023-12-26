package com.junit.learning.unitclassExtends;

import java.lang.annotation.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.TYPE, ElementType.METHOD}) // define the targetted the values
@Retention(RetentionPolicy.RUNTIME)   
@Tag("fast")

@Test
public @interface MegaAnnotationsFast {
	
	
}


