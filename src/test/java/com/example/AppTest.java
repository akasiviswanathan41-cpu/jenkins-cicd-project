package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        int a = 10;
        int b = 20;

        assertEquals(30, a + b);
    }

    @Test
    public void testProjectName() {
        String projectName = "jenkins-cicd-project";

        assertEquals("jenkins-cicd-project", projectName);
    }
}
