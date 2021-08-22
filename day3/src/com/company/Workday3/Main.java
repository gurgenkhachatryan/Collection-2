package com.company.Workday3;

public class Main {
    public static void main(String[] args) {
        System.out.print("HashSet ADD=  ");
        GetNumber1 getNumber1 = new GetNumber1();
        getNumber1.getNumber();
        System.out.println();

        System.out.print("isEmpty=     ");
       Empty2 empty = new Empty2();
       System.out.println(empty.isEmpty());

        System.out.print("HashSet Clone=  ");
       Clone3 clone3=new Clone3();
       clone3.cloneSet();
        System.out.println();

        System.out.print("HashSet Convert TreeSet=  ");
       HashConvertTree4 hashConvertTree4=new HashConvertTree4();
       hashConvertTree4.hashTree();
        System.out.println();
        System.out.print("HashSet Convert ArrayList= ");
       HashConvertArrayList5 hashConvertArrayList5=new HashConvertArrayList5();
       hashConvertArrayList5.HashArray();

        System.out.println();
        System.out.print("Compare HashSet1 HashSet2=");
        CompareHashSet6 compareHashSet6=new CompareHashSet6();
        System.out.println(compareHashSet6.compare());

        System.out.println();
        System.out.print("RemoveAll=");
        RemoveALL7 removeALL7=new RemoveALL7();
        removeALL7.rem();

        System.out.println();
        System.out.print("IterateTree=");
        IterateTree8 iterateTree8=new IterateTree8();
        iterateTree8.iterate();

        System.out.println();
        FirstLast9 firstLast9=new FirstLast9();
        firstLast9.firstLast();

        System.out.print("cloneTwo TRee Set=");
        CloneTreeSet10 cloneTreeSet10=new CloneTreeSet10();
        cloneTreeSet10.cloneTree();

        System.out.println();
        System.out.print("Count Element of Tree=");
        CountElTree11 countElTree11=new CountElTree11();
        System.out.println(countElTree11.countTree());

        System.out.println();
        System.out.print("MyAddTree compare to New Tree=");
        CompareTree12 compareTree12=new CompareTree12();
        System.out.println(compareTree12.compareTree());

        System.out.println();
        System.out.print("Minimum 7=");
        MinSeven13 minSeven13=new MinSeven13();
        minSeven13.minSeven();

        System.out.println();
        System.out.print("Great or Equal 28=");
        GreatOrEqual14 greatOrEqual14=new GreatOrEqual14();
        greatOrEqual14.greatOrEqual(28);

        System.out.println();
        System.out.print("        remove 28=");
        RemoveElFromTree15 removeElFromTree15=new RemoveElFromTree15();
        removeElFromTree15.removeElement(28);

        System.out.println();
        PriorQueue16 priorQueue16=new PriorQueue16();
        priorQueue16.priorityQueue();

        System.out.println();
        System.out.print("Compare two PriorityQueue=");
        ComparePrQueue17 comparePrQueue17=new ComparePrQueue17();
        System.out.println(comparePrQueue17.compPrQueue());
    }
}
