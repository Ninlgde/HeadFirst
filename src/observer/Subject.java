package observer;

/**
 * @author Malik.Ma
 * @version 创建时间：2013-4-23 下午4:33:10
 */
public interface Subject {
	
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
	
}
