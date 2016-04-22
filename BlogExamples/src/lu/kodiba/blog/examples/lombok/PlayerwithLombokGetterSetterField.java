package lu.kodiba.blog.examples.lombok;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PlayerwithLombokGetterSetterField {
	@Getter
	@Setter
	private String firstName;

	@Getter
	@Setter
	private String lastName;

	@Getter
	@Setter
	private Integer shirtNumber;

	private BigDecimal salary;

	@Getter
	@Setter
	private List<String> positions;
}
