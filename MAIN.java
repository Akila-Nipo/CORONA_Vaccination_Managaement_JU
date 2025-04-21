import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PERSON implements Serializable
{   private static final long serialVersionUID = 6151344065950166181L;
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
     
     
}

class SUROKKHA implements Serializable
{   private static final long serialVersionUID = -7363999143541094937L;
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
         else if(i%4==2)vaccine="COVISHIELD((Astrageneca)";
         else if(i%4==3)vaccine="SINOPHARM"; 
         doses++;
    }
    
    public void PRINT_VACCINE_CARD()
    {
        System.out.println("\n\nName: "+name);
        System.out.println("\n");
        System.out.println("\n\nNID NO: "+nid);
        System.out.println("\n");
        System.out.println("\n              DOSE NO                 NAME OF VACCINE                 STATUS\n");
        
        if(doses==0)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 N/A\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 N/A\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                 N/A\n");
        }
        
        else if(doses==1)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 OK\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 N/A\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                 N/A\n");
        }
        
        else if(doses==2)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 OK\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 OK\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                 N/A\n");
        }
        
        else if(doses==3)
        {
            System.out.println("\n              DOSE-1                "+(vaccine)+"                 OK\n");
            System.out.println("\n              DOSE-2                "+(vaccine)+"                 OK\n");
            System.out.println("\n              DOSE-3                "+(vaccine)+"                 OK\n");
        }
    }
    
  
}

class STUDENT extends PERSON 
{   private static final long serialVersionUID = -5965383080014580260L;
    public String dept,session;
    public int roll;
   
    
    public STUDENT()
    {
        dept="";
        session="";
        roll=0;
    }
    
