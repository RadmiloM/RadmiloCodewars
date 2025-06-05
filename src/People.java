/*
Problem description:
Encapsulate properly the class by providing read accessors (setters are not required for this Kata).
Implement the Builder design Pattern.
Additionally we have allegedly a JIT compiler and we want to do some micro-optimization by marking constants in the code.
 */

public class People {
    private int age;
    private String name;
    private String lastName;
    private String city;
    private String job;
    private String GREET = "hello";

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }


    public String greet() {
        return GREET + " my name is " + name;
    }

    public People(PeopleBuilder peopleBuilder) {
        this.age = peopleBuilder.age;
        this.name = peopleBuilder.name;
        this.lastName = peopleBuilder.lastName;
        this.city = peopleBuilder.city;
        this.job = peopleBuilder.job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGreet() {
        return GREET;
    }

    public static PeopleBuilder builder() {
        return new PeopleBuilder();
    }

    static class PeopleBuilder {
        private int age;
        private String name;
        private String lastName;
        private String city;
        private String job;

        public PeopleBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PeopleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PeopleBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PeopleBuilder city(String city) {
            this.city = city;
            return this;
        }

        public PeopleBuilder job(String job) {
            this.job = job;
            return this;
        }

        public People build() {
            return new People(this);
        }
    }


}
