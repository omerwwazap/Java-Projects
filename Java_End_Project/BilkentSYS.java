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
    public static ArrayList<Departments> admin= new ArrayList<Departments>();
    
    
    public static boolean addAcademicUnits(AcademicUnits au){
        for (int i = 0; i < academicUnits.size(); i++) {
            if (au.idNumber==academicUnits.get(i).getIdNumber()) {
                academicUnits.add(au);
                return true;
            }
        }
        return false;
    }
    public static boolean addAdmin(Departments au){
        for (int i = 0; i < admin.size(); i++) {
            if (au.getId()==admin.get(i).getId()) {
                admin.add(au);
                return true;
            }
        }
        return false;
    }
    
    public static String displayAdmin(){
        String output="";
        for (int i = 0; i < admin.size(); i++) {
            output+= admin.toString();
        }
        return output;
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
    public static Departments SearchAdmin(int id){
    
        for (int i = 0; i < admin.size(); i++) {
            if (id==admin.get(i).getId()) {
                return admin.get(i);
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
    public static Administration DeleteAdmin(int id){
    
        Administration temp=null;
        for (int i = 0; i < admin.size(); i++) {
            if (id==admin.get(i).getId()) {
                temp=admin.get(i);
                admin.remove(i);
            }
        }
        return temp;
    
    }
    /*  */
    /*  */
    /**/
//    public static Project searchprojects(int id) {
//        Students stu=null;
//        
//            for (int j = 0; j < Students.getNumberofStu(); j++) {
//                if (stu.checkProjcet(id)) {
//                    return stu.getProjcet(id);
//                }
//            }   
//        return null;
//    }
    
    
    
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

    public static ArrayList<Departments> getAdmin() {
        return admin;
    }
    
    
    
}