    public STUDENT(String d,String ss,int r)
    {
        dept=d;
        session=ss;
        roll=r;
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

class teacherVECTOR 
{

public String name,designation,session,vaccine;
public int dose,roll;
 
public void setteacher(String n, String de,String v,
                               int d)
    {
        name = n;
        designation = de;
        vaccine=v;
        dose = d;
    }
  public void setstudent(String n, String de,String v,int r,
                               int d)
    {
        name = n;
        session = de;
        vaccine=v;
        roll=r;
        dose= d;
    }
   public void prn()
    {
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
       System.out.println("Doses: "+dose);
    }

}




 class MAIN {
    public static void main(String[] args) 
  
  {
      int sn,tn,stn,i,j;   
try{

   //STUDENTS' FILE READING
    File iff1=new File("studentsfile.data");
    FileInputStream fis1=new FileInputStream(iff1);
    ObjectInputStream ois1=new ObjectInputStream(fis1);
    STUDENT[] st=(STUDENT[]) ois1.readObject();

   for(i=0;;i++)
   {
    if(st[i]==null)break;
    }
   
   stn=i;
   System.out.println("\nTOTAL STUDENTS' RECORDS: "+i);

  
    for(j=0;j<stn;j++)
    {st[j].displayINFO();}
     ois1.close(); 
   
//STUDENTS' FILE READING DONE

//TEACHERS' FILE READING

    File iff2=new File("teachersfile.data");
    FileInputStream fis2=new FileInputStream(iff2);
    ObjectInputStream ois2=new ObjectInputStream(fis2);
    TEACHER[] te=(TEACHER[]) ois2.readObject();

for(i=0;;i++)
{
if(te[i]==null)break;
}
System.out.println("\nTOTAL TEACHERS' RECORDS: "+i);
tn=i;


  
    for(j=0;j<tn;j++)
    {te[j].displayINFO();}

ois2.close();

//TEACHERS' FILE READING DONE

//SUROKKHA FILE READING

    File iff3=new File("surokkha.data");
    FileInputStream fis3=new FileInputStream(iff3);
    ObjectInputStream ois3=new ObjectInputStream(fis3);
    SUROKKHA[] su=(SUROKKHA[]) ois3.readObject();

for(i=0;;i++)
{
if(su[i]==null)break;
}

sn=i;
System.out.println("SUROKKHA ACCOUNTS: "+i);

  
for(j=0;j<sn;j++)
    {su[j].DISP();}

     ois3.close();
     
     
     
     
//SUROKKHA FILE READING DONE

 
 int choice;
 
do
{
 System.out.println("\t ## Enter 1 to OPEN_ACCOUNT\n");  
 System.out.println("\t ## Enter 2 to CHECK RECORDS \n"); 
 System.out.println("\t ## Enter 3 to CHECK DEPARTMENT-WISE STATUS\n");  
 System.out.println("\t ## Enter 4 to EXIT\n");
 System.out.print("\n\t ## Enter your choice:");  
Scanner scn=new Scanner(System.in);
choice=scn.nextInt();

 if(choice==1)
 {
 int ch;
 System.out.println("\n\tEnter 1 if you are a student\n\tEnter 2 if you are a teacher\n");
 System.out.print("Enter your choice:");
 ch=scn.nextInt();
 if(ch==1)
 {
 st[stn]=new STUDENT();st[stn].provideINFO();
 //public String name,birth_reg_no,nid,profession,contact;
 su[sn]=new SUROKKHA(st[stn].name,st[stn].birth_reg_no,st[stn].nid,st[stn].profession,st[stn].contact,0);
 sn++;stn++;
 System.out.println("\n\tYOU ARE SUCCESSFULLY REGISTERED FOR VACCINATION ! ! !\n\n");
 
 }
 
 else if(ch==2)
 {
 te[tn]=new TEACHER();
 te[tn].provideINFO();
 int chc;
 su[sn]=new SUROKKHA(te[tn].name,te[tn].birth_reg_no,te[tn].nid,te[tn].profession,te[tn].contact,0); 
 tn++;sn++;
 System.out.println("\n\tYOU ARE SUCCESSFULLY REGISTERED FOR VACCINATION ! ! !\n\n");
 
 }
 }
 else if(choice==2)
 { System.out.println("\n\nSTUDENTS:");
  
 for(int l=0;l<stn;l++)
 {
 st[l].displayINFO();
 }
 System.out.println("\n\nTEACHERS:");
 for(int l=0;l<tn;l++)
 {
 te[l].displayINFO();
 }
 }
 else if(choice==3)
 {  teacherVECTOR[] ar=new teacherVECTOR[500];
    teacherVECTOR[] ar1=new teacherVECTOR[500];
   String dep;
   Scanner sc1=new Scanner(System.in);
   System.out.print("\n\nEnter DEPARTMENT:");dep=sc1.next();

 // ArrayList<teacherVECTOR> ar1 = new ArrayList<teacherVECTOR>();

int cnt=0,cnt1=0,cnt2=0;
 for(int l=0;l<tn;l++)
 {
 if(te[l].dept.equals(dep)==true)
{

for(int k=0;k<sn;k++)
{
if(te[l].nid.equals(su[k].nid)==true)
{
String n1=te[l].name,d1=te[l].designation,v1=su[k].vaccine;int ds=su[k].doses;
ar[cnt]=new teacherVECTOR();
ar[cnt].setteacher(n1,d1,v1,ds);
cnt++;
}
}
}
}
///*
for(int l=0;l<stn;l++)
 {
 if(st[l].dept.equals(dep)==true )
{
for(int k=0;k<sn;k++)
{
if(st[l].nid.equals(su[k].nid)==true)
{
String n1=st[l].name,d1=st[l].session,v1=su[k].vaccine;int ds=su[k].doses,r1=st[l].roll;
ar1[cnt1]=new teacherVECTOR();
ar1[cnt1].setstudent(n1,d1,v1,r1,ds);
cnt1++;
}
}
}

//*/
 }

System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------\n"); 
 System.out.println("\nNAME							VACCINE						DOSES TAKEN\n");
System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------\n");
for(int m=0;m<cnt;m++)
{
System.out.println(""+ar[m].name+"					"+ar[m].vaccine+"						"+ar[m].dose);

}
System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------\n"); 
String se;

/*
///*
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------"); 
System.out.println("\n		ROLL					NAME										VACCINE						DOSES TAKEN\n");
System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
for(int m=0;m<cnt1;m++)
{
//System.out.println("				"+ar[m].roll+"					"+ar1[m].name+"		"+ar1[m].vaccine+"				"+ar1[m].dose+"\n\n");
System.out.println("		"+ar1[m].roll+"					"+ar1[m].name+"		"+ar1[m].vaccine+"						"+ar1[m].dose+"\n");
}
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------\n"); 
  //
*/





int c1=1;
do{
Scanner sc11=new Scanner(System.in);
System.out.print("-------------------- STUDENTS--------------------\n");
System.out.print("Enter session: ");String ss;ss=sc11.next();
teacherVECTOR[] ar2=new teacherVECTOR[500];
for(int m=0;m<cnt1;m++)
{
if(ar1[m].session.equals(ss)==true)
{
String n1=ar1[m].name,d1=ar1[m].session,v1=ar1[m].vaccine;int ds=ar1[m].dose,r1=ar1[m].roll;
ar2[cnt2]=new teacherVECTOR();
ar2[cnt2].setstudent(n1,d1,v1,r1,ds);

cnt2++;
}
}
//print rollwise
if(cnt2>1){for(int mm=0;mm<cnt2;mm++)
{
for(int k=0;k<cnt2-mm-1;k++)
{
if(ar2[k].roll>ar2[k+1].roll)
{
teacherVECTOR tmp=new teacherVECTOR();
tmp=ar2[k];ar2[k]=ar2[k+1];ar2[k+1]=tmp;
}
}
}
}
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------\n"); 
System.out.println("\n		ROLL					NAME						VACCINE				DOSES TAKEN\n");
System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
for( int mmm=0;mmm<cnt2;mmm++)
{
//System.out.println("				"+ar[mmm].roll+"					"+ar1[mmm].name+"				"+ar1[mmm].vaccine+"				"+ar1[mmm2].dose+"\n\n");
System.out.println("		"+ar2[mmm].roll+"					"+ar2[mmm].name+"						"+ar2[mmm].vaccine+"					"+ar2[mmm].dose+"\n");
}
System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------\n");
System.out.println("\n\tPress 1 to continue\n\tPress 2 to go back\n\n");
System.out.print("Enter your choice:");c1=sc1.nextInt();
if(c1==2)break;


}while(c1!=2);

}

 else if(choice==4){break;}
}while(choice!=4);

//outputfiles
     
    File of1=new File("studentsfile.data");
    FileOutputStream fos1=new FileOutputStream(of1);
    ObjectOutputStream oos1=new ObjectOutputStream(fos1);
    oos1.writeObject(st);
    oos1.close();
    
     
    File of2=new File("teachersfile.data");
    FileOutputStream fos2=new FileOutputStream(of2);
    ObjectOutputStream oos2=new ObjectOutputStream(fos2);
    oos2.writeObject(te);
    oos2.close();
    
     File of3=new File("surokkha.data");
     FileOutputStream fos3=new FileOutputStream(of3);
     ObjectOutputStream oos3=new ObjectOutputStream(fos3);
     oos3.writeObject(su);
     oos3.close();
  
 
 
}catch( Exception e)
{e.printStackTrace();
}


   }
    
}





