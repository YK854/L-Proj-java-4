public class javatable {
	public static void main(String[] args) {
		System.out.println("==���K==");
		int[] hai = new int[20];
		int sum = 0;
		int sumk = 0;
		int sumg = 0;
		
		for(int i = 0; i < hai.length; i++) {
			sum += 5;
			hai[i] += sum;
			
			if(hai[i] % 2 != 0) {
				System.out.println("�ԍ� = " + i + " �" + hai[i]);
				sumk += 1;
			}else if(hai[i] % 2 == 0) {
				System.out.println("�ԍ� = " + i +" ����" + hai[i]);
				sumg += 1;
			}
			
			
		}
		
		System.out.println("���v�l : " + "� = " + sumk + " ���� = "+ sumg);
	}

}
