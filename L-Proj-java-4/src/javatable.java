public class javatable {
	public static void main(String[] args) {
		System.out.println("==•œK==");
		int[] hai = new int[20];
		int sum = 0;
		int sumk = 0;
		int sumg = 0;
		
		for(int i = 0; i < hai.length; i++) {
			sum += 5;
			hai[i] += sum;
			
			if(hai[i] % 2 != 0) {
				System.out.println("”Ô† = " + i + " Šï”" + hai[i]);
				sumk += 1;
			}else if(hai[i] % 2 == 0) {
				System.out.println("”Ô† = " + i +" ‹ô”" + hai[i]);
				sumg += 1;
			}
			
			
		}
		
		System.out.println("‡Œv’l : " + "Šï” = " + sumk + " ‹ô” = "+ sumg);
	}

}
