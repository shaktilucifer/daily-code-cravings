public class Person {
    private int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {

            this.age = 0;
            this.printStatement("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (this.age < 13)
            this.printStatement("You are young.");
        else if (this.age >= 13 && this.age < 18)
            this.printStatement("You are a teenager.");
        else
            this.printStatement("You are old.");
    }

    public void printStatement(String toBePrinted) {
        System.out.println(toBePrinted);
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age += 1;
    }


    //Sample Input

    // 4
    // -1
    // 10
    // 16
    // 18
    // Sample Output

    // Age is not valid, setting age to 0.
    // You are young.
    // You are young.

    // You are young.
    // You are a teenager.

    // You are a teenager.
    // You are old.

    // You are old.
    // You are old.
