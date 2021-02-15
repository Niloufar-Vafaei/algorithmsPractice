package com;

import com.imp.CompanyInterview.Toptal.SearchOnPhoneBook;

import java.util.Stack;


public class stream {
    /*  static class Person {
          public final String name;
          public final Integer age;

          public Person(String name, Integer age) {
              this.name = name;
              this.age = age;
          }
      }

      static class Car {
          public final String make;
          public final String color;
          public final Float price;

          public Car(String make, String color, Float price) {
              this.make = make;
              this.color = color;
              this.price = price;
          }
      }

      static class Employee {
          public final String name;
          public final Integer age;
          public final String jobTitle;
          public final Float salary;

          public Employee(String name, Integer age, String jobTitle, Float salary) {
              this.name = name;
              this.age = age;
              this.jobTitle = jobTitle;
              this.salary = salary;
          }
      }

     // public static void main(String[] args) {
          Person[] peopleArr = {
                  new Person("Brandon", 23),
                  new Person("Hank", 43),
                  new Person("Jenna", 33),
                  new Person("Veronica", 56),
                  new Person("Jack", 27),
          };
          List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));

          //Get a list that contains all the peoples names
          List<String> peopleName = people
                  .stream()
                  .map((person) -> person.name)
                  .collect(Collectors.toList());


          Car[] carsArr = {
                  new Car("Chevy", "red", 45000f),
                  new Car("Ford", "blue", 23000f),
                  new Car("Toyota", "grey", 14000f),
                  new Car("Lamborghini", "blue", 150000f),
                  new Car("Renault", "blue", 150000f),
          };
          List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

          //Get a list of blue cars
          Predicate<Car> isBlue = x -> x.color == "blue";
          List<Car> blueCars = cars
                  .stream()
                  .filter((car) -> car.color == "blue")
                  .collect(Collectors.toList());

          Employee[] employeesArr = {
                  new Employee("John", 34, "developer", 80000f),
                  new Employee("Hannah", 24, "developer", 95000f),
                  new Employee("Bart", 50, "sales executive", 100000f),
                  new Employee("Sophie", 49, "construction worker", 40000f),
                  new Employee("Darren", 38, "writer", 50000f),
                  new Employee("Nancy", 29, "developer", 75000f),
          };
          List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
          //Find the Sum of all of the employees salaries
  //        List<Float> salaries = employees
  //                .stream()
  //                .map(s -> s.salary)
  //                .collect(Collectors.toList());
  //        BinaryOperator<Float> getSum = (acc, x) -> {
  //            Float sum = acc + x;
  //            return sum;
  //        };
          Float sum = employees
                  .stream()
                  .map((s)->s.salary)
                  .reduce(0f, (acc,x)->acc+x);
      }*/
//    static class Employee {
//        public final String name;
//        public final Integer age;
//        public final String jobTitle;
//        public final Float salary;
//
//        public Employee(String name, Integer age, String jobTitle, Float salary) {
//            this.name = name;
//            this.age = age;
//            this.jobTitle = jobTitle;
//            this.salary = salary;
//        }
//    }

    public static void main(String[] args) {
//        Employee[] employeesArr = {
//                new Employee("John", 34, "developer", 80000f),
//                new Employee("Hannah", 24, "developer", 95000f),
//                new Employee("Bart", 50, "sales executive", 100000f),
//                new Employee("Sophie", 49, "construction worker", 40000f),
//                new Employee("Darren", 38, "writer", 50000f),
//                new Employee("Nancy", 29, "developer", 75000f),
//        };
//        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));
//
//        Map<String, List<Employee>> employeesMapper = employees
//                .stream()
//                .collect(Collectors.groupingBy(e -> e.jobTitle));
//
//        Map<String, Float> em = employeesMapper
//                .entrySet()
//                .stream()
//                .collect(Collectors.toMap(
//                        (entity) -> entity.getKey(),
//                        (entity) -> entity.getValue()
//                                .stream()
//                                .map(employee -> employee.salary)
//                                .reduce(0f, (acc, x) -> acc + x) / entity.getValue().size()
//                ));
//        Set<String> myset = new HashSet<>(Arrays.asList("s"));
//        List<Integer> myList=new ArrayList<>(Arrays.asList(1,5,6,3));
//        myList.removeAll(myList);
//       // myset.add("c");
//        System.out.println( myset+"//////"+myList);
        //**************************************************************************
        //solution("4 5 6 - 7 +");
        SearchOnPhoneBook obj = new SearchOnPhoneBook();
        String result = obj.solution(new String[]{"sam", "madh", "adel", "amir"}, new String[]{"5479", "7890", "234", "47654"}, "47");
    }

    private static int checkRange(int n) {
        if (n < 0 || n > 0xFFFFF)
            throw new IllegalArgumentException("Input is out of range");
        else
            return n;
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();
        String[] splitS = S.split(" ");
        for (String c : splitS) {
            if (c == "POP") {
                stack.pop();
            } else if (c == "DUP") {
                if (stack.size() < 1) try {
                    throw new IllegalArgumentException("Stack is empty");
                } catch (IllegalArgumentException e) {
                    return -1;
                }
                else {
                    stack.push(checkRange(stack.peek()));
                }
            } else if (c == "+") {
                if (stack.size() < 2) try {
                    throw new IllegalArgumentException("Stack is empty");
                } catch (IllegalArgumentException e) {
                    return -1;
                }
                else {
                    stack.push(checkRange(stack.pop() + stack.pop()));
                }
            } else if (c == "-") {
                if (stack.size() < 2) try {
                    throw new IllegalArgumentException("Stack is empty");
                } catch (IllegalArgumentException e) {
                    return -1;
                }
                else {
                    stack.push(checkRange(stack.pop() - stack.pop()));
                }
            } else
                stack.push(checkRange(Integer.valueOf(c)));
        }
        return stack.pop();
    }


}

