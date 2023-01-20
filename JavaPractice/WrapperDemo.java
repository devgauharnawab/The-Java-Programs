public class WrapperDemo1 {
    public static void main(String[] args) {
        
        //create primitive data typpes
        int a = 20;
        double b = 10.5;

        //convert into wrapper objects
        //valueOf method is used to convert primitives types into corresponding objects
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);
        //instanceOf is used to check whether the generated objects are of Integer  or Double type or not
        if (aObj instanceof Integer) {
            System.out.println("An object integer is created");
        }

        if (bObj instanceof Double) {
            System.out.println("An object Double is Created");
        }
    }
}
