/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class jpe03_solayao
{
	public static void main(String[] args) {
		System.out.println("Step 1: Declare and initialize two variables:");
		System.out.println("- Your birth month (e.g., 11 for March)");
		System.out.println("- Your birth day (e.g., 4)\n");


		int b_month, b_day;

		int sum, subtract;
		float multiply, divide,modulo;

		b_month= 11;
		b_day = 4;
		sum = b_month + b_day;
		System.out.format("Step2. Compute the sum of the birth month and birth day.\n b_month:%d + b_day:%d = sum: %d \n\n", b_month, b_day,sum);

		subtract= sum - (b_month/2);
		System.out.format("Step3. Subtract from this sum half the value of the birth month.\n sum:%d - (b_month:%d/2) = subtract: %d \n\n", sum, b_month/2,subtract);

		multiply = subtract*(sum/2.0f);
        System.out.format("Step 4. Multiply the result by half the value of the sum from Step 2.\n subtract: %d * half of sum: %f = multiply: %f \n\n", subtract, (sum / 2.0f), multiply);

		divide = multiply / (subtract/2.0f);
		System.out.format("Step 5: Divide that result by half the value of the result from Step 3.\nmultiply: %f / half of the step3: %f = divide: %f \n\n", multiply, (subtract/2.0f), divide);

		modulo = multiply % divide;
        System.out.format("Step 6: Apply a modulo operation using one of the intermediate results of your choice.\n multiply: %f %% divide: %f = modulo: %f \n\n", multiply, divide, modulo);

        boolean	comparison = multiply > divide;
		System.out.format("Step 7: Implement at least two relational comparisons (e.g., >, <, ==) using selected result values.\nmultiply: %f > divide: %f = comparison: %b \n\n",multiply,divide,comparison);

		boolean logic_ope = !(subtract < multiply) && (sum >= divide);
		System.out.format("Step 8: Implement at least two logical operations (e.g., &&, ||, !) involving boolean expressions based on your calculations.\n !(subtract: %d < multiply: %f) && (sum: %d >= divide: %f) = logic_operator: %b",subtract,multiply,sum,divide,logic_ope);





	}
}