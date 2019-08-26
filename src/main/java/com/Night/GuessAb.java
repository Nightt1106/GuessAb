package com.Night;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class GuessAb {
    private int n;
    public String secret;
    public GuessAb(int n){
        this.n = n;
        secret = getSecretNumbers();
    }

    private String getSecretNumbers() {
        List<String> list = new ArrayList<>();
        for (Integer i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        Collections.shuffle(list);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.n ; i++) {
            sb.append(list.subList(0,4).get(i));
        }
        return sb.toString();
    }

    public String check(String data){
        int a=0,b=0;
        for (int i = 0; i < this.n ; i++) {
            int index = this.secret.indexOf(data.charAt(i));
            if(index == i )
                a++;
            else if(index != -1)
                b++;
        }
        return a+"A"+b+"B";
    }


}