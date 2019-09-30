package dataStruture.interfaces;

public interface IQuene {
    public void clear();
    public boolean isEmpty();
    public int length();
    public void addElement(Object object) throws Exception;
    public Object poll();
    public Object getFirst();
    public void display();
}
