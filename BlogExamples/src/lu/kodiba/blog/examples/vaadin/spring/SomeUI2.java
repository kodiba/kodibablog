package lu.kodiba.blog.examples.vaadin.spring;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI(path = "ui")
public class SomeUI2 extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		setContent(new Label("Hello world!"));
	}
}
