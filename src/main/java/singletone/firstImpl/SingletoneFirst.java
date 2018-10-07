package singletone.firstImpl;

import singletone.UniquePerson;

public class SingletoneFirst {
    private static UniquePerson uniquePerson;

    private SingletoneFirst() {

    }

    public static UniquePerson getPerson() {
        if (uniquePerson == null) {
            uniquePerson = new UniquePerson();
        }
        return uniquePerson;
    }
}
