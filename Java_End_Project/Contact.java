/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

/**
 *
 * @author Levent Durdali
 * @author Tunjay Taghiyev
 */

public class Contact {
    
    private String email;
    private boolean isStudent;
    private String officeNumber;
    private int id;

    public Contact(int id,String email,boolean isStudent, String officeNumber) {
        this.id=id;
        this.email = email;
        this.isStudent = isStudent;
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        if (isStudent) {
            return "Contact{" + "email=" + email ;
        }
        else {
        return "Contact{" + "email=" + email + 
                    "OfficeNumber=" + officeNumber + '}';
        }
        
    }

    public String getEmail() {
        return email;
    }

    public boolean isIsStudent() {
        return isStudent;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public void setId(int id) {
        this.id = id;
    }
    
         
    
    
}
