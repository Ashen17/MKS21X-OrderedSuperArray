import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){}
  public NoNullArrayList(int capacity){
      this.super(capacity);
  }
  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    super.add(value);
  }
  public T set(int pos, T value){


  }
  private void NoNull(T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
  }

}
