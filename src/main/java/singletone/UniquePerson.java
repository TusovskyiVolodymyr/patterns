package singletone;

import java.util.Objects;

public class UniquePerson {
  private String name = "Vova";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniquePerson that = (UniquePerson) o;
        return Objects.equals(name, that.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
