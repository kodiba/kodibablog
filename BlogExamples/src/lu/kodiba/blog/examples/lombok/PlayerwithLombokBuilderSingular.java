package lu.kodiba.blog.examples.lombok;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Builder
@Data
public class PlayerwithLombokBuilderSingular {
	private String firstName;
	private String lastName;
	private Integer shirtNumber;
	private BigDecimal salary;
	@Singular
	private List<String> positions;
}
