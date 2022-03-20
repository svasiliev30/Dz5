package TestDuplicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sbp.duplicate.Duplicate;

import java.util.ArrayList;
import java.util.Collection;


public class TestDuplicate {
    String[] list1 = {"Москва"};
    String[] list2 = {"Самара"};
    String[] list3 = {"Питер"};
    String[] list4 = {"Владивосток"};

    /**
     * first sort method содержит один дубликат type String.
     */
    @Test
    void  oneSortDuplicateOne (){
        Collection list = new ArrayList();
        list.add(list1);
        list.add(list4);
        list.add(list2);
        list.add(list3);
        list.add(list1);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(1,duplicate.sortDuplicateOne(list).size());
        if (duplicate.sortDuplicateOne(list) != null) {
            System.out.println("duplicate = " + duplicate.sortDuplicateThree(list).size());
            Assertions.assertTrue(true);
        }
    }

    /**
     * first sort method содержит два дубликат type Integer
     */
    @Test
    void  oneSortDuplicateTwo (){
        Collection list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(2,duplicate.sortDuplicateOne(list).size());
        if (duplicate.sortDuplicateOne(list) != null) {
            System.out.println("duplicate = " + duplicate.sortDuplicateThree(list).size());
            Assertions.assertTrue(true);
        }
    }

    /**
     * first sort method содержит три дубликата type String
     */
    @Test
    void  oneSortDuplicateThree(){
        Collection list = new ArrayList();
        list.add(list1);
        list.add(list4);
        list.add(list2);
        list.add(list3);
        list.add(list1);
        list.add(list4);
        list.add(list3);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(3,duplicate.sortDuplicateOne(list).size());
        if (duplicate.sortDuplicateOne(list) != null) {
            System.out.println("duplicate = " + duplicate.sortDuplicateOne(list).size());
            Assertions.assertTrue(true);
        }
    }

    /**
     * first sort method содержит null дубликат
     */
    @Test
    void  oneSortDuplicateNull (){
        Collection list = new ArrayList();
        list.add(list1);
        list.add(list4);
        list.add(list2);
        list.add(list3);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(null,duplicate.sortDuplicateOne(list));
        System.out.println("duplicate = " + duplicate.sortDuplicateOne(list));
    }

    /**
     * second sort method содержит два дубликат type Integer
     */
    @Test
    void  twoSortDuplicateTwo (){
        Collection list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals("[1, 2]",duplicate.sortDuplicateTwo(list));
            System.out.println("duplicate = " + duplicate.sortDuplicateTwo(list));
    }

    /**
     * second sort method содержит 3 дубликат type Integer
     */
    @Test
    void  twoSortDuplicateThree (){
        Collection list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals("[1, 2, 3]",duplicate.sortDuplicateTwo(list));
        System.out.println("duplicate = " + duplicate.sortDuplicateTwo(list));
    }

    /**
     * second sort method содержит оди дубликат type String
     */
    @Test
    void  twoSortDuplicateOne (){
        Collection list = new ArrayList();
        list.add("list1");
        list.add("list4");
        list.add("list2");
        list.add("list3");
        list.add("list4");

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals("[list4]",duplicate.sortDuplicateTwo(list));
        System.out.println("duplicate = " + duplicate.sortDuplicateTwo(list));
    }

    /**
     * second sort method содержит null дубликат type Integer
     */
    @Test
    void  twoSortDuplicateNull (){
        Collection list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);


        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(null,duplicate.sortDuplicateTwo(list));
        System.out.println("duplicate = " + duplicate.sortDuplicateTwo(list));
    }

    @Test
    /**
     * third sort method содержит один дубликата type String
     */
    void threeSortDuplicateOne() {
        Collection list = new ArrayList();
        list.add(list1);
        list.add(list4);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(1,duplicate.sortDuplicateThree(list).size());
        if (duplicate.sortDuplicateThree(list) != null) {
            System.out.println("duplicate = " + duplicate.sortDuplicateThree(list).size());
            Assertions.assertTrue(true);
        }
    }

    @Test
    /**
     * third sort method содержит два дубликата type String
     */
    void threeSortDuplicateTwo() {
        Collection list = new ArrayList();
        list.add(list1);
        list.add(list4);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list1);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(2,duplicate.sortDuplicateThree(list).size());
            if (duplicate.sortDuplicateThree(list) != null) {
                System.out.println("duplicate = " + duplicate.sortDuplicateThree(list).size());
                Assertions.assertTrue(true);
            }
    }

    @Test
    /**
     * third sort method содержит 3 дубликата type Integer
     */
    void threeSortDuplicateThree() {
        Collection list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(3,duplicate.sortDuplicateThree(list).size());
        if (duplicate.sortDuplicateThree(list) != null) {
            System.out.println("duplicate = " + duplicate.sortDuplicateThree(list).size());
            Assertions.assertTrue(true);
        }
    }

    /**
     * third sort method содержит null дубликат
     */
    @Test
    void  threeSortDuplicateNull (){
        Collection list = new ArrayList();
        list.add(list1);
        list.add(list4);
        list.add(list2);
        list.add(list3);

        Duplicate duplicate = new Duplicate(15);
        Assertions.assertEquals(null,duplicate.sortDuplicateThree(list));
        System.out.println("duplicate = " + duplicate.sortDuplicateThree(list));
    }
}
