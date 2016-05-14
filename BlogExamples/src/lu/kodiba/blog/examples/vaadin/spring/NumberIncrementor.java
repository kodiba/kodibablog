package lu.kodiba.blog.examples.vaadin.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NumberIncrementor {

	private Integer number = 0;

	public Integer incNumber() {
		number++;
		return number;
	}

}
