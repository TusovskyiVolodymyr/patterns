package singletone;

import singletone.firstImpl.SingletoneFirst;
import singletone.secondImpl.SingletoneEnum;

public class App {
    public static void main(String[] args) {
        UniquePerson uniquePerson = new UniquePerson();
        UniquePerson uniquePerson1 = new UniquePerson();
        UniquePerson uniquePerson2 = new UniquePerson();
        UniquePerson uniquePerson3 = new UniquePerson();
        UniquePerson uniquePerson4 = new UniquePerson();
        System.out.println(uniquePerson.hashCode());
        System.out.println(uniquePerson1.hashCode());
        System.out.println(uniquePerson2.hashCode());
        System.out.println(uniquePerson3.hashCode());
        System.out.println(uniquePerson4.hashCode());
        System.out.println(uniquePerson == uniquePerson1);

        UniquePerson uniquePerson5 = SingletoneFirst.getPerson();
        UniquePerson uniquePerson6 = SingletoneFirst.getPerson();
        UniquePerson uniquePerson7 = SingletoneFirst.getPerson();
        UniquePerson uniquePerson8 = SingletoneFirst.getPerson();
        UniquePerson uniquePerson9 = SingletoneFirst.getPerson();
        UniquePerson uniquePerson0 = SingletoneFirst.getPerson();
        System.out.println(uniquePerson5 == uniquePerson6);
        System.out.println(uniquePerson5 == uniquePerson0);
        System.out.println(uniquePerson5.hashCode());
        System.out.println(uniquePerson6.hashCode());

        UniquePerson uniquePerson10 = SingletoneEnum.INSTANSE.getUniquePerson();
        UniquePerson uniquePerson11 = SingletoneEnum.INSTANSE.getUniquePerson();
        System.out.println(uniquePerson10.hashCode());
        System.out.println(uniquePerson11.hashCode());


    }
}
