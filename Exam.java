interface Exam {
    boolean pass(int mark);
}

interface Classify {
    String division(int average);
}

class Result implements Exam, Classify {

    @Override
    public boolean pass(int mark) {
        return mark > 50;
    }

    @Override
    public String division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No division";
        }
    }
}

class Main {
    public static void main(String args[]){
        Result result = new Result();

        System.out.println(result.division(70));
        System.out.println(result.pass(60));
    }
}