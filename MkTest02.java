class MkTest02 
{
	static int maxWord(String[] str){
		int max=0;
		for(int i=0;i<str.length;i++){
			int count=0;
			for(int j=0;j<str[i].length();j++){
				if(str[i].charAt(j)==' '){
					count++;
				}
			}
			if(count+1>max){
				max=count+1;
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		String[] str={"Two men on the road in day","ont two three","Student in the school"};
		System.out.println(maxWord(str));
	}
}
