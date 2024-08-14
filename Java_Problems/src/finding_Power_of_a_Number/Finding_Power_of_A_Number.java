package finding_Power_of_a_Number;

public class Finding_Power_of_A_Number {

	public static void main(String[] args) {

		int base = 2;
		int exponent = 3;
		int result = 1;

		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		System.out.println("Result: " + result);
	}
}

/*
 * base is the number you want to raise to a power (in this case, 2). exponent
 * is the power to which you want to raise the base (in this case, 3). result is
 * initialized to 1. This variable will hold the final result after calculating
 * the power.
 * 
 * This loop runs from 0 up to (but not including) the exponent. In each
 * iteration, result is multiplied by base. This is done exponent times,
 * effectively computing base raised to the power of exponent. After the loop
 * completes, result holds the value of base raised to the exponent. The result
 * is printed to the console.
 * 
 * 2^3 = 2 * 2 * 2 = 8
 * 
 * 
 * Initial Values: result is initialized to 1. First Iteration (i = 0): result =
 * 1 * 2 = 2 Second Iteration (i = 1): result = 2 * 2 = 4 Third Iteration (i =
 * 2): result = 4 * 2 = 8 Loop Ends: After 3 iterations, result contains 8.
 * 
 * 
 * raise 3 to the power of 4: Base: 3 Exponent: 4 Calculate 3^4 = 3 * 3 * 3 * 3
 * = 81
 * 
 * When we say a loop "runs from 0 up to (but not including) the exponent,"
 * we're describing the behavior of a `for` loop in programming, specifically in
 * the context of a loop that iterates a specific number of times.
 * 
 * ### Understanding the Loop:
 * 
 * 1. **Loop Initialization**: ``` for (int i = 0; i < exponent; i++) { ``` -
 * **Initialization**: `int i = 0` sets the starting value of the loop control
 * variable `i` to 0.
 * 
 * 2. **Loop Condition**: - **Condition**: `i < exponent` is checked before each
 * iteration of the loop. - The loop continues to execute as long as `i` is less
 * than the value of `exponent`.
 * 
 * 3. **Loop Update**: - **Update**: `i++` increments the value of `i` by 1
 * after each iteration.
 * 
 * 4. **Loop Body**: - The code inside the loop `{ result = result * base; }`
 * executes in each iteration.
 * 
 * ### Example of Loop Execution
 * 
 * Let’s use your example where `base = 2` and `exponent = 3`:
 * 
 * ``` for (int i = 0; i < exponent; i++) { result = result * base; } ```
 * 
 * Here's how the loop works step-by-step:
 * 
 * 1. **Initial State**: - `i` starts at 0. - `result` starts at 1 (from
 * initialization).
 * 
 * 2. **First Iteration** (`i = 0`): - Condition `i < 3` is true (`0 < 3`). -
 * Execute loop body: `result = result * base` → `result = 1 * 2 = 2`. -
 * Increment `i` to 1.
 * 
 * 3. **Second Iteration** (`i = 1`): - Condition `i < 3` is true (`1 < 3`). -
 * Execute loop body: `result = result * base` → `result = 2 * 2 = 4`. -
 * Increment `i` to 2.
 * 
 * 4. **Third Iteration** (`i = 2`): - Condition `i < 3` is true (`2 < 3`). -
 * Execute loop body: `result = result * base` → `result = 4 * 2 = 8`. -
 * Increment `i` to 3.
 * 
 * 5. **Exit Loop**: - Condition `i < 3` is now false (`3 < 3` is false). - The
 * loop terminates.
 * 
 * ### Key Points:
 * 
 * - **Start Value**: The loop starts with `i = 0`. - **End Condition**: The
 * loop continues to run as long as `i` is less than `exponent`. - **Exclusion
 * of Upper Bound**: The loop stops before `i` reaches the value of `exponent`,
 * so if `exponent` is 3, the loop executes for `i = 0`, `i = 1`, and `i = 2`—
 * but not for `i = 3`.
 * 
 * This approach ensures that the loop executes exactly as many times as
 * specified by the exponent, thereby multiplying the base by itself the correct
 * number of times to compute the power.
 * 
 * ### Summary
 * 
 * In the context of code, the loop executes from `i = 0` up to `i < exponent`.
 * It performs the multiplication for each iteration and stops when `i` reaches
 * the value equal to `exponent`, effectively multiplying the `base` by itself
 * `exponent` times.
 */