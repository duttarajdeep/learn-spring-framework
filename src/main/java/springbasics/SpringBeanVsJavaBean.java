package springbasics;

import java.io.Serializable;

class Pojo {
    String key;
    int value;

    public String toString() {
        return key + ":" + value;
    }
}

class JavaBean implements Serializable {
    // Every Java bean or EJB has 3 main properties:
    // 1. It should have a default no parameterized constructor
    // 2. It should have getters and setters for access to properties
    // 3. It should be serializable

    String key;
    int value;

    public JavaBean(){}

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class SpringBeanVsJavaBean {
}
