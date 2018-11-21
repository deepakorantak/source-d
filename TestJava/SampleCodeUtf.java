public class SampleCode {

	public void testConditionNotUsed (){

		boolean a = false,b = true;
		int index = 0;

		if (a) {
		  index ++;
		}

		if (!a || b) {
		  index --;
		} else {
		  index ++;
		}
	}

}