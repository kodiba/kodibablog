package lu.kodiba.blog.examples.lombok;

import java.math.BigDecimal;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString(exclude = "salary", includeFieldNames = true)
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class PlayerwithLombokSlf4j {
	private String firstName;
	private String lastName;
	private Integer shirtNumber;

	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private BigDecimal salary;
	private List<String> positions;

	public void greetMe() {
		log.info("Bonjour " + this.getFirstName());
	}
}
