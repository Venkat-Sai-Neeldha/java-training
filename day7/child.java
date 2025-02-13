/**
 * @author venkat
 * @apiNote this is a program to implement child class
 * 
 * 
 * 
 * **/
	class inheritance {
		   
		public void display() {
			System.out.println("this is a parentr class method");
		}
		}

		 class child extends inheritance{
			
			public void method() {
				System.out.println("this is a child class method");
			}
			public static void main(String[] args) {
				child obj=new child();
				obj.display();   //calling a parent method
			    obj.method();    //calling a child method
			}
			
		}
