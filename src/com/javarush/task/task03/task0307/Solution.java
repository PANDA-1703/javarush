package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //Zerg
        Zerg zerq1 = new Zerg();
        zerq1.name = "Zerq1";

        Zerg zerq2 = new Zerg();
        zerq2.name = "Zerq2";

        Zerg zerq3 = new Zerg();
        zerq3.name = "Zerq3";

        Zerg zerq4 = new Zerg();
        zerq4.name = "Zerq4";

        Zerg zerq5 = new Zerg();
        zerq5.name = "Zerq5";

        //Protoss
        Protoss protoss1 = new Protoss();
        protoss1.name = "protoss1";

        Protoss protoss2 = new Protoss();
        protoss2.name = "protoss2";

        Protoss protoss3 = new Protoss();
        protoss3.name = "protoss3";

        //Terran
        Terran terran1 = new Terran();
        terran1.name = "terran1";

        Terran terran2 = new Terran();
        terran2.name = "terran2";

        Terran terran3 = new Terran();
        terran3.name = "terran3";

        Terran terran4 = new Terran();
        terran4.name = "terran4";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
