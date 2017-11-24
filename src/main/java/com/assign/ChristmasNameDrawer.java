package com.assign;

import java.util.*;

public class ChristmasNameDrawer {

    private static final Map<Integer,String> keyToName = new HashMap<Integer, String>();

    static {
        keyToName.put(1, "bryan");
        keyToName.put(2, "michelle");
        keyToName.put(3, "gavin");
        keyToName.put(4, "aliya");
        keyToName.put(5, "isaac");
        keyToName.put(6, "zaydee");
        keyToName.put(7, "xander");

        keyToName.put(8, "joel");
        keyToName.put(9, "nancy");
        keyToName.put(10, "garrett");

        keyToName.put(11, "greg");
        keyToName.put(12, "lindsey");
        keyToName.put(13, "hayden");
    }

    private static final Map<String, String> youGot = new HashMap<String, String>();

    public Map<String, String> drawNames() {
        for (String name : keyToName.values()) {
            youGot.put(name, generateNameYouGet(name) );
        }

        return youGot;
    }

    private String generateNameYouGet(String yourName) {

        Random random = new Random();

        int min = 1;

        int max = keyToName.size();

        int num = min + random.nextInt(max);

        String nameYouGet = keyToName.get(num);

        if (!yourName.equals(nameYouGet) && !youGot.values().contains(nameYouGet)) {
            youGot.put(yourName, nameYouGet);
        }
        else{
            while (yourName.equals(nameYouGet) || youGot.values().contains(nameYouGet)) {

                num = min + random.nextInt(max);

                nameYouGet = keyToName.get(num);

                if (!yourName.equals(nameYouGet) && !youGot.values().contains(nameYouGet)) {
                    youGot.put(yourName, nameYouGet);
                    break;
                }

            }
        }

        return nameYouGet;
    }

    /**
     * Displays the names such that its sorted by key where the key is the name
     */
    public static void display() {

        SortedSet<String> keys = new TreeSet<String> (youGot.keySet());

        for (String name : keys) {
            System.out.println(name + " --> " + youGot.get(name));
        }

    }

}
