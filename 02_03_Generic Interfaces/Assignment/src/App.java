public class App {
    public static void main(String[] args) throws Exception {
        Property<Double> myDoubleProperty = new Property<Double>(3.0);
        Property<Double> myDoubleProperty2 = new Property<Double>(3.0);
        System.out.println(myDoubleProperty.isGreaterThan(myDoubleProperty2.get()));
        System.out.println(myDoubleProperty.isEqual(myDoubleProperty2.get()));

    }
}