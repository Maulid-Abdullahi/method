public class methods {
    //dataStructure dt = new dataStructure();

    public static  void main(String[] args){
        methods fr = new methods("823");
        System.out.println(fr);

    }
    methods(String addnum){
        int num = Integer.parseInt(addnum);
        //Splitting the  number using Array
        String[] num2 = addnum.split("");

        //getting first number of the array
        int add = Integer.parseInt(num2[0]);
        int minus = Integer.parseInt(num2[0]);
        int times = Integer.parseInt(num2[0]);

        //getting second number of the array
        int add1 = Integer.parseInt(num2[1]);
        int minus2 = Integer.parseInt(num2[1]);
        int times3 = Integer.parseInt(num2[1]);

        //printing by adding,subtracting,multiplying
        //the first from the Array
        System.out.println("Addition " + (add + add1));
        System.out.println("Subtraction " + (minus - minus2));
        System.out.println("Subtraction " + (times * times3));


    }
}
