package com.example.Unit73.pattern;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}

class Main {
    public static void main(String[] args) {
        EagerSingleton e = EagerSingleton.getInstance();
        EagerSingleton e1 = EagerSingleton.getInstance();
        if (e.equals(e1)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        String p = President.getInstance();
        System.out.println(p);
    }
}

class LazyInnerSingleton {
    private LazyInnerSingleton() {

    }

    private static class SingltonHelper {
        private final static LazyInnerSingleton INSTANCE = new LazyInnerSingleton();
    }

    public static LazyInnerSingleton getInstance() {
        return SingltonHelper.INSTANCE;
    }
}

class President {
    //private String x = "Trump";
    private static final String instance = "Trump";

    private President() {

    }

    public static String getInstance() {
        return instance;
    }
}
