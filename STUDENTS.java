import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PERSON implements Serializable
{
    public String name,birth_reg_no,nid,profession,contact;
    transient Scanner scn=new Scanner(System.in); 
    public PERSON()
    {
        name="";
        birth_reg_no="";
        nid="";
        profession="";
        contact="";
                    
    }
    public PERSON(String n, String b_r_n,String nd,String prof,String cnt)
    {
        name=n;
        birth_reg_no=b_r_n;
        nid=nd;
        profession=prof;
        contact=cnt;
        
               
    }
    
    public void setinfo()
    {
        System.out.print("Enter NAME:");name=scn.nextLine();
         System.out.print("Enter Birth Registration No:");birth_reg_no=scn.nextLine();
          System.out.print("Enter NID:");nid=scn.nextLine();
           System.out.print("Enter PROFESSION:");profession=scn.nextLine();
            System.out.print("Enter CONTACT NO:");contact=scn.nextLine();
        
    }
    
     public void dispinfo()
    {
        System.out.println("NAME:"+ name);
         System.out.println("BIRTH REGISTRATION NO:"+ birth_reg_no);
          System.out.println("NID:"+ nid);
           System.out.println("PROFESSION:"+profession);
            System.out.println("CONTACT NO:"+contact);
        
    }
     public void provideINFO(){};
     public void displayINFO(){}; 
     public String returnDEPT(){return name;}
     public int returnROLL(){return 0;}
     public String returnSESSION(){return "A";}
     public String returnDESIGNATION(){return "A";}
     
}

class STUDENT extends PERSON 
{
    public String dept,session;
    public int roll;
   
    
    public STUDENT()
    {
        dept="";
        session="";
        roll=0;
    }
    
    public STUDENT(String d,String ss,String rr,int r)
    {
        dept="";
        session="";
        roll=0;
    }
    
    public void provideINFO()
    {
        super.setinfo();
        System.out.print("Enter DEPARTMENT:");dept=scn.nextLine();
        System.out.print("Enter SESSION:");session=scn.nextLine();
        System.out.print("Enter ROLL:");roll=scn.nextInt();
        
        
    }
    
    public void displayINFO()
    {   System.out.println("\n\n");
        super.dispinfo();
        System.out.println("DEPARTMENT:"+dept);
        System.out.println("SESSION:"+session);
        System.out.println("ROLL:"+roll);
        System.out.print("\n\n");
        
        
    }
  
}

class TEACHER extends PERSON 
{
    public String dept,designation;
    
   transient Scanner scn=new Scanner(System.in);
    
    public TEACHER()
    {
        dept="";
        designation="";
        
    }
    
    public TEACHER(String d,String des)
    {
        dept=d;
        designation=des;
        
    }
    
    public void provideINFO()
    {
        super.setinfo();
        System.out.print("Enter DEPARTMENT:");dept=scn.nextLine();
        System.out.print("Enter DESIGNATION:");designation=scn.nextLine();
        
          
        
    }
    
    public void displayINFO()
    {   System.out.println("\n\n");
        super.dispinfo();
        System.out.println("DEPARTMENT:"+dept);
        System.out.println("DESIGNATION:"+designation);
        System.out.println("\n\n");     
        
    }
   
}




public class STUDENTS {
    public static void main(String args[]) 
  
  {
      int no,i,j;   
try{

   File iff=new File("studentsfile.data");
    FileInputStream fis=new FileInputStream(iff);
    ObjectInputStream ois=new ObjectInputStream(fis);
    STUDENT[] st=(STUDENT[]) ois.readObject();

for(i=0;;i++)
{
if(st[i]==null)break;
}
System.out.println(i);
no=i;
System.out.println(i);

  
for(j=0;j<i;j++)
    {st[j].displayINFO();}

    ois.close(); 
    File of=new File("studentsfile.data");
    FileOutputStream fos=new FileOutputStream(of);
    ObjectOutputStream oos=new ObjectOutputStream(fos);
   // STUDENT[] st=new STUDENT[100];
   // st[0]=new STUDENT();st[0].provideINFO();
    oos.writeObject(st);
    oos.close();

 
 

 
}catch( Exception e)
{e.printStackTrace();
}


   }
    
}

