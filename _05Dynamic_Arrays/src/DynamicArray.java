//Custom Dynamic Array Creation :
public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    //Constructors :
    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    //add function :
    public void add(Object data) {
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    //insert function :
    public void insert(int index, Object data) {
        if(size >= capacity){
            grow();
        }
        for (int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    //Delete function :
    public void delete(Object data) {
        for (int i = 0; i < size; i++){
            if(array[i] == data){
                for (int j = 0; j < (size - i - 1); j++){
                    array[i+j] = array[i+j+1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }
    //Search function :
    public int search(Object data){
        for(int i = 0; i < size ; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    //extend size of array :
    private void grow(){
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    //shrink :
    private  void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    //isEmpty():
    public boolean isEmpty(){
        return size == 0;
    }

    //toString();
    public String toString(){
        String string = "";
        for(int i = 0; i < capacity; i++){
            string += array[i] + ", ";
        }
        if(string != ""){
            string ="[" + string.substring(0, string.length() - 2) + "]";
        }else{
            string = "[]";
        }
        return string;
    }

}


    