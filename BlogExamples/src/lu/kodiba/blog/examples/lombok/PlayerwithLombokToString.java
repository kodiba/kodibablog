package lu.kodiba.blog.examples.lombok;

import java.math.BigDecimal;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "salary", includeFieldNames = true)
public class PlayerwithLombokToString {
	private String firstName;
	private String lastName;
	private Integer shirtNumber;

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private BigDecimal salary;
	private List<String> positions;
}
