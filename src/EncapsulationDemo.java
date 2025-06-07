/*
Problem Description:
We have to do the following modifications to properly encapsulate info:
make fields private
provide accessors to the internal fields ( setters/getters )
provide an empty constructor to support Java Beans specification
Add a constructor that can receive parameters for all of the fields
Note: make sure if you don't use Lombok to enforce proper naming conventions.
 */
public class EncapsulationDemo {
    private int number;
    private String stringValue;
    private Object anObject;

    public EncapsulationDemo(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public EncapsulationDemo() {

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public Object getAnObject() {
        return this.anObject;
    }


}
