public class IO_Controller {

    // IO_Controller Attributter:
    public final Runnable typeA;
    public final Runnable typeB;

    // IO_Controller Constructor:
    public IO_Controller() {
        typeA = new Runnable() {
            public void run() {
                IO_Controller.this.getInformationOfTypeA();
            }
        };

        typeB = new Runnable() {
            public void run() {
                IO_Controller.this.getInformationOfTypeB();
                // one can use a non-final typed variable
                // to store, which then<1>
            }
        };
    }

    // IO_Controller metoder:

    // Koden til 1. tråd i metoden herunder. Kunnne renames til getInput, Input eller lign.
    public void getInformationOfTypeA(){
        // get information of type A
        // return the data or directly store in IO_Controller.

        // eksempel
        System.out.println("Print fra tråd A");
    }


    // Koden til 2. tråd i metoden herunder. Kunne renames til setOutput, Output eller lign.
    public void getInformationOfTypeB(){
        // get information of type B
        // return the data or directly store in IO_Controller.

        // eksempel
        System.out.println("Print fra tråd B");
    }


    // Eksempel på brug af controller. Her i en main:

    // Main viser bare hvordan det kunne fungere/bruges.
    public static void main(String args[]) {
        IO_Controller x = new IO_Controller();
        new Thread(x.typeA).start(); // start A
        new Thread(x.typeB).start(); // start B
        // <1>can be accessed here.
    }



}