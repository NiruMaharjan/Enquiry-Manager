/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.coursedaoimpl;

import com.leapfrog.coursedao.CourseDAO;
import com.leapfrog.courses.Course;
import com.leapfrog.dbconenction.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class CourseDAOImpl implements CourseDAO {

    DbConnection db = new DbConnection();

    @Override

    public int insert(Course c) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO courses(course_id,course_name,course_description,fees,status) values(?,?,?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, c.getId());
        stmt.setString(2, c.getName());
        stmt.setString(3, c.getDescription());
        stmt.setInt(4, c.getFees());
        stmt.setBoolean(5, c.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;

    }

    @Override
    public int update(Course c) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE courses set course_name=?,course_description=?,fees=?,modified_date=?,status=? WHERE course_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, c.getName());
        stmt.setString(2, c.getDescription());
        stmt.setInt(3, c.getFees());
        stmt.setDate(4, new java.sql.Date(c.getModified_date().getTime()));
        stmt.setBoolean(5, c.isStatus());
        stmt.setInt(6, c.getId());
        int result = stmt.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Course searchById(int id) throws ClassNotFoundException, SQLException {
        String sql = "SELECT *from courses WHERE course_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        Course course = new Course();
        while (rs.next()) {

            course.setId(rs.getInt("course_id"));
            course.setName(rs.getString("course_name"));
            course.setDescription(rs.getString("course_description"));
            course.setFees(rs.getInt("fees"));
            course.setAdded_date(rs.getDate("added_date"));
            course.setModified_date(rs.getDate("modified_date"));
            course.setStatus(rs.getBoolean("status"));

        }
        return course;

    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Course course = null;
        String sql = "DELETE FROM courses WHERE course_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = stmt.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public List<Course> getAll() throws ClassNotFoundException, SQLException {
        List<Course> courseList=new ArrayList<>();
        String sql="SELECT *FROM courses";
        db.open();
        PreparedStatement stmt=db.initStatement(sql);
        ResultSet rs=stmt.executeQuery();
        while(rs.next()){
            Course c=new Course();
            c.setId(rs.getInt("course_id"));
            c.setName(rs.getString("course_name"));
            c.setDescription(rs.getString("course_description"));
            c.setAdded_date(rs.getDate("added_date"));
            c.setModified_date(rs.getDate("modified_date"));
            c.setStatus(rs.getBoolean("status"));
            courseList.add(c);
            
        }
        db.close();
        return courseList;
        
    }

}
