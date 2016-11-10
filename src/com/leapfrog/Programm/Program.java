/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Programm;

import com.leapfrog.coursedao.CourseDAO;
import com.leapfrog.coursedaoimpl.CourseDAOImpl;
import com.leapfrog.courses.Course;
import com.leapfrog.ui.CourseAdduI;
import com.leapfrog.ui.CourseUI;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Program {

    public static void main(String[] args) {
       new CourseUI().setVisible(true);
        /*Course c = new Course(2, "advance java", "advance java", 10000, true);
                c.setModified_date(new Date());
            CourseDAO coursedao = new CourseDAOImpl();
        try {
            
            coursedao.update(c);
            
        }
        catch(ClassNotFoundException |SQLException ex){
            System.out.println(ex.getMessage());
        }*/
        /*Course c = new Course(2, "core java", "core java", 20000, true);
            CourseDAO coursedao = new CourseDAOImpl();
             
        try {
            
            coursedao.insert(c);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }*/
        
        /*Course c=new Course();
        CourseDAO coursedao=new CourseDAOImpl();
        try{
        coursedao.delete(18);
        }
        catch(ClassNotFoundException| SQLException ex){
            System.out.println(ex.getMessage());
        }*/
        
      /*CourseDAO coursedao=new CourseDAOImpl();
        try{
        Course c=coursedao.searchById(2);
            System.out.println(c);
                }
        catch(ClassNotFoundException|SQLException ex){
            System.out.println(ex.getMessage());
        }*/
        
       /* CourseDAO coursedao=new CourseDAOImpl();
        try{
        for(Course c:coursedao.getAll()){
            System.out.println(c);
        }
        }
        catch(ClassNotFoundException|SQLException ex){
            System.out.println(ex.getMessage());
        }*/
        
      
        

    }

}
