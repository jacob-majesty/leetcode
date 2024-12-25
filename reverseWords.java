public static String reverseWords(String s) {

	char[] chars = s.toCharArray();
	int n = chars.length;

	// Step 1: Reverse the entire string
	reverse(chars, 0, n - 1);

	// Step 2: Reverse each word in the reversed string
	int start = 0;
	for(int i = 0; i <= n; i++) {
		if (i == n || chars[i] == " ") {
			reverse(chars, start, i - 1);
			start = i + 1;
		}
	}

}

public static void reverse(char[] chars, int left, int right) {
	while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
    }
}











/**
* REVERSE ALL THE WORDS IN A SENTENCE
*Given a string containing a set of words separated by whitespace, we would like to
*transform it to a string in which the words appear in the reverse order. For example,
*"Alice likes Bob" transformsto "Bob likes Alice". We do not need to keep the original
*string.
*Implement a function for reversing the wordsin a string s.
* 
* For the general case, reversing s gets the words to their correct relative positions.
*However, for words that are longer than one character, their letters appear in reverse
*order. This situation can be corrected by reversing the individual words.
*For example, "ram is costly" reversed yields "yltsoc si mar". We obtain the final
*result by reversing each word to obtain "costly is ram".
* /
 



