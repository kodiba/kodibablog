package lu.kodiba.blog.examples.vaadin.spring;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;

@SpringUI(path = "uiviewintegration")
public class UIViewIntegration extends UI {
	@Autowired
	private SpringViewProvider viewProvider;

	@Override
	protected void init(VaadinRequest request) {
		// Just adding a Panel as View Container to our page
		final Panel viewContainer = new Panel();
		viewContainer.setSizeFull();
		setContent(viewContainer);
		// To be able to navigatze to views we attach our viewContainer to
		// a Navigator. The navigator will use the SpringViewProvider
		// to provide registered views!

		Navigator navigator = new Navigator(this, viewContainer);
		navigator.addProvider(viewProvider);
	}
}
