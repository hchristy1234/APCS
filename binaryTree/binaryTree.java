public class binaryTree {
    public static void main(String[] args) {
        Number z = new Number(54);
        numTree(z);
        displayTree(z);
    }
    public static void numTree(Number x) {
        for (int i = 2; i < x.getValue(); i++) {
            if (x.getValue()%i == 0) {
                Number left = new Number(i);
                x.setLeft(left);
                Number right = new Number(x.getValue()/i);
                x.setRight(right);
                i=x.getValue()+1;
                numTree(x.getRight());
            }
        }
    }
    public static void displayTree(Number x) {
        if (x.getLeft() == null) {
            System.out.print(x.getValue());
        }
        else {
            System.out.print(x.getLeft().getValue() + " ");
            displayTree(x.getRight());
        }
    }
}
