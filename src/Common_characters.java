public class Common_characters {
	public static void main(String[] args) {
		String str1="Dhivyu";
		String str2="Vaishu";
		String str3="Rasu";
		String common="";
		for(char c:str1.toCharArray()) {
			if((str1.indexOf(c) != -1) && (str2.indexOf(c) != -1) && (str3.indexOf(c) != -1)) {
				common=common+c;
			}
		}
		System.out.println("Common letters : "+common);
		
	}

}
