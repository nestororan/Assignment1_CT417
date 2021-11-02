//package com.github.EigerEx;

import org.junit.Test;
import org.junit.Assert;
import java.util.*;
import org.joda.time.DateTime;

public class Test
{
    @Test
    public void testStudent() {
        List<String> courses;
        List<String> modules;
        courses="Maths science","Biotech";
        modules="Biochemistry","Mechanical Mapping";
        final Student student = new Student("John", 20, new DateTime(), 147773, new List<String> courses="Maths science","Biotech", new List<String> modules="Biochemistry","Mechanical Mapping");
        Assert.assertEquals((Object)student.getName(), (Object)"John");
    }
}