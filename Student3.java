class Student3{  
   int id;  
   String name;  
     
   Student3(int i,String nm){  
   id = i;  
   name = nm;  
   }  
 void display (){System.out.println(id+" "+name);}  
  
 public static void main(String args[]){  
 Student3 s1 = new Student3(111,"Karan");  
 Student3 s2 = new Student3(222,"Aryan");  
   
 s1.display();  
 s2.display();  
 }  
}  