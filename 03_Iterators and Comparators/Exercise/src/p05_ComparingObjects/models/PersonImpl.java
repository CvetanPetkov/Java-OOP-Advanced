package p05_ComparingObjects.models;

public class PersonImpl implements Comparable<PersonImpl>{

    private String name;
    private int age;
    private String town;

    public PersonImpl(String name, int age, String town) {
        this.setName(name);
        this.setAge(age);
        this.setTown(town);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(PersonImpl personToCompareWith) {
        if (this.getName().compareTo(personToCompareWith.getName()) == 0 &&
                this.getAge()==personToCompareWith.getAge() &&
                this.getTown().compareTo(personToCompareWith.getTown()) == 0) {
            return 1;
        }
        return -1;
    }
}
