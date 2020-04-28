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
public abstract class AcademicUnits  implements Binterface{
    
    protected String FullName;
    protected String deapertmentName;
    protected int idNumber;
    protected boolean isStu;
    Contact contact;
   

    public AcademicUnits(String FullName, String deapertmentName, int idNumber,Contact contact) {
        this.FullName = FullName;
        this.deapertmentName = deapertmentName;
        this.idNumber = idNumber;
        this.contact=contact;
     
    }

    public void setIsStu(boolean isStu) {
        this.isStu = isStu;
    }

    public String getFullName() {
        return FullName;
    }

    public String getDeapertmentName() {
        return deapertmentName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Name and Surname" + FullName + "Deapertment Name:" + deapertmentName + 
                "Id Number:" + idNumber;
    }
    
    
    
    
    
    
    
    
}
