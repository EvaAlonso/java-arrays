public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!
        String[] discaCoders = {"Luis", "Miller", "Ángel", "Andrea", "Cristina", "Genta"};
        for (String discaCoder : discaCoders){
            System.out.println("¡Hola " + discaCoder + ", bienvenida a Java!");
        }

        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        int[] numbers = {10, 30, 50, 70, 90};
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado
        int[] someNumbers = {10, 30, 50, 70, 90};
        for (int someNumber : someNumbers){
            System.out.println(someNumber + " " + someNumber);
        }
        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels){
            System.out.println(String.valueOf(vowel).toUpperCase());
        }
    }
}