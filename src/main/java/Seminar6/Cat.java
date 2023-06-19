package Seminar6;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
public class Cat {
    Bread bread;
    LocalDate birthday;
    Owner owner;
    Color color;
    Pedigree pedigree;
    Gender gender;

    public Cat(Bread bread, LocalDate birthday, Owner owner, Color color, Pedigree pedigree, Gender gender) {
        this.bread = bread;
        this.birthday = birthday;
        this.owner = owner;
        this.color = color;
        this.pedigree = pedigree;
        this.gender = gender;
    }

//    public Bread getBread() {
//        return bread;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public Owner getOwner() {
//        return owner;
//    }
//
//    public Color getColor() {
//        return color;
//    }
//
//    public Pedigree getPedigree() {
//        return pedigree;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "bread=" + bread +
                ", birthday=" + birthday +
                ", owner=" + owner +
                ", color=" + color +
                ", pedigree=" + pedigree +
                ", gender=" + gender +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return bread == cat.bread && Objects.equals(birthday, cat.birthday) && color == cat.color && gender == cat.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bread, birthday, color, gender);
    }
}
