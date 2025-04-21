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
    Scanner scn=new Scanner(System.in); 
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
         System.out.print("\nEnter Birth Registration No:");birth_reg_no=scn.nextLine();
          System.out.print("\nEnter NID:");nid=scn.nextLine();
           System.out.print("\nEnter PROFESSION:");profession=scn.nextLine();
            System.out.print("Enter CONATACT NO:");contact=scn.nextLine();
        
    }
    
     public void dispinfo()
    {
        System.out.println("NAME:"+ name);
         System.out.println("\nBIRTH REGISTRATION NO:"+ birth_reg_no);
          System.out.println("\nNID:"+ nid);
           System.out.println("\nPROFESSION:"+profession);
            System.out.println("\nCONTACT NO:"+contact);
        
    }
     public void provideINFO(){};
     public void displayINFO(){}; 
     public String returnDEPT(){return name;}
     public int returnROLL(){return 0;}
     public String returnSESSION(){return "A";}
     public String returnDESIGNATION(){return "A";}
     
}

class SUROKKHA implements Serializable
{
    public PERSON p;
    public String name,birth_reg_no,nid,profession,contact;
    public int doses;
    public String vaccine;
    SUROKKHA()
    {
        name="";
        birth_reg_no="";
        nid="";
        profession="";
        contact="";
        doses=0;
        vaccine="";
    }
    
    SUROKKHA(String n, String b_r_n,String nd,String prof,String cnt,int no)
    {
        name=n;
        birth_reg_no=b_r_n;
        nid=nd;
        profession=prof;
        contact=cnt;
        doses=no;
        vaccine="X";
    }
   
    
    public void DISP()
    {
        System.out.println("NAME:"+ name);
         System.out.println("BIRTH REGISTRATION NO:"+ birth_reg_no);
          System.out.println("NID:"+ nid);
           System.out.println("PROFESSION:"+profession);
            System.out.println("CONTACT NO:"+contact);
             System.out.println("VACCINE NAME: "+vaccine);
              System.out.println("DOSES: "+doses);
              System.out.println("\n\n");
    }
    
    public void update(int i)
    {   if(i%4==0)vaccine="Pfizer";
         else if(i%4==1)vaccine="Moderna";
         else if(i%4==2)vaccine="COVISHIELD(Astrageneca)";
         else if(i%4==3)vaccine="SINOPHARM";
        
        doses++;
    }
    
    public void PRINT_VACCINE_CARD()
    {
        System.out.println("\n\nName: "+name);
        System.out.println("\n");
        System.out.println("\n\nNID NO: "+nid);
        System.out.println("\n");
        System.out.println("\n              DOSE NO                 NAME OF VACCINE                 		STATUS\n");
        
        if(doses==0)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 		N/A\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 		N/A\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                 		N/A\n");
        }
        
        else if(doses==1)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 		OK\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 		N/A\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                 		N/A\n");
        }
        
        else if(doses==2)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 		OK\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 		OK\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                 		N/A\n");
        }
        
        else if(doses==3)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 		OK\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 		OK\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                     	OK\n");
        }
    }
    
    public String returnNID()
    {
        return nid;
    }
}



public class SUROKKHAtest {
    public static void main(String args[]) 
  
  {
 int no,i;   
try{
   
    File iff=new File("surokkha.data");
    FileInputStream fis=new FileInputStream(iff);
    ObjectInputStream ois=new ObjectInputStream(fis);
    SUROKKHA[] su=(SUROKKHA[]) ois.readObject();

for(i=0;;i++)
{
if(su[i]==null)break;
}
System.out.println(i);
no=i;

int j;
  
    for(j=0;j<i;j++)
    {su[j].DISP();}

     ois.close();
      
int choice;
     do{
System.out.println("Enter 1 to Perform Registration");
System.out.println("Enter 2 to Update Status");
System.out.println("Enter 3 to print Vaccine Card");
System.out.println("Enter 4 to exit");
 System.out.print("Enter your choice: ");

 
Scanner scn=new Scanner(System.in);
choice=scn.nextInt();
 
 if(choice==1)
 { String nm,nd, b_r_no,prof,cnt,chc;
 System.out.print("Enter Name:");nm=scn.next();
 System.out.print("Enter Birth Registration No:");b_r_no=scn.next();
 System.out.print("Enter NID:");nd=scn.next();
 System.out.print("Enter Profession:");prof=scn.next();
 System.out.print("Enter Contact NO:");cnt=scn.next();

 su[i]=new SUROKKHA(nm,b_r_no,nd,prof,cnt,0);
 i++;
 }

else if(choice==2)
{ int f=0;
  System.out.print("Enter NID:");
  String ns;
  ns=scn.next();
 for(j=0;j<i;j++)
 {
 if(ns.equals(su[j].returnNID())==true){f=1;if(su[j].doses==0 ||su[j].doses==1 ||su[j].doses==2) su[j].update(j);
 else  System.out.println(" ALL THE DOSES OF VACCINATION COMPLETED\n");}
 }
}
else if(choice==3)
{ String nd;
  int f=0;
do{
 System.out.print("Enter NID:");nd=scn.next();
 for(j=0;j<i;j++)
 {
//string1.equals(string2)
 if(nd.equals(su[j].returnNID())==true)
 {f=1;
 su[j].PRINT_VACCINE_CARD();
 }
 if(f==1)break;
 }
 if(f==1){System.out.println("\n");break;}
 else System.out.println("\n----Enter Correct NID!------\n"); 

}while(f==0);

}
else if(choice==4)break;
}while(choice!=4);

     File of=new File("surokkha.data");
     FileOutputStream fos=new FileOutputStream(of);
     ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(su);
     oos.close();

    
  
}catch( Exception ex)
{ex.printStackTrace();
}

    

   }
    
}

