public class Main
{
    public static void main(String[] args) {
        //Node node = new Node("Chad");
        BST tree = new BST();

        tree.Insert("Chad");
        tree.Insert("Tychee");
        tree.Insert("Sora");
        tree.Insert("Donald");
        tree.Insert("Roxas");
        tree.Insert("Goofy");
        tree.Insert("Mickey");
        tree.Insert("Minnie");
        tree.Insert("Kairi");


        tree.InOrder();

        System.out.println(tree.CountLeafNodes());
        System.out.println(tree.CounterNodes());
        System.out.println(tree.NumberOfAllLetters());
        System.out.println(tree.FindHeight());
    }
}
