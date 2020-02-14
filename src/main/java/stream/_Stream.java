package stream;

import dto.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static dto.Person.Gender.FEMALE;
import static dto.Person.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Emrah", MALE),
                new Person("Esin", FEMALE),
                new Person("İsmail", MALE),
                new Person("Ayşe Betül", FEMALE),
                new Person("Zehra Nil", FEMALE)
        );

        people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        people.stream().map(person -> person.name).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        Function<String, Integer> length = String::length;
        Consumer<Integer> println = System.out::println;

        people.stream().map(person -> person.name).map(length).forEach(println);
        System.out.println("--------------------------------------------------");

        //Hepsi içeriyor
        boolean containsFemales = people.stream().allMatch(person -> person.gender.equals(FEMALE));
        System.out.println(containsFemales);
        System.out.println("--------------------------------------------------");

        //En az bir tane içeriyor.
        boolean anyMatchFemale = people.stream().anyMatch(person -> person.gender.equals(FEMALE));
        System.out.println(anyMatchFemale);


    }
}
