package lu.kodiba.blog.examples.lombok;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerwithLombokGetterSetter {
	private String firstName;
	private String lastName;
	private Integer shirtNumber;
	private BigDecimal salary;
	private List<String> positions;
}
