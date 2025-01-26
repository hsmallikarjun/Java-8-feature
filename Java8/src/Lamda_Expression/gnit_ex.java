package Lamda_Expression;


@FunctionalInterface
 interface gmit {
	
void show();
//		void show1(); //CTE
	}

		

public class gnit_ex implements gmit{
	@Override
	public void show() {
System.out.println("welcome to gmit");			
	}
		public static void main(String...k) {
		
		gmit i=new gnit_ex();
		i.show();
		gmit g =()->System.out.println("welcome");
		g.show();
			
		}

		
	}

