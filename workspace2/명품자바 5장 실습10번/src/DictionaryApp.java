abstract class PairMap {
	protected String keyArray[];
	protected String valueArray[];

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}

class Dictionary implements PairMap {

	String[] keyArray;
	String[] valueArray;
	
	int i;

	Dictionary(int a) {
		for (i = 0; i < a; i++) {
			keyArray = new String[a];
			valueArray = new String[a];
		}
		i = 0;
	}

	String get(String key) {

	}

	String delete(String key);

	{

	}

	void put(String key, String value) {
		keyArray[i] = key;
		valueArray[i] = value;
		i++;
	}

	int length() {

	}
}

public class DictionaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}

}
