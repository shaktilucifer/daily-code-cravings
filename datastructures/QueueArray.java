class QueueArray{
    private Object[] queueArray;
    private int size;
    private int headIndex;
    private int tailIndex;
    
    QueueArray(int size){
        queueArray = new Object[size];
    }
  
    public void enqueue(Object data){
        if(isFull()){
            System.out.println("Not enough space");
            return;
        }
            queueArray[tailIndex++] = data;
            size++;
    }
    
    
    public void printQueue(){
        int i = 0;
        while(i < queueArray.length -1){
            System.out.println(queueArray[i++]);
        }
    }
    
    
    public boolean isEmpty(){
        return size == 0;
    }  
    
    public boolean isFull(){
        return size == queueArray.length;
    }
    
    
  
  
}

class QueueArrayApp{
	 public static void main(String[] args){
            QueueArray queueArray = new QueueArray(10);
            queueArray.enqueue(2.2);
            queueArray.enqueue(2.4);
            queueArray.printQueue();
            for(int i=0;i<10;i++){
                queueArray.enqueue(2.2 + i);
            }

	 }

}
