/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

import java.io.Serializable;

/**
 *
 * @author vinicius
 */
public abstract class People implements Serializable
{
   private String name;
   private java.util.Date dateOfBirth;
   private String gender;
   private String address;
   private String city;
   private String state;

   public People(String name, java.util.Date dateOfBirth, String gender, String address, String city, 
                 String state)
   {
      this.name = name;
      this.dateOfBirth = dateOfBirth;
      this.gender = gender;
      this.address = address;
      this.city = city;
      this.state = state;
   }

   public String getName()
   {
      return name;
   }
   
   public java.util.Date getDateOfBirth()
   {
      return dateOfBirth;
   }

   public String getAddress()
   {
      return address;
   }

   public String getGender()
   {
      return gender;
   }

   public String getCity()
   {
      return city;
   }

   public String getState()
   {
      return state;
   }
}
