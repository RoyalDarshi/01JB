class StringArray {
	public static void main(String[] args) {
		String[] sa=new String[]{"Priyadarshi","Lalit","Sandeep","Rohit","Vaibhav","Imam","Raj","Rani"};
		System.out.println("======Static View======");
		for(int i=0;i<8;i++) {
			System.out.println(sa[i]);
		}
		System.out.println("======Dynamic View======");
		for(int i=0;i<sa.length;i++){
			System.out.println(sa[i]);
		}
		System.out.println("======Name In Upper Case======");
		for(int i=0;i<sa.length;i++) {
			System.out.println(sa[i].toUpperCase());
		}
		System.out.println("======Name Above Five Character======");
		for(int i=0;i<sa.length;i++) {
			if(sa[i].length()>5) {
				System.out.println(sa[i]);
			}
		}
	}
}
