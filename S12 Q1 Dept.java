import java.util.*; 
class college 
{ 
 int no; 
 String name; 
 String addr;
} 
class Dept extends college 
{ 
 int dno; 
 String dname; 
 Scanner sc = new Scanner(System.in); 
 public void accept() 
 { 
 System.out.println("enter no"); 
 no=sc.nextInt(); 
 System.out.println("enter name"); 
 name=sc.next(); 
 System.out.println("enter college address"); 
 addr=sc.next(); 
 System.out.println("enter depatrment no"); 
 dno=sc.nextInt(); 
 System.out.println("enter department name"); 
 dname=sc.next(); 
 } 
 public void display() 
 { 
 System.out.println("college no"+no); 
 System.out.println("college name"+name); 
 System.out.println("college address"+addr); 
 System.out.println("department number"+dno); 
 System.out.println("department number"+dname); 
 } 
 public static void main(String a[]) 
 { 
 Dept ob=new Dept(); 
 ob.accept(); 
 ob.display();
}
}