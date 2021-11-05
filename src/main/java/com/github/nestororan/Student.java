/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.github.nestororan;

import java.util.*;



public class Student {
    
    
    String name;
    int age;
    String dob;
    int ID;
    String username;
    List<String> courses;
    List<String> modules;
    
    public Student(String name, int age, String dob, int ID,List<String> courses, List<String> modules) {
        
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.ID=ID;
        this.courses=courses;
        this.modules=modules;
    }
   
 
    public void getUsername() {
        
        System.out.println("Student username: "+name+age);
        
        
    }
    
    public String getName(){
        
        return name;
    
    }
    
    public int getAge(){
        
        return age;
    
    }
    
    public String getDOB(){
        
        return dob;
    
    }
    
    public int getID(){
        
        return ID;
    
    }
    
    public String getCourses(){
        
        String courseNames="";
        int i;
        for(i=0;i<courses.size();i++){
        
            courseNames=courseNames+" "+courses.get(i)+",";
            
        }
        
        return courseNames;
        
    }
    
    public String getModules(){
        
        String moduleNames="";
        int i;
        for(i=0;i<modules.size();i++){
        
            moduleNames=moduleNames+" "+modules.get(i)+",";
            
        }
        
        return moduleNames;
        
    }
    
}
