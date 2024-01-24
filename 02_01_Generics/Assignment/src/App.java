public class App {
    public static void main(String[] args) throws Exception {

        Property<String> myStringProperty = new Property<String>();
        myStringProperty.set("Hi");
        System.out.println(myStringProperty.get());
        myStringProperty.set("Hello");
        System.out.println(myStringProperty.get());

        Property<Integer> myInteger = new Property<Integer>();
        myInteger.set(3);
        System.out.println(myInteger.get());
        myInteger.set(2);
        System.out.println(myInteger.get());

        Property<Boolean> mybull = new Property<Boolean>();
        mybull.set(true);
        System.out.println(mybull.get());
        mybull.set(false);
        System.out.println(mybull.get());

        Property<Integer> myInt = new Property<Integer>();
        myInt.set(12);
        System.out.println(myInt.get());
        myInt.set(21);
        System.out.println(myInt.get());

    }
}