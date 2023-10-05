package classComponents.blocks;

public class StaticBlockTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. load the class in the memory by creating the object
        //Driver driver = new Driver();

        //2. Load the class in the memory by using Class.forName
        Class.forName("classComponents.blocks.Driver");
    }
}
