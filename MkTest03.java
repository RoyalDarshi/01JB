class MkTest03 
{
	static boolean reduceString(String str1,String str2){
		/* for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(str2.charAt(j)>=48&&str2.charAt(j)<=57){
					i=i+str2.charAt(j);
				}
				if(str1.charAr(i)!=str2.charAt(j){
					
				}
			}
		} */
		int i=0;
		int j=0;
		for(j=0;j<str2.length();j++){
			
			if(str2.charAt(j)>=48&&str2.charAt(j)<=57){
				i=i+((int)str2.charAt(j));
			}
			else if(str1.charAt(i)!=str2.charAt(j)){
					return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String str1="SHARPNER";
		String str2="S3P3R";
		System.out.println(reduceString(str1,str2));
	}
}
