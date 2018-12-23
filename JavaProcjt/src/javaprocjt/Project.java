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

public class Project{
    
    private String title;
    private String field;
    private int owner;
    private String Shortdesc;
    private boolean needhelp;

    public Project(String title, String field, int owner, String Shortdesc, boolean needhelp) {
        this.title = title;
        this.field = field;
        this.owner = owner;
        this.Shortdesc = Shortdesc;
        this.needhelp = needhelp;
    }

    @Override
    public String toString() {
        return "Project{" + "title=" + title + ", field=" + field + 
                ", owner=" + owner + ", Shortdesc=" + Shortdesc + 
                ", needhelp=" + needhelp + '}';
    }

    public boolean gethelp() {
        return needhelp;
    }
    
    public String getTitle() {
        return title;
    }

    public String getField() {
        return field;
    }

    public int getOwner() {
        return owner;
    }

    public String getShortdesc() {
        return Shortdesc;
    }

}
