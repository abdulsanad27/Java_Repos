package learn;

 class getset2 {
	 		int page;
	 		void print(int a) {
	 			if(a<0) {
	 				System.out.println("error");
	 			}
	 			else {
	 				page=a;
	 			}
	 		}
	 		int p() {
	 			return page;
	 		}
	 		
	
}
public class getset{
	public static void main(String[] args) {
		getset2 gt = new getset2();
			gt.print(-5);
			int result=gt.p();
			System.out.println(result);
	}
}
