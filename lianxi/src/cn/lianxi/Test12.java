package cn.lianxi;

public class Test12 {
    private Test12 test12;

    public Test12 getName() {
        if (test12 == null) {
            synchronized (this) {
                if (test12 == null) {
                    test12 = new Test12();
                }
            }
        }
        return test12;
    }

    private Test12() {
    }
}
