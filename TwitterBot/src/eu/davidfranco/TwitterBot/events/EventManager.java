package eu.davidfranco.TwitterBot.events;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
	List<Object> listeners = new ArrayList<Object>();
	public EventManager(){
		
	}
	public void registerEvents(Object c){
		listeners.add(c);
	}
	public void callEvent(Event e){
		for(Object c : listeners){
			for(Method m : c.getClass().getMethods()){
				if(m.getAnnotation(EventHandler.class) != null){
					Class<?>[] tp = m.getParameterTypes();
					if(tp.length == 1 && tp[0] == e.getClass()){
						try {
							m.invoke(c, new Object[]{e});
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		}
	}
}
