/*
 * All Birds are Animals but all Animals are not Mice
 */
public class Mouse extends Animal {
    public Mouse() {
        //super();
        System.out.println("A mouse ran by...");
    }


    @Override
    public String sleep() {
        return "A mouse sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }

    public String squeaks() {

        return "A mouse squeaks...";
    }
}