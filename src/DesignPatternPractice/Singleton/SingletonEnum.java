package DesignPatternPractice.Singleton;

public enum SingletonEnum {
    Instance;

    private int count;

    public void count() {
        count++;
        System.out.println("instance count :: " + count);
    }

    public int getInstanceCount() {
        return count;
    }
}

class EnumSingletonApp {
    public static void main(String[] args) {
        SingletonEnum singletonEnum1 = SingletonEnum.Instance;
        SingletonEnum singletonEnum2 = SingletonEnum.Instance;
        singletonEnum1.count();
        singletonEnum2.count();
        System.out.println("count :: " + singletonEnum1.getInstanceCount());

        System.out.println("isTrue :: " + singletonEnum1.equals(singletonEnum2));
    }
}
