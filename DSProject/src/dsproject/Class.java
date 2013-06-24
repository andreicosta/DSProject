/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class Class implements Cloneable
{
   private String id;
   private int schoolYear;
   private ArrayList<Student> students = new ArrayList<>();

   public Class(String id, int schoolYear)
   {
      this.id = id;
      this.schoolYear = schoolYear;
   }
   
   public void insertStudent(Student student)
   {
      this.students.add(student);
   }
   
   @Override
   public Class clone() throws CloneNotSupportedException
   {
      Class clone = (Class) super.clone();
      clone.students = new ArrayList<>(students);
      return clone;
   }

}
