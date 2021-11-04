/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;

import java.util.*;
import org.joda.time.DateTime;
        
        

public class Programme {
    
    String name;
    List<String> modules;
    List<String> students;
    DateTime startDate;
    DateTime endDate;
    
    
    
    
    public String getName(){
        
        return name;
        
    }
    
    
    public String getModules(){
        
        String moduleNames="";
        int i;
        for(i=0;i<modules.size();i++){
        
            moduleNames=moduleNames+" "+modules.get(i)+",";
            
        }
        
        return moduleNames;
        
    }
    
    public String getStudents(){
        
        String studentNames="";
        int i;
        for(i=0;i<students.size();i++){
        
            studentNames=studentNames+" "+students.get(i)+",";
            
        }
        
        return studentNames;
        
    }
    
    
    
    
    
    
}
