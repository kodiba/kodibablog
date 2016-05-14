package lu.kodiba.blog.examples.vaadin.spring;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI(path = "injectiontest")
public class InjectionTestUI extends UI {

	@Autowired
	private NumberIncrementor numberInc;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		setContent(new Label("This is UI view InjectionTestUI requesting number inc.: " + numberInc.incNumber()));
	}
}
