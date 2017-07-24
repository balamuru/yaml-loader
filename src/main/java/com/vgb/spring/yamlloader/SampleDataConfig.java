package com.vgb.spring.yamlloader;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.foo.bar.stuff")
public class SampleDataConfig {
    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "SampleDataConfig{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
