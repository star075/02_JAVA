package practice.ch15.sec03.exam02;

import java.util.*;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Member)) return false;
        Member other = (Member) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
