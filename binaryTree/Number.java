package binaryTree;

public class Number {
    private int value;
    private Number left, right;

    public Number(int v){
        value = v;
        left = null;
        right = null;
    }

    public int getValue(){
        return value;
    }
    public Number getLeft(){
        return left;
    }
    public Number getRight(){
        return right;
    }
    
    public void setValue(int v){
        value = v;
    }
    public void setLeft(Number l){
        left = l;
    }
    public void setRight(Number r){
        right = r;
    }
}
