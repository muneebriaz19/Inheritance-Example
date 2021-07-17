/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.example;

import java.util.Scanner;

/**
 *
 * @author Muneeb Riaz
 */
class Person
{
    private String name;
    private String address;
    Person( String n,String add){
        name=n;
        address=add;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String add)
    {
        address=add;
    }
    public String tostring()
    {
        return "Person Name"+name+"and Address" +address;
    }
    Person(){}
}
class Student extends Person 
{
    private String program;
    private int year;
    private double fee;
    Student(String name,String address,String program,int year,double fee)
    {
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
        
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program)
    {
        this.program=program;
    }
    public int getyear()
    {
        return year;
    }
    public void setyear(int year)
    {
        this.year=year;
        
    }
    public double getfee()
    {
        return fee;
    }
    public void setfee(double fee)
    {
        this.fee=fee;
    }
    @Override
    public String tostring()
    {
        return "Student"+super.toString()+"Program"+program+"year"+year+"fee"+fee;
    }
}
class Staff extends Person
{
    private String school;
    private double pay;
    Staff(String name,String address,String school,double pay)
    {
        super(name,address);
        this.school=school;
        this.pay=pay;
    }
    public String getschool()
    {
        return school;
    }
    public void setschool(String school)
    {
        
        this.school=school;
    }
    public double getpay()
    {
        return pay;
    }
    public void setpay(double pay)
    {
        this.pay=pay;
    }
    public String tostring()
    {
        return "Staff"+super.tostring()+"school"+school+"pay"+pay;
    }
    
}
    
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Student[] stu = new Student[5];
        Staff[] stf = new Staff[5]; 
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b = 0;
        int num = 0;
        while(num !=7)
        {
        System.out.println("Press 1 for student object" +"\n"
                +          "Press 2 for staff object" +"\n"
                +          "Press 3 for student display" +"\n"
                +          "Press 4 for staff display" +"\n"
                +          "Press 5 for student searching" +"\n"
                +          "Press 6 for staff searching" +"\n"
                +          "Press 7 to end program");
        
        
        System.out.println("Enter The Number:");
         num =sc.nextInt();
         sc.nextLine();
        if(num==1){
            System.out.println("how many student data you want to enter");
            int stunum = sc.nextInt();
            sc.nextLine();
                    
            
            
        for(int i=a;i<stu.length;i++)
        
        {
             if(i==stunum)
            {
                a =i;
                break;
            }
            System.out.println("Enter your name:");
            String name= sc.nextLine();
            System.out.println("Enter your address:");
            String address = sc.nextLine();
            System.out.println("Enter your Program:");
            String program = sc.nextLine();
            System.out.println("Enter your Year:");
            int year = sc.nextInt();
            System.out.println("Enter your Fee:");
            double fee = sc.nextDouble();
            stu[i]= new Student(name,address,program,year,fee);
            //sc.next();
            sc.nextLine();
           
        }
            System.out.println("Your data of"+ stunum +"students have been saved successfully");
        }
        if (num==2)
        {
            
            System.out.println("how many staff data you want to enter");
            int stfnum = sc.nextInt();
            for (int i = b; i < stf.length; i++)
            {
                if(i==stfnum)
            {
                b=i;
                break;
            }
            System.out.println("Enter your name:");
            String name= sc.nextLine();
            System.out.println("Enter your address:");
            String address = sc.nextLine();
            System.out.println("Enter your School:");
            String school = sc.nextLine();
            System.out.println("Enter your pay:");
            double pay = sc.nextDouble();
            stf[i]= new Staff(name,address,school,pay);
            sc.nextLine();
            
            }
            System.out.println("Your data of"+ stfnum +"staff have been saved successfully");
        } 

        if(num ==5)
        {

        System.out.println("Enter the student name index you want to search:");
        String stuname = sc.next();
        int d=0;
        for (int i = 0; i < stu.length; i++)
        {
         if (stuname.equals(stu[i].getName()))
         {
            System.out.println(i);
            d++;
            break;
         }
        }
         if(d==0)
         {
            System.out.println("Your name is not present in data"); 
           
        }
            
        }
        if(num ==6)
        {

        System.out.println("Enter the staff name index you want to search:");
        String stfname = sc.next();
        
        int c =0 ;
        for (int i = 0; i < stf.length; i++)
        {
         if (stfname.equals(stf[i].getName()))
         {
            System.out.println(i);
            c++;
            break;
         }
        }
        
         if(c==0)
         {
            System.out.println("Your name is not present in data"); 
            
            
        }
            
        }
        if (num ==3)
        {
            for (int i = 0; i < stu.length; i++) {
                System.out.println(stu[i].tostring());
            }
            
        }
        if (num ==4)
        {
            for (int i = 0; i < stf.length; i++) {
                System.out.println(stf[i]);
            }
            
        }
        if (num==7)
        {
            System.exit(0);
        }
        if(num>7)
        {
            System.out.println("Please enter the number between");
        }
    }
    }
}
