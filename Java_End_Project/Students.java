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
    private static int numberofStu=0;
    Project project ;

    public Project getProject() {
        return project;
    }
    public static int getNumberofStu() {
        return numberofStu;
    }

    @Override
    public void ShowSystemRegistrationDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2018/12/12 12:08:43
    }

    public Students(double cgpa, String FullName, String deapertmentName, int idNumber, Contact contact,Project project) {
        super(FullName, deapertmentName, idNumber, contact);
        this.cgpa = cgpa;
        numberofStu++;
        super.setIsStu(true);
        this.project=project;
    }

    @Override
    public String toString() {
        String str = "\nProjects: ";

        return "Students:" + "\nCgpa:" + cgpa + "\nCourses=" + "courses" + "\nGraduation Year:" + "gradyear" + str;
    }

    
}
