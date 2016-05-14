package lu.kodiba.blog.examples.vaadin.spring;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = View2.ID)
public class View2 extends VerticalLayout implements View {
	public static final String ID = "view2";

	@PostConstruct
	void init() {
		addComponent(new Label("View2"));
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}
}
