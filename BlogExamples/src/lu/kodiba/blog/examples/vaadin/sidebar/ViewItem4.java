package lu.kodiba.blog.examples.vaadin.sidebar;

import org.vaadin.spring.sidebar.annotation.FontAwesomeIcon;
import org.vaadin.spring.sidebar.annotation.SideBarItem;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.annotation.ViewScope;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = ViewItem4.ID)
@SideBarItem(sectionId = Sections.SECTION1, caption = "View4", order = 3)
@FontAwesomeIcon(FontAwesome.GEARS)
@ViewScope
public class ViewItem4 extends VerticalLayout implements View {
	public static final String ID = "viewitem4";
	private static final long serialVersionUID = 2217814051618370412L;

	public ViewItem4() {
		addComponent(new Label("This is item 4!"));
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
	}

}
