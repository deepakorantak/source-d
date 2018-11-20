/**
 *
 */

/**
 * @author Deepa Korantak
 *
 */
public class SampleCode {

	public void testConditionNotUsed (){

		boolean a = false,b = true;
		int index = 0;

		if (a) { // Non-compliant
		  index ++; // never executed
		}

		if (!a || b) { // Non-compliant; "!a" is always "true", "b" is never evaluated
		  index --;
		} else {
		  index ++; // never executed
		}
	}


}
