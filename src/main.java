import java.util.*;
import java.util.stream.Collectors;

public class main {
    private static List<People> list_people;
    private static List<People> females;

    public static void main (String [] args){
        list_people = getListOfPeople();
        females = new ArrayList<>();

        for (People people: list_people){
            if(people.getGender().equals(GENDER.FEMALE)){
                females.add(people);
            }
        }


        List<People> male = list_people.stream()
                .filter(people -> people.getGender().equals(GENDER.MALE))
                .collect(Collectors.toList());


        List<People> sorted = list_people.stream()
                .sorted(Comparator.comparing(People::getName)
                        .thenComparing(People::getName)
                        .reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        boolean allMatch = list_people.stream()
                .allMatch(people -> people.getAge() < 30);

        Map<String, List<People>> groupByName = list_people.stream()
                .collect(Collectors.groupingBy(People::getName));

        groupByName.forEach((s, people) -> {
            System.out.println(s);
            people.forEach(System.out::println);
            System.out.println();
        });

        Optional<Integer> oldestAge = list_people.stream()
                .filter(people -> people.getAge() > 30)
                .max(Comparator.comparing(People::getAge))
                .map(People::getAge);
        oldestAge.ifPresent(System.out::println);

    }

    private static List<People> getListOfPeople(){
        return List.of(
                 new People("joy", 23, true, GENDER.MALE),
                 new People("elena", 18, false, GENDER.FEMALE),
                 new People("kay", 28, true, GENDER.MALE),
                 new People("jacky", 32, true, GENDER.FEMALE),
                 new People("charlotte", 22, true, GENDER.FEMALE),
                 new People("kevin", 37, false, GENDER.MALE)
        );
    }
}
