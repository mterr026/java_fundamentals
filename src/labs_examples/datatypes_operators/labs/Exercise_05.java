package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        //AND
        boolean c = true;
        boolean d = true;
        if (c & d) {
            System.out.println("c and d are true");
        }

        //Short circuit AND
        if (b && c) {
            System.out.println("b is false therefore, c is not evaluated");
        }

        //Short-circuit OR
        if (c || d) {
            System.out.println("c is true, therefore the statement is true and d is not evaluated");
        }

        //XOR
        if (c ^ d) {
            System.out.println("c and d are true, therefore the statementis false");
        }

        if (!b) {
            System.out.println("b is false");
        }

    }

}

