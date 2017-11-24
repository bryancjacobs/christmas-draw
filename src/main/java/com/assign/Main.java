package com.assign;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ChristmasNameDrawer drawer = new ChristmasNameDrawer();

        Map<String, String> names = drawer.assignNames();

        ChristmasNameDrawer.display(names);

    }
}
