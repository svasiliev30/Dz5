package TestSort;

import org.junit.jupiter.api.Test;
import sbp.Sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSort {


    @Test
    void sortSigns() {

        List list = Arrays.asList("[","{","(",")","}","]");

        Sort sort = new Sort();
        System.out.println( sort.sortSigns(list));

    }

    }

