package singletone.secondImpl;

import singletone.UniquePerson;

public enum SingletoneEnum {
    INSTANSE(new UniquePerson());

   private UniquePerson uniquePerson;

    SingletoneEnum(UniquePerson uniquePerson) {
        this.uniquePerson = uniquePerson;
    }

    public UniquePerson getUniquePerson() {
        return uniquePerson;
    }
}
