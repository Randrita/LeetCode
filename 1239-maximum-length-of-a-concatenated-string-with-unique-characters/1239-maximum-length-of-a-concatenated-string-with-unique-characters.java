class Solution {
 private int maxLen = 0;

  public int maxLength(List<String> arr) {
	maxLen = 0;

	Set<Character> set = new HashSet<>();
	helper(set, arr, 0);

	return maxLen;
  }

  private void helper(Set<Character> set, List<String> arr, int index) {
	if (index == arr.size()) {
	  return;
	}

	char[] s = arr.get(index).toCharArray();

	boolean unique = true;

	Set<Character> chars = new HashSet<>();
	for (char ch : s) {
	  if (chars.contains(ch) || set.contains(ch)) {
		unique = false;
		break;
	  }

	  chars.add(ch);
	}

	helper(set, arr, index + 1);

	if (unique) {
	  maxLen = Math.max(maxLen, set.size() + s.length);

	  set.addAll(chars);
	  helper(set, arr, index + 1);
	  set.removeAll(chars);
	}
  }
}