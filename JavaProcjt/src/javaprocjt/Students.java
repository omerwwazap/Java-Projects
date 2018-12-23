/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Levent Durdali
 * @author Tunjay Taghiyev
 */
public class Students extends AcademicUnits{
    
    private double cgpa;
   // private String courses;
   // private int gradyear;
    private static int numberofStu=0;
    private ArrayList<Project> project = new ArrayList<>();
    private ArrayList<Contact> contact = new ArrayList<>();
    
    
    public static int getNumberofStu() {
        return numberofStu;
    }

    @Override
    public void ShowSystemRegistrationDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2018/12/12 12:08:43
    }
    
    public Students(double cgpa, String courses, int gradyear, String FullName, String deapertmentName, int idNumber) {
        super(FullName, deapertmentName, idNumber);
        this.cgpa = cgpa;
        //this.courses = courses;
        //this.gradyear = gradyear;
        numberofStu++;
    }

    
    
    public boolean checkProjcet(int code) {
        int j;
        int tcode;
        Project tmp;
        for (j = 0; j < project.size(); j++) {
            tmp = (Project) project.get(j);
            tcode = tmp.getOwner();
            if (code==tcode) {
                return true;
            }
        }
        return false;
    }
    
      public Project getProjcet(int code) {
        Project tmp;
        for (int j = 0; j < project.size(); j++) {
            tmp = (Project) project.get(j);
            int tcode = tmp.getOwner();
            if (code==tcode) {
                return project.get(j);
            }
        }
        return null;
    }
      
      public Contact getContact(int code) {
        Contact tmp;
        for (int j = 0; j < contact.size(); j++) {
            tmp = (Contact) contact.get(j);
            int tcode = tmp.getId();
            if (code==tcode) {
                return contact.get(j);
            }
        }
        return null;
    }
     
    @Override
    public String toString() {
        String str = "\nProjects: ";
        
        for (int i = 0; i < project.size(); i++) {
            str += project.get(i);
        }
        
        return "Students:" + "\nCgpa:" + cgpa + "\nCourses=" + "courses" + "\nGraduation Year:" + "gradyear" + str;
    }

    public ArrayList<Project> getProject() {
        return project;
    }

     public void addProject(Project c) {
        project.add(c);
    }

    public ArrayList<Contact> getContact() {
        return contact;
    }
    
    
    

    
    
    
    
}
