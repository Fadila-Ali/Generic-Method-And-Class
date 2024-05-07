public class myRunner {
    public static void main(String[] args) {
        // initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25);
        dObj.genericsMethod("Per Scholas");
        dObj.genericsMethod(2563.5);
        dObj.genericsMethod('H');


        System.out.println("/-----------------------/");
        GMultipleDatatype<String, Integer> mObj = new GMultipleDatatype("Per Scholas", 11025);

        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        GMultipleDatatype<String, String> mObj2 = new GMultipleDatatype("Per Scholas", "Non profit");

        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());
    }
}
