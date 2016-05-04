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

@SpringView(name = ViewItem1.ID)
@SideBarItem(sectionId = Sections.SECTION1, caption = "View1", order = 1)
@FontAwesomeIcon(FontAwesome.AUTOMOBILE)
@ViewScope

public class ViewItem1 extends VerticalLayout implements View {
	public static final String ID = "viewitem1";
	private static final long serialVersionUID = 2217814051618370412L;

	public ViewItem1() {
		addComponent(new Label("This is item 1!"));
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
	}

}
