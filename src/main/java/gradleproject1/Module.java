/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;

import java.util.*;





public class Module {
    
    String moduleName;
    String id;
    List<String> students;
    List<String> courses;
    
    
    public String getModuleName(){
        
        return moduleName;
        
        
    }
    
    public String getID(){
        
        return id;
        
        
    }
    
    public String getStudents(){
        
        String studentNames="";
        int i;
        for(i=0;i<students.size();i++){
        
            studentNames=studentNames+" "+students.get(i)+",";
            
        }
        
        return studentNames;
        
    }
    
    public String getCourses(){
        
        String courseNames="";
        int i;
        for(i=0;i<courses.size();i++){
        
            courseNames=courseNames+" "+courses.get(i)+",";
            
        }
        
        return courseNames;
        
    }
    
    
    
    
    
}
