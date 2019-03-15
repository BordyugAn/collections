package list;

import org.junit.Test;
import ru.antony.collection.Collection;
import ru.antony.collection.list.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    @Test
    public void initListTest(){

        Collection<String> list = new LinkedList();
        list.add("first");
        list.add("second");
        assertTrue(list.size() == 2);

    }


    @Test
    public void getFirstAndLastTest(){

        Collection<String> list = new LinkedList();
        list.add("first");
        list.add("second");
        list.add("Piter");
        list.add("dddd");

        String first = list.getFirst();
        String last = list.getLast();

        assertEquals(first, "first");
        assertEquals(last, "dddd");

    }


    @Test
    public void toArrayTest(){

        Collection<String> list = new LinkedList();
        list.add("first");
        list.add("second");
        list.add("Piter");
        list.add("dddd");

        String[] stringArray = list.toArray();

        assertTrue(list.size() == 4);
        assertEquals(stringArray[0], "first");
        assertEquals(stringArray[1], "second");
        assertEquals(stringArray[2], "Piter");
        assertEquals(stringArray[3], "dddd");

    }
}
