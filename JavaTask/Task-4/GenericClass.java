
class Box<T>{//Generic class
    private T item;
    public void add(T item){
       this.item=item;
    }
    public T get(){
        return item;
    }
}
public class GenericClass{
    public static void main(String[] args) {
      Box<String> stringBox = new Box<>();
      stringBox.add("Hello");
      Box <Integer> intBox = new Box<>();
      intBox.add(123);
      System.out.println("This is String :" + stringBox.get());
      System.out.println("This is Integer :" + intBox.get());
    }
}