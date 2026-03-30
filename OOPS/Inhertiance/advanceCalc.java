class advanceCalc extends basicsCalc{
    public int findFactorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }

    public int findCombination(int n, int r){
        if(r > n){
            System.out.println("Combination is not possible, as choice is greater than total items.");
            return 0;
        }
        int factTotal = findFactorial(n);
        int factChoice = findFactorial(r);
        int factRemaining = findFactorial(n - r);
        return factTotal / (factChoice * factRemaining);
    }

    public int findPermutation(int n, int r){
        if(r > n){
            System.out.println("Permutation is not possible, as choice is greater than total items.");
            return 0;
        }
        int factTotal = findFactorial(n);
        int factRemaining = findFactorial(n - r);
        return factTotal / factRemaining;
    }

    public int power(int base, int expo){
        int result = 1;
        for(int i = 1;i<=expo;i++){
            result *= base;
        }
        return result;
    }
}