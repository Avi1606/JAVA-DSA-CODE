package com.JavaDSA.Queue_Stack;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            int []temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(start_ptr+i)%data.length];
            }
            start_ptr=0;
            end_ptr=data.length;
            data = temp;
        }

        return super.insert(item);
    }
}
