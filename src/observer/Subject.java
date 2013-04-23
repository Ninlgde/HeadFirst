package observer;

/**
 * @author Malik.Ma
 * @version ����ʱ�䣺2013-4-23 ����4:33:10
 */
public interface Subject {
	
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
	
}
