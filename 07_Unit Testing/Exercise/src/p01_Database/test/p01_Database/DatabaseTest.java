package p01_Database;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    private Database database;

    @Test(expected = OperationNotSupportedException.class)
    public void constructorCheckWithNull() throws OperationNotSupportedException {
        this.database = new Database(null);
    }

    @Test
    public void constructorCheckWithoutInteger() throws OperationNotSupportedException {
        this.database = new Database();
        String expected = "[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]";
        String actual = this.database.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void constructorCheckWithMoreIntegers() throws OperationNotSupportedException {
        People p = new People();
        this.database = new Database(p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void addIntegerInFullArray() throws Exception {
        People p = new People();
        this.database = new Database(p,p,p,p,p,p,p,p,p,p,p,p,p,p,p,p);
        this.database.addPeople(p);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void removeInteger() throws Exception {
        this.database = new Database();
        this.database.removePeople();
    }

    @Test
    public void fetch() throws Exception {
        this.database = new Database();
        People[] expected = new People[16];
        People[] actual = this.database.fetch();
        Assert.assertArrayEquals(expected, actual);

    }

}