package lu.kodiba.blog.examples.vaadin.sidebar;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.vaadin.spring.sidebar.annotation.SideBarItem;

import com.vaadin.ui.Notification;

@SideBarItem(sectionId = Sections.SECTION2, caption = "Item5")
@Component
public class ActionItem5 implements Runnable, Serializable {

	private static final long serialVersionUID = 7376470664287797415L;

	@Override
	public void run() {
		Notification.show("Item5 triggered!");
	}

}
