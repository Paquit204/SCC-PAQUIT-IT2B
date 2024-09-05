 
package demoapps;

import java.util.Scanner;

public class grade {
    
     Scanner mark = new Scanner(System.in);
  
    
    String name;
    int id;
    
    double p,m,pf,f;
    
 public void AddGrade(String sname, int sid, double sp,double sm, double spf, double sf){
     this.name=name;
      this.id=id;
       this.p=sp;
        this.m=sm;
         this.pf=spf;
          this.f=sf;
     
 }public void viewGrades(){
     double total= this.p + this. m + this. pf + this. f;
     double average = total / 4;
     String remarks=(average > 3.0  )? "failed":  " passed ";
     
            System.out.println("%-10s | %-10d | %-10.2f | %-10.2f | %-10.2f | %-10.2f | % -10f",
                    this.name, this. id, this.p ,this. m, this.m, this.pf.this.f ,average, remarks);
            
 }

    void getgrades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
