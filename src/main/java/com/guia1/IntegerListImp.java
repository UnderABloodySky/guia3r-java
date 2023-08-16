package com.guia1;

//Wrapper
public class IntegerListImp implements IntegerList{
    private Integer[] numbers;
    private int currentIndex = 0;
    private int index;

    public IntegerListImp(int index){
        this.numbers = new Integer[index];
        this.index = index;
    }
    

    @Override
    public boolean add(Integer element){
        if(this.index > this.currentIndex){
            this.numbers[currentIndex] = element;
            this.currentIndex++;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void add(int otherIndex, Integer element){
        if(otherIndex > this.index || otherIndex < 0){
           // throw new Exception("");
        }
        this.numbers[otherIndex]= element;       
    }
    
    public boolean addAll(IntegerList aList){
        Integer[] temp = aList.toArray();
        boolean result = true;
        for(int i = 0; i < temp.length; i++){
            Integer numberTemp = temp[i];
            result = result && this.add(numberTemp);
        }
        return result;
        
    }
        /* 
        boolean addAll(int index, IntegerList aList);
        /** Removes all of the elements from this list. */
        /* void clear();
        /** Returns true if this list contains the specified element. */
        /* boolean contains(Integer element);
        /** Returns the element at the specified position in this list. */
        /* Integer get(int index);
        /** Returns the index of the first occurrence of the specified
        * element in this list, or -1 if this list does not contain
        * the element. */
        /* int indexOf(Integer element);
        
        /** Returns true if this list contains no elements. */
        /* boolean isEmpty();
        /** Returns the index of the last occurrence of the specified
        * element in this list, or -1 if this list does not contain
        * the element. */
        /* int lastIndexOf(Integer element);
        /** Removes the element at the specified position in this list. */
        /* int remove(int index);
        /** Replaces the element at the specified position
        * in this list with the specified element. */
        /* void set(int index, Integer element);
        /** Returns the number of elements in this list. */
        /* int size();
        /** Returns a view of the portion of this list between
        * the specified fromIndex, inclusive, and toIndex, exclusive. */
        /* List<Integer> subList(int fromIndex, int toIndex);
        /** Returns an array containing all of the elements
        * in this list in proper sequence (from first to last element). */
        public Integer[] toArray(){
            return this.numbers;
        }
}
