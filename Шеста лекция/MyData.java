package sixst;
import java.io.Serializable;

public class MyData implements Serializable{
	private static final long serialVersionUID = 1L;
	int count;
	String name;
	
	public MyData(int k, String name) {
		count=k;
		this.name=name;
	}
	public String toString() {
		return "["+count+","+name+"]";
	}
}
