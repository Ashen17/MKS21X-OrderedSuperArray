import java.util.ArrayList;
public class OrderedArraylist<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArraylist(){}
  public OrderedArraylist(int capacity){
    super(capacity);
  }
  private int Location(T value){
    if (size() == 0){return 0;}
    int half = size()/2;
    for (int pos = size()/2; pos < size(); pos+= half){
        
    }
  }


}
