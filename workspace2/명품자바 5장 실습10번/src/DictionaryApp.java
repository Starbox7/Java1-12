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
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}

}
