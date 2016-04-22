package lu.kodiba.blog.examples.lombok;

import java.math.BigDecimal;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerwithLombokGetterSetterFieldAccessLevel {
	private String firstName;
	private String lastName;
	private Integer shirtNumber;

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private BigDecimal salary;
	private List<String> positions;
}
