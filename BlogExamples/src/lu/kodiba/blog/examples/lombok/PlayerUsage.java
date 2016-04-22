package lu.kodiba.blog.examples.lombok;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayerUsage {

	@Test
	public void testPlayerSlf4j() {
		PlayerwithLombokSlf4j player = new PlayerwithLombokSlf4j();
		player.setFirstName("Shinji");
		player.greetMe();
	}

	@Test
	public void testPlayerBuilder() {

		PlayerwithLombokBuilder shinji = PlayerwithLombokBuilder.builder().firstName("Shinji").lastName("Kagawa")
				.shirtNumber(23).build();
		log.info(shinji.toString());
	}

	@Test
	public void testPlayerBuilderSingular() {

		PlayerwithLombokBuilderSingular shinji = PlayerwithLombokBuilderSingular.builder().firstName("Shinji")
				.lastName("Kagawa").shirtNumber(23).position("ZM").position("LM").build();
		log.info(shinji.toString());
	}
}
