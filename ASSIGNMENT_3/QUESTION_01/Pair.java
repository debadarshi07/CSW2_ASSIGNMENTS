package Q01;

public class Pair<K,V> {
	private K key;
	private V value;
	
	Pair(K key, V value){
		this.key=key;
		this.value=value;
	}
	
	K getKey() {
		return key;
	}
	void setKey(K key) {
		this.key=key;
	}
	
	V getValue() {
		return value;
	}
	void setValue(V value) {
		this.value=value;
	}
	
	
	public String toString() {
		return this.key+" "+this.value;
	}

}
