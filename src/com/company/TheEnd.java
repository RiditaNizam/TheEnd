package com.company;

/**
 * Created by ridita on 5/14/17.
 */
public class TheEnd {

    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

}
