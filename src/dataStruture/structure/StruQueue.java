package dataStruture.structure;

import dataStruture.interfaces.IQuene;

import java.util.*;


/**
 * 实现队列(一般队列)
 */
public class StruQueue implements IQuene {
    private Object[] queueitem;
    private int front;    //队首指针
    private int rear;     //队尾指针
    private int maxSize;  //队列长度
    //得到一个新的队列
    public StruQueue (int maxSize){
        queueitem = new Object[maxSize];
        this.maxSize = maxSize;
        front = rear = 0;
    }

    //清空队列
    @Override
    public void clear() {
        front = rear = 0;
    }

    //判断对列是否为空
    public boolean isEmpty(){
        return front == rear;
    }
    //获取队列长度
    @Override
    public int length() {
        return rear-front;
    }
    //添加元素
    public void addElement(Object object) throws Exception {
        if(rear==maxSize){
            throw new Exception("队列已满");
        }
        queueitem[rear] = object;
        rear++;
    }
    //删除队列元素
    @Override
    public Object poll() {
        if(isEmpty()){
            return null;
        }
        front++;
        return queueitem[front-1];
    }
    //获取队首元素
    @Override
    public Object getFirst() {
        if(isEmpty()){
            return null;
        }
        return queueitem[front];
    }
    //
    @Override
    public void display() {

    }

}