package generic;
//Generic o muc class
/*T: Type
E: Element
K: Key
V: Value*/
public class MyArrayList<E> {
	//private String name;
	private E e;
	
	public MyArrayList() {
		// TODO Auto-generated constructor stub
	}

	public MyArrayList(E e) {
		this.e = e;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "MyArrayList [e=" + e + "]";
	}
	
}
