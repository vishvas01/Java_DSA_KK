package leetcode;

class maxProduct{
    public static void main(String[] args) {
        
    }
public static int maxProduct(String[] words) {
	if (words == null || words.length == 0)
		return 0;
	int length = words.length;
	int[] value = new int[length];
	for (int i = 0; i < length; i++) {
		String tmp = words[i];
		value[i] = 0;
		for (int j = 0; j < tmp.length(); j++) {
			value[i] |= 1 << (tmp.charAt(j) - 'a');
		}
	}
	int maxProduct = 0;
	for (int i = 0; i < length; i++)
		for (int j = i + 1; j < length; j++) {
			if ((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > maxProduct))
				maxProduct = words[i].length() * words[j].length();
		}
	return maxProduct;
}}