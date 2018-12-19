package stackOfStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String elements){
        this.data.add(elements);
    }
    public String pop(){
        if(!this.isEmpty()){
            return this.data.remove(this.data.size() - 1);
        }else {
            throw new NoSuchElementException();
        }
    }
    public String peak(){
        if(!this.isEmpty()){
            return this.data.get(this.data.size() - 1);
        }else {
            throw new NoSuchElementException();
        }
    }
    public boolean isEmpty(){
        return this.data.isEmpty();
    }

}
