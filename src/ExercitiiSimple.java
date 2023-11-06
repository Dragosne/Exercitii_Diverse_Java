public class ExercitiiSimple {
    public static void main(String[] args) {
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName)); // concatenare

        String txt = "Hello World";
        System.out.println(txt.indexOf("e")); //arata indexul lui e

        int a = 10, b = 25;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("numarul mai mare este: " + Math.max(a,b)); //arata care e mai mare dintre a si b
        System.out.println("radical din b este: " + Math.sqrt(b)); //radical din b
        System.out.println(Math.random()); // genereaza un numar random intre 0 si 1
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars.length);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; // two-dimentional array
        //Create an object of MyClass called myObj
        //MyClass myobj = new MyClass();
        // final class nu mai mosteneste nimic din alte clase, extend class - extinde clasa
        //try catch finnaly? de studiat
    }//inchide psvm
}//inchide clasa
