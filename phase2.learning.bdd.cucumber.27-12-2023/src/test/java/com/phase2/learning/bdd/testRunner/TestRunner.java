package com.phase2.learning.bdd.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="src/test/resource/Features", 
                  glue= {"com/phase2/learning/bdd/step_definitions"})

public class TestRunner {}
