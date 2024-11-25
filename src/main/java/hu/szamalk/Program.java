package hu.szamalk;
import hu.szamalk.modell.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {

    private ArrayList<AbstractIdom> idomok;

    public Program() {
        idomok = new ArrayList<>();
        idomok.add(new MertaniHenger(1, 1) {
            @Override
            public String fajsuly() {
                return "";
            }
        });
        idomok.add(new TomorHenger(1, 1, 1) {
            @Override
            public String fajsuly() {
                return "";
            }
        });
        idomok.add(new LyukasHenger(1, 1, 1, 1) {
            @Override
            public String fajsuly() {
                return "";
            }
        });
        idomok.add(new Hasab(1, 1, 2) {
            @Override
            public String fajsuly() {
                return "";
            }
        });

    }

    private void kiir() {
        for (int i = 0; i < idomok.size(); i++) {
            System.out.println(idomok.get(i).toString());
        }
    }

    private String terfogatok() {
        String s = "Térfogatok:\n";
        for (AbstractIdom idom : idomok){
            s += "\n   V:" + idom.terfogat();
            s += "\n";
        }
        return s;
    }

    private String fajsulyok(){
        String s = "Fajsúlyok:";
        for (AbstractIdom idom : idomok)
            if (idom instanceof AbstractIdom){
                s+= "\n Fajsuly:"+ AbstractFaIdom.getFajsuly();
                if (idom instanceof AbstractFaIdom){
                    s += "\n   F:" + idom.fajsuly();
                } else if (idom instanceof TomorHenger) {
                    s += "fs:" + ((TomorHenger)idom).getFajsuly();
                }
                s+= "\n";
            }
            return s;
        }

        private String fajsulyokSzama(){
            String s = "Melyik fajsúlyból mennyi van:\n";
            HashMap<Double,Integer>fajsulyok = new HashMap<>();
            for (AbstractIdom idom : idomok){
                double fs = 0;
                if (idom instanceof  AbstractFaIdom){
                    fs = AbstractFaIdom.getFajsuly();
                } else if () {
                    
                }
            }
        }


    public void run(){
        System.out.println(terfogatok());
    }
}
