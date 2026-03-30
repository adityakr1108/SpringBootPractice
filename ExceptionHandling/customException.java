package ExceptionHandling;
class adityaCustomException extends Exception {
    adityaCustomException(String message) {
        super(message);
    }
}

class exceptionHandling {
    exceptionHandling() {
        System.out.println("This is the constructor of the exceptionHandling class.");
    }

    int checkGreater(int a, int b) {
        try {
            if (a > b) {
                throw new adityaCustomException("a is greater than b");
            }
            return a + b;
        } catch (adityaCustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            return 0;
        }
    }
}

class customException {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        exceptionHandling obj = new exceptionHandling();
        int result = obj.checkGreater(a, b);

        System.out.println("Result: " + result);
    }
}