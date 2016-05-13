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

@SpringView(name = ViewItem2.ID)
@SideBarItem(sectionId = Sections.SECTION1, caption = "View2", order = 2)
@FontAwesomeIcon(FontAwesome.BRIEFCASE)
@ViewScope
public class ViewItem2 extends VerticalLayout implements View {
	public static final String ID = "viewitem2";
	private static final long serialVersionUID = 2217814051618370412L;

	public ViewItem2() {
		addComponent(new Label("This is item 2!"));
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent event) {
	}

}
