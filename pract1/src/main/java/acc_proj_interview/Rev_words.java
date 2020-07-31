package acc_proj_interview;

public class Rev_words {
	//Reverse each word’s characters but the position of word in string remain unchanged.

	public static void rev() {
		String original="ar koto kal aka thakbo";
		//expected o/p=ra otok lak aka obkaht
		String words[] = original.split("\\s");
		System.out.println(words.length);
		String reversed = "";
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			String reverseWord = "";
			System.out.println(word.length());
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversed = reversed + reverseWord + " ";
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rev();
		
		String ori="My name is joydeep";
		String[] split=ori.split("\\s");
		System.out.println(split.length);
		String rev="";
		for(int i=0;i<split.length;i++) {
			String words=split[i];
			String revword="";
			for(int j=words.length()-1;j>=0;j--) {
				revword=revword+words.charAt(j);
			}
			rev=rev+revword+" ";
			
			}
		System.out.print(rev);
		}
}
