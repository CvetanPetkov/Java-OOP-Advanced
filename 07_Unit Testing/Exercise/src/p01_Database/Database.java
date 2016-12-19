package p01_Database;


import javax.naming.OperationNotSupportedException;
import java.util.Arrays;

public class Database {

    private People[] peoples;

    public Database(People... peoples) throws OperationNotSupportedException {
        this.setIntegers(peoples);
    }

    public People[] getPeoples() {
        return this.peoples;
    }

    private void setIntegers(People... peoples) throws OperationNotSupportedException {

        if (peoples == null) {
            throw new OperationNotSupportedException();
        }
        if (peoples.length <= 16) {
            this.peoples = new People[16];

            for (int i = 0; i < peoples.length; i++) {
                this.peoples[i] = peoples[i];
            }
        } else {
            throw new OperationNotSupportedException();
        }
    }

    public void addPeople(People people) throws OperationNotSupportedException {

        if (this.peoples.length < 16) {
            int lastEmptyIndex = this.peoples.length;
            for (int i = 0; i < this.peoples.length; i++) {
                if (this.peoples[i].getId() == people.getId())
            }
            this.peoples[lastEmptyIndex] = people;
        } else {
            throw new OperationNotSupportedException();
        }
    }

    public void removePeople() throws OperationNotSupportedException {

        int countOcupaedCells = 0;
        for (int i = 0; i < this.peoples.length; i++) {
            if (this.peoples[i] != null) {
                countOcupaedCells++;
            }
        }
        if (countOcupaedCells == 0) {
            throw new OperationNotSupportedException();
        } else {
            this.peoples[countOcupaedCells - 1] = null;
        }
    }

    public People[] fetch() {
        return this.peoples;
    }

    public People findPeopleById(long id) throws OperationNotSupportedException {
        for (int i = 0; i < this.peoples.length; i++) {
            if (this.peoples[i].getId() == id) {
                return this.peoples[i];
            }
        }
        throw new OperationNotSupportedException();
    }

    public People findPeopleByUserName(String nameToSearch) throws OperationNotSupportedException {
        if (!nameToSearch.equals(null)) {
            for (int i = 0; i < this.peoples.length; i++) {
                if (this.peoples[i].getUserName().equals(nameToSearch)) {
                    return this.peoples[i];
                }
            }
        }
        throw new OperationNotSupportedException();
    }

    @Override
    public String toString() {
        return Arrays.toString(this.peoples);
    }
}
