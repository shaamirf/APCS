package binaryTree;

public class binaryTree {
    public static void main(String[] args) {
        Number n = new Number(134752574);
        numTree(n);
        displayMult(n);
    }
    public static void numTree( Number x ){
        int next = nextPrime(x.getValue());
        if(next!=1){
            x.setLeft(new Number(next));
            x.setRight(new Number(x.getValue()/next));
            numTree(x.getRight());
        }
    }
    public static void displayMult(Number x){
        if(x.getLeft()!=null){
            System.out.print(x.getLeft().getValue()+", ");
            displayMult(x.getRight());
            if(nextPrime(x.getRight().getValue())==1) System.out.print(x.getRight().getValue());
        }
    }
    public static int nextPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0) return i;
        }
        return 1;
    }
}
