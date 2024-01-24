public class Property<T extends Comparable<T>> implements Inequality<T> {

    private T t;

    public Property(T t) {
        this.t = t;
    }

    public Property() {
        this.t = null;
    }

    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    @Override
    public boolean isGreaterThan(T other) {
        if (t.compareTo(other) == 1){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public boolean isLessThan(T other) {
        if (t.compareTo(other) == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEqual(T other) {
        if (t.compareTo(other) == 0){
            return true;
        }
        else { 
            return false;
        }        
    }

    public boolean isNotEqualTo(T other){
        if(t.compareTo(other) != 0){
            return true;
        }
        else {
            return false;
        } 
    }

    public boolean greaterThanOrEqualTo(T other){
        if(t.compareTo(other) == 0 || t.compareTo(other) == 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean lessThanOrEqualTo(T other){
        if(t.compareTo(other) == 0 || t.compareTo(other) == -1){
            return true;
        }else{
            return false;
        }
    }

}