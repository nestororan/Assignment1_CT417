package com.github.nestororan;


import org.junit.*;
import java.util.*;
import org.joda.time.DateTime;

public class myTest
{
    private Student s;
    
    List<String> courses;
    List<String> modules;
    
    @Test
    public void testStudent() {
        
        String DOB="13/05/1964";
        
        courses.add("Maths science");
        courses.add("Biotech");
        modules.add("Biochemistry");
        modules.add("Mechanical Mapping");
        
        s= new Student("Padraic", 57, DOB, 163283, courses, modules);
        Assert.assertEquals((Object)s.getName(), (Object)"Padraic");
    }
}