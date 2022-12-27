package com.vigilantex.nbcaas.Utils;

import java.util.ArrayList;
import java.util.List;

public class PVARLogic {

    public static List<String> test(String word) {

        StringBuffer s=new StringBuffer("");

        List<String> fieldNames=new ArrayList<>();

        int index=word.indexOf("[[PVAR");
        if(index<0)
            return fieldNames;
        else {
            while (index < word.length()) {
                int frontindex = word.indexOf("[[PVAR", index);
                int lastindex = word.indexOf("]]", frontindex + 2);
                if (frontindex < 0) {
                    break;
                }
                int firstdot = word.indexOf(".", frontindex);
                int seconddot = word.indexOf(".", firstdot + 2);
                int i = (firstdot + 1);
                while (i < seconddot) {
                    s = s.append(word.charAt(i));
                    i++;
                }
                fieldNames.add(String.valueOf(s));
                s.delete(0, s.length());
                s.append("");

                index = frontindex + 2;
            }


            return fieldNames;
        }

    }
}
