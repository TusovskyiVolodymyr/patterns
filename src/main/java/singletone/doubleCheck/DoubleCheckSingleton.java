package singletone.doubleCheck;

import singletone.UniquePerson;

public class DoubleCheckSingleton {

    private static  UniquePerson uniquePerson;

    private DoubleCheckSingleton() {
    }

    public static UniquePerson getUniquePerson() {
        if (uniquePerson == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (uniquePerson == null) {
                    uniquePerson = new UniquePerson();
                }
            }
        }
        return uniquePerson;
    }
}
