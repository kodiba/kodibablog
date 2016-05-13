package lu.kodiba.blog.examples.vaadin.sidebar;

import org.springframework.stereotype.Component;
import org.vaadin.spring.sidebar.annotation.SideBarSection;
import org.vaadin.spring.sidebar.annotation.SideBarSections;

@SideBarSections({ @SideBarSection(id = Sections.SECTION1, caption = "Section1"),
	@SideBarSection(id = Sections.SECTION2, caption = "Section2"),
	@SideBarSection(id = Sections.SECTION3, caption = "Section3") })
@Component
public class Sections {
	public static final String SECTION1 = "section1";
	public static final String SECTION2 = "section2";
	public static final String SECTION3 = "section3";
}
