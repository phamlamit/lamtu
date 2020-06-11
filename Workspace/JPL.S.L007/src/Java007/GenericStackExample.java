package Java007;

public class GenericStackExample {
	private static Double[] doubleElements = {1.1,2.2,3.3,4.4,5.5};
	private static Integer[] integerElements = {1,2,3,4,5,6,7,8,9,10};
	private static Stack<Double> doubleStack = new Stack<Double>(5);
	private static Stack<Integer> integerStack = new Stack<Integer>(10);
	
	private static <T> void testPush(String name, Stack<T> stack, T[] elements) {
		try {
			System.out.printf("\nPushing elements onto %s\n",name);
			for (T element : elements) {
				System.out.printf("%s ",element);
				stack.push(element);
			}
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}
	private static <T> void testPop(String name, Stack<T> stack) {
		try {
			System.out.printf("\nPoping element from %s\n",name);
			T popValue;
			while(true) {
				popValue = stack.pop();
				System.out.printf("%s ",popValue);
			}
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack);
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);
	}

}
