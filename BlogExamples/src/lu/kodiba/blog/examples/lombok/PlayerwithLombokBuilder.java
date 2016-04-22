package lu.kodiba.blog.examples.lombok;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PlayerwithLombokBuilder {
	private String firstName;
	private String lastName;
	private Integer shirtNumber;
	private BigDecimal salary;
	private List<String> positions;
}
