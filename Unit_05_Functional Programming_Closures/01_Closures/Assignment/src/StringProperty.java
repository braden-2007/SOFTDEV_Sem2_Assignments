public class StringProperty {

    public static StringProperty of(String d){
        return new StringProperty(d);
    }

    private String value;

    private StringProperty(String d) {
        this.value = d;
    }

    public String get() {
        return value;
    }

    public void set(String value) {
        this.value = value;
    }

    public StringProperty plus(StringProperty value) {
        this.value += value.get();
        return this;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }

}