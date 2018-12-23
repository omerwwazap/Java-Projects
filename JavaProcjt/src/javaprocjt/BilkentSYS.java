/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

import java.util.ArrayList;

/**
 *
 * @author Levent Durdali
 * @author Tunjay Taghiyev
 */
public class BilkentSYS {
    
    public static ArrayList<AcademicUnits> academicUnits =new ArrayList<AcademicUnits>() ;
    
    public static boolean addAcademicUnits(AcademicUnits au){
        for (int i = 0; i < academicUnits.size(); i++) {
            if (au.idNumber==academicUnits.get(i).getIdNumber()) {
                academicUnits.add(au);
                return true;
            }
        }
        return false;
    }
    
    public static String displayAcademicUnits(){
        String output="";
        for (int i = 0; i < academicUnits.size(); i++) {
            output+= academicUnits.toString();
        }
        return output;
    }
    
    
    
    public static AcademicUnits SearchUnits(int id){
    
        for (int i = 0; i < academicUnits.size(); i++) {
            if (id==academicUnits.get(i).idNumber) {
                return academicUnits.get(i);
            }
        }return null;
    }
    
    
    
    public static AcademicUnits DeleteUnits(int id){
    
        AcademicUnits temp=null;
        for (int i = 0; i < academicUnits.size(); i++) {
            if (id==academicUnits.get(i).idNumber) {
                temp=academicUnits.get(i);
                academicUnits.remove(i);
            }
        }
        return temp;
    
    }
    /*  */
    /*  */
    /**/
    public static Project searchprojects(int id) {
        Students stu=null;
        
            for (int j = 0; j < Students.getNumberofStu(); j++) {
                if (stu.checkProjcet(id)) {
                    return stu.getProjcet(id);
                }
            }   
        return null;
    }
    public static Contact searchContact(int id) {
        Students stu=null;
        
            for (int j = 0; j < stu.getContact().size(); j++) {
                if (stu.getContact(j).getId()==id) {
                    return stu.getContact(j);
                }
            }   
        return null;
    }
    
    
    
    public static boolean checkRedundancy(int id) {
         for (int i = 0; i < academicUnits.size(); i++) {
            if (id==academicUnits.get(i).idNumber) {
                return true;
            }
        }return false;
    }
    
    public static ArrayList<AcademicUnits> getStudents() {
        return academicUnits;
    }

    public static ArrayList<AcademicUnits> getAcademicUnits() {
        return academicUnits;
    }
    
    
    
}
