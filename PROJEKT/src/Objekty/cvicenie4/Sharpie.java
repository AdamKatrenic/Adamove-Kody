package Objekty.cvicenie4;

public class Sharpie {
    public static void main(String[] args) {
        //Create a Sharpie class
        //We should know the followings about each sharpie:
        //color (which should be a string),
        //width (which will be a number) and the
        //inkAmount (another number)
        //We need to specify the color and the width at creation
        //Every sharpie is created with a default inkAmount value: 100
        //We can use() the sharpie objects: using it decreasesinkAmount by 10

        Ceruzka Mceruzka = new Ceruzka("Modra",3);
        Ceruzka Oceruzka = new Ceruzka("Oranzova",2);
        Ceruzka Bceruzka = new Ceruzka("Biela", 1);

        Mceruzka.use();
        Mceruzka.use();

        Oceruzka.use();

        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();

        System.out.println(Bceruzka.getInkPercento());

        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();
        Bceruzka.use();

        System.out.println(Bceruzka.getInkPercento());




    }
}
