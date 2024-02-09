package pl.gorecki.slawomir.java.learn;

public class StartMain {
    public static void main(String[] args) {
        System.out.println("hello world");
        for (int i = 0; i < args.length; i++) {

            System.out.println("Argument wiersza poleceń: " + args[i]);
        }

        for(String s :args){
            System.out.println(s);
        }

        int i=0;
        while ( i < args.length){
            System.out.println(args[i]);
            i++;
        }

        i=0;
        if(args.length>0){
            do{
                System.out.println(args[i]);
                i++;
            }while (i<args.length);
        }
    }
}



//TODO 6.02.2024 PRACA DOMOWA
//Z KONSOLI URUCHOMIĆ StartMain i przesłać argumenty wiersza poleceń
//slawomir@slawomir-HP-ZBook-15-G2:~/IdeaProjects/java-learn/src/pl/gorecki/slawomir/java/learn$ java StartMain.java jakis tekst
//hello world
//Argument wiersza poleceń: jakis
//Argument wiersza poleceń: tekst


//Zaprerzentować działanie istrukcji warunkowych oraz pętli w języku java