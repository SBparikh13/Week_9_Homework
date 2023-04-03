package pgrm1calculate;

public class Calculator {

    public void addition(int a,int b){
        System.out.println("Addition of " + a + " and "+ b + " is  : " + (a+b));
    }
    public void subtraction(int a,int b){
        System.out.println("Subtraction  of " + a + " and "+ b + " is  : " + (a-b));

    }
    public void multiplication(int a, int b){
        System.out.println("Multiplication  of " + a + " and "+ b + " is  : " + (a*b));


    }
    public void division(int a,int b ){
        System.out.println("Division  of " + a + " and "+ b + " is  : " + (a/b));


    }
    public void calculateResult(int a,int b, char symbol){
        if(symbol == '+'){
            addition(a,b);
        }else if(symbol == '-'){
            subtraction(a,b);
        }else if(symbol == '*'){
            multiplication(a,b);
        }else if(symbol == '/'){
            try {
                division(a, b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Number can not divide by 0 ");
            }
        }else{
            System.out.println("Invalid input ");

        }
    }

}
