package ru.muctr.Students;

import java.util.Objects;

/**
 * @author Evgenia Skichko
 */
public class Student{
    String surname;
    int reiting;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return reiting == student.reiting && groupNumber == student.groupNumber && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, reiting, groupNumber);
    }

    int groupNumber;

    public String getSurname() {
        return surname;
    }

    public int getReiting() {
        return reiting;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Student(String surname, int reiting, int gn) {
        this.surname = surname;
        this.reiting = reiting;
        this.groupNumber = gn;
    }

    @Override
    public String toString() {
        return this.getSurname();
    }
}
