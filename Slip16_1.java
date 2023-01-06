interface Square { 
 int calculate(int x); 
} 
class Slip16_1 { 
 public static void main(String args[]) 
 { 
 //you can read value from user 
 int a = 6; 
 Square s = (int x) -> x * x; 
 int ans = s.calculate(a); 
 System.out.println(ans); 
 } 
}