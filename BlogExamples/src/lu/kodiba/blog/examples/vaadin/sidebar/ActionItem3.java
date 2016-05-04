package lu.kodiba.blog.examples.vaadin.sidebar;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.vaadin.spring.sidebar.annotation.SideBarItem;

import com.vaadin.ui.Notification;

@SideBarItem(sectionId = Sections.SECTION1, caption = "Item3")
@Component
public class ActionItem3 implements Runnable, Serializable {

	private static final long serialVersionUID = 7376470664287797415L;

	@Override
	public void run() {
		Notification.show("Item3 triggered!");
	}

}
