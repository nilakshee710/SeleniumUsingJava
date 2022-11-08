package collections;
import java.util.function.Consumer;
import java.util.function.Function;

class ConsumerImpl implements Consumer<String>
{

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
public class ConsumerDemo {
	public static void main(String[] args) {
	Consumer<String> newcon = (t)->System.out.println(t);
	newcon.accept("Gayatri");
	}

}
