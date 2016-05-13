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
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = "/sidebar/valo")
@Theme("valo")
public class SidebarUI extends UI {
	@Autowired
	private ValoSideBar sideBar;

	@Autowired
	private SpringViewProvider viewProvider;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		getPage().setTitle("Sidebar Tutorial");

		// The layout of our entire page
		final HorizontalLayout layout = new HorizontalLayout();
		layout.setSizeFull();
		setContent(layout);

		// For the right hand part of our page we will use a vertical layout
		final VerticalLayout viewLayout = new VerticalLayout();
		viewLayout.setSizeFull();

		// In order to make view transitions possible we'll have to integrate a
		// navigator. Our target will be the right hand side viewLayout
		final Navigator navigator = new Navigator(this, viewLayout);
		navigator.setErrorView(new ErrorView());
		navigator.addProvider(viewProvider);
		setNavigator(navigator);

		// We may configure some elements of our sidebar
		// Lets set a logo and use large icons for our items
		sideBar.setLogo(new Label(FontAwesome.FLASH.getHtml(), ContentMode.HTML));
		sideBar.setLargeIcons(true);

		// We still have to add our two parts of the page to our page layout
		layout.addComponent(sideBar);
		layout.addComponent(viewLayout);
		layout.setExpandRatio(viewLayout, 1.0f);

		// Finally lets set some view as default view
		navigator.navigateTo(ViewItem1.ID);

	}

	private class ErrorView extends VerticalLayout implements View {
		private Label errorLabel;

		ErrorView() {
			setMargin(true);
			errorLabel = new Label();
			addComponent(errorLabel);
		}

		@Override
		public void enter(ViewChangeListener.ViewChangeEvent event) {
			errorLabel.setValue(String.format("Sorry but there is no such view: %s", event.getViewName()));
		}
	}

}
