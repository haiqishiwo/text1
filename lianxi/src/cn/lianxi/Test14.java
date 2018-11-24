package cn.lianxi;

import java.util.Objects;

public class Test14 {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test14 test14 = (Test14) o;
        return Objects.equals(name, test14.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
