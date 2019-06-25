/*
 * All Birds are Animals but all Animals are not Dogs
 */
public class Dog extends Animal {
    public Dog() {
        //super();
        System.out.println("A dog ran up...");
    }


    @Override
    public String sleep() {
        return "A dog sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }

    public String barks() {

        return "A dog barks...";
    }
}