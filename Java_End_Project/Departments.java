/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Levent Durdali
 * @author Tunjay Taghiyev
 */

public class Departments extends Administration{
    private String postion;
    

    public Departments(int id, String FullName, int appointyear,String postion) {
        super(id, FullName, appointyear);
        this.postion=postion;
    }
     public void ShowSystemRegistrationDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2018/12/12 12:08:43
    }
    
    @Override
    public String toString() {
        return "Department "+"Position "+postion;
    }

    public String getPostion() {
        return postion;
    }

    
    public int getYear() {
        return super.getAppointyear();
    }

   

    
    
}
