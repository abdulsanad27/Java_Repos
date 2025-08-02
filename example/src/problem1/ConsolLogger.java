package problem1;

 class ConsolLogger implements PaymentLogger {
	@Override
	public void log(UPI method, double amount) {
		System.out.println(method);
		System.out.println(amount);
		
	}
}
