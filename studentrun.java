/////B DIVYA 1BM26CS415-T/////////

import java.util.Scanner;
class student{
String name;
String usn;
void accept(){
 Scanner s=new Scanner(System.in);
 System.out.println("enter name");
 name=s.nextLine();
  System.out.println("enter USN");
 usn=s.nextLine();
 }
 void display(){
 System.out.println("the student name is:"+name);
 System.out.println("the student usn is"+usn);
 }
 }
 public class studentrun{
 public static void main (String args[]){
 Scanner s1=new Scanner(System.in);
     System.out.println("enetr the no of Students:");
 int n=s1.nextInt();
  student s[]=new student[n];
  for(int i=0;i<n;i++){
  s[i]=new student();
  s[i].accept();
 
  
  }
    System.out.println("the student details are:");
  for(int i=0;i<n;i++){
 
     s[i].display();
   

  }
  }
  }


///////////OUTPUT///////////////

enetr the no of Students:
4
enter name
Divya
enter USN
cs01
enter name
Bhavana
enter USN
Cs02
enter name
Varshini
enter USN
Cs03
enter name
Bhoomika
enter USN
Cs04
the student details are:
the student name is:Divya
the student usn iscs01
the student name is:Bhavana
the student usn isCs02
the student name is:Varshini
the student usn isCs03
the student name is:Bhoomika
the student usn isCs04

  
 
 