package singletone;

import singletone.firstImpl.SingletoneFirst;
import singletone.secondImpl.SingletoneEnum;

public class App {
    public static void main(String[] args) {
        UniquePerson uniquePerson1 = SingletoneFirst.getPerson();
        UniquePerson uniquePerson2 = SingletoneEnum.INSTANSE.getUniquePerson();
        System.out.println(uniquePerson1);
        System.out.println(uniquePerson2);
    }
}
