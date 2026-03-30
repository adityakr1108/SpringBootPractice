
class mainClass{
    public static void main(String args[]){
        basicsCalc obj = new basicsCalc();
        int sum = obj.add(5, 10);
        int sub = obj.sub(10, 5);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);

        advanceCalc advObj = new advanceCalc();
        int factorial = advObj.findFactorial(5);
        int combination = advObj.findCombination(5, 2);
        int permutation = advObj.findPermutation(5, 2);
        int power = advObj.power(2, 3);
        int cal = advObj.add(10, 20); 
        System.out.println("Factorial: " + factorial);
        System.out.println("Combination: " + combination);
        System.out.println("Permutation: " + permutation);
        System.out.println("Power: " + power);
        System.out.println("Calculation: " + cal);
    }
}