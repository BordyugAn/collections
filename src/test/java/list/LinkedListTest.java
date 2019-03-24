package list;

import org.junit.Before;
import org.junit.Test;
import ru.antony.collection.Collection;
import ru.antony.collection.list.LinkedList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    Collection<String> list;

    @Before
    public void before(){
        list = new LinkedList();
        list.add("first");
        list.add("second");
        list.add("Piter");
        list.add("dddd");
    }

    @Test
    public void initListTest(){

        assertTrue(list.size() == 4);

    }


    @Test
    public void getFirstAndLastTest(){

        String first = list.getFirst();
        String last = list.getLast();

        assertEquals(first, "first");
        assertEquals(last, "dddd");

    }


    @Test
    public void toArrayTest(){

        String[] stringArray = list.toArray();

        assertTrue(list.size() == 4);
        assertEquals(stringArray[0], "first");
        assertEquals(stringArray[1], "second");
        assertEquals(stringArray[2], "Piter");
        assertEquals(stringArray[3], "dddd");

        Collection<Integer> list2 = new LinkedList<Integer>();

        list2.add(new Integer(10));
        list2.add(new Integer(15));
        list2.add(new Integer(69));
        list2.add(new Integer(100));
        list2.add(new Integer(-10));

        Integer[] integerArray = list2.toArray();

        assertEquals(integerArray[0], new Integer(10));
        assertEquals(integerArray[1], new Integer(15));
        assertEquals(integerArray[2], new Integer(69));
        assertEquals(integerArray[3], new Integer(100));
        assertEquals(integerArray[4], new Integer(-10));

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getTest(){

        assertEquals("first", list.get(0));
        assertEquals("second", list.get(1));
        assertEquals("Piter", list.get(2));
        assertEquals("dddd", list.get(3));

        String error = list.get(4);
    }

    @Test
    public void testLambda(){
        List<String> list2 = new ArrayList<>();
        list2.add("firstFromList2");
        list2.add("secondFromList2");

        list2.forEach(list::add);
        assertTrue(list.size() == 6);
    }

}
