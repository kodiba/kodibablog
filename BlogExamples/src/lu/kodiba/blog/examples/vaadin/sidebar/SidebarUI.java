package lu.kodiba.blog.examples.vaadin.sidebar;

import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.spring.sidebar.components.ValoSideBar;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class SidebarUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9127499650116220717L;

	@Autowired
	ValoSideBar sideBar;

	@Autowired
	SpringViewProvider viewProvider;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		getPage().setTitle("Sidebar Tutorial");
		final HorizontalLayout rootLayout = new HorizontalLayout();
		rootLayout.setSizeFull();
		setContent(rootLayout);

		final VerticalLayout viewContainer = new VerticalLayout();
		viewContainer.setSizeFull();

		final Navigator navigator = new Navigator(this, viewContainer);
		navigator.setErrorView(new ErrorView());
		navigator.addProvider(viewProvider);
		setNavigator(navigator);

		rootLayout.addComponent(sideBar);
		rootLayout.addComponent(viewContainer);
		rootLayout.setExpandRatio(viewContainer, 1.0f);

		CssLayout header = new CssLayout();

		sideBar.setLogo(new Label(FontAwesome.FLASH.getHtml(), ContentMode.HTML));
		sideBar.setLargeIcons(true);

		// sideBar.setHeader(header);
	}

	private class ErrorView extends VerticalLayout implements View {

		private static final long serialVersionUID = -1349484555495574658L;
		private Label message;

		ErrorView() {
			setMargin(true);
			message = new Label();
			addComponent(message);
		}

		@Override
		public void enter(ViewChangeListener.ViewChangeEvent event) {
			message.setValue(String.format("No such view: %s", event.getViewName()));
		}
	}

}
